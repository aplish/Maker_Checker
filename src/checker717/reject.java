package checker717;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import login.DBconn;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
 
public class reject extends ActionSupport implements SessionAware{    
    private static final long serialVersionUID = 1L;
 
    HttpServletRequest request;   
    
    private String fid;
    private String flag;
  
 
    public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	
	
	public String execute()
    {   if (checkerAcceptBussinessClass.rejectRequest(fid)) {
			System.out.println("Rejecting The record Action class");
				return "success";
					}
		else return " error";

 
    }
	
	
	
 
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
 
    public HttpServletRequest getServletRequest() {
        return request;
    }

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
 
}