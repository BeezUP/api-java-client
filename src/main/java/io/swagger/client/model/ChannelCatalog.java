/*
 * BeezUP API
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
import io.swagger.client.model.BeezUPCommonChannelBasicInfo;
import io.swagger.client.model.BeezUPCommonChannelCatalogId;
import io.swagger.client.model.BeezUPCommonChannelId;
import io.swagger.client.model.BeezUPCommonChannelName;
import io.swagger.client.model.BeezUPCommonHttpUrl;
import io.swagger.client.model.BeezUPCommonLink2;
import io.swagger.client.model.BeezUPCommonStoreId;
import io.swagger.client.model.ChannelCatalogState;
import io.swagger.client.model.ColumnMappingWithNameList;
import io.swagger.client.model.CostSettings;
import io.swagger.client.model.ExclusionFilters;
import io.swagger.client.model.GeneralSettings;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelCatalog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class ChannelCatalog {
  @SerializedName("channelId")
  private BeezUPCommonChannelId channelId = null;

  @SerializedName("channelName")
  private BeezUPCommonChannelName channelName = null;

  @SerializedName("channelImageUrl")
  private BeezUPCommonHttpUrl channelImageUrl = null;

  @SerializedName("productCount")
  private Integer productCount = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("isMarketplace")
  private Boolean isMarketplace = null;

  @SerializedName("channelCatalogId")
  private BeezUPCommonChannelCatalogId channelCatalogId = null;

  @SerializedName("storeId")
  private BeezUPCommonStoreId storeId = null;

  @SerializedName("generalSettings")
  private GeneralSettings generalSettings = null;

  @SerializedName("costSettings")
  private CostSettings costSettings = null;

  @SerializedName("columnMappings")
  private ColumnMappingWithNameList columnMappings = null;

  @SerializedName("exclusionFilters")
  private ExclusionFilters exclusionFilters = null;

  @SerializedName("exportUrl")
  private BeezUPCommonHttpUrl exportUrl = null;

  @SerializedName("state")
  private ChannelCatalogState state = null;

  @SerializedName("types")
  private List<String> types = new ArrayList<String>();

  @SerializedName("links")
  private List<BeezUPCommonLink2> links = new ArrayList<BeezUPCommonLink2>();

  public ChannelCatalog channelId(BeezUPCommonChannelId channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelId getChannelId() {
    return channelId;
  }

  public void setChannelId(BeezUPCommonChannelId channelId) {
    this.channelId = channelId;
  }

  public ChannelCatalog channelName(BeezUPCommonChannelName channelName) {
    this.channelName = channelName;
    return this;
  }

   /**
   * Get channelName
   * @return channelName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelName getChannelName() {
    return channelName;
  }

  public void setChannelName(BeezUPCommonChannelName channelName) {
    this.channelName = channelName;
  }

  public ChannelCatalog channelImageUrl(BeezUPCommonHttpUrl channelImageUrl) {
    this.channelImageUrl = channelImageUrl;
    return this;
  }

   /**
   * Get channelImageUrl
   * @return channelImageUrl
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonHttpUrl getChannelImageUrl() {
    return channelImageUrl;
  }

  public void setChannelImageUrl(BeezUPCommonHttpUrl channelImageUrl) {
    this.channelImageUrl = channelImageUrl;
  }

  public ChannelCatalog productCount(Integer productCount) {
    this.productCount = productCount;
    return this;
  }

   /**
   * The product count exported considering category mapping. Not all filters have been applied.
   * @return productCount
  **/
  @ApiModelProperty(example = "null", required = true, value = "The product count exported considering category mapping. Not all filters have been applied.")
  public Integer getProductCount() {
    return productCount;
  }

  public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }

  public ChannelCatalog enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates if the channel catalog is active
   * @return enabled
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the channel catalog is active")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ChannelCatalog isMarketplace(Boolean isMarketplace) {
    this.isMarketplace = isMarketplace;
    return this;
  }

   /**
   * Indicates if this channel catalog is related to a marketplace
   * @return isMarketplace
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if this channel catalog is related to a marketplace")
  public Boolean getIsMarketplace() {
    return isMarketplace;
  }

  public void setIsMarketplace(Boolean isMarketplace) {
    this.isMarketplace = isMarketplace;
  }

  public ChannelCatalog channelCatalogId(BeezUPCommonChannelCatalogId channelCatalogId) {
    this.channelCatalogId = channelCatalogId;
    return this;
  }

   /**
   * Get channelCatalogId
   * @return channelCatalogId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelCatalogId getChannelCatalogId() {
    return channelCatalogId;
  }

  public void setChannelCatalogId(BeezUPCommonChannelCatalogId channelCatalogId) {
    this.channelCatalogId = channelCatalogId;
  }

  public ChannelCatalog storeId(BeezUPCommonStoreId storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonStoreId getStoreId() {
    return storeId;
  }

  public void setStoreId(BeezUPCommonStoreId storeId) {
    this.storeId = storeId;
  }

  public ChannelCatalog generalSettings(GeneralSettings generalSettings) {
    this.generalSettings = generalSettings;
    return this;
  }

   /**
   * Get generalSettings
   * @return generalSettings
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public GeneralSettings getGeneralSettings() {
    return generalSettings;
  }

  public void setGeneralSettings(GeneralSettings generalSettings) {
    this.generalSettings = generalSettings;
  }

  public ChannelCatalog costSettings(CostSettings costSettings) {
    this.costSettings = costSettings;
    return this;
  }

   /**
   * Get costSettings
   * @return costSettings
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CostSettings getCostSettings() {
    return costSettings;
  }

  public void setCostSettings(CostSettings costSettings) {
    this.costSettings = costSettings;
  }

  public ChannelCatalog columnMappings(ColumnMappingWithNameList columnMappings) {
    this.columnMappings = columnMappings;
    return this;
  }

   /**
   * Get columnMappings
   * @return columnMappings
  **/
  @ApiModelProperty(example = "null", value = "")
  public ColumnMappingWithNameList getColumnMappings() {
    return columnMappings;
  }

  public void setColumnMappings(ColumnMappingWithNameList columnMappings) {
    this.columnMappings = columnMappings;
  }

  public ChannelCatalog exclusionFilters(ExclusionFilters exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
    return this;
  }

   /**
   * Get exclusionFilters
   * @return exclusionFilters
  **/
  @ApiModelProperty(example = "null", value = "")
  public ExclusionFilters getExclusionFilters() {
    return exclusionFilters;
  }

  public void setExclusionFilters(ExclusionFilters exclusionFilters) {
    this.exclusionFilters = exclusionFilters;
  }

  public ChannelCatalog exportUrl(BeezUPCommonHttpUrl exportUrl) {
    this.exportUrl = exportUrl;
    return this;
  }

   /**
   * Get exportUrl
   * @return exportUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonHttpUrl getExportUrl() {
    return exportUrl;
  }

  public void setExportUrl(BeezUPCommonHttpUrl exportUrl) {
    this.exportUrl = exportUrl;
  }

  public ChannelCatalog state(ChannelCatalogState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelCatalogState getState() {
    return state;
  }

  public void setState(ChannelCatalogState state) {
    this.state = state;
  }

  public ChannelCatalog types(List<String> types) {
    this.types = types;
    return this;
  }

  public ChannelCatalog addTypesItem(String typesItem) {
    this.types.add(typesItem);
    return this;
  }

   /**
   * The channel type list related to the channel
   * @return types
  **/
  @ApiModelProperty(example = "[&quot;Marketplace&quot;]", required = true, value = "The channel type list related to the channel")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  public ChannelCatalog links(List<BeezUPCommonLink2> links) {
    this.links = links;
    return this;
  }

  public ChannelCatalog addLinksItem(BeezUPCommonLink2 linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Indicates the actions you can do on a channel catalog
   * @return links
  **/
  @ApiModelProperty(example = "[{&quot;rel&quot;:&quot;categoryMappings&quot;,&quot;operationId&quot;:&quot;GetChannelCatalogCategoyMappings&quot;,&quot;href&quot;:&quot;/v2/user/channelCatalogs/{channelCatalogId}/categoryMappings&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;channelCatalogId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;required&quot;:true,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;6d6b04de-406b-4539-8e7e-bf3e8da5dfb0&quot;}]},{&quot;rel&quot;:&quot;delete&quot;,&quot;operationId&quot;:&quot;DeleteChannelCatalog&quot;,&quot;href&quot;:&quot;/v2/user/channelCatalogs/{channelCatalogId}&quot;,&quot;method&quot;:&quot;DELETE&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;channelCatalogId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;required&quot;:true,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;6d6b04de-406b-4539-8e7e-bf3e8da5dfb0&quot;}]},{&quot;rel&quot;:&quot;disable&quot;,&quot;operationId&quot;:&quot;DisableChannelCatalog&quot;,&quot;href&quot;:&quot;/v2/user/channelCatalogs/{channelCatalogId}/disable&quot;,&quot;method&quot;:&quot;POST&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;channelCatalogId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;required&quot;:true,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;6d6b04de-406b-4539-8e7e-bf3e8da5dfb0&quot;}]},{&quot;rel&quot;:&quot;exportation&quot;,&quot;operationId&quot;:&quot;GetChannelCatalogExportationCacheInfo&quot;,&quot;href&quot;:&quot;/v2/user/channelCatalogs/{channelCatalogId}/exportations/cache&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;channelCatalogId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;required&quot;:true,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;6d6b04de-406b-4539-8e7e-bf3e8da5dfb0&quot;}]},{&quot;rel&quot;:&quot;exportationHistory&quot;,&quot;operationId&quot;:&quot;GetChannelCatalogExportationHistory&quot;,&quot;href&quot;:&quot;/v2/user/channelCatalogs/{channelCatalogId}/exportations/history&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;channelCatalogId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;required&quot;:true,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;6d6b04de-406b-4539-8e7e-bf3e8da5dfb0&quot;}]}]", required = true, value = "Indicates the actions you can do on a channel catalog")
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
    ChannelCatalog channelCatalog = (ChannelCatalog) o;
    return Objects.equals(this.channelId, channelCatalog.channelId) &&
        Objects.equals(this.channelName, channelCatalog.channelName) &&
        Objects.equals(this.channelImageUrl, channelCatalog.channelImageUrl) &&
        Objects.equals(this.productCount, channelCatalog.productCount) &&
        Objects.equals(this.enabled, channelCatalog.enabled) &&
        Objects.equals(this.isMarketplace, channelCatalog.isMarketplace) &&
        Objects.equals(this.channelCatalogId, channelCatalog.channelCatalogId) &&
        Objects.equals(this.storeId, channelCatalog.storeId) &&
        Objects.equals(this.generalSettings, channelCatalog.generalSettings) &&
        Objects.equals(this.costSettings, channelCatalog.costSettings) &&
        Objects.equals(this.columnMappings, channelCatalog.columnMappings) &&
        Objects.equals(this.exclusionFilters, channelCatalog.exclusionFilters) &&
        Objects.equals(this.exportUrl, channelCatalog.exportUrl) &&
        Objects.equals(this.state, channelCatalog.state) &&
        Objects.equals(this.types, channelCatalog.types) &&
        Objects.equals(this.links, channelCatalog.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelName, channelImageUrl, productCount, enabled, isMarketplace, channelCatalogId, storeId, generalSettings, costSettings, columnMappings, exclusionFilters, exportUrl, state, types, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalog {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    channelImageUrl: ").append(toIndentedString(channelImageUrl)).append("\n");
    sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    isMarketplace: ").append(toIndentedString(isMarketplace)).append("\n");
    sb.append("    channelCatalogId: ").append(toIndentedString(channelCatalogId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    generalSettings: ").append(toIndentedString(generalSettings)).append("\n");
    sb.append("    costSettings: ").append(toIndentedString(costSettings)).append("\n");
    sb.append("    columnMappings: ").append(toIndentedString(columnMappings)).append("\n");
    sb.append("    exclusionFilters: ").append(toIndentedString(exclusionFilters)).append("\n");
    sb.append("    exportUrl: ").append(toIndentedString(exportUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

