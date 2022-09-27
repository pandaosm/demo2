package com.example.demo.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@Builder


public class NCG {


	private String idNCGGR;



	private String ncgcat;

	private String ncggr;

	private String ncg;



	public NCG(String idNCGGR, String ncgcat, String ncggr , String ncg) {
		this.idNCGGR = idNCGGR;
		this.ncgcat = ncgcat;
		this.ncggr = ncggr;
		this.ncg = ncg;
	}


	public String getNcggr() {
		return ncggr;
	}

	public String getNcg() {
		return ncg;
	}

	public void setNcggr(String ncggr) {
		this.ncggr = ncggr;
	}

	public void setNcg(String ncg) {
		this.ncg = ncg;
	}

	public String getNcgcat() {
		return ncgcat;
	}

	public void setNcgcat(String ncgcat) {
		this.ncgcat = ncgcat;
	}

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


