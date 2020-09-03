package com.store.storeBilling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.storeBilling.model.Book;
import com.store.storeBilling.service.StoreBillingService;

@RestController
@RequestMapping("/sb")
public class StoreBillingController {

	@Autowired
	private StoreBillingService list1;

	@GetMapping("/welcome")
	public String welcome() {
		return list1.retriveWelcomeMessage();
	}

	@GetMapping("/search/{id}")
	public Book searchById(@PathVariable int id) {
		return list1.searchById(id);
	}

}
