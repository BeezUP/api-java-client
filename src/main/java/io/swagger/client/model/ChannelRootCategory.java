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
import io.swagger.client.model.ChannelFirstLevelCategory;
import java.util.ArrayList;
import java.util.List;

/**
 * Get channel first level category list
 */
@ApiModel(description = "Get channel first level category list")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:54:35.212Z")
public class ChannelRootCategory {
  @SerializedName("firstLevelCategories")
  private List<ChannelFirstLevelCategory> firstLevelCategories = new ArrayList<ChannelFirstLevelCategory>();

  public ChannelRootCategory firstLevelCategories(List<ChannelFirstLevelCategory> firstLevelCategories) {
    this.firstLevelCategories = firstLevelCategories;
    return this;
  }

  public ChannelRootCategory addFirstLevelCategoriesItem(ChannelFirstLevelCategory firstLevelCategoriesItem) {
    this.firstLevelCategories.add(firstLevelCategoriesItem);
    return this;
  }

   /**
   * Get firstLevelCategories
   * @return firstLevelCategories
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<ChannelFirstLevelCategory> getFirstLevelCategories() {
    return firstLevelCategories;
  }

  public void setFirstLevelCategories(List<ChannelFirstLevelCategory> firstLevelCategories) {
    this.firstLevelCategories = firstLevelCategories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelRootCategory channelRootCategory = (ChannelRootCategory) o;
    return Objects.equals(this.firstLevelCategories, channelRootCategory.firstLevelCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstLevelCategories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelRootCategory {\n");
    
    sb.append("    firstLevelCategories: ").append(toIndentedString(firstLevelCategories)).append("\n");
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

