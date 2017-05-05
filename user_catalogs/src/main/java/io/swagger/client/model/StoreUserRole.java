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
 * Indicates the role can have a user on a store.  * Owner: Indicates that you are the owner of this store * User: Indicates that you are a simple user on this store 
 */
public enum StoreUserRole {
  
  @SerializedName("Owner")
  OWNER("Owner"),
  
  @SerializedName("User")
  USER("User");

  private String value;

  StoreUserRole(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
