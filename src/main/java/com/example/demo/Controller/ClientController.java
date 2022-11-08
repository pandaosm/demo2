package com.example.demo.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IClient;
import com.example.demo.entity.Client;

@RestController
public class ClientController {

	public ClientController() {
	}

	private Logger log = LoggerFactory.getLogger(ClientController.class);
	@Autowired
	private IClient iClient;
	//this is client
	@GetMapping("/getClientByCodeAgence/{branchCode}")
	public Client getClient(@PathVariable String branchCode) {
		log.info("client " + branchCode)  ;
		if (!branchCode.isEmpty() ==true && branchCode.length()>0) {
			Client client = iClient.findByBranchCode(branchCode);
			return client;
		}
		return null;
	}
	
	
	@GetMapping("/client/{customerId}") // get client by Id
	public Client getClientBycustomerId(@PathVariable String customerId) {
		
		log.info("client " + customerId)  ;
		if (!customerId.isEmpty() ==true && customerId.length() != 0) {
			Client client = iClient.findByCustomerId(customerId);
			return client;
		}
		return null;
	}
	
	@GetMapping("/clients")
	public List<Client> getAllClient() {
		return iClient.findAll();
		}
	
	
//	
//	@GetMapping("/geAlltClientsName")
//	public Map<String,String> getAllClientName() {
//		Stream<Client> streamClient = iClient.findAll().stream(); 
//		Map<String,String> mapClientName = streamClient.map(e -> e.getCustomerName(),streamClient.sorted());
//		return mapClientName;
//		}
}
