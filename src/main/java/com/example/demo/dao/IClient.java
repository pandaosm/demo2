package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Client;


public interface IClient extends JpaRepository<Client, String>{
	
	@Query(nativeQuery = true , value = "select * from  client_temp where CODE_RACINE=:CODE_RACINE")
	Client findByCustomerId(@Param ("CODE_RACINE")String clientId);
	
	//@Query(countQuery = "SELECT COUNT(1)  FROM Account account  WHERE (1=0 or account.client In :clientId  or account.accountNumber In :accNum)  ORDER BY account.clientId, account.accountNumber ", value = "SELECT account.customer  FROM Account account  WHERE (1=0 or account.client In :clientId  or account.accountNumber In :accNum)  ORDER BY account.customer.customerId")
	  //List<Client> getCustomerList(@Param("clientId") List<String> paramList1, @Param("accNum") List<String> paramList2);
	
	@Query(value = "select client from  Client client where client.branchCode=:branchCode")
	Client findByBranchCode(@Param ("branchCode")String branchCode);
	
	}
