package com.store.storeBilling.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.storeBilling.bookRepository.BookRepository;
import com.store.storeBilling.model.Book;

@Service
public class StoreBillingService {
	
	public String retriveWelcomeMessage() {
		return "Welcome to BookStore... Choose your book to read";
	}
	
	@Autowired
	BookRepository repos;


//	public Book searchByType(String type) {
//		// Traversing list
//				for (Book t : repos.list) {
//					if (type == t.type) {
//						return t;
//					}
//					System.out.println(t.id + " " + t.name + " " + t.price + " "+ t.type +" " +t.quantity + " " + t.status);
//				}
//		
//		return null;
//	}
					

	public Book searchById(int id) {
		
		
		// Traversing list
		for (Book b : repos.list) {
			if (id == b.id) {
				return b;
			}
			System.out.println(b.id + " " + b.name + " " + b.price + " " + b.quantity + " " + b.status);
		}
		
		return null;
	}





}
