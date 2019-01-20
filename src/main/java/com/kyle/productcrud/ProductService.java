package com.kyle.productcrud;

import java.util.List;

import javax.ws.rs.core.Response;

import com.kyle.productcrud.entities.Product;

public interface ProductService {
	List<Product> getProducts();
	
	Product getProduct(int id);
	
	Response createProduct(Product product);
	
	Response updateProduct(Product product);
	
	Response deleteProduct(int id);
	
	
	
}
