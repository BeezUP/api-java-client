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

/**
 * ProductOverrideWithCatalogValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:15:46.573Z")
public class ProductOverrideWithCatalogValue {
  @SerializedName("override")
  private String override = null;

  @SerializedName("catalogValue")
  private String catalogValue = null;

  public ProductOverrideWithCatalogValue override(String override) {
    this.override = override;
    return this;
  }

   /**
   * The overrided product value
   * @return override
  **/
  @ApiModelProperty(example = "Sony bravia", required = true, value = "The overrided product value")
  public String getOverride() {
    return override;
  }

  public void setOverride(String override) {
    this.override = override;
  }

  public ProductOverrideWithCatalogValue catalogValue(String catalogValue) {
    this.catalogValue = catalogValue;
    return this;
  }

   /**
   * The catalog product value
   * @return catalogValue
  **/
  @ApiModelProperty(example = "Sony", value = "The catalog product value")
  public String getCatalogValue() {
    return catalogValue;
  }

  public void setCatalogValue(String catalogValue) {
    this.catalogValue = catalogValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOverrideWithCatalogValue productOverrideWithCatalogValue = (ProductOverrideWithCatalogValue) o;
    return Objects.equals(this.override, productOverrideWithCatalogValue.override) &&
        Objects.equals(this.catalogValue, productOverrideWithCatalogValue.catalogValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(override, catalogValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOverrideWithCatalogValue {\n");
    
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
    sb.append("    catalogValue: ").append(toIndentedString(catalogValue)).append("\n");
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

