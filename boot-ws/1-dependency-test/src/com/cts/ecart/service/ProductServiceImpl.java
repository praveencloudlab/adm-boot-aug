package com.cts.ecart.service;

import com.cts.ecart.repository.ProductRepositoryImpl;
//dependent
public class ProductServiceImpl {
	
	//java based BL
	
	/*
	 * Design issues
	 * =====================
	 * -> too many dependency class objects
	 * 		=> memory management issues
	 * 		=> perfoamnce of application goes down
	 * 
	 *  why this issue happened?
	 *  ===============================
	 *  -> dependent class itself creating dependency class object directly
	 *  
	 *  What is the solution?
	 *  ========================
	 *  -> do not create dependency object in the dependent class directly
	 *  -> insted of this, use techniques like JNDI look up ... etc
	 *  	-> JNDI location is tightly coupled with dependent class
	 * 
	 *  What is the best solution?
	 *  ==============================
	 *  -> do not create dependency object directly or do not use look up techniques like JNDI,
	 *  	Instead, ask some one (container) to inject/pass dependency object as parameter. this is called IoC (inversion of control)
	 * 
	 *  How to implement IoC?
	 *  ==========================
	 *  -> using a technique 'dependency injection'
	 *  
	 *  WHat is dependency injection ? (DI)
	 *  =======================================
	 *  ->Injecting/passing dependency object to the dependent object
	 *  
	 *  How to implement DI? : 2 ways
	 *  ========================================
	 *  1.setter based injection
	 *  2.constructor based injection
	 *  
	 *   1.setter based injection
	 *   ==============================
	 *   -> define dependency class reference object in the dependent class at class level.
	 * 	 -> create / generate setter method for above defined property.
	 * 
	 */
	
	
	private ProductRepositoryImpl prodRepo;

	
	public void setProdRepo(ProductRepositoryImpl prodRepo) {
		this.prodRepo = prodRepo;
	}



	public void saveProduct() {
		//ProductRepositoryImpl prodRepo=new ProductRepositoryImpl();// dependency
		System.out.println("SERVICE:::saveProductImpl");
		prodRepo.save();
	}
	
	

}
