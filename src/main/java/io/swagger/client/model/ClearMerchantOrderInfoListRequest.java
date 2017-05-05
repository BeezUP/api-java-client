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
import io.swagger.client.model.OrderIdentifier;
import java.util.ArrayList;
import java.util.List;

/**
 * ClearMerchantOrderInfoListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:51:26.209Z")
public class ClearMerchantOrderInfoListRequest {
  @SerializedName("orders")
  private List<OrderIdentifier> orders = new ArrayList<OrderIdentifier>();

  public ClearMerchantOrderInfoListRequest orders(List<OrderIdentifier> orders) {
    this.orders = orders;
    return this;
  }

  public ClearMerchantOrderInfoListRequest addOrdersItem(OrderIdentifier ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @ApiModelProperty(example = "[{&quot;marketplaceTechnicalCode&quot;:&quot;Amazon&quot;,&quot;accountId&quot;:1234,&quot;beezUPOrderId&quot;:&quot;00000000000000000000000000000000000000000000000&quot;},{&quot;marketplaceTechnicalCode&quot;:&quot;Amazon&quot;,&quot;accountId&quot;:5678,&quot;beezUPOrderId&quot;:&quot;00000000000000000000000000000000000000000000000&quot;},{&quot;marketplaceTechnicalCode&quot;:&quot;Ebay&quot;,&quot;accountId&quot;:9876,&quot;beezUPOrderId&quot;:&quot;00000000000000000000000000000000000000000000000&quot;}]", required = true, value = "")
  public List<OrderIdentifier> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderIdentifier> orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearMerchantOrderInfoListRequest clearMerchantOrderInfoListRequest = (ClearMerchantOrderInfoListRequest) o;
    return Objects.equals(this.orders, clearMerchantOrderInfoListRequest.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearMerchantOrderInfoListRequest {\n");
    
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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

