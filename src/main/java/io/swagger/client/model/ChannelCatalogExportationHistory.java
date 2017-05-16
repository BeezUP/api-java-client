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
import io.swagger.client.model.BeezUPCommonPaginationResult;
import io.swagger.client.model.ChannelCatalogExportationHistoryLinks;
import io.swagger.client.model.ChannelCatalogExportationReporting;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelCatalogExportationHistory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T09:23:29.795Z")
public class ChannelCatalogExportationHistory {
  @SerializedName("paginationResult")
  private BeezUPCommonPaginationResult paginationResult = null;

  @SerializedName("exportations")
  private List<ChannelCatalogExportationReporting> exportations = new ArrayList<ChannelCatalogExportationReporting>();

  @SerializedName("links")
  private ChannelCatalogExportationHistoryLinks links = null;

  public ChannelCatalogExportationHistory paginationResult(BeezUPCommonPaginationResult paginationResult) {
    this.paginationResult = paginationResult;
    return this;
  }

   /**
   * Get paginationResult
   * @return paginationResult
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonPaginationResult getPaginationResult() {
    return paginationResult;
  }

  public void setPaginationResult(BeezUPCommonPaginationResult paginationResult) {
    this.paginationResult = paginationResult;
  }

  public ChannelCatalogExportationHistory exportations(List<ChannelCatalogExportationReporting> exportations) {
    this.exportations = exportations;
    return this;
  }

  public ChannelCatalogExportationHistory addExportationsItem(ChannelCatalogExportationReporting exportationsItem) {
    this.exportations.add(exportationsItem);
    return this;
  }

   /**
   * Get exportations
   * @return exportations
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<ChannelCatalogExportationReporting> getExportations() {
    return exportations;
  }

  public void setExportations(List<ChannelCatalogExportationReporting> exportations) {
    this.exportations = exportations;
  }

  public ChannelCatalogExportationHistory links(ChannelCatalogExportationHistoryLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelCatalogExportationHistoryLinks getLinks() {
    return links;
  }

  public void setLinks(ChannelCatalogExportationHistoryLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogExportationHistory channelCatalogExportationHistory = (ChannelCatalogExportationHistory) o;
    return Objects.equals(this.paginationResult, channelCatalogExportationHistory.paginationResult) &&
        Objects.equals(this.exportations, channelCatalogExportationHistory.exportations) &&
        Objects.equals(this.links, channelCatalogExportationHistory.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginationResult, exportations, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogExportationHistory {\n");
    
    sb.append("    paginationResult: ").append(toIndentedString(paginationResult)).append("\n");
    sb.append("    exportations: ").append(toIndentedString(exportations)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

