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
import io.swagger.client.model.OrderExportationReporting;
import java.util.ArrayList;
import java.util.List;

/**
 * The list of Order report exportations
 */
@ApiModel(description = "The list of Order report exportations")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:14:33.629Z")
public class OrderExportations {
  @SerializedName("paginationResult")
  private BeezUPCommonPaginationResult paginationResult = null;

  @SerializedName("exportations")
  private List<OrderExportationReporting> exportations = new ArrayList<OrderExportationReporting>();

  public OrderExportations paginationResult(BeezUPCommonPaginationResult paginationResult) {
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

  public OrderExportations exportations(List<OrderExportationReporting> exportations) {
    this.exportations = exportations;
    return this;
  }

  public OrderExportations addExportationsItem(OrderExportationReporting exportationsItem) {
    this.exportations.add(exportationsItem);
    return this;
  }

   /**
   * Get exportations
   * @return exportations
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<OrderExportationReporting> getExportations() {
    return exportations;
  }

  public void setExportations(List<OrderExportationReporting> exportations) {
    this.exportations = exportations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderExportations orderExportations = (OrderExportations) o;
    return Objects.equals(this.paginationResult, orderExportations.paginationResult) &&
        Objects.equals(this.exportations, orderExportations.exportations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginationResult, exportations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderExportations {\n");
    
    sb.append("    paginationResult: ").append(toIndentedString(paginationResult)).append("\n");
    sb.append("    exportations: ").append(toIndentedString(exportations)).append("\n");
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

