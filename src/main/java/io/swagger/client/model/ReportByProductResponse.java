/*
 * Public - Security
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
import io.swagger.client.model.BeezUPCommonPaginationResult;
import io.swagger.client.model.ReportByProduct;
import io.swagger.client.model.ReportByProductResponseLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportByProductResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:14:52.070Z")
public class ReportByProductResponse {
  @SerializedName("paginationResult")
  private BeezUPCommonPaginationResult paginationResult = null;

  @SerializedName("products")
  private List<ReportByProduct> products = new ArrayList<ReportByProduct>();

  @SerializedName("links")
  private ReportByProductResponseLinks links = null;

  public ReportByProductResponse paginationResult(BeezUPCommonPaginationResult paginationResult) {
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

  public ReportByProductResponse products(List<ReportByProduct> products) {
    this.products = products;
    return this;
  }

  public ReportByProductResponse addProductsItem(ReportByProduct productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<ReportByProduct> getProducts() {
    return products;
  }

  public void setProducts(List<ReportByProduct> products) {
    this.products = products;
  }

  public ReportByProductResponse links(ReportByProductResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ReportByProductResponseLinks getLinks() {
    return links;
  }

  public void setLinks(ReportByProductResponseLinks links) {
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
    ReportByProductResponse reportByProductResponse = (ReportByProductResponse) o;
    return Objects.equals(this.paginationResult, reportByProductResponse.paginationResult) &&
        Objects.equals(this.products, reportByProductResponse.products) &&
        Objects.equals(this.links, reportByProductResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginationResult, products, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByProductResponse {\n");
    
    sb.append("    paginationResult: ").append(toIndentedString(paginationResult)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

