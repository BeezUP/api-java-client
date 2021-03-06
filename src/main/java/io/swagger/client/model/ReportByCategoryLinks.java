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
import io.swagger.client.model.LinksOptimiseByCategoryLink;

/**
 * ReportByCategoryLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class ReportByCategoryLinks {
  @SerializedName("enableProducts")
  private LinksOptimiseByCategoryLink enableProducts = null;

  @SerializedName("disableProducts")
  private LinksOptimiseByCategoryLink disableProducts = null;

  public ReportByCategoryLinks enableProducts(LinksOptimiseByCategoryLink enableProducts) {
    this.enableProducts = enableProducts;
    return this;
  }

   /**
   * Get enableProducts
   * @return enableProducts
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksOptimiseByCategoryLink getEnableProducts() {
    return enableProducts;
  }

  public void setEnableProducts(LinksOptimiseByCategoryLink enableProducts) {
    this.enableProducts = enableProducts;
  }

  public ReportByCategoryLinks disableProducts(LinksOptimiseByCategoryLink disableProducts) {
    this.disableProducts = disableProducts;
    return this;
  }

   /**
   * Get disableProducts
   * @return disableProducts
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksOptimiseByCategoryLink getDisableProducts() {
    return disableProducts;
  }

  public void setDisableProducts(LinksOptimiseByCategoryLink disableProducts) {
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
    ReportByCategoryLinks reportByCategoryLinks = (ReportByCategoryLinks) o;
    return Objects.equals(this.enableProducts, reportByCategoryLinks.enableProducts) &&
        Objects.equals(this.disableProducts, reportByCategoryLinks.disableProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableProducts, disableProducts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByCategoryLinks {\n");
    
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

