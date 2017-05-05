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
 * CPC means cost per click. CPA means cost per action. You can have CPC/CPA with a global cost value. You can have CPC/CPA by category the cost value MUST be null You can have global fixed price. 
 */
public enum CostType {
  
  @SerializedName("CPC_Global")
  CPC_GLOBAL("CPC_Global"),
  
  @SerializedName("CPA_Global")
  CPA_GLOBAL("CPA_Global"),
  
  @SerializedName("CPC_ByCategory")
  CPC_BYCATEGORY("CPC_ByCategory"),
  
  @SerializedName("CPA_ByCategory")
  CPA_BYCATEGORY("CPA_ByCategory"),
  
  @SerializedName("Fixed_Global")
  FIXED_GLOBAL("Fixed_Global");

  private String value;

  CostType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
