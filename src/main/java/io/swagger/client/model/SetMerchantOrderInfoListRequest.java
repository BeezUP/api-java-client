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
import io.swagger.client.model.OrderMerchantECommerceSoftwareName;
import io.swagger.client.model.OrderMerchantECommerceSoftwareVersion;
import io.swagger.client.model.SetMerchantOrderInfoListRequestItem;
import java.util.ArrayList;
import java.util.List;

/**
 * SetMerchantOrderInfoListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class SetMerchantOrderInfoListRequest {
  @SerializedName("order_MerchantECommerceSoftwareName")
  private OrderMerchantECommerceSoftwareName orderMerchantECommerceSoftwareName = null;

  @SerializedName("order_MerchantECommerceSoftwareVersion")
  private OrderMerchantECommerceSoftwareVersion orderMerchantECommerceSoftwareVersion = null;

  @SerializedName("orders")
  private List<SetMerchantOrderInfoListRequestItem> orders = new ArrayList<SetMerchantOrderInfoListRequestItem>();

  public SetMerchantOrderInfoListRequest orderMerchantECommerceSoftwareName(OrderMerchantECommerceSoftwareName orderMerchantECommerceSoftwareName) {
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

  public SetMerchantOrderInfoListRequest orderMerchantECommerceSoftwareVersion(OrderMerchantECommerceSoftwareVersion orderMerchantECommerceSoftwareVersion) {
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

  public SetMerchantOrderInfoListRequest orders(List<SetMerchantOrderInfoListRequestItem> orders) {
    this.orders = orders;
    return this;
  }

  public SetMerchantOrderInfoListRequest addOrdersItem(SetMerchantOrderInfoListRequestItem ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @ApiModelProperty(example = "[{&quot;marketplaceTechnicalCode&quot;:&quot;Amazon&quot;,&quot;accountId&quot;:1234,&quot;beezUPOrderId&quot;:&quot;8D47FF1427A26B064ca98e95f644361ada5a5be0bbb3b53&quot;,&quot;order_MerchantOrderId&quot;:&quot;BX1234&quot;},{&quot;marketplaceTechnicalCode&quot;:&quot;Amazon&quot;,&quot;accountId&quot;:5678,&quot;beezUPOrderId&quot;:&quot;8D47FF149F213D055f26e3c413e4c9ba5c5cfda460547a4&quot;,&quot;order_MerchantOrderId&quot;:&quot;BX5678&quot;},{&quot;marketplaceTechnicalCode&quot;:&quot;Ebay&quot;,&quot;accountId&quot;:9876,&quot;beezUPOrderId&quot;:&quot;8D47FF150217B60bdec05ab61c445d1a59e3da050b52823&quot;,&quot;order_MerchantOrderId&quot;:&quot;BX9876&quot;}]", required = true, value = "")
  public List<SetMerchantOrderInfoListRequestItem> getOrders() {
    return orders;
  }

  public void setOrders(List<SetMerchantOrderInfoListRequestItem> orders) {
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
    SetMerchantOrderInfoListRequest setMerchantOrderInfoListRequest = (SetMerchantOrderInfoListRequest) o;
    return Objects.equals(this.orderMerchantECommerceSoftwareName, setMerchantOrderInfoListRequest.orderMerchantECommerceSoftwareName) &&
        Objects.equals(this.orderMerchantECommerceSoftwareVersion, setMerchantOrderInfoListRequest.orderMerchantECommerceSoftwareVersion) &&
        Objects.equals(this.orders, setMerchantOrderInfoListRequest.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderMerchantECommerceSoftwareName, orderMerchantECommerceSoftwareVersion, orders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetMerchantOrderInfoListRequest {\n");
    
    sb.append("    orderMerchantECommerceSoftwareName: ").append(toIndentedString(orderMerchantECommerceSoftwareName)).append("\n");
    sb.append("    orderMerchantECommerceSoftwareVersion: ").append(toIndentedString(orderMerchantECommerceSoftwareVersion)).append("\n");
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

