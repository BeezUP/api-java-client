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
import io.swagger.client.model.CustomColumn;
import java.util.ArrayList;
import java.util.List;

/**
 * CustomColumns
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T09:59:46.672Z")
public class CustomColumns {
  @SerializedName("customColumns")
  private List<CustomColumn> customColumns = new ArrayList<CustomColumn>();

  public CustomColumns customColumns(List<CustomColumn> customColumns) {
    this.customColumns = customColumns;
    return this;
  }

  public CustomColumns addCustomColumnsItem(CustomColumn customColumnsItem) {
    this.customColumns.add(customColumnsItem);
    return this;
  }

   /**
   * Get customColumns
   * @return customColumns
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CustomColumn> getCustomColumns() {
    return customColumns;
  }

  public void setCustomColumns(List<CustomColumn> customColumns) {
    this.customColumns = customColumns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomColumns customColumns = (CustomColumns) o;
    return Objects.equals(this.customColumns, customColumns.customColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customColumns);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomColumns {\n");
    
    sb.append("    customColumns: ").append(toIndentedString(customColumns)).append("\n");
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

