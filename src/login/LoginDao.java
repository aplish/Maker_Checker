package login;


 


import java.sql.Connection;
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServlet;
import javax.sql.DataSource;
  
public class LoginDao extends HttpServlet{  
  
	public static void main(String[] args){
		
	}
	
	
public static boolean validate(String username,String userpass){  
 boolean status=false;  
  try{  
/*
	  //have to put in try catch 
	  Context envContext = new InitialContext();
                     
          //Context initContext  = (Context)envContext.lookup("java:/comp/env");
         // DataSource ds = (DataSource)initContext.lookup("jdbc/testDB"); 
          DataSource ds = (DataSource)envContext.lookup("java:/comp/env/jdbc/testDB");
          Connection con = ds.getConnection(); */
	  
	  Connection con = DBconn.getConn();
	 
   PreparedStatement ps=con.prepareStatement(  
		
    "select * from user717 where name=? and password=?");  
   ps.setString(1,username);  
   ps.setString(2,userpass);  
  
   ResultSet rs=ps.executeQuery();  
   //status=rs.next(); 
  // con.close();
   if (rs.next()){
	   status=true;
   }
   
  }catch(Exception e){System.out.print("sql error in first function.");}  

 return status;  
 
}  


public static String role(String username,String userpass){
 String role=null;
	try{ 
		 /* Context envContext = new InitialContext();
	       DataSource ds = (DataSource)envContext.lookup("java:/comp/env/jdbc/testDB");
	          Connection con = ds.getConnection();
	              
	         */ 
		  Connection con = DBconn.getConn();
          
		
	   PreparedStatement ps=con.prepareStatement(  
			
	    "select * from user717 where name=? and password=?");  
	   ps.setString(1,username);  
	   ps.setString(2,userpass);  
	  
	   ResultSet rs2=ps.executeQuery();  
	  if(rs2.next())
	    role = rs2.getString("role");
	
	  // con.close();
	  }
	catch(Exception e){System.out.print("sql error in 2nd function");}  
	
	 return role ;  
	
	 
	}  

}
// old JDBC method
/*
 *public static boolean validate(String username,String userpass){  
 boolean status=false;  
  try{  

		Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection	con=DriverManager.getConnection("jdbc:oracle:thin:@finn:1521:orcl","hr","hr");  
     
   PreparedStatement ps=con.prepareStatement(  
		  // "select * from user3333 ");
    "select * from user717 where name=? and password=?");  
   ps.setString(1,username);  
   ps.setString(2,userpass);  
   
   ResultSet rs=ps.executeQuery();  
   status=rs.next(); 
   
   
  }catch(Exception e){System.out.print("sql error is there.");}  

 return status;  
}  
 */

  