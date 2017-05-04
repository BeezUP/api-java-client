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
import java.util.ArrayList;
import java.util.List;

/**
 * ReportCategoryFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T17:44:01.940Z")
public class ReportCategoryFilter {
  @SerializedName("categoryPath")
  private List<String> categoryPath = new ArrayList<String>();

  public ReportCategoryFilter categoryPath(List<String> categoryPath) {
    this.categoryPath = categoryPath;
    return this;
  }

  public ReportCategoryFilter addCategoryPathItem(String categoryPathItem) {
    this.categoryPath.add(categoryPathItem);
    return this;
  }

   /**
   * Indicates on which category path you want to make the filter
   * @return categoryPath
  **/
  @ApiModelProperty(example = "[&quot;Home&quot;,&quot;Bedroom&quot;]", value = "Indicates on which category path you want to make the filter")
  public List<String> getCategoryPath() {
    return categoryPath;
  }

  public void setCategoryPath(List<String> categoryPath) {
    this.categoryPath = categoryPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCategoryFilter reportCategoryFilter = (ReportCategoryFilter) o;
    return Objects.equals(this.categoryPath, reportCategoryFilter.categoryPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCategoryFilter {\n");
    
    sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
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

