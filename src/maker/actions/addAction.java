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

import checker717.myBean;

import com.opensymphony.xwork2.ActionSupport;

public class addAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;

	HttpServletRequest request;




	public String execute() {
		
		myBean mb1 = new myBean();
		
		System.out.println("data is set in bean");

		
		return "success";

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