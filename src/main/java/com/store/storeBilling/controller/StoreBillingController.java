package com.store.storeBilling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.storeBilling.bookRepository.BookRepository;
import com.store.storeBilling.model.Book;
import com.store.storeBilling.service.StoreBillingService;

@RestController
@RequestMapping("/sb")
public class StoreBillingController {
	@Autowired
	private BookRepository repo;

	@Autowired
	private StoreBillingService service;

	@GetMapping("/welcome")
	public String welcome() {
		return service.retriveWelcomeMessage();
	}

	@GetMapping("/add")
	public List<Book> addBooks() {
		return repo.addBooks();
	}
	
//	@GetMapping("/book/{type}")
//	public Book searchByType(@PathVariable String type) {
//		return service.searchByType(type);
//	}
	
	@GetMapping("/search/{id}")
	public Book searchById(@PathVariable int id) {
		return service.searchById(id);
	}

}
