package com.store.storeBilling.CustomerRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.store.storeBilling.CustomerModel.Customer;

@Component
public class CustomerRepository {
	public List<Customer> cust = new ArrayList<Customer>();
   //This is the table Instead of Database
	public List<Customer> table() {
		cust.add((new Customer(100, "Rama", "Chandra", "2-21/10,Leena Mahal,Ramanthapur,HYD", "rama.chandra@gmail.com",
				"678-778-9087")));
		cust.add((new Customer(101, "Seetha", "Janaki", "6-21/10,Santhi Mahal,Madhapur,HYD", "seetha.janaki@gmail.com",
				"900-778-9087")));
		cust.add((new Customer(102, "Krishna", "Kannaya", "3-21/10,Srinagr Colony,Ameerpet,HYD",
				"rama.chandra@gmail.com", "777-778-9087")));
		cust.add((new Customer(103, "Balram", "Mukherjee", "4-21/10,T -Zone,Secunderabad,HYD", "rama.chandra@gmail.com",
				"678-778-9087")));
		cust.add((new Customer(104, "Lakshman", "Kande", "5-21/10,Stony Hills,Lingampally,HYD",
				"rama.chandra@gmail.com", "211-778-9087")));
		cust.add((new Customer(105, "Saraswathi", "Swarroop", "8-21/10,Megha Hills,ECIL,HYD", "rama.chandra@gmail.com",
				"344-778-9087")));
		cust.add((new Customer(106, "Lakshmi", "Rajyam", "9-21/10,ASRao Nagar,HYD", "rama.chandra@gmail.com",
				"908-778-9087")));
		cust.add((new Customer(107, "Durga", "Devi", "12-21/10,My Home Hub,Taranaka,HYD", "rama.chandra@gmail.com",
				"567-778-9087")));
		cust.add((new Customer(108, "Arjun", "Pande", "23-21/10,Toll bros,HYD", "rama.chandra@gmail.com",
				"876-778-9087")));
		cust.add((new Customer(109, "Shashi", "Vangepalli", "2-21/10,Pranam colony,RTCX roads,HYD",
				"rama.chandra@gmail.com", "108-778-9087")));
		cust.add((new Customer(110, "Mohit", "Agarwal", "19-21/10,PNT Colony,Chikadpally,HYD", "rama.chandra@gmail.com",
				"123-778-9087")));
		cust.add((new Customer(111, "Sahasra", "Deepthi", "31-21/10,Tom hills,Malkajgiri,HYD", "rama.chandra@gmail.com",
				"148-778-9087")));
		return cust;
	}
}
