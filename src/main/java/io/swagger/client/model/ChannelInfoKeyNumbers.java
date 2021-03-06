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

/**
 * ChannelInfoKeyNumbers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T14:10:34.021Z")
public class ChannelInfoKeyNumbers {
  @SerializedName("products")
  private String products = null;

  @SerializedName("categories")
  private String categories = null;

  @SerializedName("stores")
  private String stores = null;

  @SerializedName("viewsPerMonth")
  private String viewsPerMonth = null;

  public ChannelInfoKeyNumbers products(String products) {
    this.products = products;
    return this;
  }

   /**
   * The estimated product count of the channel
   * @return products
  **/
  @ApiModelProperty(example = "1M", value = "The estimated product count of the channel")
  public String getProducts() {
    return products;
  }

  public void setProducts(String products) {
    this.products = products;
  }

  public ChannelInfoKeyNumbers categories(String categories) {
    this.categories = categories;
    return this;
  }

   /**
   * The estimated category count of the channel
   * @return categories
  **/
  @ApiModelProperty(example = "NC", value = "The estimated category count of the channel")
  public String getCategories() {
    return categories;
  }

  public void setCategories(String categories) {
    this.categories = categories;
  }

  public ChannelInfoKeyNumbers stores(String stores) {
    this.stores = stores;
    return this;
  }

   /**
   * The estimated store count of the channel
   * @return stores
  **/
  @ApiModelProperty(example = "3000", value = "The estimated store count of the channel")
  public String getStores() {
    return stores;
  }

  public void setStores(String stores) {
    this.stores = stores;
  }

  public ChannelInfoKeyNumbers viewsPerMonth(String viewsPerMonth) {
    this.viewsPerMonth = viewsPerMonth;
    return this;
  }

   /**
   * The estimated view count per month of the channel
   * @return viewsPerMonth
  **/
  @ApiModelProperty(example = "3M", value = "The estimated view count per month of the channel")
  public String getViewsPerMonth() {
    return viewsPerMonth;
  }

  public void setViewsPerMonth(String viewsPerMonth) {
    this.viewsPerMonth = viewsPerMonth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelInfoKeyNumbers channelInfoKeyNumbers = (ChannelInfoKeyNumbers) o;
    return Objects.equals(this.products, channelInfoKeyNumbers.products) &&
        Objects.equals(this.categories, channelInfoKeyNumbers.categories) &&
        Objects.equals(this.stores, channelInfoKeyNumbers.stores) &&
        Objects.equals(this.viewsPerMonth, channelInfoKeyNumbers.viewsPerMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, categories, stores, viewsPerMonth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelInfoKeyNumbers {\n");
    
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
    sb.append("    viewsPerMonth: ").append(toIndentedString(viewsPerMonth)).append("\n");
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

