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
import io.swagger.client.model.BeezUPCommonStoreId;
import io.swagger.client.model.ExportOrderListFormat;
import io.swagger.client.model.OrderListRequest;

/**
 * The message request to export order list. The store identifier is requested to regroup the exportations.
 */
@ApiModel(description = "The message request to export order list. The store identifier is requested to regroup the exportations.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T09:37:28.005Z")
public class ExportOrderListRequest {
  @SerializedName("format")
  private ExportOrderListFormat format = null;

  @SerializedName("storeId")
  private BeezUPCommonStoreId storeId = null;

  @SerializedName("orderListRequest")
  private OrderListRequest orderListRequest = null;

  public ExportOrderListRequest format(ExportOrderListFormat format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(example = "null", value = "")
  public ExportOrderListFormat getFormat() {
    return format;
  }

  public void setFormat(ExportOrderListFormat format) {
    this.format = format;
  }

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
    return Objects.equals(this.format, exportOrderListRequest.format) &&
        Objects.equals(this.storeId, exportOrderListRequest.storeId) &&
        Objects.equals(this.orderListRequest, exportOrderListRequest.orderListRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, storeId, orderListRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportOrderListRequest {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

