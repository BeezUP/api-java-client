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
 * GetChannelCatalogProductInfoListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T13:44:04.202Z")
public class GetChannelCatalogProductInfoListRequest {
  @SerializedName("sku")
  private String sku = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("overrided")
  private Boolean overrided = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("categoryMapped")
  private Boolean categoryMapped = null;

  @SerializedName("excluded")
  private Boolean excluded = null;

  @SerializedName("active")
  private Boolean active = null;

  public GetChannelCatalogProductInfoListRequest sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Search by product sku. If null the filter will not be taken in account.
   * @return sku
  **/
  @ApiModelProperty(example = "M123", value = "Search by product sku. If null the filter will not be taken in account.")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public GetChannelCatalogProductInfoListRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Search by product title. If null the filter will not be taken in account.
   * @return title
  **/
  @ApiModelProperty(example = "RÃ©frigÃ©rateur", value = "Search by product title. If null the filter will not be taken in account.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GetChannelCatalogProductInfoListRequest overrided(Boolean overrided) {
    this.overrided = overrided;
    return this;
  }

   /**
   * Search overrided products. If null the filter will not be taken in account.
   * @return overrided
  **/
  @ApiModelProperty(example = "true", value = "Search overrided products. If null the filter will not be taken in account.")
  public Boolean getOverrided() {
    return overrided;
  }

  public void setOverrided(Boolean overrided) {
    this.overrided = overrided;
  }

  public GetChannelCatalogProductInfoListRequest disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Search disabled products. If null the filter will not be taken in account.
   * @return disabled
  **/
  @ApiModelProperty(example = "false", value = "Search disabled products. If null the filter will not be taken in account.")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public GetChannelCatalogProductInfoListRequest categoryMapped(Boolean categoryMapped) {
    this.categoryMapped = categoryMapped;
    return this;
  }

   /**
   * Search product with category mapped with the channel. If null the filter will not be taken in account.
   * @return categoryMapped
  **/
  @ApiModelProperty(example = "false", value = "Search product with category mapped with the channel. If null the filter will not be taken in account.")
  public Boolean getCategoryMapped() {
    return categoryMapped;
  }

  public void setCategoryMapped(Boolean categoryMapped) {
    this.categoryMapped = categoryMapped;
  }

  public GetChannelCatalogProductInfoListRequest excluded(Boolean excluded) {
    this.excluded = excluded;
    return this;
  }

   /**
   * Search excluded products by at least an exclusion filter. If null the filter will not be taken in account.
   * @return excluded
  **/
  @ApiModelProperty(example = "false", value = "Search excluded products by at least an exclusion filter. If null the filter will not be taken in account.")
  public Boolean getExcluded() {
    return excluded;
  }

  public void setExcluded(Boolean excluded) {
    this.excluded = excluded;
  }

  public GetChannelCatalogProductInfoListRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * If false, search for product absent from the current catalog. If null the filter will not be taken in account.
   * @return active
  **/
  @ApiModelProperty(example = "true", value = "If false, search for product absent from the current catalog. If null the filter will not be taken in account.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChannelCatalogProductInfoListRequest getChannelCatalogProductInfoListRequest = (GetChannelCatalogProductInfoListRequest) o;
    return Objects.equals(this.sku, getChannelCatalogProductInfoListRequest.sku) &&
        Objects.equals(this.title, getChannelCatalogProductInfoListRequest.title) &&
        Objects.equals(this.overrided, getChannelCatalogProductInfoListRequest.overrided) &&
        Objects.equals(this.disabled, getChannelCatalogProductInfoListRequest.disabled) &&
        Objects.equals(this.categoryMapped, getChannelCatalogProductInfoListRequest.categoryMapped) &&
        Objects.equals(this.excluded, getChannelCatalogProductInfoListRequest.excluded) &&
        Objects.equals(this.active, getChannelCatalogProductInfoListRequest.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, title, overrided, disabled, categoryMapped, excluded, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChannelCatalogProductInfoListRequest {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    overrided: ").append(toIndentedString(overrided)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    categoryMapped: ").append(toIndentedString(categoryMapped)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

