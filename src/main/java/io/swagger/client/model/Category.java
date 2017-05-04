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

/**
 * The catalog category
 */
@ApiModel(description = "The catalog category")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T11:55:43.788Z")
public class Category {
  @SerializedName("categoryId")
  private BeezUPCommonCatalogCategoryId categoryId = null;

  @SerializedName("categoryPath")
  private BeezUPCommonCatalogCategoryPath categoryPath = null;

  public Category categoryId(BeezUPCommonCatalogCategoryId categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonCatalogCategoryId getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(BeezUPCommonCatalogCategoryId categoryId) {
    this.categoryId = categoryId;
  }

  public Category categoryPath(BeezUPCommonCatalogCategoryPath categoryPath) {
    this.categoryPath = categoryPath;
    return this;
  }

   /**
   * Get categoryPath
   * @return categoryPath
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonCatalogCategoryPath getCategoryPath() {
    return categoryPath;
  }

  public void setCategoryPath(BeezUPCommonCatalogCategoryPath categoryPath) {
    this.categoryPath = categoryPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.categoryId, category.categoryId) &&
        Objects.equals(this.categoryPath, category.categoryPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
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

