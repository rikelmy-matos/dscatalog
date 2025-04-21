package com.devsuperior.dscatalog.tests;

import java.time.Instant;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

public class Factory {
	
	public static Product createProduct() {
		
		Product product = new Product(26L, "Phone", "Good Phone", 800.0, "https://img.com/img.png", Instant.parse("2025-04-20T23:00:00Z"));
		product.getCategories().add(new Category(1L, "Eletrônicos"));
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}

}
