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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AlertPropertyId;
import io.swagger.client.model.AlertPropertyValue;

/**
 * StoreAlertProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:26:19.914Z")
public class StoreAlertProperty {
  @SerializedName("propertyId")
  private AlertPropertyId propertyId = null;

  @SerializedName("propertyValue")
  private AlertPropertyValue propertyValue = null;

  public StoreAlertProperty propertyId(AlertPropertyId propertyId) {
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Get propertyId
   * @return propertyId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AlertPropertyId getPropertyId() {
    return propertyId;
  }

  public void setPropertyId(AlertPropertyId propertyId) {
    this.propertyId = propertyId;
  }

  public StoreAlertProperty propertyValue(AlertPropertyValue propertyValue) {
    this.propertyValue = propertyValue;
    return this;
  }

   /**
   * Get propertyValue
   * @return propertyValue
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AlertPropertyValue getPropertyValue() {
    return propertyValue;
  }

  public void setPropertyValue(AlertPropertyValue propertyValue) {
    this.propertyValue = propertyValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreAlertProperty storeAlertProperty = (StoreAlertProperty) o;
    return Objects.equals(this.propertyId, storeAlertProperty.propertyId) &&
        Objects.equals(this.propertyValue, storeAlertProperty.propertyValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyId, propertyValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreAlertProperty {\n");
    
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

