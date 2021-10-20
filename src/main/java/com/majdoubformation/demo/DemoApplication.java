package com.majdoubformation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.majdoubformation.demo.dao.ProductRepository;
import com.majdoubformation.demo.entities.Product;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	
		
	@Override
	public void run(String... args) throws Exception {
		
		Product p=new Product("NAME DSDS","KSDOIHSDHIFDS");
		Product p2=new Product("NAME DSDS","KSDOIHSDHIFDS");

		productRepository.save(p);
		productRepository.save(p2);

		productRepository.findAll().forEach(product->{
			System.out.println("DATABASE PRODUCT");
			System.out.println(product.getNom());
		});
		
	}
	


}
