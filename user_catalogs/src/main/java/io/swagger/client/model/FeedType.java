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
 * The Feed Type
 */
public enum FeedType {
  
  @SerializedName("Products")
  PRODUCTS("Products"),
  
  @SerializedName("Inventory")
  INVENTORY("Inventory"),
  
  @SerializedName("Pricing")
  PRICING("Pricing"),
  
  @SerializedName("Images")
  IMAGES("Images"),
  
  @SerializedName("Relationships")
  RELATIONSHIPS("Relationships"),
  
  @SerializedName("Unpublish")
  UNPUBLISH("Unpublish"),
  
  @SerializedName("Offers")
  OFFERS("Offers");

  private String value;

  FeedType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

