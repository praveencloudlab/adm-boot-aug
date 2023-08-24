package com.cts.ecart.service;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl {
	public ProductServiceImpl() {
		System.out.println(">> ProductServiceImpl object created..");
	}
	
	public void f1() {
		System.out.println(">> f1 :: ProductServiceImpl");
	}

}
