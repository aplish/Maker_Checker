package maker.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import login.DBconn;

public class makerBussinessClass {

	public static int deleteFromOld(int val){
		int status=0;
		try { DBconn cn=new DBconn();
		Connection con=cn.getConn();
		
		String s2 = "delete from Custemp717 where custcode=?";
		PreparedStatement update2=con.prepareStatement( s2);

	 update2.setInt(1, val);
	 
	 status=update2.executeUpdate();
	 con.commit();
	 
		update2.close();
		con.close();
	

		    }
		catch(Exception e){
			e.printStackTrace();
			System.out.print("sql error hai !");
		}
	return status;
	}

		
	
	
	
	
	public static int insert(addNCustomer mb) throws java.text.ParseException
	{ int status=0; 
	try{ DBconn cn=new DBconn();
	Connection con=cn.getConn();
	
   
	String s = "INSERT INTO CusTemp717 values (customers_seq717.nextval,?,?,?,?,?,?,?,?,?,?,SYSDATE,?,?,?,?,?)";
    
PreparedStatement update=con.prepareStatement( s);

    update.setString(1, mb.getCustomerCode());
	update.setString(2, mb.getCustomerName());
	update.setString(3, mb.getCustomerAddr1());
	update.setString(4, mb.getCustomerAddr2());
	update.setInt(5, mb.getCustomerPinCode());
	update.setString(6, mb.getEmail());
	update.setLong(7, mb.getNumber());
	update.setString(8, mb.getPrimaryContactPerson());
	update.setString(9, mb.getRecordStatus());
	update.setString(10, mb.getFlag());
	update.setString(11, mb.getCreatedBy());
	update.setString(12, null); 
	update.setString(13, " ");
	update.setString(14, null); 
	update.setString(15, " "); 
	status=update.executeUpdate();
	con.commit();
 
		update.close();
		con.close();
	

		    }
		catch(Exception e){
 			e.printStackTrace();
 			System.out.print("sql error hai !");
 		}
	return status;
	}
	
 
}
