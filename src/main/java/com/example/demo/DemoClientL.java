package com.example.demo;

import com.example.demo.entity.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.demo.dao.IClient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
//@EnableEurekaClient
public class DemoClientL implements CommandLineRunner{

	    
	    @Autowired
	    private IClient repository;
	    
	    private static Logger LOGGER = null;

	public static void main(String[] args) {
		SpringApplication.run(DemoClientL.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("---------------------test boa client------------------------");
		System.setProperty("log4j.configurationFile", "log4j2-testConfig.xml");
		LOGGER = LogManager.getLogger();
		
	//Client();
		
		LOGGER.info("*****************info**************");
			
       // Client product = repository.findByCustomerId("A1");
        
      //  System.out.println(product.getCustomerName());
		List<Client> listClient = new ArrayList();
		Client clt = new Client();
		clt.setBranchCode("1111A");
		clt.setCustomerId("FOFANA1111A");
		clt.getCustomerName("fofana");
		repository.save(clt);

		listClient.add(1,clt);
		clt.setBranchCode("1112A");
		clt.setCustomerId("VALEDY1112A");
		clt.getCustomerName("VALEDY");
		repository.save(clt);

		listClient.add(2,clt);

		Strea


		Stream<Client> strClient = listClient.parallelStream().
	}
	

	
}
