package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.ecart.repository.ProductRepository;
//dependent
@Service
public class ProductServiceImpl {
	
	
	//@Autowired
	//@Qualifier(value = "productRepositoryOracleImpl")
	//private ProductRepository prodRepo;
	
	@Autowired
	@Qualifier(value = "productRepositoryImpl")
	private ProductRepository prodRepo;

	/*
	public ProductServiceImpl(ProductRepository prodRepo) {
		this.prodRepo = prodRepo;
	}
	*/




	public void saveProduct() {
		//ProductRepositoryImpl prodRepo=new ProductRepositoryImpl();// dependency
		System.out.println("SERVICE:::saveProductImpl");
		prodRepo.save();
	}
	
	

}
