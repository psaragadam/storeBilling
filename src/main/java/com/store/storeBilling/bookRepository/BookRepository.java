package com.store.storeBilling.bookRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.store.storeBilling.CustomerModel.Customer;
import com.store.storeBilling.model.Book;

@Component
public class BookRepository {
	
	public ArrayList<Book> list = new ArrayList<Book>();
	
	//Creating Records
		public List<Book> addBooks() {
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
//			System.out.println(list);

			return list;
		}

	
}
