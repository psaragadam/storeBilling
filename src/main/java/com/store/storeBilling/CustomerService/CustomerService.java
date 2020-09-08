package com.store.storeBilling.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.store.storeBilling.CustomerModel.Customer;
import com.store.storeBilling.CustomerRepository.CustomerRepository;
import com.store.storeBilling.model.Book;

@Service
public class CustomerService {
	
	

	@Autowired
	CustomerRepository repos;
   //Updating the records by Comparing the first name.
	public List<Customer> up(String name) {
		repos.table();
		repos.table();
		Optional<Customer> sitaCustomer = repos.cust.stream().filter(a -> a.getCust_Fname().equals(name)).findFirst();

		if (sitaCustomer.isPresent()) {
			Customer sitaCust = sitaCustomer.get();
			sitaCust.setCust_Fname("Ganga");
			sitaCust.setCust_Lname("Bhavani");
			sitaCust.setCust_ID(911);
			sitaCust.setAddress("33-33,Sony Towers,TK Nagar");
			sitaCust.setEmailID("ganga.bhavani@yahoo.com");
			repos.cust.add(sitaCust);
			return repos.cust;
		} else {
			return null;
		}
	}
   //Creating the records Dynamically.
	public List<Customer> createmore(Customer ad) {
		repos.table();
		repos.cust.add(ad);

		return repos.cust;
	}
	



public Customer searchByCustId(int cust_ID) {
	repos.table();
	for (Customer c: repos.cust) {
		if (cust_ID == c.cust_ID) {
			return c;
		}
		System.out.println(c.cust_ID);
	}
	
	return null;
	
}

}

