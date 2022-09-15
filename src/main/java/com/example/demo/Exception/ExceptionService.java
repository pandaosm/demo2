package com.example.demo.Exception;

import org.springframework.http.HttpStatus;

public class ExceptionService extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	  
	private String codeError;
	
	private HttpStatus status ;

	public String getCodeError() {
		return codeError;
	}

	public void setCodeError(String codeError) {
		this.codeError = codeError;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public ExceptionService(String codeError, HttpStatus status) {
		super();
		this.codeError = codeError;
		this.status = status;
	}
	
	
	
	public ExceptionService() {
		super();
	}
	
	
	
}
