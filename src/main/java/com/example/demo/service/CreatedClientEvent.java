package com.example.demo.service;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class CreatedClientEvent {

	  private String customerId;
		
		
	  private String branchCode;
	  
		
	  private String customerName;
}
