package com.majdoubformation.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.majdoubformation.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
