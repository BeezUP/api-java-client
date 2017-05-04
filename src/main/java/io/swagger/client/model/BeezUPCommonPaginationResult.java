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
import io.swagger.client.model.BeezUPCommonPaginationResultLinks;

/**
 * BeezUPCommonPaginationResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T12:05:37.723Z")
public class BeezUPCommonPaginationResult {
  @SerializedName("entryCount")
  private Integer entryCount = null;

  @SerializedName("pageCount")
  private Integer pageCount = null;

  @SerializedName("totalEntryCount")
  private Integer totalEntryCount = null;

  @SerializedName("links")
  private BeezUPCommonPaginationResultLinks links = null;

  public BeezUPCommonPaginationResult entryCount(Integer entryCount) {
    this.entryCount = entryCount;
    return this;
  }

   /**
   * The entry count currently returned
   * minimum: 0
   * @return entryCount
  **/
  @ApiModelProperty(example = "25", value = "The entry count currently returned")
  public Integer getEntryCount() {
    return entryCount;
  }

  public void setEntryCount(Integer entryCount) {
    this.entryCount = entryCount;
  }

  public BeezUPCommonPaginationResult pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * The page count
   * minimum: 0
   * @return pageCount
  **/
  @ApiModelProperty(example = "38", value = "The page count")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public BeezUPCommonPaginationResult totalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
    return this;
  }

   /**
   * The total entry count
   * minimum: 0
   * @return totalEntryCount
  **/
  @ApiModelProperty(example = "943", value = "The total entry count")
  public Integer getTotalEntryCount() {
    return totalEntryCount;
  }

  public void setTotalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
  }

  public BeezUPCommonPaginationResult links(BeezUPCommonPaginationResultLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonPaginationResultLinks getLinks() {
    return links;
  }

  public void setLinks(BeezUPCommonPaginationResultLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonPaginationResult beezUPCommonPaginationResult = (BeezUPCommonPaginationResult) o;
    return Objects.equals(this.entryCount, beezUPCommonPaginationResult.entryCount) &&
        Objects.equals(this.pageCount, beezUPCommonPaginationResult.pageCount) &&
        Objects.equals(this.totalEntryCount, beezUPCommonPaginationResult.totalEntryCount) &&
        Objects.equals(this.links, beezUPCommonPaginationResult.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryCount, pageCount, totalEntryCount, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonPaginationResult {\n");
    
    sb.append("    entryCount: ").append(toIndentedString(entryCount)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    totalEntryCount: ").append(toIndentedString(totalEntryCount)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

