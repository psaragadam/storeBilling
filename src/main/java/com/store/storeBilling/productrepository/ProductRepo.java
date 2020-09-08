package com.store.storeBilling.productrepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.store.storeBilling.Productmodel.Productmodel;

@Component
public class ProductRepo {
	
public  List<Productmodel> pm = new ArrayList<Productmodel>();
 
 public List<Productmodel> create(String type){
	 
 pm.add(new Productmodel("Dolphins","rf-nfa2","Non-Fiction"));
 pm.add(new Productmodel("Gulliver's Travels","rf-fp5","Fiction"));
 pm.add(new Productmodel("Who WasElbert Einstein","rf-nfs1","Non-Fiction"));
	List m=pm.stream().filter(a->a.getProdtype().equalsIgnoreCase(type)).collect(Collectors.toList());
 return m;
 
 }


}
