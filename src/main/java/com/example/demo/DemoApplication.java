package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.IClient;
import com.example.demo.entity.Client;

@SpringBootApplication
//@EnableEurekaClient
public class DemoApplication implements CommandLineRunner{

	    
	    @Autowired
	    private IClient repository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("test boa client");
		
		Client client= new Client();
		
		
        Client product = repository.findByCustomerId("A1");
        
        System.out.println(product.getCustomerName());
		
	}
	

	
}
