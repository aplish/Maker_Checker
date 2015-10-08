package maker.actions;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;

import login.DBconn;
import login.LoginDao;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class addNCustomer extends ActionSupport {	
	private String CustomerCode;
	private String CustomerName;
	private String CustomerAddr1;
	private String CustomerAddr2;
	private int CustomerPinCode;
	private String email;
	private int number;
	private String PrimaryContactPerson;
	private String RecordStatus;
	private String Flag;
	//private String CreationDate;
	private String CreatedBy;
	//private String moddate;
	//private String modby;
	//private String authdate;
	//private String authby;
	
	
		  
	public String getCustomerCode() {
		return CustomerCode;
	}

	public void setCustomerCode(String customerCode) {
		CustomerCode = customerCode;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerAddr1() {
		return CustomerAddr1;
	}

	public void setCustomerAddr1(String customerAddr1) {
		CustomerAddr1 = customerAddr1;
	}

	public String getCustomerAddr2() {
		return CustomerAddr2;
	}

	public void setCustomerAddr2(String customerAddr2) {
		CustomerAddr2 = customerAddr2;
	}

	public int getCustomerPinCode() {
		return CustomerPinCode;
	}

	public void setCustomerPinCode(int customerPinCode) {
		CustomerPinCode = customerPinCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int  number) {
		this.number = number;
	}

	public String getPrimaryContactPerson() {
		return PrimaryContactPerson;
	}

	public void setPrimaryContactPerson(String primaryContactPerson) {
		PrimaryContactPerson = primaryContactPerson;
	}

	public String getRecordStatus() {
		return RecordStatus;
	}

	public void setRecordStatus(String recordStatus) {
		RecordStatus = recordStatus;
	}

	public String getFlag() {
		return Flag;
	}

	public void setFlag(String flag) {
		Flag = flag;
	}

	


	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	
	
	public String execute() throws java.text.ParseException{  
		
		
		SessionMap<String, String> sessionmap = null;
		
		//String n=request.getParameter("fid"); 
		
		 int i=InsertData.insert(this);
		    if(i>0){  
		    	//sessionmap.put("message", "New Record Added Successfully.");
		    return "success";  
		    }  
		    else
		    {
		    return "error"; 
		
		    }

	
	
	}
	}
	/*
	String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";



	@Override
	public String execute() throws Exception {
	    HttpSession session=ServletActionContext.getRequest().getSession(false);  

		System.out.println("in execute");
		insert();
	    if  (value==1)
	    {System.out.println("here1");
		  return "success";
	    }
	    else 
	    System.out.println("here2");
	  return "error";
	}
	
	
	
	
	
	
	@Override
	public void validate() {
	System.out.println("in validate");
		 
		  if(mb.getCustomerCode().equals(""))
	      addFieldError("customercode", "customercode can't be empty");
		  if(mb.getCustomerName().equals(""))
	      addFieldError("customername", "customername can't be empty");
		  if(mb.getCustomerAddr1().equals(""))
	      addFieldError("address1", "address1 can't be empty");
		  if(mb.getCustomerAddr2().equals(""))
	      addFieldError("address2", "address2 can't be empty");
	//	  if(mb.getCustomerPinCode().equals(""))
	  //    addFieldError("pincode", "pincode can't be empty");
		  if(mb.getEmail().equals(""))
	      addFieldError("email", "email can't be empty");
		//  if(mb.getNumber().equals(""))
	      //addFieldError("contact", "contact can't be empty");
		  if(mb.getPrimaryContactPerson().equals(""))
	      addFieldError("primarycontact", "primarycontact can't be empty");
		  if(mb.getRecordStatus().equals(""))
	      addFieldError("rstatus", "rstatus can't be empty");
		  if(mb.getFlag().equals(""))
	      addFieldError("flag", "flag can't be empty");
		  if(mb.getCreatedBy().equals(""))
	      addFieldError("createdby", "createdby can't be empty");
		 	  
		//  if((mybean.a1).contains(customercode))
			//  addFieldError("customercode","not a valid customer code");
		  if(mb.getCustomerName().length() >= 30  || ! (mb.getCustomerName().matches("[a-zA-Z0-9 ]*" )))
			  addFieldError("customername","enter a valid customer name ");
		  if(mb.getCustomerAddr1().length()>=100)
			  addFieldError("address1","address1 too large ");
		  if(mb.getCustomerAddr2().length()>=100)
			  addFieldError("address2","address2 too large ");
	 //   if(mb.getCustomerPinCode().length()!=6)
		//	  addFieldError("pincode","pincode can be of 6 charachters only ");
	   // if(!mb.getCustomerPinCode().matches(regex)) 
		//	  addFieldError("pincode","pincode can be numeric only ");
	    if(mb.getEmail().length()>=100 || !mb.getEmail().matches(EMAIL_REGEX))
			  addFieldError("email","email not valid ");
		 if(!(mb.getRecordStatus().equals("m")|| mb.getRecordStatus().equals("n")||mb.getRecordStatus().equals("a")||mb.getRecordStatus().equals("r")||mb.getRecordStatus().equals("d")))
			 addFieldError("rstatus","rstatus not valid ");
		 if(!(mb.getFlag().equals("a")|| mb.getFlag().equals("i")))
			 addFieldError("flag","invalid flag12");

	}

	*/
	
	
	
	
	
	
	 
	
		    


	

