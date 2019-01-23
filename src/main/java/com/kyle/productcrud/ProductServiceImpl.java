package com.kyle.productcrud;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.kyle.productcrud.entities.Product;
import com.kyle.productcrud.repos.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository repository;

	@Override
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@Override
	public Product getProduct(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Response createProduct(Product product) {
		Product savedProduct = repository.save(product);
		return Response.ok(savedProduct).build();
	}

	@Override
	public Response updateProduct(Product product) {
		Product savedProduct = repository.save(product);
		return Response.ok(savedProduct).build();
	}

	@Override
	public Response deleteProduct(int id) {
		return null;
	}

}
