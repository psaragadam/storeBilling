package com.store.storeBilling.CustomerService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.store.storeBilling.CustomerModel.Customer;
import com.store.storeBilling.CustomerRepository.CustomerRepository;



@Service
public class CustomerService {
	@Autowired
	CustomerRepository repos;
	
	
	public  List<Customer> up(String name) {
		repos.table();
		//Customer c=null;
		//repos.cust.forEach(elem->elem.getCust_Fname().equalsIgnoreCase("rama")
		
	
		repos.table();
		Optional<Customer> sitaCustomer=repos.cust.stream().filter(a -> a.getCust_Fname().equals(name)).findFirst();
	
		if(sitaCustomer.isPresent()) {
			Customer sitaCust = sitaCustomer.get();
			sitaCust.setCust_Fname("Ganga");
			sitaCust.setCust_Lname("Bhavani");
			sitaCust.setCust_ID(911);
			sitaCust.setAddress("33-33,Sony Towers,TK Nagar");
			sitaCust.setEmailID("ganga.bhavani@yahoo.com");
			 repos.cust.add(sitaCust);
			 return repos.cust;
		}else {
			return null;
		}
	}
	
	 public List<Customer> createmore(Customer ad)
	 {
		 repos.table();
		 repos.cust.add(ad);
		 
		 return repos.cust;
	 }
	  public Customer update(Customer customer)
		 {
		   repos.cust.add(customer);
			 return customer;
		 }
	
}
