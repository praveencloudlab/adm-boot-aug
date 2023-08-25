package com.cts.ecart.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository

public class ProductRepositoryOracleImpl implements ProductRepository{

	@Override
	public void save() {
		System.out.println("OracleDB: Product is saved...");
		
	}

}
