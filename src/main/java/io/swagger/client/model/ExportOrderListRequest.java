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
import io.swagger.client.model.BeezUPCommonStoreId;
import io.swagger.client.model.OrderListRequest;

/**
 * The message request to export order list. The store identifier is requested to regroup the exportations.
 */
@ApiModel(description = "The message request to export order list. The store identifier is requested to regroup the exportations.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:26:52.821Z")
public class ExportOrderListRequest {
  @SerializedName("storeId")
  private BeezUPCommonStoreId storeId = null;

  @SerializedName("orderListRequest")
  private OrderListRequest orderListRequest = null;

  public ExportOrderListRequest storeId(BeezUPCommonStoreId storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonStoreId getStoreId() {
    return storeId;
  }

  public void setStoreId(BeezUPCommonStoreId storeId) {
    this.storeId = storeId;
  }

  public ExportOrderListRequest orderListRequest(OrderListRequest orderListRequest) {
    this.orderListRequest = orderListRequest;
    return this;
  }

   /**
   * Get orderListRequest
   * @return orderListRequest
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public OrderListRequest getOrderListRequest() {
    return orderListRequest;
  }

  public void setOrderListRequest(OrderListRequest orderListRequest) {
    this.orderListRequest = orderListRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportOrderListRequest exportOrderListRequest = (ExportOrderListRequest) o;
    return Objects.equals(this.storeId, exportOrderListRequest.storeId) &&
        Objects.equals(this.orderListRequest, exportOrderListRequest.orderListRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, orderListRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportOrderListRequest {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    orderListRequest: ").append(toIndentedString(orderListRequest)).append("\n");
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

