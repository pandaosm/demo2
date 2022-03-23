package com.example.demo.service;

public class AccountListServiceRequestObject {

	 private String language;
	  
	  private String accountId;
	  
	  private String clientId;
	  
	  private String withTotalAmountExpenses;
	  
	  public String getLanguage() {
	    return this.language;
	  }
	  
	  public void setLanguage(String language) {
	    this.language = language;
	  }
	  
	  public String getAccountId() {
	    return this.accountId;
	  }
	  
	  public void setAccountIds(String accountId) {
	    this.accountId = accountId;
	  }
	  
	  public String getClientIds() {
	    return this.clientId;
	  }
	  
	  public void setClientIds(String clientId) {
	    this.clientId = clientId;
	  }
	  
	  public String getWithTotalAmountExpenses() {
	    return this.withTotalAmountExpenses;
	  }
	  
	  public void setWithTotalAmountExpenses(String withTotalAmountExpenses) {
	    this.withTotalAmountExpenses = withTotalAmountExpenses;
	  }
	}
