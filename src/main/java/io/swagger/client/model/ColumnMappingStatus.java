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
import com.google.gson.annotations.SerializedName;


/**
 * Gets or Sets columnMappingStatus
 */
public enum ColumnMappingStatus {
  
  @SerializedName("warning")
  WARNING("warning"),
  
  @SerializedName("success")
  SUCCESS("success"),
  
  @SerializedName("failed")
  FAILED("failed");

  private String value;

  ColumnMappingStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

