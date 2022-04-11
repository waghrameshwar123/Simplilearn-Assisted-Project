package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;
import com.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public Product findById(Integer id) {
		Optional<Product> temp = productRepository.findById(id);
		if(temp.isPresent())
		{
			return temp.get();
		}
		return null;
	}

	@Override
	public List<Product> findByProdname(String prodname) {
		return productRepository.findByProdname(prodname);
	}

	@Override
	public List<Product> findByCategory(String category) {
		return productRepository.findByCategory(category);
	}

	@Override
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public void updateProduct(Integer id, Product product) {
		Optional<Product> temp = productRepository.findById(id);
		if(temp.isPresent())
		{
			productRepository.save(product);
		}
	}

	@Override
	public void deleteProduct(Integer id) {
		Optional<Product> temp = productRepository.findById(id);
		if(temp.isPresent())
		{
			productRepository.delete(temp.get());
		}
	}

}
