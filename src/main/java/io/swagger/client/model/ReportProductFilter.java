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
import io.swagger.client.model.ReportProductFilterOperatorName;
import java.util.ArrayList;
import java.util.List;

/**
 * Describe a filter on a product&#39;s column
 */
@ApiModel(description = "Describe a filter on a product's column")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:22:45.227Z")
public class ReportProductFilter {
  @SerializedName("columnId")
  private String columnId = null;

  @SerializedName("operatorName")
  private ReportProductFilterOperatorName operatorName = null;

  @SerializedName("values")
  private List<String> values = new ArrayList<String>();

  public ReportProductFilter columnId(String columnId) {
    this.columnId = columnId;
    return this;
  }

   /**
   * The column identifier of your catalog or a custom column.
   * @return columnId
  **/
  @ApiModelProperty(example = "672644c7-5bd0-4e25-88c1-1f732bda5e4c", required = true, value = "The column identifier of your catalog or a custom column.")
  public String getColumnId() {
    return columnId;
  }

  public void setColumnId(String columnId) {
    this.columnId = columnId;
  }

  public ReportProductFilter operatorName(ReportProductFilterOperatorName operatorName) {
    this.operatorName = operatorName;
    return this;
  }

   /**
   * Get operatorName
   * @return operatorName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ReportProductFilterOperatorName getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(ReportProductFilterOperatorName operatorName) {
    this.operatorName = operatorName;
  }

  public ReportProductFilter values(List<String> values) {
    this.values = values;
    return this;
  }

  public ReportProductFilter addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Must be null if the operator is \"IsNull\" or \"IsNotNull\". Can contains multiple value in case of \"InList\" operator. Otherwise a single value is expected.
   * @return values
  **/
  @ApiModelProperty(example = "[&quot;My value&quot;]", value = "Must be null if the operator is \"IsNull\" or \"IsNotNull\". Can contains multiple value in case of \"InList\" operator. Otherwise a single value is expected.")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportProductFilter reportProductFilter = (ReportProductFilter) o;
    return Objects.equals(this.columnId, reportProductFilter.columnId) &&
        Objects.equals(this.operatorName, reportProductFilter.operatorName) &&
        Objects.equals(this.values, reportProductFilter.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnId, operatorName, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportProductFilter {\n");
    
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

