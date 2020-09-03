package com.store.storeBilling.CustomerModel;

public class Customer {
	private int cust_ID;
	private String cust_Fname;
	private String cust_Lname;
	private String address;
	private String emailID;
	private String contact_Number;
	public int getCust_ID() {
		return cust_ID;
	}
	public String getCust_Fname() {
		return cust_Fname;
	}
	public String getCust_Lname() {
		return cust_Lname;
	}
	public String getAddress() {
		return address;
	}
	public String getEmailID() {
		return emailID;
	}
	public String getContact_Number() {
		return contact_Number;
	}
	public void setCust_ID(int cust_ID) {
		this.cust_ID = cust_ID;
	}
	public void setCust_Fname(String cust_Fname) {
		this.cust_Fname = cust_Fname;
	}
	public void setCust_Lname(String cust_Lname) {
		this.cust_Lname = cust_Lname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public void setContact_Number(String contact_Number) {
		this.contact_Number = contact_Number;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cust_ID, String cust_Fname, String cust_Lname, String address, String emailID,
			String contact_Number) {
		super();
		this.cust_ID = cust_ID;
		this.cust_Fname = cust_Fname;
		this.cust_Lname = cust_Lname;
		this.address = address;
		this.emailID = emailID;
		this.contact_Number = contact_Number;
	}
	@Override
	public String toString() {
		return "Customer [cust_ID=" + cust_ID + ", cust_Fname=" + cust_Fname + ", cust_Lname=" + cust_Lname
				+ ", address=" + address + ", emailID=" + emailID + ", contact_Number=" + contact_Number + "]";
	}
	
	

}
