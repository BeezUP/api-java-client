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
import io.swagger.client.model.OrderMerchantECommerceSoftwareName;
import io.swagger.client.model.OrderMerchantECommerceSoftwareVersion;
import io.swagger.client.model.OrderMerchantOrderId;

/**
 * SetMerchantOrderInfoRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:31:28.102Z")
public class SetMerchantOrderInfoRequest {
  @SerializedName("order_MerchantOrderId")
  private OrderMerchantOrderId orderMerchantOrderId = null;

  @SerializedName("order_MerchantECommerceSoftwareName")
  private OrderMerchantECommerceSoftwareName orderMerchantECommerceSoftwareName = null;

  @SerializedName("order_MerchantECommerceSoftwareVersion")
  private OrderMerchantECommerceSoftwareVersion orderMerchantECommerceSoftwareVersion = null;

  public SetMerchantOrderInfoRequest orderMerchantOrderId(OrderMerchantOrderId orderMerchantOrderId) {
    this.orderMerchantOrderId = orderMerchantOrderId;
    return this;
  }

   /**
   * Get orderMerchantOrderId
   * @return orderMerchantOrderId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public OrderMerchantOrderId getOrderMerchantOrderId() {
    return orderMerchantOrderId;
  }

  public void setOrderMerchantOrderId(OrderMerchantOrderId orderMerchantOrderId) {
    this.orderMerchantOrderId = orderMerchantOrderId;
  }

  public SetMerchantOrderInfoRequest orderMerchantECommerceSoftwareName(OrderMerchantECommerceSoftwareName orderMerchantECommerceSoftwareName) {
    this.orderMerchantECommerceSoftwareName = orderMerchantECommerceSoftwareName;
    return this;
  }

   /**
   * Get orderMerchantECommerceSoftwareName
   * @return orderMerchantECommerceSoftwareName
  **/
  @ApiModelProperty(example = "null", value = "")
  public OrderMerchantECommerceSoftwareName getOrderMerchantECommerceSoftwareName() {
    return orderMerchantECommerceSoftwareName;
  }

  public void setOrderMerchantECommerceSoftwareName(OrderMerchantECommerceSoftwareName orderMerchantECommerceSoftwareName) {
    this.orderMerchantECommerceSoftwareName = orderMerchantECommerceSoftwareName;
  }

  public SetMerchantOrderInfoRequest orderMerchantECommerceSoftwareVersion(OrderMerchantECommerceSoftwareVersion orderMerchantECommerceSoftwareVersion) {
    this.orderMerchantECommerceSoftwareVersion = orderMerchantECommerceSoftwareVersion;
    return this;
  }

   /**
   * Get orderMerchantECommerceSoftwareVersion
   * @return orderMerchantECommerceSoftwareVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public OrderMerchantECommerceSoftwareVersion getOrderMerchantECommerceSoftwareVersion() {
    return orderMerchantECommerceSoftwareVersion;
  }

  public void setOrderMerchantECommerceSoftwareVersion(OrderMerchantECommerceSoftwareVersion orderMerchantECommerceSoftwareVersion) {
    this.orderMerchantECommerceSoftwareVersion = orderMerchantECommerceSoftwareVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetMerchantOrderInfoRequest setMerchantOrderInfoRequest = (SetMerchantOrderInfoRequest) o;
    return Objects.equals(this.orderMerchantOrderId, setMerchantOrderInfoRequest.orderMerchantOrderId) &&
        Objects.equals(this.orderMerchantECommerceSoftwareName, setMerchantOrderInfoRequest.orderMerchantECommerceSoftwareName) &&
        Objects.equals(this.orderMerchantECommerceSoftwareVersion, setMerchantOrderInfoRequest.orderMerchantECommerceSoftwareVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderMerchantOrderId, orderMerchantECommerceSoftwareName, orderMerchantECommerceSoftwareVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetMerchantOrderInfoRequest {\n");
    
    sb.append("    orderMerchantOrderId: ").append(toIndentedString(orderMerchantOrderId)).append("\n");
    sb.append("    orderMerchantECommerceSoftwareName: ").append(toIndentedString(orderMerchantECommerceSoftwareName)).append("\n");
    sb.append("    orderMerchantECommerceSoftwareVersion: ").append(toIndentedString(orderMerchantECommerceSoftwareVersion)).append("\n");
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

