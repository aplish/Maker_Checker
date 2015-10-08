package login;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private String name, password;
	SessionMap<String, String> sessionmap;

	/*
	public void validate() {
		if (name.length() < 1 || name.equals("") || name == null)
			addFieldError("name", "Name can't be blank");
		if (password.length() < 1 || password.equals("") || password == null)
			addFieldError("password", "Password can't be blank");

	}
*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
	
		if (LoginDao.validate(name, password)) {
			sessionmap.put("login", "true");
	
			if (LoginDao.role(name, password).equals("checker")) {
				sessionmap.put("username", name);
				sessionmap.put("role", "checker");

				
				return "success";
			} else if (LoginDao.role(name, password).equals("maker")) {
				sessionmap.put("username", name);
				sessionmap.put("role", "maker");

				Map session = (Map) ActionContext.getContext().get("session");
				session.put("myId", name);

				return "success";
			} else
				return "error";

		} else {
			return "error";
		}

	}

	public void setSession(Map map) {
		sessionmap = (SessionMap) map;
		sessionmap.put("login", "true");
	}

	public String logout() {
		System.out.print("it was here");
		sessionmap.invalidate();
		return "success";
	}

}