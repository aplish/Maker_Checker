package maker.actions;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import login.DBconn;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import checker717.checkerAcceptBussinessClass;
import checker717.myBean;

import com.opensymphony.xwork2.ActionSupport;

public class modification extends ActionSupport implements SessionAware {
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

	public String execute() {
		
		 System.out.println(" the fid is  " + fid);
		 System.out.println(" the flag is  " + flag);
		 int fidd=Integer.parseInt(fid);
		 
		myBean mb1 = new myBean();
		myBean mb2 = checkerAcceptBussinessClass.selectFromTemp(fid, mb1);
		System.out.println("data is set in bean");

		if (flag.equalsIgnoreCase("delete")){
			
			int i = 0;
			i = makerBussinessClass.deleteFromOld(fidd);
			if (i > 0) {
				System.out.println("data is deleted from temporary table");
				return "success";
			          }
			else return " error";	
		}
		
		if (flag.equalsIgnoreCase("deleteperm")){
			
		}
		
if (flag.equalsIgnoreCase("editperm")){
			
		}

		/*
		 if (flag.equalsIgnoreCase("edit")){	
		}
		 */

else	return "error";
	

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