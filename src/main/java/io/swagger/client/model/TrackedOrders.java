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
import io.swagger.client.model.TrackedOrder;
import java.util.ArrayList;
import java.util.List;

/**
 * TrackedOrders
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:57:46.029Z")
public class TrackedOrders {
  @SerializedName("orders")
  private List<TrackedOrder> orders = new ArrayList<TrackedOrder>();

  public TrackedOrders orders(List<TrackedOrder> orders) {
    this.orders = orders;
    return this;
  }

  public TrackedOrders addOrdersItem(TrackedOrder ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<TrackedOrder> getOrders() {
    return orders;
  }

  public void setOrders(List<TrackedOrder> orders) {
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
    TrackedOrders trackedOrders = (TrackedOrders) o;
    return Objects.equals(this.orders, trackedOrders.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedOrders {\n");
    
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

