package com.majdoubformation.demo.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product implements Serializable {
	
	@Id @GeneratedValue
    private Long id;
    private String nom;
    private String price;
    
    public Product(Long id,String nom,String price) {
    	this.id=id;
    	this.nom=nom;
    	this.price=price;
    }
    public Product() {
    	
    }
    public Product(String nom,String price) {
    	this.nom=nom;
    	this.price=price;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return this.nom;
    }
    
    public String getNom() {
		return nom;
	}
    public String getPrice() {
		return price;
	}
    
    public void setNom(String nom) {
		this.nom = nom;
	}
    public void setPrice(String price) {
		this.price = price;
	}
    
    public Long getId() {
		return id;
	}
    public void setId(Long id) {
		this.id = id;
	}

}
