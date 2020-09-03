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
import com.store.storeBilling.CustomerRepository.CustomerRepository;
import com.store.storeBilling.CustomerService.CustomerService;


@RestController
public class CustomerController {
	@Autowired
	CustomerRepository repo;
	@Autowired
	CustomerService service;
	@GetMapping("/customers")
	public List<Customer> all()
	{ 
		return repo.table();		     
	}
	   
	  // public Customer updateinfo(@PathVariable("") int id, @RequestBody Customer customer) { 
		
	   //  if(!repo.cust.add(customer));
	      //repo.cust.remove(id);
	     // repo.cust.set(id, customer);
	      //repo.cust.put(id, customer);
	@PutMapping("/cust/{cust_Fname}")
	   public List<Customer> updateinfo(@PathVariable("cust_Fname") String cust_Fname,@RequestBody Customer customer) {
		   
	      return  service.up(cust_Fname);
	     
	   }
	   @PostMapping("/cust")
	   public List<Customer> create(@RequestBody Customer customer)
		{
				
			return service.createmore(customer);
		
		}
	
	
}