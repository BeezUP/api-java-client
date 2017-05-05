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
import io.swagger.client.model.ReportFilterLinks;
import io.swagger.client.model.ReportFilterParameters;

/**
 * ReportFilter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:12:33.618Z")
public class ReportFilter {
  @SerializedName("reportFilterId")
  private String reportFilterId = null;

  @SerializedName("reportFilterName")
  private String reportFilterName = null;

  @SerializedName("parameters")
  private ReportFilterParameters parameters = null;

  @SerializedName("links")
  private ReportFilterLinks links = null;

  public ReportFilter reportFilterId(String reportFilterId) {
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

  public ReportFilter reportFilterName(String reportFilterName) {
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

  public ReportFilter parameters(ReportFilterParameters parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ReportFilterParameters getParameters() {
    return parameters;
  }

  public void setParameters(ReportFilterParameters parameters) {
    this.parameters = parameters;
  }

  public ReportFilter links(ReportFilterLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReportFilterLinks getLinks() {
    return links;
  }

  public void setLinks(ReportFilterLinks links) {
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
    ReportFilter reportFilter = (ReportFilter) o;
    return Objects.equals(this.reportFilterId, reportFilter.reportFilterId) &&
        Objects.equals(this.reportFilterName, reportFilter.reportFilterName) &&
        Objects.equals(this.parameters, reportFilter.parameters) &&
        Objects.equals(this.links, reportFilter.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportFilterId, reportFilterName, parameters, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportFilter {\n");
    
    sb.append("    reportFilterId: ").append(toIndentedString(reportFilterId)).append("\n");
    sb.append("    reportFilterName: ").append(toIndentedString(reportFilterName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

