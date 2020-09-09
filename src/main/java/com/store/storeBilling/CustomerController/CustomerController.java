package com.store.storeBilling.CustomerController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.store.storeBilling.CustomerModel.Customer;
import com.store.storeBilling.CustomerRepository.CustomerRepo;
import com.store.storeBilling.CustomerService.CustomerService;
import com.store.storeBilling.model.Book;

@RestController
public class CustomerController {
	//master test
	@Autowired
	CustomerRepo repo;
	@Autowired
	CustomerService service;

	// Reading all the customer records from repository.
	@GetMapping("/customers")
	public List<Customer> all() {
		return repo.table();
	}

	// Updating the customer record.
	@PutMapping("/cust/{cust_Fname}")
	public List<Customer> updateinfo(@PathVariable("cust_Fname") String cust_Fname) {
		return service.up(cust_Fname);
	}

	// Creating the records dynamically.
	@PostMapping("/cust")
	public List<Customer> create(@RequestBody Customer customer) {

		return service.createmore(customer);

	}
	
//	Search record by cust_ID 
	@GetMapping("/search/{cust_ID}")
	public Customer searchByCustId(@PathVariable int cust_ID) {
		return service.searchByCustId(cust_ID);
	}

}
