<<<<<<< HEAD
package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="client_Temp")
public class Client {
	@Id
	@Column(name="CODE_RACINE")
  private String customerId;
	
	@Column(name="CODE_AGENCE")
  private String branchCode;
  
	@Column(name="NOM")
  private String customerName;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Client(String customerId, String branchCode, String customerName) {
		super();
		this.customerId = customerId;
		this.branchCode = branchCode;
		this.customerName = customerName;
	}
		public Client() {
		
	}


	
  
=======
package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="client_Temp")
public class Client {
	@Id
	@Column(name="CODE_RACINE")
  private String customerId;
	
	@Column(name="CODE_AGENCE")
  private String branchCode;
  
	@Column(name="NOM")
  private String customerName;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCustomerName(String fofana) {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Client(String customerId, String branchCode, String customerName) {
		super();
		this.customerId = customerId;
		this.branchCode = branchCode;
		this.customerName = customerName;
	}
		public Client() {
		
	}


	
  
>>>>>>> 0d53964d0ca56025d058e7b889db5ced174b47a7
}