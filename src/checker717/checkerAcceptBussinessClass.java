package checker717;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.servlet.http.HttpServlet;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import login.DBconn;
import maker.actions.addNCustomer;

public class checkerAcceptBussinessClass extends HttpServlet implements SessionAware {
	//SessionMap<String, String> sessionmap;

	public static myBean selectFromTemp(String fid,myBean mb) {
		boolean status = false;
		
		try {

			DBconn cn = new DBconn();
			Connection con = cn.getConn();
			PreparedStatement ps = null;	
			ps = con.prepareStatement("select * from custemp717 where custcode=?");
			int k = Integer.parseInt(fid);
			ps.setInt(1, k);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				mb.setCustomerID(rs.getInt(1));
				mb.setCustomerCode(rs.getString(2));
				mb.setCustomerName(rs.getString(3));
				mb.setCustomerAddr1(rs.getString(4));
				mb.setCustomerAddr2(rs.getString(5));
				mb.setCustomerPinCode(rs.getInt(6));
				mb.setEmail(rs.getString(7));
				mb.setNumber(rs.getInt(8));
				mb.setPrimaryContactPerson(rs.getString(9));
				mb.setRecordStatus(rs.getString(10).charAt(0));
				mb.setFlag(rs.getString(11).charAt(0));
				mb.setCreationDate(rs.getDate(12));
				mb.setCreatedBy(rs.getString(13));
				mb.setModDate(rs.getDate(14));
				mb.setModby(rs.getString(15));
				mb.setAuthDate(rs.getDate(16));
				mb.setAuthby(rs.getString(17));
				// status=true;
			}
			con.commit();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mb;

	}

	
	
	//**************Inserting into permanent table  ************************************
	
	public static int insert(myBean mb ) throws java.text.ParseException
	{ int status=0; 

	//String username=(String)session.getAttribute("username"); 
	
	try{ DBconn cn=new DBconn();
	Connection con=cn.getConn();
//	String s = "INSERT INTO Cus717 values (customers_seq717.nextval,?,?,?,?,?,?,?,?,?,?,SYSDATE,?,SYSDATE,?,SYSDATE,?)";
	String s = "INSERT INTO Cus717 values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,SYSDATE,?)";
PreparedStatement update=con.prepareStatement( s);
update.setInt(1, mb.getCustomerID());
update.setString(2, mb.getCustomerCode());
	update.setString(3, mb.getCustomerName());
	update.setString(4, mb.getCustomerAddr1());
	update.setString(5, mb.getCustomerAddr2());
	update.setInt(6, mb.getCustomerPinCode());
	update.setString(7, mb.getEmail());
	update.setLong(8, mb.getNumber());
	update.setString(9, mb.getPrimaryContactPerson());
	update.setString(10,""+'A' );
	
	//logic for A-D-A
	char delstatus=mb.getRecordStatus();
	if (delstatus=='D'){
		update.setString(11,""+'I');
	}
	else { 	update.setString(11,""+mb.getFlag()); }

	update.setDate(12,mb.getCreationDate());
	update.setString(13, mb.getCreatedBy());
	update.setDate(14,mb.getModDate());
	update.setString(15, " ");
	update.setString(16, " "); 
	status=update.executeUpdate();
	con.commit();
 
		update.close();
		con.close();
		//System.out.println("inserting in table done from bussiness class");
		}
		catch(Exception e){
 			e.printStackTrace();
 			System.out.print("sql error hai !");
 		}
	return status;
	}
	


	// *********************Delete From Temporary Table**************************************************************

	public static boolean delFromTemp(String fid) {
		boolean status = false;
		int i = 0;

		try {
			DBconn cn = new DBconn();
			Connection con = cn.getConn();
			PreparedStatement ps2 = null;
			ps2 = con.prepareStatement(" delete from custemp717 where custcode=?");
			int k = Integer.parseInt(fid);
			ps2.setInt(1, k);
			i = ps2.executeUpdate();

			con.commit();
			ps2.close();
			con.close();

			if (i > 0) {
				status = true;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Dele from temp table done from bClass" + status);
		return status;
	}

	//*********************Rejecting Records : status=R*****************************************
	
	
	public static boolean rejectRequest(String fid) {
		boolean status = false;
		int i = 0;

		try {
			DBconn cn = new DBconn();
			Connection con = cn.getConn();
			PreparedStatement ps2 = null;
			ps2 = con.prepareStatement(" update custemp717 set Recstatus='R' where custcode=?");
			int k = Integer.parseInt(fid);
			ps2.setInt(1, k);
			i = ps2.executeUpdate();

			con.commit();
			ps2.close();
			con.close();

			if (i > 0) {
				status = true;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Rejecting the record...");
		return status;
	}
	
	
	

	// ***********************Not using**********************************************************
	public static boolean approve(String fid) {
		boolean status = false;
		int i = 0;
		try {
			DBconn cn = new DBconn();
			Connection con = cn.getConn();
			PreparedStatement ps = null;
			PreparedStatement ps2 = null;
			ps = con.prepareStatement("insert into cus717 (select * from custemp717 where custcode=?)");
			int k = Integer.parseInt(fid);
			ps.setInt(1, k);

			i = ps.executeUpdate();
			con.commit();
			ps.close();
			con.close();

			if (i > 0) {
				status = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}



	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
}