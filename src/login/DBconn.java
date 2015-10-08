package login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
public class DBconn {
	static Connection con;
	public static Connection getConn()
	{
			try {
				Context envContext = new InitialContext();
                
		          //Context initContext  = (Context)envContext.lookup("java:/comp/env");
		         // DataSource ds = (DataSource)initContext.lookup("jdbc/testDB"); 
		          DataSource ds = (DataSource)envContext.lookup("java:/comp/env/jdbc/testDB");
		         con = ds.getConnection();
			
			} catch (Exception e) 
		     {e.printStackTrace();}
			
		
		return con;
	}
	
	public static void closeConn()
	{
		
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}

}
