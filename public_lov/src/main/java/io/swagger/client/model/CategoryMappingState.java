/*
 * Channel Catalogs
 * This api allows you to manage your channel catalogs.   A channel catalog is an association between your store and a channel.  You will be able to: - map your catalog colums to channel columns. - map your catalog categories to the channel categories and define a cost of this category - configure the general and cost settings of the channel - enable or disable a channel - exclude products using filters for a channel - override product values for a channel - disable or reenable a product on a channel 
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
import io.swagger.client.model.CategoryMappingStatus;

/**
 * The category mapping state of the channel catalog
 */
@ApiModel(description = "The category mapping state of the channel catalog")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:11:08.222Z")
public class CategoryMappingState {
  @SerializedName("status")
  private CategoryMappingStatus status = null;

  @SerializedName("uncategorizedProductCount")
  private Integer uncategorizedProductCount = null;

  @SerializedName("categorizedWithoutCostProductCount")
  private Integer categorizedWithoutCostProductCount = null;

  public CategoryMappingState status(CategoryMappingStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public CategoryMappingStatus getStatus() {
    return status;
  }

  public void setStatus(CategoryMappingStatus status) {
    this.status = status;
  }

  public CategoryMappingState uncategorizedProductCount(Integer uncategorizedProductCount) {
    this.uncategorizedProductCount = uncategorizedProductCount;
    return this;
  }

   /**
   * Indicates the uncategorized product count
   * @return uncategorizedProductCount
  **/
  @ApiModelProperty(example = "101", value = "Indicates the uncategorized product count")
  public Integer getUncategorizedProductCount() {
    return uncategorizedProductCount;
  }

  public void setUncategorizedProductCount(Integer uncategorizedProductCount) {
    this.uncategorizedProductCount = uncategorizedProductCount;
  }

  public CategoryMappingState categorizedWithoutCostProductCount(Integer categorizedWithoutCostProductCount) {
    this.categorizedWithoutCostProductCount = categorizedWithoutCostProductCount;
    return this;
  }

   /**
   * Indicates the categorized product count without cost defined on the category
   * @return categorizedWithoutCostProductCount
  **/
  @ApiModelProperty(example = "42", value = "Indicates the categorized product count without cost defined on the category")
  public Integer getCategorizedWithoutCostProductCount() {
    return categorizedWithoutCostProductCount;
  }

  public void setCategorizedWithoutCostProductCount(Integer categorizedWithoutCostProductCount) {
    this.categorizedWithoutCostProductCount = categorizedWithoutCostProductCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryMappingState categoryMappingState = (CategoryMappingState) o;
    return Objects.equals(this.status, categoryMappingState.status) &&
        Objects.equals(this.uncategorizedProductCount, categoryMappingState.uncategorizedProductCount) &&
        Objects.equals(this.categorizedWithoutCostProductCount, categoryMappingState.categorizedWithoutCostProductCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, uncategorizedProductCount, categorizedWithoutCostProductCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryMappingState {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uncategorizedProductCount: ").append(toIndentedString(uncategorizedProductCount)).append("\n");
    sb.append("    categorizedWithoutCostProductCount: ").append(toIndentedString(categorizedWithoutCostProductCount)).append("\n");
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
