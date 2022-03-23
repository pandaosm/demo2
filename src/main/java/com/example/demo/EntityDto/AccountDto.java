package com.example.demo.EntityDto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.example.demo.entity.Client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


public class AccountDto implements Serializable{

	private String compte;

	private Client customer;

	private String devise;

	private BigDecimal posdev;

	private Date datfrm;
	
	private String expl;
	
	public  AccountDto (){
		
	}

	public AccountDto(String compte, Client customer, String devise, BigDecimal posdev, Date datfrm,
			String expl) {
		super();
		this.compte = compte;
		this.customer = customer;
		this.devise = devise;
		this.posdev = posdev;
		this.datfrm = datfrm;
		this.expl = expl;
	}

	public String getCompte() {
		return compte;
	}

	public void setCompte(String compte) {
		this.compte = compte;
	}

	public Client getCustomer() {
		return customer;
	}

	public void setCustomer(Client customer) {
		this.customer = customer;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}




	public BigDecimal getPosdev() {
		return posdev;
	}

	public void setPosdev(BigDecimal posdev) {
		this.posdev = posdev;
	}

	public Date getDatfrm() {
		return datfrm;
	}

	public void setDatfrm(Date datfrm) {
		this.datfrm = datfrm;
	}

	public String getExpl() {
		return expl;
	}

	public void setExpl(String expl) {
		this.expl = expl;
	}
	
	
}
