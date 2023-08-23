package com.cts.ecart;

import com.cts.ecart.repository.ProductRepositoryImpl;
import com.cts.ecart.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
			
		
		//==============================================================
		ProductRepositoryImpl prodRepo=new ProductRepositoryImpl(); //dependency
		//==============================================================

		ProductServiceImpl ps1=new ProductServiceImpl(); // dependent
		ProductServiceImpl ps2=new ProductServiceImpl(); // dependent

		ps1.setProdRepo(prodRepo); // injecting dependency object(prodRepo) to the dependent object (ps1,pas2) is called DI
		ps2.setProdRepo(prodRepo);
		
		//========================
		ps1.saveProduct(); // BL
		ps2.saveProduct(); // BL
		//========================
		
		
		

	}

}
