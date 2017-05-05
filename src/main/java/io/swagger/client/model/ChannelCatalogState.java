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
import io.swagger.client.model.ApiSettingStatus;
import io.swagger.client.model.CategoryMappingState;
import io.swagger.client.model.ColumnMappingStatus;

/**
 * Channel Catalog State
 */
@ApiModel(description = "Channel Catalog State")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:23:39.618Z")
public class ChannelCatalogState {
  @SerializedName("exportedProductCount")
  private Integer exportedProductCount = null;

  @SerializedName("columnMappingStatus")
  private ColumnMappingStatus columnMappingStatus = null;

  @SerializedName("categoryMappingState")
  private CategoryMappingState categoryMappingState = null;

  @SerializedName("apiSettingStatus")
  private ApiSettingStatus apiSettingStatus = null;

  public ChannelCatalogState exportedProductCount(Integer exportedProductCount) {
    this.exportedProductCount = exportedProductCount;
    return this;
  }

   /**
   * Get exportedProductCount
   * @return exportedProductCount
  **/
  @ApiModelProperty(example = "101", required = true, value = "")
  public Integer getExportedProductCount() {
    return exportedProductCount;
  }

  public void setExportedProductCount(Integer exportedProductCount) {
    this.exportedProductCount = exportedProductCount;
  }

  public ChannelCatalogState columnMappingStatus(ColumnMappingStatus columnMappingStatus) {
    this.columnMappingStatus = columnMappingStatus;
    return this;
  }

   /**
   * Get columnMappingStatus
   * @return columnMappingStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ColumnMappingStatus getColumnMappingStatus() {
    return columnMappingStatus;
  }

  public void setColumnMappingStatus(ColumnMappingStatus columnMappingStatus) {
    this.columnMappingStatus = columnMappingStatus;
  }

  public ChannelCatalogState categoryMappingState(CategoryMappingState categoryMappingState) {
    this.categoryMappingState = categoryMappingState;
    return this;
  }

   /**
   * Get categoryMappingState
   * @return categoryMappingState
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CategoryMappingState getCategoryMappingState() {
    return categoryMappingState;
  }

  public void setCategoryMappingState(CategoryMappingState categoryMappingState) {
    this.categoryMappingState = categoryMappingState;
  }

  public ChannelCatalogState apiSettingStatus(ApiSettingStatus apiSettingStatus) {
    this.apiSettingStatus = apiSettingStatus;
    return this;
  }

   /**
   * Get apiSettingStatus
   * @return apiSettingStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ApiSettingStatus getApiSettingStatus() {
    return apiSettingStatus;
  }

  public void setApiSettingStatus(ApiSettingStatus apiSettingStatus) {
    this.apiSettingStatus = apiSettingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogState channelCatalogState = (ChannelCatalogState) o;
    return Objects.equals(this.exportedProductCount, channelCatalogState.exportedProductCount) &&
        Objects.equals(this.columnMappingStatus, channelCatalogState.columnMappingStatus) &&
        Objects.equals(this.categoryMappingState, channelCatalogState.categoryMappingState) &&
        Objects.equals(this.apiSettingStatus, channelCatalogState.apiSettingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportedProductCount, columnMappingStatus, categoryMappingState, apiSettingStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogState {\n");
    
    sb.append("    exportedProductCount: ").append(toIndentedString(exportedProductCount)).append("\n");
    sb.append("    columnMappingStatus: ").append(toIndentedString(columnMappingStatus)).append("\n");
    sb.append("    categoryMappingState: ").append(toIndentedString(categoryMappingState)).append("\n");
    sb.append("    apiSettingStatus: ").append(toIndentedString(apiSettingStatus)).append("\n");
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

