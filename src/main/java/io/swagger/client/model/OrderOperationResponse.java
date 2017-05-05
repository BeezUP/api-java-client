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
import io.swagger.client.model.BeezUPCommonUserErrorMessage;
import io.swagger.client.model.OrderIdentifier;
import java.util.ArrayList;
import java.util.List;

/**
 * The response given by the batch operation for an order
 */
@ApiModel(description = "The response given by the batch operation for an order")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:50:41.747Z")
public class OrderOperationResponse {
  @SerializedName("order")
  private OrderIdentifier order = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("errors")
  private List<BeezUPCommonUserErrorMessage> errors = new ArrayList<BeezUPCommonUserErrorMessage>();

  public OrderOperationResponse order(OrderIdentifier order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public OrderIdentifier getOrder() {
    return order;
  }

  public void setOrder(OrderIdentifier order) {
    this.order = order;
  }

  public OrderOperationResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Indicates if the operation succeed or not
   * @return success
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the operation succeed or not")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public OrderOperationResponse status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the http status corresponding to the individual operation
   * @return status
  **/
  @ApiModelProperty(example = "204", required = true, value = "Indicates the http status corresponding to the individual operation")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public OrderOperationResponse errors(List<BeezUPCommonUserErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public OrderOperationResponse addErrorsItem(BeezUPCommonUserErrorMessage errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * The error list
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "The error list")
  public List<BeezUPCommonUserErrorMessage> getErrors() {
    return errors;
  }

  public void setErrors(List<BeezUPCommonUserErrorMessage> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderOperationResponse orderOperationResponse = (OrderOperationResponse) o;
    return Objects.equals(this.order, orderOperationResponse.order) &&
        Objects.equals(this.success, orderOperationResponse.success) &&
        Objects.equals(this.status, orderOperationResponse.status) &&
        Objects.equals(this.errors, orderOperationResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, success, status, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderOperationResponse {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

