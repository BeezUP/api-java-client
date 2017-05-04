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
import io.swagger.client.model.BeezUPCommonCurrencyCode;
import io.swagger.client.model.BeezUPCommonPaginationResult;
import io.swagger.client.model.ReportByCategory;
import io.swagger.client.model.ReportByCategoryResponseLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportByCategoryResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T12:20:31.147Z")
public class ReportByCategoryResponse {
  @SerializedName("paginationResult")
  private BeezUPCommonPaginationResult paginationResult = null;

  @SerializedName("currencyCode")
  private BeezUPCommonCurrencyCode currencyCode = null;

  @SerializedName("categories")
  private List<ReportByCategory> categories = new ArrayList<ReportByCategory>();

  @SerializedName("links")
  private ReportByCategoryResponseLinks links = null;

  public ReportByCategoryResponse paginationResult(BeezUPCommonPaginationResult paginationResult) {
    this.paginationResult = paginationResult;
    return this;
  }

   /**
   * Get paginationResult
   * @return paginationResult
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonPaginationResult getPaginationResult() {
    return paginationResult;
  }

  public void setPaginationResult(BeezUPCommonPaginationResult paginationResult) {
    this.paginationResult = paginationResult;
  }

  public ReportByCategoryResponse currencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonCurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ReportByCategoryResponse categories(List<ReportByCategory> categories) {
    this.categories = categories;
    return this;
  }

  public ReportByCategoryResponse addCategoriesItem(ReportByCategory categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ReportByCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<ReportByCategory> categories) {
    this.categories = categories;
  }

  public ReportByCategoryResponse links(ReportByCategoryResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReportByCategoryResponseLinks getLinks() {
    return links;
  }

  public void setLinks(ReportByCategoryResponseLinks links) {
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
    ReportByCategoryResponse reportByCategoryResponse = (ReportByCategoryResponse) o;
    return Objects.equals(this.paginationResult, reportByCategoryResponse.paginationResult) &&
        Objects.equals(this.currencyCode, reportByCategoryResponse.currencyCode) &&
        Objects.equals(this.categories, reportByCategoryResponse.categories) &&
        Objects.equals(this.links, reportByCategoryResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginationResult, currencyCode, categories, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByCategoryResponse {\n");
    
    sb.append("    paginationResult: ").append(toIndentedString(paginationResult)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

