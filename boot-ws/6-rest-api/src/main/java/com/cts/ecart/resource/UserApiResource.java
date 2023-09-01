package com.cts.ecart.resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.model.Product;


@RestController
@RequestMapping("/api/products")
public class UserApiResource {
	
	@GetMapping
	public String f1() {
		return "F1::GET Mapping";
	}
	
	@GetMapping("/{prodName}")
	public String f11(@PathVariable String prodName) {
		return "F11::GET Mapping - "+prodName;
	}
	@GetMapping("/{prodName}/{qty}")
	public String f1111(@PathVariable String prodName,@PathVariable int qty) {
		return "F1111::GET Mapping - "+prodName +"and QTY: "+qty;
	}
	
	@GetMapping("/q1")
	public String f111(@RequestParam String prodName) {
		return "F111::GET Mapping - "+prodName;
	}
	
	@GetMapping("/product")
	public Product f11111() {
		return new Product(1, "Pen", 1000);
	}
	
	
	

	@PostMapping
	public String f2() {
		return "F2::POST Mapping";
	}
	
	@PostMapping("/save")
	public Product f22(@RequestBody Product prod) {
		System.out.println(prod);
		return prod;
	}
	
	@PutMapping
	public String f3() {
		return "F3::PUT Mapping";
	}
	
	@PatchMapping
	public String f4() {
		return "F4::PATCH Mapping";
	}
	
	@DeleteMapping
	public String f5() {
		return "F5::DELETE Mapping";
	}

	

}
