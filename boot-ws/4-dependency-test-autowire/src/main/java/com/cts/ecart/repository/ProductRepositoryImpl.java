package com.cts.ecart.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//dependency
@Repository
//@Primary
public class ProductRepositoryImpl implements ProductRepository {
	
	public ProductRepositoryImpl() {
		System.out.println(">> ProductRepositoryImpl object created..");
	}
	
	// database related BL
	
	@Override
	public void save() {
		System.out.println(">>MYSQL::: saving to DB");
	}

}
