package com.majdoubformation.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.majdoubformation.demo.dao.ProductRepository;
import com.majdoubformation.demo.entities.Product;

@RestController
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public List<Product>  get_products() {
			return productRepository.findAll();
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.GET)
	public Product getProduct(@PathVariable Long id) throws Exception{
		try {
			return productRepository.getById(id);
		}
		catch (Exception e) {
			System.err.println(e.toString());
			return null;
		}
	}

	@RequestMapping(value="/products",method=RequestMethod.POST)
	public Product add_product(@RequestBody Product p) {
			Product p2=productRepository.save(p);
			return p2;
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.DELETE)
	public void  delete_product(@PathVariable Long id) {
			Product p=productRepository.getById(id);
			productRepository.delete(p);
//			return p;
	}
	
}
