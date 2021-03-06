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
import io.swagger.client.model.DetectedCatalogColumn;
import java.util.ArrayList;
import java.util.List;

/**
 * The list of detected catalog column
 */
@ApiModel(description = "The list of detected catalog column")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class DetectedCatalogColumns {
  @SerializedName("detectedCatalogColumns")
  private List<DetectedCatalogColumn> detectedCatalogColumns = new ArrayList<DetectedCatalogColumn>();

  public DetectedCatalogColumns detectedCatalogColumns(List<DetectedCatalogColumn> detectedCatalogColumns) {
    this.detectedCatalogColumns = detectedCatalogColumns;
    return this;
  }

  public DetectedCatalogColumns addDetectedCatalogColumnsItem(DetectedCatalogColumn detectedCatalogColumnsItem) {
    this.detectedCatalogColumns.add(detectedCatalogColumnsItem);
    return this;
  }

   /**
   * Contains all deteted catalog columns
   * @return detectedCatalogColumns
  **/
  @ApiModelProperty(example = "null", value = "Contains all deteted catalog columns")
  public List<DetectedCatalogColumn> getDetectedCatalogColumns() {
    return detectedCatalogColumns;
  }

  public void setDetectedCatalogColumns(List<DetectedCatalogColumn> detectedCatalogColumns) {
    this.detectedCatalogColumns = detectedCatalogColumns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedCatalogColumns detectedCatalogColumns = (DetectedCatalogColumns) o;
    return Objects.equals(this.detectedCatalogColumns, detectedCatalogColumns.detectedCatalogColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectedCatalogColumns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedCatalogColumns {\n");
    
    sb.append("    detectedCatalogColumns: ").append(toIndentedString(detectedCatalogColumns)).append("\n");
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

