package com.example.demo.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




public class AccountServiceRequest {

	private String language;

	private String customerId;

	private String accountNumber;

	private String withTotalAmountExpenses;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getWithTotalAmountExpenses() {
		return withTotalAmountExpenses;
	}

	public void setWithTotalAmountExpenses(String withTotalAmountExpenses) {
		this.withTotalAmountExpenses = withTotalAmountExpenses;
	}

	public AccountServiceRequest(String language, String customerId, String accountNumber,
			String withTotalAmountExpenses) {
		super();
		this.language = language;
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.withTotalAmountExpenses = withTotalAmountExpenses;
	}

	public AccountServiceRequest() {
		super();
	}

	
	
	
	
}
