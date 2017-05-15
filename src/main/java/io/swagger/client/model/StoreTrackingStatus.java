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
import org.joda.time.DateTime;

/**
 * StoreTrackingStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:40:14.157Z")
public class StoreTrackingStatus {
  @SerializedName("clickSynchronizationUtcDate")
  private DateTime clickSynchronizationUtcDate = null;

  @SerializedName("orderSynchonizationUtcDate")
  private DateTime orderSynchonizationUtcDate = null;

  @SerializedName("marketplaceOrderSynchonizationUtcDate")
  private DateTime marketplaceOrderSynchonizationUtcDate = null;

  public StoreTrackingStatus clickSynchronizationUtcDate(DateTime clickSynchronizationUtcDate) {
    this.clickSynchronizationUtcDate = clickSynchronizationUtcDate;
    return this;
  }

   /**
   * The utc date of the latest click synchronized
   * @return clickSynchronizationUtcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", value = "The utc date of the latest click synchronized")
  public DateTime getClickSynchronizationUtcDate() {
    return clickSynchronizationUtcDate;
  }

  public void setClickSynchronizationUtcDate(DateTime clickSynchronizationUtcDate) {
    this.clickSynchronizationUtcDate = clickSynchronizationUtcDate;
  }

  public StoreTrackingStatus orderSynchonizationUtcDate(DateTime orderSynchonizationUtcDate) {
    this.orderSynchonizationUtcDate = orderSynchonizationUtcDate;
    return this;
  }

   /**
   * The utc date of the latest order synchronized
   * @return orderSynchonizationUtcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", value = "The utc date of the latest order synchronized")
  public DateTime getOrderSynchonizationUtcDate() {
    return orderSynchonizationUtcDate;
  }

  public void setOrderSynchonizationUtcDate(DateTime orderSynchonizationUtcDate) {
    this.orderSynchonizationUtcDate = orderSynchonizationUtcDate;
  }

  public StoreTrackingStatus marketplaceOrderSynchonizationUtcDate(DateTime marketplaceOrderSynchonizationUtcDate) {
    this.marketplaceOrderSynchonizationUtcDate = marketplaceOrderSynchonizationUtcDate;
    return this;
  }

   /**
   * The utc date of the latest marketplace order synchronized
   * @return marketplaceOrderSynchonizationUtcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", value = "The utc date of the latest marketplace order synchronized")
  public DateTime getMarketplaceOrderSynchonizationUtcDate() {
    return marketplaceOrderSynchonizationUtcDate;
  }

  public void setMarketplaceOrderSynchonizationUtcDate(DateTime marketplaceOrderSynchonizationUtcDate) {
    this.marketplaceOrderSynchonizationUtcDate = marketplaceOrderSynchonizationUtcDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreTrackingStatus storeTrackingStatus = (StoreTrackingStatus) o;
    return Objects.equals(this.clickSynchronizationUtcDate, storeTrackingStatus.clickSynchronizationUtcDate) &&
        Objects.equals(this.orderSynchonizationUtcDate, storeTrackingStatus.orderSynchonizationUtcDate) &&
        Objects.equals(this.marketplaceOrderSynchonizationUtcDate, storeTrackingStatus.marketplaceOrderSynchonizationUtcDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickSynchronizationUtcDate, orderSynchonizationUtcDate, marketplaceOrderSynchonizationUtcDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreTrackingStatus {\n");
    
    sb.append("    clickSynchronizationUtcDate: ").append(toIndentedString(clickSynchronizationUtcDate)).append("\n");
    sb.append("    orderSynchonizationUtcDate: ").append(toIndentedString(orderSynchonizationUtcDate)).append("\n");
    sb.append("    marketplaceOrderSynchonizationUtcDate: ").append(toIndentedString(marketplaceOrderSynchonizationUtcDate)).append("\n");
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

