package com.cts.ecart.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.entity.ProductDetails;
import com.cts.ecart.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductApiResource {
	
	@Autowired
	private ProductRepository  prodRepo;
	
	@GetMapping
	public List<ProductDetails> listAllProducts(){
		return prodRepo.findAll();
	}
	
	@PostMapping
	public ProductDetails save(@RequestBody ProductDetails prodDetails) {
		return prodRepo.save(prodDetails);
	}
	
	

}
