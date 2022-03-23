package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "account_temp")
public class Account {
	@Id
	@Column(name = "compte")
	private String accountNumber;

	@Column(insertable = false, updatable = false, name = "client")
	private String client;

	@Column(name = "devise")
	private String currencyIsoCode;

	@Column(name = "posdisp")
	private BigDecimal availableBalance;


	@Column(name = "MATURITY_DATE")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date maturityDate;

	@Column(name = "SUM_MVTA", nullable = true)
	private BigDecimal totalComingExpenses;

	@ManyToOne
	@JoinColumn(name = "client")
	private Client customer;

	@Transient
	private String status;
	


public Account(String accountNumber, String client, String currencyIsoCode, BigDecimal availableBalance,
			Date maturityDate, BigDecimal totalComingExpenses, Client customer, String status) {
		super();
		this.accountNumber = accountNumber;
		this.client = client;
		this.currencyIsoCode = currencyIsoCode;
		this.availableBalance = availableBalance;
		this.maturityDate = maturityDate;
		this.totalComingExpenses = totalComingExpenses;
		this.customer = customer;
		this.status = status;
	}

public Account() {
	super();
}

public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public String getClient() {
	return client;
}

public void setClient(String client) {
	this.client = client;
}

public String getCurrencyIsoCode() {
	return currencyIsoCode;
}

public void setCurrencyIsoCode(String currencyIsoCode) {
	this.currencyIsoCode = currencyIsoCode;
}

public BigDecimal getAvailableBalance() {
	return availableBalance;
}

public void setAvailableBalance(BigDecimal availableBalance) {
	this.availableBalance = availableBalance;
}
public Date getMaturityDate() {
	return maturityDate;
}

public void setMaturityDate(Date maturityDate) {
	this.maturityDate = maturityDate;
}

public BigDecimal getTotalComingExpenses() {
	return totalComingExpenses;
}

public void setTotalComingExpenses(BigDecimal totalComingExpenses) {
	this.totalComingExpenses = totalComingExpenses;
}

public Client getCustomer() {
	return customer;
}

public void setCustomer(Client customer) {
	this.customer = customer;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}
 
	

}
