package com.example.demo.Exception;




public class GeneralException extends Exception {
  private static final long serialVersionUID = 1L;
  
  private ErrorObject errorObject;
  
  public GeneralException(ErrorObject error) {
    super((error != null && error.getErrorCode() != null && error.getMessage() != null && !error.getMessage().isEmpty()) ? String.format("%s - %s", new Object[] { error.getErrorCode(), error.getMessage() }) : "Error object not defined");
    this.errorObject = error;
  }
  
  public ErrorObject getErrorObject() {
    return this.errorObject;
  }
}

