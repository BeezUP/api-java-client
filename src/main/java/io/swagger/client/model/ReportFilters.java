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
import io.swagger.client.model.ReportFilterHeader;
import io.swagger.client.model.ReportFiltersLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportFilters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:14:33.629Z")
public class ReportFilters {
  @SerializedName("reportFilters")
  private List<ReportFilterHeader> reportFilters = new ArrayList<ReportFilterHeader>();

  @SerializedName("links")
  private ReportFiltersLinks links = null;

  public ReportFilters reportFilters(List<ReportFilterHeader> reportFilters) {
    this.reportFilters = reportFilters;
    return this;
  }

  public ReportFilters addReportFiltersItem(ReportFilterHeader reportFiltersItem) {
    this.reportFilters.add(reportFiltersItem);
    return this;
  }

   /**
   * Get reportFilters
   * @return reportFilters
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ReportFilterHeader> getReportFilters() {
    return reportFilters;
  }

  public void setReportFilters(List<ReportFilterHeader> reportFilters) {
    this.reportFilters = reportFilters;
  }

  public ReportFilters links(ReportFiltersLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReportFiltersLinks getLinks() {
    return links;
  }

  public void setLinks(ReportFiltersLinks links) {
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
    ReportFilters reportFilters = (ReportFilters) o;
    return Objects.equals(this.reportFilters, reportFilters.reportFilters) &&
        Objects.equals(this.links, reportFilters.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportFilters, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportFilters {\n");
    
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
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

