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
import io.swagger.client.model.BeezUPCommonLink2;
import io.swagger.client.model.ReportFilterHeader;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportFilters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T13:44:04.202Z")
public class ReportFilters {
  @SerializedName("reportFilters")
  private List<ReportFilterHeader> reportFilters = new ArrayList<ReportFilterHeader>();

  @SerializedName("links")
  private List<BeezUPCommonLink2> links = new ArrayList<BeezUPCommonLink2>();

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

  public ReportFilters links(List<BeezUPCommonLink2> links) {
    this.links = links;
    return this;
  }

  public ReportFilters addLinksItem(BeezUPCommonLink2 linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "[{&quot;href&quot;:&quot;/v2/user/analytics/{storeId}/reports/filters&quot;,&quot;rel&quot;:&quot;self&quot;,&quot;operationId&quot;:&quot;GetReportFilters&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;10af9486-e28e-47ab-b045-e13e4acd55c3&quot;},{&quot;name&quot;:&quot;reportFilterId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;in&quot;:&quot;path&quot;}]},{&quot;href&quot;:&quot;/v2/user/analytics/{storeId}/reports/filters/{reportFilterId}&quot;,&quot;rel&quot;:&quot;SaveReportFilter&quot;,&quot;operationId&quot;:&quot;SaveReportFilter&quot;,&quot;method&quot;:&quot;PUT&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;in&quot;:&quot;path&quot;,&quot;value&quot;:&quot;10af9486-e28e-47ab-b045-e13e4acd55c3&quot;},{&quot;name&quot;:&quot;reportFilterId&quot;,&quot;type&quot;:&quot;string&quot;,&quot;in&quot;:&quot;path&quot;}]}]", value = "")
  public List<BeezUPCommonLink2> getLinks() {
    return links;
  }

  public void setLinks(List<BeezUPCommonLink2> links) {
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

