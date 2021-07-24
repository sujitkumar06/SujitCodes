package com.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entities.Product;
import com.repositories.ProductRepository;

@SpringBootApplication
public class GetEntitiesListApplication implements CommandLineRunner {
	
	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(GetEntitiesListApplication.class, args);
	}

	@Override
	public void run(String...arg0)throws Exception{
		for(Product product : productRepository.findAll()) {
			System.out.println("ID:" +product.getId());
			System.out.println("ID:" +product.getQuantity());
			}
		}
}
