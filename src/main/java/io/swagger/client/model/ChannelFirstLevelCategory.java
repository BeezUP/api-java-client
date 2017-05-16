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
import io.swagger.client.model.BeezUPCommonChannelCategoryId;
import io.swagger.client.model.ChannelCategory;
import io.swagger.client.model.ChannelCategoryChannelCode;
import io.swagger.client.model.ChannelCategoryColumnOverrides;
import io.swagger.client.model.ChannelCategoryDefaultCost;
import io.swagger.client.model.ChannelCategoryLevel;
import java.util.ArrayList;
import java.util.List;

/**
 * The first level category with his sub categories
 */
@ApiModel(description = "The first level category with his sub categories")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T09:23:29.795Z")
public class ChannelFirstLevelCategory {
  @SerializedName("channelCategoryId")
  private BeezUPCommonChannelCategoryId channelCategoryId = null;

  @SerializedName("channelCategoryName")
  private String channelCategoryName = null;

  @SerializedName("channelCategoryLevel")
  private ChannelCategoryLevel channelCategoryLevel = null;

  @SerializedName("channelCategoryDefaultCost")
  private ChannelCategoryDefaultCost channelCategoryDefaultCost = null;

  @SerializedName("channelCategoryChannelCode")
  private ChannelCategoryChannelCode channelCategoryChannelCode = null;

  @SerializedName("channelCategoryColumnOverrides")
  private ChannelCategoryColumnOverrides channelCategoryColumnOverrides = null;

  @SerializedName("subCategories")
  private List<ChannelCategory> subCategories = new ArrayList<ChannelCategory>();

  public ChannelFirstLevelCategory channelCategoryId(BeezUPCommonChannelCategoryId channelCategoryId) {
    this.channelCategoryId = channelCategoryId;
    return this;
  }

   /**
   * Get channelCategoryId
   * @return channelCategoryId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelCategoryId getChannelCategoryId() {
    return channelCategoryId;
  }

  public void setChannelCategoryId(BeezUPCommonChannelCategoryId channelCategoryId) {
    this.channelCategoryId = channelCategoryId;
  }

  public ChannelFirstLevelCategory channelCategoryName(String channelCategoryName) {
    this.channelCategoryName = channelCategoryName;
    return this;
  }

   /**
   * The channel category name
   * @return channelCategoryName
  **/
  @ApiModelProperty(example = "Clothing", required = true, value = "The channel category name")
  public String getChannelCategoryName() {
    return channelCategoryName;
  }

  public void setChannelCategoryName(String channelCategoryName) {
    this.channelCategoryName = channelCategoryName;
  }

  public ChannelFirstLevelCategory channelCategoryLevel(ChannelCategoryLevel channelCategoryLevel) {
    this.channelCategoryLevel = channelCategoryLevel;
    return this;
  }

   /**
   * Get channelCategoryLevel
   * @return channelCategoryLevel
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelCategoryLevel getChannelCategoryLevel() {
    return channelCategoryLevel;
  }

  public void setChannelCategoryLevel(ChannelCategoryLevel channelCategoryLevel) {
    this.channelCategoryLevel = channelCategoryLevel;
  }

  public ChannelFirstLevelCategory channelCategoryDefaultCost(ChannelCategoryDefaultCost channelCategoryDefaultCost) {
    this.channelCategoryDefaultCost = channelCategoryDefaultCost;
    return this;
  }

   /**
   * Get channelCategoryDefaultCost
   * @return channelCategoryDefaultCost
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelCategoryDefaultCost getChannelCategoryDefaultCost() {
    return channelCategoryDefaultCost;
  }

  public void setChannelCategoryDefaultCost(ChannelCategoryDefaultCost channelCategoryDefaultCost) {
    this.channelCategoryDefaultCost = channelCategoryDefaultCost;
  }

  public ChannelFirstLevelCategory channelCategoryChannelCode(ChannelCategoryChannelCode channelCategoryChannelCode) {
    this.channelCategoryChannelCode = channelCategoryChannelCode;
    return this;
  }

   /**
   * Get channelCategoryChannelCode
   * @return channelCategoryChannelCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelCategoryChannelCode getChannelCategoryChannelCode() {
    return channelCategoryChannelCode;
  }

  public void setChannelCategoryChannelCode(ChannelCategoryChannelCode channelCategoryChannelCode) {
    this.channelCategoryChannelCode = channelCategoryChannelCode;
  }

  public ChannelFirstLevelCategory channelCategoryColumnOverrides(ChannelCategoryColumnOverrides channelCategoryColumnOverrides) {
    this.channelCategoryColumnOverrides = channelCategoryColumnOverrides;
    return this;
  }

   /**
   * Get channelCategoryColumnOverrides
   * @return channelCategoryColumnOverrides
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelCategoryColumnOverrides getChannelCategoryColumnOverrides() {
    return channelCategoryColumnOverrides;
  }

  public void setChannelCategoryColumnOverrides(ChannelCategoryColumnOverrides channelCategoryColumnOverrides) {
    this.channelCategoryColumnOverrides = channelCategoryColumnOverrides;
  }

  public ChannelFirstLevelCategory subCategories(List<ChannelCategory> subCategories) {
    this.subCategories = subCategories;
    return this;
  }

  public ChannelFirstLevelCategory addSubCategoriesItem(ChannelCategory subCategoriesItem) {
    this.subCategories.add(subCategoriesItem);
    return this;
  }

   /**
   * Get subCategories
   * @return subCategories
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ChannelCategory> getSubCategories() {
    return subCategories;
  }

  public void setSubCategories(List<ChannelCategory> subCategories) {
    this.subCategories = subCategories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelFirstLevelCategory channelFirstLevelCategory = (ChannelFirstLevelCategory) o;
    return Objects.equals(this.channelCategoryId, channelFirstLevelCategory.channelCategoryId) &&
        Objects.equals(this.channelCategoryName, channelFirstLevelCategory.channelCategoryName) &&
        Objects.equals(this.channelCategoryLevel, channelFirstLevelCategory.channelCategoryLevel) &&
        Objects.equals(this.channelCategoryDefaultCost, channelFirstLevelCategory.channelCategoryDefaultCost) &&
        Objects.equals(this.channelCategoryChannelCode, channelFirstLevelCategory.channelCategoryChannelCode) &&
        Objects.equals(this.channelCategoryColumnOverrides, channelFirstLevelCategory.channelCategoryColumnOverrides) &&
        Objects.equals(this.subCategories, channelFirstLevelCategory.subCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelCategoryId, channelCategoryName, channelCategoryLevel, channelCategoryDefaultCost, channelCategoryChannelCode, channelCategoryColumnOverrides, subCategories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelFirstLevelCategory {\n");
    
    sb.append("    channelCategoryId: ").append(toIndentedString(channelCategoryId)).append("\n");
    sb.append("    channelCategoryName: ").append(toIndentedString(channelCategoryName)).append("\n");
    sb.append("    channelCategoryLevel: ").append(toIndentedString(channelCategoryLevel)).append("\n");
    sb.append("    channelCategoryDefaultCost: ").append(toIndentedString(channelCategoryDefaultCost)).append("\n");
    sb.append("    channelCategoryChannelCode: ").append(toIndentedString(channelCategoryChannelCode)).append("\n");
    sb.append("    channelCategoryColumnOverrides: ").append(toIndentedString(channelCategoryColumnOverrides)).append("\n");
    sb.append("    subCategories: ").append(toIndentedString(subCategories)).append("\n");
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

