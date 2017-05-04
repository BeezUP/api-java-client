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
import io.swagger.client.model.CatalogColumn;

/**
 * The request to configure a catalog column
 */
@ApiModel(description = "The request to configure a catalog column")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T12:43:33.063Z")
public class ConfigureCatalogColumnCatalogRequest {
  @SerializedName("catalogColumn")
  private CatalogColumn catalogColumn = null;

  public ConfigureCatalogColumnCatalogRequest catalogColumn(CatalogColumn catalogColumn) {
    this.catalogColumn = catalogColumn;
    return this;
  }

   /**
   * Get catalogColumn
   * @return catalogColumn
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CatalogColumn getCatalogColumn() {
    return catalogColumn;
  }

  public void setCatalogColumn(CatalogColumn catalogColumn) {
    this.catalogColumn = catalogColumn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureCatalogColumnCatalogRequest configureCatalogColumnCatalogRequest = (ConfigureCatalogColumnCatalogRequest) o;
    return Objects.equals(this.catalogColumn, configureCatalogColumnCatalogRequest.catalogColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogColumn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureCatalogColumnCatalogRequest {\n");
    
    sb.append("    catalogColumn: ").append(toIndentedString(catalogColumn)).append("\n");
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

