package com.example.demo;

import java.net.MalformedURLException;
import java.util.List;

import javax.persistence.EntityManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
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
	    
	    private static Logger LOGGER = null;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("test boa client");
		System.setProperty("log4j.configurationFile", "log4j2-testConfig.xml");
		LOGGER = LogManager.getLogger();
		
	//Client client= new Client();
		
		LOGGER.info("*****************info**************");
			
       // Client product = repository.findByCustomerId("A1");
        
      //  System.out.println(product.getCustomerName());
		
	}
	

	
}
