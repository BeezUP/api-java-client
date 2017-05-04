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
import io.swagger.client.model.LinksGetChannelCatalogProductInfoLink;
import io.swagger.client.model.LinksOptimiseByProductLink;

/**
 * ReportByProductLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T13:54:25.397Z")
public class ReportByProductLinks {
  @SerializedName("editProduct")
  private LinksGetChannelCatalogProductInfoLink editProduct = null;

  @SerializedName("enableProduct")
  private LinksOptimiseByProductLink enableProduct = null;

  @SerializedName("disableProduct")
  private LinksOptimiseByProductLink disableProduct = null;

  public ReportByProductLinks editProduct(LinksGetChannelCatalogProductInfoLink editProduct) {
    this.editProduct = editProduct;
    return this;
  }

   /**
   * Get editProduct
   * @return editProduct
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetChannelCatalogProductInfoLink getEditProduct() {
    return editProduct;
  }

  public void setEditProduct(LinksGetChannelCatalogProductInfoLink editProduct) {
    this.editProduct = editProduct;
  }

  public ReportByProductLinks enableProduct(LinksOptimiseByProductLink enableProduct) {
    this.enableProduct = enableProduct;
    return this;
  }

   /**
   * Get enableProduct
   * @return enableProduct
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksOptimiseByProductLink getEnableProduct() {
    return enableProduct;
  }

  public void setEnableProduct(LinksOptimiseByProductLink enableProduct) {
    this.enableProduct = enableProduct;
  }

  public ReportByProductLinks disableProduct(LinksOptimiseByProductLink disableProduct) {
    this.disableProduct = disableProduct;
    return this;
  }

   /**
   * Get disableProduct
   * @return disableProduct
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksOptimiseByProductLink getDisableProduct() {
    return disableProduct;
  }

  public void setDisableProduct(LinksOptimiseByProductLink disableProduct) {
    this.disableProduct = disableProduct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportByProductLinks reportByProductLinks = (ReportByProductLinks) o;
    return Objects.equals(this.editProduct, reportByProductLinks.editProduct) &&
        Objects.equals(this.enableProduct, reportByProductLinks.enableProduct) &&
        Objects.equals(this.disableProduct, reportByProductLinks.disableProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editProduct, enableProduct, disableProduct);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByProductLinks {\n");
    
    sb.append("    editProduct: ").append(toIndentedString(editProduct)).append("\n");
    sb.append("    enableProduct: ").append(toIndentedString(enableProduct)).append("\n");
    sb.append("    disableProduct: ").append(toIndentedString(disableProduct)).append("\n");
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

