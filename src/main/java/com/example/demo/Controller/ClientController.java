package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IClient;
import com.example.demo.entity.Client;

@RestController
public class ClientController {

	@Autowired
	private IClient iClient;
	
	
	@GetMapping("/getClientByCodeAgence/{codeAgence}")
	public Client getClient(@PathVariable String codeAgence) {
		if (!codeAgence.isEmpty() ==false && codeAgence.length()>0) {
			Client client = iClient.findByCustomerId(codeAgence);
			return client;
		}
		return null;
	}
	
	
	@GetMapping("/geAlltClients")
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
