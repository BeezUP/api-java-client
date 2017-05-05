/*
 * Channels
 * This api allows you to get access to your channels
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
 * Importance of the column
 */
public enum BeezUPCommonColumnImportance {
  
  @SerializedName("Required")
  REQUIRED("Required"),
  
  @SerializedName("Recommended")
  RECOMMENDED("Recommended"),
  
  @SerializedName("Optional")
  OPTIONAL("Optional");

  private String value;

  BeezUPCommonColumnImportance(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
