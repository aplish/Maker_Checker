package checker717;

import com.opensymphony.xwork2.ActionSupport;

public class myBean extends ActionSupport {
	private int CustomerID;
	private String CustomerCode;
	private String CustomerName;
	private String CustomerAddr1;
	private String CustomerAddr2;
	private int CustomerPinCode;
	private String email;
	private long number;
	private String PrimaryContactPerson;
	private char RecordStatus;
	private char Flag;
	
	//private String CreationDate;
	 java.sql.Date CreationDate;
	
	
	private String CreatedBy;
	 java.sql.Date ModDate;
	//private String moddate;
	private String modby;
	//private String authdate;
	 java.sql.Date authDate;
	private String authby;
	
	
	
	
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
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
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getPrimaryContactPerson() {
		return PrimaryContactPerson;
	}
	public void setPrimaryContactPerson(String primaryContactPerson) {
		PrimaryContactPerson = primaryContactPerson;
	}
	public char getRecordStatus() {
		return RecordStatus;
	}
	public void setRecordStatus(char recordStatus) {
		RecordStatus = recordStatus;
	}
	public char getFlag() {
		return Flag;
	}
	public void setFlag(char flag) {
		Flag = flag;
	}
	/*
	 * public String getCreationDate() {
	
		return CreationDate;
	}
	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	} */
	public String getCreatedBy() {
		return CreatedBy;
	}
	public java.sql.Date getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(java.sql.Date creationDate) {
		CreationDate = creationDate;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	
	public java.sql.Date getModDate() {
		return ModDate;
	}
	public void setModDate(java.sql.Date modDate) {
		ModDate = modDate;
	}
	public java.sql.Date getAuthDate() {
		return authDate;
	}
	public void setAuthDate(java.sql.Date authDate) {
		this.authDate = authDate;
	}
	public String getModby() {
		return modby;
	}
	public void setModby(String modby) {
		this.modby = modby;
	}

	
	public String getAuthby() {
		return authby;
	}
	public void setAuthby(String authby) {
		this.authby = authby;
	}
	
}
