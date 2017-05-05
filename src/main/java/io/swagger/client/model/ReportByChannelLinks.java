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
import io.swagger.client.model.LinksOptimiseByChannelLink;

/**
 * ReportByChannelLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T09:13:41.476Z")
public class ReportByChannelLinks {
  @SerializedName("enableProducts")
  private LinksOptimiseByChannelLink enableProducts = null;

  @SerializedName("disableProducts")
  private LinksOptimiseByChannelLink disableProducts = null;

  public ReportByChannelLinks enableProducts(LinksOptimiseByChannelLink enableProducts) {
    this.enableProducts = enableProducts;
    return this;
  }

   /**
   * Get enableProducts
   * @return enableProducts
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksOptimiseByChannelLink getEnableProducts() {
    return enableProducts;
  }

  public void setEnableProducts(LinksOptimiseByChannelLink enableProducts) {
    this.enableProducts = enableProducts;
  }

  public ReportByChannelLinks disableProducts(LinksOptimiseByChannelLink disableProducts) {
    this.disableProducts = disableProducts;
    return this;
  }

   /**
   * Get disableProducts
   * @return disableProducts
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksOptimiseByChannelLink getDisableProducts() {
    return disableProducts;
  }

  public void setDisableProducts(LinksOptimiseByChannelLink disableProducts) {
    this.disableProducts = disableProducts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportByChannelLinks reportByChannelLinks = (ReportByChannelLinks) o;
    return Objects.equals(this.enableProducts, reportByChannelLinks.enableProducts) &&
        Objects.equals(this.disableProducts, reportByChannelLinks.disableProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableProducts, disableProducts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByChannelLinks {\n");
    
    sb.append("    enableProducts: ").append(toIndentedString(enableProducts)).append("\n");
    sb.append("    disableProducts: ").append(toIndentedString(disableProducts)).append("\n");
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

