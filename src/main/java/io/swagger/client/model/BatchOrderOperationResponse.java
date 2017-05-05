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
import io.swagger.client.model.OrderOperationResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * The response given by the batch operation
 */
@ApiModel(description = "The response given by the batch operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:58:38.338Z")
public class BatchOrderOperationResponse {
  @SerializedName("operations")
  private List<OrderOperationResponse> operations = new ArrayList<OrderOperationResponse>();

  public BatchOrderOperationResponse operations(List<OrderOperationResponse> operations) {
    this.operations = operations;
    return this;
  }

  public BatchOrderOperationResponse addOperationsItem(OrderOperationResponse operationsItem) {
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<OrderOperationResponse> getOperations() {
    return operations;
  }

  public void setOperations(List<OrderOperationResponse> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchOrderOperationResponse batchOrderOperationResponse = (BatchOrderOperationResponse) o;
    return Objects.equals(this.operations, batchOrderOperationResponse.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchOrderOperationResponse {\n");
    
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

