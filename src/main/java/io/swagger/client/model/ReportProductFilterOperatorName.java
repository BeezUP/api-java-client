/*
 * BeezUP API
 * This API will allow you to create your account and to get your tokens. \\ If you lost your password, you have an operation to get it back. 
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
 * Indicate the operator you want to make on the columnId
 */
public enum ReportProductFilterOperatorName {
  
  @SerializedName("Equals")
  EQUALS("Equals"),
  
  @SerializedName("Contains")
  CONTAINS("Contains"),
  
  @SerializedName("GreaterTo")
  GREATERTO("GreaterTo"),
  
  @SerializedName("LowerTo")
  LOWERTO("LowerTo"),
  
  @SerializedName("InList")
  INLIST("InList"),
  
  @SerializedName("IsNull")
  ISNULL("IsNull"),
  
  @SerializedName("IsNotNull")
  ISNOTNULL("IsNotNull");

  private String value;

  ReportProductFilterOperatorName(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

