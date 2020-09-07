package com.store.storeBilling.booksmodel;

public class Books {
	
	String id;
	String title;
	String author;
	double price;
	int yearOfPublish;
	int noOfCopies;
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(String id, String title, String author, double price, int yearOfPublish, int noOfCopies) {
		super();
		this.id = id;
		this.title = title;
		    
		this.author = author;
		this.price = price;
		this.yearOfPublish = yearOfPublish;
		this.noOfCopies = noOfCopies;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYearOfPublish() {
		return yearOfPublish;
	}
	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	@Override
	public String toString() {
		return "productsModel [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", yearOfPublish=" + yearOfPublish + ", noOfCopies=" + noOfCopies + "]";
	}
	public Object getBooksList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
