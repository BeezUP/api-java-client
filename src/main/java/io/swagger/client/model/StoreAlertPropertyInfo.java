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
import io.swagger.client.model.StoreAlertProperty;

/**
 * StoreAlertPropertyInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:38:53.309Z")
public class StoreAlertPropertyInfo {
  @SerializedName("propertyId")
  private AlertPropertyId propertyId = null;

  @SerializedName("propertyValue")
  private AlertPropertyValue propertyValue = null;

  @SerializedName("propertyName")
  private String propertyName = null;

  @SerializedName("propertyValidationExpression")
  private String propertyValidationExpression = null;

  public StoreAlertPropertyInfo propertyId(AlertPropertyId propertyId) {
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

  public StoreAlertPropertyInfo propertyValue(AlertPropertyValue propertyValue) {
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

  public StoreAlertPropertyInfo propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

   /**
   * The property name of the alert
   * @return propertyName
  **/
  @ApiModelProperty(example = "NbDays", required = true, value = "The property name of the alert")
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public StoreAlertPropertyInfo propertyValidationExpression(String propertyValidationExpression) {
    this.propertyValidationExpression = propertyValidationExpression;
    return this;
  }

   /**
   * The regular expression related to the alert property
   * @return propertyValidationExpression
  **/
  @ApiModelProperty(example = "\b0*([1-9]|[12][0-9]|30)\b", value = "The regular expression related to the alert property")
  public String getPropertyValidationExpression() {
    return propertyValidationExpression;
  }

  public void setPropertyValidationExpression(String propertyValidationExpression) {
    this.propertyValidationExpression = propertyValidationExpression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreAlertPropertyInfo storeAlertPropertyInfo = (StoreAlertPropertyInfo) o;
    return Objects.equals(this.propertyId, storeAlertPropertyInfo.propertyId) &&
        Objects.equals(this.propertyValue, storeAlertPropertyInfo.propertyValue) &&
        Objects.equals(this.propertyName, storeAlertPropertyInfo.propertyName) &&
        Objects.equals(this.propertyValidationExpression, storeAlertPropertyInfo.propertyValidationExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyId, propertyValue, propertyName, propertyValidationExpression);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreAlertPropertyInfo {\n");
    
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    propertyValidationExpression: ").append(toIndentedString(propertyValidationExpression)).append("\n");
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

