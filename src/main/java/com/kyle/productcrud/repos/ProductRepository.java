package com.kyle.productcrud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kyle.productcrud.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	

}
