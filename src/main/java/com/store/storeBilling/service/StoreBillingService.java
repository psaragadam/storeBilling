package com.store.storeBilling.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.store.storeBilling.model.Book;

@Service
public class StoreBillingService {


	public String retriveWelcomeMessage() {
		return "Welcome to BookStore... Choose your book to read";
	}

	public Book searchById(int id) {
		ArrayList<Book> list = new ArrayList<Book>();

		// Creating Books
		Book b1 = new Book(101, "Let us C", 20, "Technical", 5, "available");
		Book b2 = new Book(102, "The Joy of Cooking", 20, "CookBook", 3, "available");
		Book b3 = new Book(103, "Head First Java", 29, "Technical", 10, "available");
		Book b4 = new Book(104, "Crepe Paper Flowers: The Beginner's Guide to Making and Arranging Beautiful Blooms", 3,
				"eBook", 7, "available");
		Book b5 = new Book(105, "Rich Dad Poor Dad", 7, "audioBook", 15, "available");

		// Adding Books to list

		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		System.out.println(list);

		// Traversing list
		for (Book b : list) {
			if (id == b.id) {
				return b;
			}
			System.out.println(b.id + " " + b.name + " " + b.price + " " + b.quantity + " " + b.status);
		}

		return null;

	}

}
