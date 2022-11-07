package com.example.demo.entity;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
=======
import javax.persistence.*;
>>>>>>> 0d53964d0ca56025d058e7b889db5ced174b47a7

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

=======
import java.io.Serializable;
import java.util.Objects;

@Data
@Builder


>>>>>>> 0d53964d0ca56025d058e7b889db5ced174b47a7
public class NCG {


	private String idNCGGR;


<<<<<<< HEAD
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

=======

	private String ncgcat;

	private String ncggr;

	private String ncg;



	public NCG(String idNCGGR, String ncgcat, String ncggr , String ncg) {
		this.idNCGGR = idNCGGR;
		this.ncgcat = ncgcat;
		this.ncggr = ncggr;
		this.ncg = ncg;
	}


>>>>>>> 0d53964d0ca56025d058e7b889db5ced174b47a7
	public String getNcggr() {
		return ncggr;
	}

<<<<<<< HEAD
=======
	public String getNcg() {
		return ncg;
	}

>>>>>>> 0d53964d0ca56025d058e7b889db5ced174b47a7
	public void setNcggr(String ncggr) {
		this.ncggr = ncggr;
	}

<<<<<<< HEAD
=======
	public void setNcg(String ncg) {
		this.ncg = ncg;
	}

>>>>>>> 0d53964d0ca56025d058e7b889db5ced174b47a7
	public String getNcgcat() {
		return ncgcat;
	}

	public void setNcgcat(String ncgcat) {
		this.ncgcat = ncgcat;
	}

<<<<<<< HEAD
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
=======
	public String getIdNCGGR() {
		return idNCGGR;
	}

	public void setIdNCGGR(String idNCGGR) {
		this.idNCGGR = idNCGGR;
	}




	public String getncggr() {
		return ncggr;
	}

	public void setncggr(String ncggr) {
		this.ncggr = ncggr;
	}

	public NCG() {
	}
}


>>>>>>> 0d53964d0ca56025d058e7b889db5ced174b47a7
