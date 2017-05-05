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
import io.swagger.client.model.ChangeOrderRequest;
import io.swagger.client.model.OrderIdentifierWithETag;

/**
 * Contains the order identifier and the change order request
 */
@ApiModel(description = "Contains the order identifier and the change order request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:54:35.212Z")
public class ChangeOrderListRequestItem {
  @SerializedName("order")
  private OrderIdentifierWithETag order = null;

  @SerializedName("changeOrderRequest")
  private ChangeOrderRequest changeOrderRequest = null;

  public ChangeOrderListRequestItem order(OrderIdentifierWithETag order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public OrderIdentifierWithETag getOrder() {
    return order;
  }

  public void setOrder(OrderIdentifierWithETag order) {
    this.order = order;
  }

  public ChangeOrderListRequestItem changeOrderRequest(ChangeOrderRequest changeOrderRequest) {
    this.changeOrderRequest = changeOrderRequest;
    return this;
  }

   /**
   * Get changeOrderRequest
   * @return changeOrderRequest
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChangeOrderRequest getChangeOrderRequest() {
    return changeOrderRequest;
  }

  public void setChangeOrderRequest(ChangeOrderRequest changeOrderRequest) {
    this.changeOrderRequest = changeOrderRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeOrderListRequestItem changeOrderListRequestItem = (ChangeOrderListRequestItem) o;
    return Objects.equals(this.order, changeOrderListRequestItem.order) &&
        Objects.equals(this.changeOrderRequest, changeOrderListRequestItem.changeOrderRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, changeOrderRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeOrderListRequestItem {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    changeOrderRequest: ").append(toIndentedString(changeOrderRequest)).append("\n");
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

