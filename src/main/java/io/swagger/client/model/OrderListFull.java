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
import io.swagger.client.model.BeezUPCommonPaginationResult;
import io.swagger.client.model.Order;
import io.swagger.client.model.OrderListFullLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * The order list with all information we have from the orders and its items.\\ The paginationResult properties can be null if the list is empty.  
 */
@ApiModel(description = "The order list with all information we have from the orders and its items.\\ The paginationResult properties can be null if the list is empty.  ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T09:37:28.005Z")
public class OrderListFull {
  @SerializedName("paginationResult")
  private BeezUPCommonPaginationResult paginationResult = null;

  @SerializedName("orders")
  private List<Order> orders = new ArrayList<Order>();

  @SerializedName("links")
  private OrderListFullLinks links = null;

  public OrderListFull paginationResult(BeezUPCommonPaginationResult paginationResult) {
    this.paginationResult = paginationResult;
    return this;
  }

   /**
   * Get paginationResult
   * @return paginationResult
  **/
  @ApiModelProperty(example = "null", value = "")
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

  public OrderListFull links(OrderListFullLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public OrderListFullLinks getLinks() {
    return links;
  }

  public void setLinks(OrderListFullLinks links) {
    this.links = links;
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
        Objects.equals(this.orders, orderListFull.orders) &&
        Objects.equals(this.links, orderListFull.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginationResult, orders, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderListFull {\n");
    
    sb.append("    paginationResult: ").append(toIndentedString(paginationResult)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

