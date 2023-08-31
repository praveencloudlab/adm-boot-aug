package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.entity.BrandRepository;
import com.cts.ecart.entity.ProductDetails;
import com.cts.ecart.repository.CategoryRepository;
import com.cts.ecart.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductRepository prodRepo = context.getBean(ProductRepository.class);
		
		CategoryRepository catRepo = context.getBean(CategoryRepository.class);
		BrandRepository brandRepo = context.getBean(BrandRepository.class);
		
		//brandRepo.findAll().forEach(System.out::println);
		
		catRepo.findAll().forEach(System.out::println);
		
		//prodRepo.findAll().forEach(System.out::println);
		
		//ProductDetails prod = prodRepo.findById(1).orElse(null);
		///if(prod!=null)
			//System.out.println(prod);
	}

}
