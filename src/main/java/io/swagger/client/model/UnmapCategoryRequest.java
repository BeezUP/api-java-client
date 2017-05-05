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
import io.swagger.client.model.BeezUPCommonCatalogCategoryPath;

/**
 * The request message to unmap a catalog category path to a channel category path
 */
@ApiModel(description = "The request message to unmap a catalog category path to a channel category path")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T09:07:09.864Z")
public class UnmapCategoryRequest {
  @SerializedName("catalogCategoryPath")
  private BeezUPCommonCatalogCategoryPath catalogCategoryPath = null;

  public UnmapCategoryRequest catalogCategoryPath(BeezUPCommonCatalogCategoryPath catalogCategoryPath) {
    this.catalogCategoryPath = catalogCategoryPath;
    return this;
  }

   /**
   * Get catalogCategoryPath
   * @return catalogCategoryPath
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonCatalogCategoryPath getCatalogCategoryPath() {
    return catalogCategoryPath;
  }

  public void setCatalogCategoryPath(BeezUPCommonCatalogCategoryPath catalogCategoryPath) {
    this.catalogCategoryPath = catalogCategoryPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnmapCategoryRequest unmapCategoryRequest = (UnmapCategoryRequest) o;
    return Objects.equals(this.catalogCategoryPath, unmapCategoryRequest.catalogCategoryPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogCategoryPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnmapCategoryRequest {\n");
    
    sb.append("    catalogCategoryPath: ").append(toIndentedString(catalogCategoryPath)).append("\n");
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

