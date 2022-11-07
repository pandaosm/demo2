package com.example.demo.entity.Response;

import java.math.BigDecimal;

public class ProductResponseObject {
  private String productCode;
  
  private BigDecimal consolidatedBookBalance;
  
  private BigDecimal consolidatedAvailableBalance;
  
  private String currencyIsoCode;
  
  public ProductResponseObject(BigDecimal consolidatedBookBalance, BigDecimal consolidatedAvailableBalance, String currencyIsoCode, String productCode) {
    this.consolidatedBookBalance = consolidatedBookBalance;
    this.consolidatedAvailableBalance = consolidatedAvailableBalance;
    this.currencyIsoCode = currencyIsoCode;
    this.productCode = productCode;
  }
  
  public String getProductCode() {
    return this.productCode;
  }
  
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }
  
  public BigDecimal getConsolidatedBookBalance() {
    return this.consolidatedBookBalance;
  }
  
  public void setConsolidatedBookBalance(BigDecimal consolidatedBookBalance) {
    this.consolidatedBookBalance = consolidatedBookBalance;
  }
  
  public BigDecimal getConsolidatedAvailableBalance() {
    return this.consolidatedAvailableBalance;
  }
  
  public void setConsolidatedAvailableBalance(BigDecimal consolidatedAvailableBalance) {
    this.consolidatedAvailableBalance = consolidatedAvailableBalance;
  }
  
  public String getCurrencyIsoCode() {
    return this.currencyIsoCode;
  }
  
  public void setCurrencyIsoCode(String currencyIsoCode) {
    this.currencyIsoCode = currencyIsoCode;
  }
}
