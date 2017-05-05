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
import io.swagger.client.model.BeezUPCommonCatalogCategoryPath;

/**
 * The request message to get products based on these filters
 */
@ApiModel(description = "The request message to get products based on these filters")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:31:28.102Z")
public class GetProductsRequest {
  @SerializedName("sku")
  private String sku = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("categoryPath")
  private BeezUPCommonCatalogCategoryPath categoryPath = null;

  public GetProductsRequest sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Search for products containing this SKU (merchant product dentifier).
   * @return sku
  **/
  @ApiModelProperty(example = "null", value = "Search for products containing this SKU (merchant product dentifier).")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public GetProductsRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Search for products containing this title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "Search for products containing this title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GetProductsRequest categoryPath(BeezUPCommonCatalogCategoryPath categoryPath) {
    this.categoryPath = categoryPath;
    return this;
  }

   /**
   * Get categoryPath
   * @return categoryPath
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonCatalogCategoryPath getCategoryPath() {
    return categoryPath;
  }

  public void setCategoryPath(BeezUPCommonCatalogCategoryPath categoryPath) {
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
    GetProductsRequest getProductsRequest = (GetProductsRequest) o;
    return Objects.equals(this.sku, getProductsRequest.sku) &&
        Objects.equals(this.title, getProductsRequest.title) &&
        Objects.equals(this.categoryPath, getProductsRequest.categoryPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, title, categoryPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProductsRequest {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

