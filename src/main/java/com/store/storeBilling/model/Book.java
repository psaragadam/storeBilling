package com.store.storeBilling.model;

public class Book {

	public int id;
	public String name;
	public float price;
	public String type;
	public int quantity;
	public String status;


	public Book(int id, String name, float price, String type, int quantity, String status) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", quantity=" + quantity
				+ ", status=" + status + "]";
	}


}




