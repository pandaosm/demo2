package com.example.demo.Exception;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigInteger;
import org.springframework.stereotype.Component;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorObject {
  @JsonIgnore
  private String errorId;
  
  private String message;
  
  private BigInteger errorCode;
  
  private String exception;
  
  @JsonIgnore
  private BigInteger httpStatus;
  
  public String getMessage() {
    return this.message;
  }
  
  public String getErrorId() {
    return this.errorId;
  }
  
  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
  
  public BigInteger getErrorCode() {
    return this.errorCode;
  }
  
  public void setErrorCode(BigInteger errorCode) {
    this.errorCode = errorCode;
  }
  
  public String getException() {
    return this.exception;
  }
  
  public void setException(String exception) {
    this.exception = exception;
  }
  
  public BigInteger getHttpStatus() {
    return this.httpStatus;
  }
  
  public void setHttpStatus(BigInteger httpStatus) {
    this.httpStatus = httpStatus;
  }
  
  public String toString() {
    return "ErrorObject [message=" + this.message + ", errorCode=" + this.errorCode + ", exception=" + this.exception + "]";
  }
}

