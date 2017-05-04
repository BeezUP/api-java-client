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
import io.swagger.client.model.ChannelCatalogCategoryMapping;

/**
 * The request message to make a mapping between catalog category path and a channel category path
 */
@ApiModel(description = "The request message to make a mapping between catalog category path and a channel category path")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:27:39.504Z")
public class MapCategoryRequest {
  @SerializedName("overrideSubCategoryMappings")
  private Boolean overrideSubCategoryMappings = null;

  @SerializedName("autoMapNewSubCategories")
  private Boolean autoMapNewSubCategories = null;

  @SerializedName("channelCatalogCategoryMapping")
  private ChannelCatalogCategoryMapping channelCatalogCategoryMapping = null;

  public MapCategoryRequest overrideSubCategoryMappings(Boolean overrideSubCategoryMappings) {
    this.overrideSubCategoryMappings = overrideSubCategoryMappings;
    return this;
  }

   /**
   * Great feature! In case of mapping to parent channel category, you can ask to override the mapping of all sub channel category to this catalog category path
   * @return overrideSubCategoryMappings
  **/
  @ApiModelProperty(example = "true", required = true, value = "Great feature! In case of mapping to parent channel category, you can ask to override the mapping of all sub channel category to this catalog category path")
  public Boolean getOverrideSubCategoryMappings() {
    return overrideSubCategoryMappings;
  }

  public void setOverrideSubCategoryMappings(Boolean overrideSubCategoryMappings) {
    this.overrideSubCategoryMappings = overrideSubCategoryMappings;
  }

  public MapCategoryRequest autoMapNewSubCategories(Boolean autoMapNewSubCategories) {
    this.autoMapNewSubCategories = autoMapNewSubCategories;
    return this;
  }

   /**
   * Great feature! In case of mapping to parent catalog category, you can ask to automatically map new sub catalog category in the next importation to this channel category path.
   * @return autoMapNewSubCategories
  **/
  @ApiModelProperty(example = "true", required = true, value = "Great feature! In case of mapping to parent catalog category, you can ask to automatically map new sub catalog category in the next importation to this channel category path.")
  public Boolean getAutoMapNewSubCategories() {
    return autoMapNewSubCategories;
  }

  public void setAutoMapNewSubCategories(Boolean autoMapNewSubCategories) {
    this.autoMapNewSubCategories = autoMapNewSubCategories;
  }

  public MapCategoryRequest channelCatalogCategoryMapping(ChannelCatalogCategoryMapping channelCatalogCategoryMapping) {
    this.channelCatalogCategoryMapping = channelCatalogCategoryMapping;
    return this;
  }

   /**
   * Get channelCatalogCategoryMapping
   * @return channelCatalogCategoryMapping
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelCatalogCategoryMapping getChannelCatalogCategoryMapping() {
    return channelCatalogCategoryMapping;
  }

  public void setChannelCatalogCategoryMapping(ChannelCatalogCategoryMapping channelCatalogCategoryMapping) {
    this.channelCatalogCategoryMapping = channelCatalogCategoryMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapCategoryRequest mapCategoryRequest = (MapCategoryRequest) o;
    return Objects.equals(this.overrideSubCategoryMappings, mapCategoryRequest.overrideSubCategoryMappings) &&
        Objects.equals(this.autoMapNewSubCategories, mapCategoryRequest.autoMapNewSubCategories) &&
        Objects.equals(this.channelCatalogCategoryMapping, mapCategoryRequest.channelCatalogCategoryMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrideSubCategoryMappings, autoMapNewSubCategories, channelCatalogCategoryMapping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapCategoryRequest {\n");
    
    sb.append("    overrideSubCategoryMappings: ").append(toIndentedString(overrideSubCategoryMappings)).append("\n");
    sb.append("    autoMapNewSubCategories: ").append(toIndentedString(autoMapNewSubCategories)).append("\n");
    sb.append("    channelCatalogCategoryMapping: ").append(toIndentedString(channelCatalogCategoryMapping)).append("\n");
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

