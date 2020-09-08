package com.store.storeBilling.booksrepo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.store.storeBilling.booksmodel.Books;

@Repository

public class BooksRepo {
	
	public List<Books> creatRepository() {
		List<Books> blist=new ArrayList<>();  
	      
	    Books b1=new Books("id1","tile1","author1",5.99,2000,8);  
	    Books b2=new Books("id2","tile2","author2",5.99,2001,18);  
	    Books b3=new Books("id3","tile3","author3",5.50,2002,8);  
	    Books b4=new Books("id4","tile4","author4",5.45,2003,8);
	    
	    blist.add(b1);
	    blist.add(b2);
	    blist.add(b3);
	    blist.add(b4);
	    
	    return blist;
	}
	
	
    
    
    
    

      
   
	

}
