package com.cts.ecart.service;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	public ProductServiceImpl() {
		System.out.println(">> ProductServiceImpl object created..");
	}
	
	
	@Override
	public void f1() {
		System.out.println(">> f1 :: ProductServiceImpl");
	}

}
