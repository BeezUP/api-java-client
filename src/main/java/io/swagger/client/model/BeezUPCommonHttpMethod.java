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
 * Indicate the http method to use on this link
 */
public enum BeezUPCommonHttpMethod {
  
  @SerializedName("GET")
  GET("GET"),
  
  @SerializedName("POST")
  POST("POST"),
  
  @SerializedName("PATCH")
  PATCH("PATCH"),
  
  @SerializedName("DELETE")
  DELETE("DELETE"),
  
  @SerializedName("PUT")
  PUT("PUT"),
  
  @SerializedName("HEAD")
  HEAD("HEAD");

  private String value;

  BeezUPCommonHttpMethod(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

