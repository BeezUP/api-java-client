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
import io.swagger.client.model.ReportProductFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductFilters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:26:19.914Z")
public class ProductFilters {
  @SerializedName("sku")
  private String sku = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("additionalProductFilters")
  private List<ReportProductFilter> additionalProductFilters = new ArrayList<ReportProductFilter>();

  public ProductFilters sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The product sku filter
   * @return sku
  **/
  @ApiModelProperty(example = "M1234", value = "The product sku filter")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public ProductFilters title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The product title filter
   * @return title
  **/
  @ApiModelProperty(example = "RefrigÃ©rateur", value = "The product title filter")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProductFilters additionalProductFilters(List<ReportProductFilter> additionalProductFilters) {
    this.additionalProductFilters = additionalProductFilters;
    return this;
  }

  public ProductFilters addAdditionalProductFiltersItem(ReportProductFilter additionalProductFiltersItem) {
    this.additionalProductFilters.add(additionalProductFiltersItem);
    return this;
  }

   /**
   * Get additionalProductFilters
   * @return additionalProductFilters
  **/
  @ApiModelProperty(example = "[{&quot;columnId&quot;:&quot;672644c7-5bd0-4e25-88c1-1f732bda5e4c&quot;,&quot;operatorName&quot;:&quot;GreaterTo&quot;,&quot;values&quot;:[100]}]", value = "")
  public List<ReportProductFilter> getAdditionalProductFilters() {
    return additionalProductFilters;
  }

  public void setAdditionalProductFilters(List<ReportProductFilter> additionalProductFilters) {
    this.additionalProductFilters = additionalProductFilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductFilters productFilters = (ProductFilters) o;
    return Objects.equals(this.sku, productFilters.sku) &&
        Objects.equals(this.title, productFilters.title) &&
        Objects.equals(this.additionalProductFilters, productFilters.additionalProductFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, title, additionalProductFilters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductFilters {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    additionalProductFilters: ").append(toIndentedString(additionalProductFilters)).append("\n");
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

