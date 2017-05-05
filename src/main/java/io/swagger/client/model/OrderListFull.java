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
import io.swagger.client.model.BeezUPCommonPaginationResult;
import io.swagger.client.model.Order;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderListFull
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T14:10:34.021Z")
public class OrderListFull {
  @SerializedName("paginationResult")
  private BeezUPCommonPaginationResult paginationResult = null;

  @SerializedName("orders")
  private List<Order> orders = new ArrayList<Order>();

  public OrderListFull paginationResult(BeezUPCommonPaginationResult paginationResult) {
    this.paginationResult = paginationResult;
    return this;
  }

   /**
   * Get paginationResult
   * @return paginationResult
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonPaginationResult getPaginationResult() {
    return paginationResult;
  }

  public void setPaginationResult(BeezUPCommonPaginationResult paginationResult) {
    this.paginationResult = paginationResult;
  }

  public OrderListFull orders(List<Order> orders) {
    this.orders = orders;
    return this;
  }

  public OrderListFull addOrdersItem(Order ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<Order> getOrders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
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
    OrderListFull orderListFull = (OrderListFull) o;
    return Objects.equals(this.paginationResult, orderListFull.paginationResult) &&
        Objects.equals(this.orders, orderListFull.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginationResult, orders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderListFull {\n");
    
    sb.append("    paginationResult: ").append(toIndentedString(paginationResult)).append("\n");
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

