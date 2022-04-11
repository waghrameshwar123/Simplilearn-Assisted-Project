package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {

	void addProduct(Product product);
	
	Product findById(Integer id);
	List<Product> findByProdname(String prodname);
	List<Product> findByCategory(String category);
	List<Product> findAllProduct();
	
	void updateProduct(Integer id, Product product);
	void deleteProduct(Integer id);
}
