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
import io.swagger.client.model.ReportFilterHeaderLinks;

/**
 * ReportFilterHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class ReportFilterHeader {
  @SerializedName("reportFilterId")
  private String reportFilterId = null;

  @SerializedName("reportFilterName")
  private String reportFilterName = null;

  @SerializedName("links")
  private ReportFilterHeaderLinks links = null;

  public ReportFilterHeader reportFilterId(String reportFilterId) {
    this.reportFilterId = reportFilterId;
    return this;
  }

   /**
   * Report filter identifier
   * @return reportFilterId
  **/
  @ApiModelProperty(example = "fb19c53c-2f63-4262-9d94-2d7faa500acd", required = true, value = "Report filter identifier")
  public String getReportFilterId() {
    return reportFilterId;
  }

  public void setReportFilterId(String reportFilterId) {
    this.reportFilterId = reportFilterId;
  }

  public ReportFilterHeader reportFilterName(String reportFilterName) {
    this.reportFilterName = reportFilterName;
    return this;
  }

   /**
   * Report filter name
   * @return reportFilterName
  **/
  @ApiModelProperty(example = "My report filter", required = true, value = "Report filter name")
  public String getReportFilterName() {
    return reportFilterName;
  }

  public void setReportFilterName(String reportFilterName) {
    this.reportFilterName = reportFilterName;
  }

  public ReportFilterHeader links(ReportFilterHeaderLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ReportFilterHeaderLinks getLinks() {
    return links;
  }

  public void setLinks(ReportFilterHeaderLinks links) {
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
    ReportFilterHeader reportFilterHeader = (ReportFilterHeader) o;
    return Objects.equals(this.reportFilterId, reportFilterHeader.reportFilterId) &&
        Objects.equals(this.reportFilterName, reportFilterHeader.reportFilterName) &&
        Objects.equals(this.links, reportFilterHeader.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportFilterId, reportFilterName, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportFilterHeader {\n");
    
    sb.append("    reportFilterId: ").append(toIndentedString(reportFilterId)).append("\n");
    sb.append("    reportFilterName: ").append(toIndentedString(reportFilterName)).append("\n");
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

