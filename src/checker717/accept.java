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

public class accept extends ActionSupport implements SessionAware {
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
		
	//	 System.out.println(" in accept class " + fid);
		myBean mb1 = new myBean();
		myBean mb2 = checkerAcceptBussinessClass.selectFromTemp(fid, mb1);
		System.out.println("data is set in bean");

		try {
			int i = 0;
			i = checkerAcceptBussinessClass.insert(mb2);
			if (i > 0) {
				System.out.println("data is set in permanent table");

						if (checkerAcceptBussinessClass.delFromTemp(fid)) {
							System.out.println("data is deleted from temporary table");
							return "success";
							}
						else return "error";
						}
			else return " error";
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" in accept sql error");
		}

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