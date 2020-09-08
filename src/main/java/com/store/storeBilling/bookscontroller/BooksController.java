package com.store.storeBilling.bookscontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.storeBilling.booksmodel.Books;
import com.store.storeBilling.booksrepo.BooksRepo;

//@SuppressWarnings("unused")
@RestController
@RequestMapping(path= "/Books")
public class BooksController {
	
	@Autowired
	
	private BooksRepo booksrepo;
	
	@GetMapping(path= "/AddBooks")
	public void AddBooksList() {
		// test into master
		List<Books> bookList = booksrepo.creatRepository();
	}
	
	

}
