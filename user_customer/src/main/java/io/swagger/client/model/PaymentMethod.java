/*
 * Customer
 * This API will gives you the ability to : - manage your account - manage your stores - shares your stores with your friends - manage your contracts - access to your invoices 
 *
 * OpenAPI spec version: 2.0
 * Contact: support@beezup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;


/**
 * Payment method
 */
public enum PaymentMethod {
  
  @SerializedName("Transfer")
  TRANSFER("Transfer"),
  
  @SerializedName("Debit")
  DEBIT("Debit"),
  
  @SerializedName("Paypal")
  PAYPAL("Paypal"),
  
  @SerializedName("Check")
  CHECK("Check"),
  
  @SerializedName("CreditNote")
  CREDITNOTE("CreditNote"),
  
  @SerializedName("Loss")
  LOSS("Loss"),
  
  @SerializedName("OnlinePayment")
  ONLINEPAYMENT("OnlinePayment");

  private String value;

  PaymentMethod(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

