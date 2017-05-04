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
import io.swagger.client.model.BeezUPCommonCatalogCategoryId;
import io.swagger.client.model.BeezUPCommonCatalogCategoryPath;
import io.swagger.client.model.BeezUPCommonLink2;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportByCategory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T11:55:43.788Z")
public class ReportByCategory {
  @SerializedName("catalogCategoryId")
  private BeezUPCommonCatalogCategoryId catalogCategoryId = null;

  @SerializedName("catalogCategoryPath")
  private BeezUPCommonCatalogCategoryPath catalogCategoryPath = null;

  @SerializedName("enabledProductCount")
  private Integer enabledProductCount = null;

  @SerializedName("catalogProductCount")
  private Integer catalogProductCount = null;

  @SerializedName("clickCount")
  private Integer clickCount = null;

  @SerializedName("cost")
  private BigDecimal cost = null;

  @SerializedName("orderCount")
  private Integer orderCount = null;

  @SerializedName("turnOver")
  private BigDecimal turnOver = null;

  @SerializedName("margin")
  private BigDecimal margin = null;

  @SerializedName("performanceIndicator")
  private BigDecimal performanceIndicator = null;

  @SerializedName("links")
  private List<BeezUPCommonLink2> links = new ArrayList<BeezUPCommonLink2>();

  public ReportByCategory catalogCategoryId(BeezUPCommonCatalogCategoryId catalogCategoryId) {
    this.catalogCategoryId = catalogCategoryId;
    return this;
  }

   /**
   * Get catalogCategoryId
   * @return catalogCategoryId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonCatalogCategoryId getCatalogCategoryId() {
    return catalogCategoryId;
  }

  public void setCatalogCategoryId(BeezUPCommonCatalogCategoryId catalogCategoryId) {
    this.catalogCategoryId = catalogCategoryId;
  }

  public ReportByCategory catalogCategoryPath(BeezUPCommonCatalogCategoryPath catalogCategoryPath) {
    this.catalogCategoryPath = catalogCategoryPath;
    return this;
  }

   /**
   * Get catalogCategoryPath
   * @return catalogCategoryPath
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonCatalogCategoryPath getCatalogCategoryPath() {
    return catalogCategoryPath;
  }

  public void setCatalogCategoryPath(BeezUPCommonCatalogCategoryPath catalogCategoryPath) {
    this.catalogCategoryPath = catalogCategoryPath;
  }

  public ReportByCategory enabledProductCount(Integer enabledProductCount) {
    this.enabledProductCount = enabledProductCount;
    return this;
  }

   /**
   * The enabled product count for this category
   * @return enabledProductCount
  **/
  @ApiModelProperty(example = "101", required = true, value = "The enabled product count for this category")
  public Integer getEnabledProductCount() {
    return enabledProductCount;
  }

  public void setEnabledProductCount(Integer enabledProductCount) {
    this.enabledProductCount = enabledProductCount;
  }

  public ReportByCategory catalogProductCount(Integer catalogProductCount) {
    this.catalogProductCount = catalogProductCount;
    return this;
  }

   /**
   * The catalog product count related to this category
   * @return catalogProductCount
  **/
  @ApiModelProperty(example = "101", required = true, value = "The catalog product count related to this category")
  public Integer getCatalogProductCount() {
    return catalogProductCount;
  }

  public void setCatalogProductCount(Integer catalogProductCount) {
    this.catalogProductCount = catalogProductCount;
  }

  public ReportByCategory clickCount(Integer clickCount) {
    this.clickCount = clickCount;
    return this;
  }

   /**
   * The click count for this category
   * @return clickCount
  **/
  @ApiModelProperty(example = "1001", required = true, value = "The click count for this category")
  public Integer getClickCount() {
    return clickCount;
  }

  public void setClickCount(Integer clickCount) {
    this.clickCount = clickCount;
  }

  public ReportByCategory cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

   /**
   * The cost for this category
   * @return cost
  **/
  @ApiModelProperty(example = "12.42", required = true, value = "The cost for this category")
  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public ReportByCategory orderCount(Integer orderCount) {
    this.orderCount = orderCount;
    return this;
  }

   /**
   * The order count for this category
   * @return orderCount
  **/
  @ApiModelProperty(example = "25.33", required = true, value = "The order count for this category")
  public Integer getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
  }

  public ReportByCategory turnOver(BigDecimal turnOver) {
    this.turnOver = turnOver;
    return this;
  }

   /**
   * The Turnover for this category
   * @return turnOver
  **/
  @ApiModelProperty(example = "25.33", required = true, value = "The Turnover for this category")
  public BigDecimal getTurnOver() {
    return turnOver;
  }

  public void setTurnOver(BigDecimal turnOver) {
    this.turnOver = turnOver;
  }

  public ReportByCategory margin(BigDecimal margin) {
    this.margin = margin;
    return this;
  }

   /**
   * The margin for this category
   * @return margin
  **/
  @ApiModelProperty(example = "3.33", required = true, value = "The margin for this category")
  public BigDecimal getMargin() {
    return margin;
  }

  public void setMargin(BigDecimal margin) {
    this.margin = margin;
  }

  public ReportByCategory performanceIndicator(BigDecimal performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
    return this;
  }

   /**
   * The performance indicator based on the performance indicator formula indicated in the request for this category
   * @return performanceIndicator
  **/
  @ApiModelProperty(example = "25.33", required = true, value = "The performance indicator based on the performance indicator formula indicated in the request for this category")
  public BigDecimal getPerformanceIndicator() {
    return performanceIndicator;
  }

  public void setPerformanceIndicator(BigDecimal performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
  }

  public ReportByCategory links(List<BeezUPCommonLink2> links) {
    this.links = links;
    return this;
  }

  public ReportByCategory addLinksItem(BeezUPCommonLink2 linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * The action list on this catagory
   * @return links
  **/
  @ApiModelProperty(example = "[{&quot;href&quot;:&quot;/v2/user/analytics/{storeId}/optimisations/bycategory/{catalogCategoryId}/{actionName}&quot;,&quot;operationId&quot;:&quot;OptimiseByCategory&quot;,&quot;rel&quot;:&quot;EnableProducts&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;8f95eb1a-3691-4750-950d-a13c4a8a9bcc&quot;},{&quot;name&quot;:&quot;catalogCategoryId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;4c376178-25b4-4656-a86e-e3bd3a25b139&quot;},{&quot;name&quot;:&quot;actionName&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;reenable&quot;},{&quot;name&quot;:&quot;request&quot;,&quot;in&quot;:&quot;body&quot;,&quot;type&quot;:&quot;array&quot;,&quot;value&quot;:[&quot;a2d38563-50f0-43f1-be2b-b16e7ec4f007&quot;]}]},{&quot;href&quot;:&quot;/v2/user/analytics/{storeId}/optimisations/bycategory/{catalogCategoryId}/{actionName}&quot;,&quot;operationId&quot;:&quot;OptimiseByCategory&quot;,&quot;rel&quot;:&quot;DisableProducts&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;8f95eb1a-3691-4750-950d-a13c4a8a9bcc&quot;},{&quot;name&quot;:&quot;catalogCategoryId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;4c376178-25b4-4656-a86e-e3bd3a25b139&quot;},{&quot;name&quot;:&quot;actionName&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;disable&quot;},{&quot;name&quot;:&quot;request&quot;,&quot;in&quot;:&quot;body&quot;,&quot;type&quot;:&quot;array&quot;,&quot;value&quot;:[&quot;a2d38563-50f0-43f1-be2b-b16e7ec4f007&quot;]}]}]", value = "The action list on this catagory")
  public List<BeezUPCommonLink2> getLinks() {
    return links;
  }

  public void setLinks(List<BeezUPCommonLink2> links) {
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
    ReportByCategory reportByCategory = (ReportByCategory) o;
    return Objects.equals(this.catalogCategoryId, reportByCategory.catalogCategoryId) &&
        Objects.equals(this.catalogCategoryPath, reportByCategory.catalogCategoryPath) &&
        Objects.equals(this.enabledProductCount, reportByCategory.enabledProductCount) &&
        Objects.equals(this.catalogProductCount, reportByCategory.catalogProductCount) &&
        Objects.equals(this.clickCount, reportByCategory.clickCount) &&
        Objects.equals(this.cost, reportByCategory.cost) &&
        Objects.equals(this.orderCount, reportByCategory.orderCount) &&
        Objects.equals(this.turnOver, reportByCategory.turnOver) &&
        Objects.equals(this.margin, reportByCategory.margin) &&
        Objects.equals(this.performanceIndicator, reportByCategory.performanceIndicator) &&
        Objects.equals(this.links, reportByCategory.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogCategoryId, catalogCategoryPath, enabledProductCount, catalogProductCount, clickCount, cost, orderCount, turnOver, margin, performanceIndicator, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByCategory {\n");
    
    sb.append("    catalogCategoryId: ").append(toIndentedString(catalogCategoryId)).append("\n");
    sb.append("    catalogCategoryPath: ").append(toIndentedString(catalogCategoryPath)).append("\n");
    sb.append("    enabledProductCount: ").append(toIndentedString(enabledProductCount)).append("\n");
    sb.append("    catalogProductCount: ").append(toIndentedString(catalogProductCount)).append("\n");
    sb.append("    clickCount: ").append(toIndentedString(clickCount)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
    sb.append("    turnOver: ").append(toIndentedString(turnOver)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    performanceIndicator: ").append(toIndentedString(performanceIndicator)).append("\n");
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

