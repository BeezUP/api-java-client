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
import io.swagger.client.model.BeezUPCommonCatalogCategoryPath;
import io.swagger.client.model.BeezUPCommonChannelCategoryPath;
import java.math.BigDecimal;

/**
 * Represent a mapping between a catalog category path and a channel category path.  The cost on this mapping can be applied. 
 */
@ApiModel(description = "Represent a mapping between a catalog category path and a channel category path.  The cost on this mapping can be applied. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class ChannelCatalogCategoryMapping {
  @SerializedName("catalogCategoryPath")
  private BeezUPCommonCatalogCategoryPath catalogCategoryPath = null;

  @SerializedName("channelCategoryPath")
  private BeezUPCommonChannelCategoryPath channelCategoryPath = null;

  @SerializedName("costValue")
  private BigDecimal costValue = null;

  public ChannelCatalogCategoryMapping catalogCategoryPath(BeezUPCommonCatalogCategoryPath catalogCategoryPath) {
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

  public ChannelCatalogCategoryMapping channelCategoryPath(BeezUPCommonChannelCategoryPath channelCategoryPath) {
    this.channelCategoryPath = channelCategoryPath;
    return this;
  }

   /**
   * Get channelCategoryPath
   * @return channelCategoryPath
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelCategoryPath getChannelCategoryPath() {
    return channelCategoryPath;
  }

  public void setChannelCategoryPath(BeezUPCommonChannelCategoryPath channelCategoryPath) {
    this.channelCategoryPath = channelCategoryPath;
  }

  public ChannelCatalogCategoryMapping costValue(BigDecimal costValue) {
    this.costValue = costValue;
    return this;
  }

   /**
   * In case of CPC_ByCategory or CPA_ByCategory cost type, you have to indicate the cost value.
   * @return costValue
  **/
  @ApiModelProperty(example = "10.21", value = "In case of CPC_ByCategory or CPA_ByCategory cost type, you have to indicate the cost value.")
  public BigDecimal getCostValue() {
    return costValue;
  }

  public void setCostValue(BigDecimal costValue) {
    this.costValue = costValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogCategoryMapping channelCatalogCategoryMapping = (ChannelCatalogCategoryMapping) o;
    return Objects.equals(this.catalogCategoryPath, channelCatalogCategoryMapping.catalogCategoryPath) &&
        Objects.equals(this.channelCategoryPath, channelCatalogCategoryMapping.channelCategoryPath) &&
        Objects.equals(this.costValue, channelCatalogCategoryMapping.costValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogCategoryPath, channelCategoryPath, costValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogCategoryMapping {\n");
    
    sb.append("    catalogCategoryPath: ").append(toIndentedString(catalogCategoryPath)).append("\n");
    sb.append("    channelCategoryPath: ").append(toIndentedString(channelCategoryPath)).append("\n");
    sb.append("    costValue: ").append(toIndentedString(costValue)).append("\n");
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

