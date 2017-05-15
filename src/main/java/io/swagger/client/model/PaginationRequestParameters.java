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
import io.swagger.client.model.PageNumber;
import io.swagger.client.model.PageSize;

/**
 * PaginationRequestParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:58:06.674Z")
public class PaginationRequestParameters {
  @SerializedName("pageSize")
  private PageSize pageSize = null;

  @SerializedName("pageNumber")
  private PageNumber pageNumber = null;

  public PaginationRequestParameters pageSize(PageSize pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public PageSize getPageSize() {
    return pageSize;
  }

  public void setPageSize(PageSize pageSize) {
    this.pageSize = pageSize;
  }

  public PaginationRequestParameters pageNumber(PageNumber pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public PageNumber getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(PageNumber pageNumber) {
    this.pageNumber = pageNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationRequestParameters paginationRequestParameters = (PaginationRequestParameters) o;
    return Objects.equals(this.pageSize, paginationRequestParameters.pageSize) &&
        Objects.equals(this.pageNumber, paginationRequestParameters.pageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationRequestParameters {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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

