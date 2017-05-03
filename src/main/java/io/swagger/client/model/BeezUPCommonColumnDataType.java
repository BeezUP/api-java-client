/*
 * BeezUP API
 * This is the RESTful API of BeezUP which allows you to manage everything related to BeezUP
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
 * Data type of the column, will be used for parsing and for consolidation proces
 */
public enum BeezUPCommonColumnDataType {
  
  @SerializedName("String")
  STRING("String"),
  
  @SerializedName("Url")
  URL("Url"),
  
  @SerializedName("Text")
  TEXT("Text"),
  
  @SerializedName("Decimal")
  DECIMAL("Decimal"),
  
  @SerializedName("DateTime")
  DATETIME("DateTime"),
  
  @SerializedName("Int")
  INT("Int"),
  
  @SerializedName("SpecialInt")
  SPECIALINT("SpecialInt"),
  
  @SerializedName("InStock")
  INSTOCK("InStock"),
  
  @SerializedName("Unknown")
  UNKNOWN("Unknown");

  private String value;

  BeezUPCommonColumnDataType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

