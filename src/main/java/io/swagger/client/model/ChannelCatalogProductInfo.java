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
import io.swagger.client.model.BeezUPCommonProductBasicInfo;
import io.swagger.client.model.ChannelCatalogProductInfoLinks;
import io.swagger.client.model.ExclusionFilterName;
import io.swagger.client.model.ProductOverridesWithCatalogValues;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelCatalogProductInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T14:10:34.021Z")
public class ChannelCatalogProductInfo {
  @SerializedName("productId")
  private String productId = null;

  @SerializedName("productSku")
  private String productSku = null;

  @SerializedName("productTitle")
  private String productTitle = null;

  @SerializedName("productImageUrl")
  private String productImageUrl = null;

  @SerializedName("productActive")
  private Boolean productActive = null;

  @SerializedName("overrides")
  private ProductOverridesWithCatalogValues overrides = null;

  @SerializedName("disabled")
  private Boolean disabled = false;

  @SerializedName("categoryMapped")
  private Boolean categoryMapped = null;

  @SerializedName("excluded")
  private Boolean excluded = false;

  @SerializedName("excludedBy")
  private List<ExclusionFilterName> excludedBy = new ArrayList<ExclusionFilterName>();

  @SerializedName("links")
  private ChannelCatalogProductInfoLinks links = null;

  public ChannelCatalogProductInfo productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * The product identifier
   * @return productId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "The product identifier")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public ChannelCatalogProductInfo productSku(String productSku) {
    this.productSku = productSku;
    return this;
  }

   /**
   * The product SKU
   * @return productSku
  **/
  @ApiModelProperty(example = "SKU1234", required = true, value = "The product SKU")
  public String getProductSku() {
    return productSku;
  }

  public void setProductSku(String productSku) {
    this.productSku = productSku;
  }

  public ChannelCatalogProductInfo productTitle(String productTitle) {
    this.productTitle = productTitle;
    return this;
  }

   /**
   * The product tile
   * @return productTitle
  **/
  @ApiModelProperty(example = "My supert product", required = true, value = "The product tile")
  public String getProductTitle() {
    return productTitle;
  }

  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }

  public ChannelCatalogProductInfo productImageUrl(String productImageUrl) {
    this.productImageUrl = productImageUrl;
    return this;
  }

   /**
   * The product image Url
   * @return productImageUrl
  **/
  @ApiModelProperty(example = "http://i2.cdscdn.com/pdt2/3/9/0/1/550x550/hai6901018043390/rw/haier-b20fwrss-refrigerateur-americain.jpg", required = true, value = "The product image Url")
  public String getProductImageUrl() {
    return productImageUrl;
  }

  public void setProductImageUrl(String productImageUrl) {
    this.productImageUrl = productImageUrl;
  }

  public ChannelCatalogProductInfo productActive(Boolean productActive) {
    this.productActive = productActive;
    return this;
  }

   /**
   * Indicates if the product still exists in your catalog
   * @return productActive
  **/
  @ApiModelProperty(example = "true", value = "Indicates if the product still exists in your catalog")
  public Boolean getProductActive() {
    return productActive;
  }

  public void setProductActive(Boolean productActive) {
    this.productActive = productActive;
  }

  public ChannelCatalogProductInfo overrides(ProductOverridesWithCatalogValues overrides) {
    this.overrides = overrides;
    return this;
  }

   /**
   * Get overrides
   * @return overrides
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ProductOverridesWithCatalogValues getOverrides() {
    return overrides;
  }

  public void setOverrides(ProductOverridesWithCatalogValues overrides) {
    this.overrides = overrides;
  }

  public ChannelCatalogProductInfo disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Indicates if the product has been disabled or not
   * @return disabled
  **/
  @ApiModelProperty(example = "false", required = true, value = "Indicates if the product has been disabled or not")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public ChannelCatalogProductInfo categoryMapped(Boolean categoryMapped) {
    this.categoryMapped = categoryMapped;
    return this;
  }

   /**
   * Indicates if the product's category has been mapped to a channel category
   * @return categoryMapped
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the product's category has been mapped to a channel category")
  public Boolean getCategoryMapped() {
    return categoryMapped;
  }

  public void setCategoryMapped(Boolean categoryMapped) {
    this.categoryMapped = categoryMapped;
  }

  public ChannelCatalogProductInfo excluded(Boolean excluded) {
    this.excluded = excluded;
    return this;
  }

   /**
   * Indicates if the product has been excluded by a exclusion filter
   * @return excluded
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the product has been excluded by a exclusion filter")
  public Boolean getExcluded() {
    return excluded;
  }

  public void setExcluded(Boolean excluded) {
    this.excluded = excluded;
  }

  public ChannelCatalogProductInfo excludedBy(List<ExclusionFilterName> excludedBy) {
    this.excludedBy = excludedBy;
    return this;
  }

  public ChannelCatalogProductInfo addExcludedByItem(ExclusionFilterName excludedByItem) {
    this.excludedBy.add(excludedByItem);
    return this;
  }

   /**
   * Get excludedBy
   * @return excludedBy
  **/
  @ApiModelProperty(example = "[&quot;Exclude sony products&quot;]", value = "")
  public List<ExclusionFilterName> getExcludedBy() {
    return excludedBy;
  }

  public void setExcludedBy(List<ExclusionFilterName> excludedBy) {
    this.excludedBy = excludedBy;
  }

  public ChannelCatalogProductInfo links(ChannelCatalogProductInfoLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelCatalogProductInfoLinks getLinks() {
    return links;
  }

  public void setLinks(ChannelCatalogProductInfoLinks links) {
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
    ChannelCatalogProductInfo channelCatalogProductInfo = (ChannelCatalogProductInfo) o;
    return Objects.equals(this.productId, channelCatalogProductInfo.productId) &&
        Objects.equals(this.productSku, channelCatalogProductInfo.productSku) &&
        Objects.equals(this.productTitle, channelCatalogProductInfo.productTitle) &&
        Objects.equals(this.productImageUrl, channelCatalogProductInfo.productImageUrl) &&
        Objects.equals(this.productActive, channelCatalogProductInfo.productActive) &&
        Objects.equals(this.overrides, channelCatalogProductInfo.overrides) &&
        Objects.equals(this.disabled, channelCatalogProductInfo.disabled) &&
        Objects.equals(this.categoryMapped, channelCatalogProductInfo.categoryMapped) &&
        Objects.equals(this.excluded, channelCatalogProductInfo.excluded) &&
        Objects.equals(this.excludedBy, channelCatalogProductInfo.excludedBy) &&
        Objects.equals(this.links, channelCatalogProductInfo.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productSku, productTitle, productImageUrl, productActive, overrides, disabled, categoryMapped, excluded, excludedBy, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogProductInfo {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
    sb.append("    productImageUrl: ").append(toIndentedString(productImageUrl)).append("\n");
    sb.append("    productActive: ").append(toIndentedString(productActive)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    categoryMapped: ").append(toIndentedString(categoryMapped)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    excludedBy: ").append(toIndentedString(excludedBy)).append("\n");
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

