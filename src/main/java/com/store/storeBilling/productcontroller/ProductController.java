package com.store.storeBilling.productcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.storeBilling.Productmodel.Productmodel;
import com.store.storeBilling.productrepository.ProductRepo;
import com.store.storeBilling.productservice.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductRepo prodtrepo;
	@Autowired
	ProductService prodtsevice;
	
	@GetMapping("/byProdtype/{prodtype}")
	public List<Productmodel> call(@PathVariable("prodtype")String prodtype) {
		
		return prodtsevice.search(prodtype);
		
		
		
	}
	
	@GetMapping("/prod")
	
public List<Productmodel> calling(@RequestParam String prodtype) {
		System.out.println(prodtrepo.create(prodtype));
		
		return prodtrepo.create(prodtype);
		
		
		
	}
}
