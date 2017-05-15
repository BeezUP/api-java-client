/*
 * Public - Security
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
 * The Publication Type
 */
public enum PublicationType {
  
  @SerializedName("PublishProducts")
  PUBLISHPRODUCTS("PublishProducts"),
  
  @SerializedName("PublishOffers")
  PUBLISHOFFERS("PublishOffers"),
  
  @SerializedName("Unpublish")
  UNPUBLISH("Unpublish");

  private String value;

  PublicationType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

