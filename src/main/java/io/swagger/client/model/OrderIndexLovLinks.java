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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BeezUPCommonLOVLink3;

/**
 * Gives you all the LOV to get the translations realated to operation name, codes, property names and statuses.
 */
@ApiModel(description = "Gives you all the LOV to get the translations realated to operation name, codes, property names and statuses.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class OrderIndexLovLinks {
  @SerializedName("orderChangeBusinessOperationType")
  private BeezUPCommonLOVLink3 orderChangeBusinessOperationType = null;

  @SerializedName("orderState")
  private BeezUPCommonLOVLink3 orderState = null;

  @SerializedName("orderProperty")
  private BeezUPCommonLOVLink3 orderProperty = null;

  @SerializedName("orderPropertyPosted")
  private BeezUPCommonLOVLink3 orderPropertyPosted = null;

  public OrderIndexLovLinks orderChangeBusinessOperationType(BeezUPCommonLOVLink3 orderChangeBusinessOperationType) {
    this.orderChangeBusinessOperationType = orderChangeBusinessOperationType;
    return this;
  }

   /**
   * Get orderChangeBusinessOperationType
   * @return orderChangeBusinessOperationType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonLOVLink3 getOrderChangeBusinessOperationType() {
    return orderChangeBusinessOperationType;
  }

  public void setOrderChangeBusinessOperationType(BeezUPCommonLOVLink3 orderChangeBusinessOperationType) {
    this.orderChangeBusinessOperationType = orderChangeBusinessOperationType;
  }

  public OrderIndexLovLinks orderState(BeezUPCommonLOVLink3 orderState) {
    this.orderState = orderState;
    return this;
  }

   /**
   * Get orderState
   * @return orderState
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonLOVLink3 getOrderState() {
    return orderState;
  }

  public void setOrderState(BeezUPCommonLOVLink3 orderState) {
    this.orderState = orderState;
  }

  public OrderIndexLovLinks orderProperty(BeezUPCommonLOVLink3 orderProperty) {
    this.orderProperty = orderProperty;
    return this;
  }

   /**
   * Get orderProperty
   * @return orderProperty
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonLOVLink3 getOrderProperty() {
    return orderProperty;
  }

  public void setOrderProperty(BeezUPCommonLOVLink3 orderProperty) {
    this.orderProperty = orderProperty;
  }

  public OrderIndexLovLinks orderPropertyPosted(BeezUPCommonLOVLink3 orderPropertyPosted) {
    this.orderPropertyPosted = orderPropertyPosted;
    return this;
  }

   /**
   * Get orderPropertyPosted
   * @return orderPropertyPosted
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonLOVLink3 getOrderPropertyPosted() {
    return orderPropertyPosted;
  }

  public void setOrderPropertyPosted(BeezUPCommonLOVLink3 orderPropertyPosted) {
    this.orderPropertyPosted = orderPropertyPosted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderIndexLovLinks orderIndexLovLinks = (OrderIndexLovLinks) o;
    return Objects.equals(this.orderChangeBusinessOperationType, orderIndexLovLinks.orderChangeBusinessOperationType) &&
        Objects.equals(this.orderState, orderIndexLovLinks.orderState) &&
        Objects.equals(this.orderProperty, orderIndexLovLinks.orderProperty) &&
        Objects.equals(this.orderPropertyPosted, orderIndexLovLinks.orderPropertyPosted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderChangeBusinessOperationType, orderState, orderProperty, orderPropertyPosted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderIndexLovLinks {\n");
    
    sb.append("    orderChangeBusinessOperationType: ").append(toIndentedString(orderChangeBusinessOperationType)).append("\n");
    sb.append("    orderState: ").append(toIndentedString(orderState)).append("\n");
    sb.append("    orderProperty: ").append(toIndentedString(orderProperty)).append("\n");
    sb.append("    orderPropertyPosted: ").append(toIndentedString(orderPropertyPosted)).append("\n");
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

