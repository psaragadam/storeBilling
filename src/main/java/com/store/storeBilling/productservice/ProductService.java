package com.store.storeBilling.productservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.storeBilling.Productmodel.Productmodel;
import com.store.storeBilling.productrepository.ProductRepo;
@Service
public class ProductService {
	@Autowired
	ProductRepo prodtrepo;
	
	public List<Productmodel> search(String type) {
		
		List l=prodtrepo.pm.stream().filter(a->a.getProdtype().equalsIgnoreCase(type)).collect(Collectors.toList());
		System.out.println( l);
		return l;
	}
	 

}
