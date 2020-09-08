package com.store.storeBilling.Productmodel;

public class Productmodel {
	String name;
	String id;
	String prodtype;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProdtype() {
		return prodtype;
	}
	public void setProdtype(String prodtype) {
		this.prodtype = prodtype;
	}
	public Productmodel(String name, String id, String prodtype) {
		
		this.name = name;
		this.id = id;
		this.prodtype = prodtype;
	}
	@Override
	public String toString() {
		return "Productmodel [name=" + name + ", id=" + id + ", prodtype=" + prodtype + "]";
	}
	

}
