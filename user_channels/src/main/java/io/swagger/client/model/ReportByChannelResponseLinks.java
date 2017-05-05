/*
 * Analytics
 * This API will help you to manage the tracking of your clicks and your sales, get reporting on this trackings and put in place rules based on this reporting to automatically optimize your channel catalogs. \\ Also, you will be able to consult the rule execution reporting. 
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
import io.swagger.client.model.LinksOptimiseLink;
import io.swagger.client.model.ReportByCommonResponseLinks;

/**
 * ReportByChannelResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:12:33.618Z")
public class ReportByChannelResponseLinks {
  @SerializedName("enableAllProducts")
  private LinksOptimiseLink enableAllProducts = null;

  @SerializedName("disableAllProducts")
  private LinksOptimiseLink disableAllProducts = null;

  public ReportByChannelResponseLinks enableAllProducts(LinksOptimiseLink enableAllProducts) {
    this.enableAllProducts = enableAllProducts;
    return this;
  }

   /**
   * Get enableAllProducts
   * @return enableAllProducts
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksOptimiseLink getEnableAllProducts() {
    return enableAllProducts;
  }

  public void setEnableAllProducts(LinksOptimiseLink enableAllProducts) {
    this.enableAllProducts = enableAllProducts;
  }

  public ReportByChannelResponseLinks disableAllProducts(LinksOptimiseLink disableAllProducts) {
    this.disableAllProducts = disableAllProducts;
    return this;
  }

   /**
   * Get disableAllProducts
   * @return disableAllProducts
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksOptimiseLink getDisableAllProducts() {
    return disableAllProducts;
  }

  public void setDisableAllProducts(LinksOptimiseLink disableAllProducts) {
    this.disableAllProducts = disableAllProducts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportByChannelResponseLinks reportByChannelResponseLinks = (ReportByChannelResponseLinks) o;
    return Objects.equals(this.enableAllProducts, reportByChannelResponseLinks.enableAllProducts) &&
        Objects.equals(this.disableAllProducts, reportByChannelResponseLinks.disableAllProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableAllProducts, disableAllProducts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByChannelResponseLinks {\n");
    
    sb.append("    enableAllProducts: ").append(toIndentedString(enableAllProducts)).append("\n");
    sb.append("    disableAllProducts: ").append(toIndentedString(disableAllProducts)).append("\n");
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
