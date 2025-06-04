package com.exemple;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.entities.Product;

@RestController
public class ProductController {
	@GetMapping("/products")
	public List<Product> getProducts(){
		return List.of(
				new Product("Onion", 1, 15.00),
				new Product("Apple", 2, 13.00),
				new Product("Melon", 3, 12.00)
				);
	}

	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable int id){
		List<Product> products = List.of(
				new Product("Onion", 1, 15.00),
				new Product("Apple", 2, 13.00),
				new Product("Melon", 3, 12.00)
				);
		
		for(Product p : products) {
			if(p.getId() == id) {
				return p;
			}
		}
		
		return null;
	}
}
