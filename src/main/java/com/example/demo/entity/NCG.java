package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class NCG {


	private String idNCGGR;


private String ncggr ;
	
	private String ncgcat;
	
	private String ncg ;
	

	private String libelle;
	
	public NCG() {
		
	}
	
	

	public NCG(String idNCGGR, String ncggr, String ncgcat, String ncg, String libelle) {
		super();
		this.idNCGGR = idNCGGR;
		this.ncggr = ncggr;
		this.ncgcat = ncgcat;
		this.ncg = ncg;
		this.libelle = libelle;
	}



	public String getIdNCGGR() {
		return idNCGGR;
	}

	public void setIdNCGGR(String idNCGGR) {
		this.idNCGGR = idNCGGR;
	}

	public String getNcggr() {
		return ncggr;
	}

	public void setNcggr(String ncggr) {
		this.ncggr = ncggr;
	}

	public String getNcgcat() {
		return ncgcat;
	}

	public void setNcgcat(String ncgcat) {
		this.ncgcat = ncgcat;
	}

	public String getNcg() {
		return ncg;
	}

	public void setNcg(String ncg) {
		this.ncg = ncg;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
	
	

}
