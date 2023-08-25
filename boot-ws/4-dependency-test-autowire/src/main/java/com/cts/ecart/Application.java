package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.repository.ProductRepositoryImpl;
import com.cts.ecart.service.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductServiceImpl ps1 = context.getBean(ProductServiceImpl.class);
		ProductServiceImpl ps2 = context.getBean(ProductServiceImpl.class);

		ps1.saveProduct();
		ps2.saveProduct();
		
		
		/*
		
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
		 * 
		 * 
		 */
		
		
		
	}

}
