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
import io.swagger.client.model.ReportFilterParameters;

/**
 * SaveReportFilterRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:26:52.821Z")
public class SaveReportFilterRequest {
  @SerializedName("reportFilterName")
  private String reportFilterName = null;

  @SerializedName("parameters")
  private ReportFilterParameters parameters = null;

  public SaveReportFilterRequest reportFilterName(String reportFilterName) {
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

  public SaveReportFilterRequest parameters(ReportFilterParameters parameters) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveReportFilterRequest saveReportFilterRequest = (SaveReportFilterRequest) o;
    return Objects.equals(this.reportFilterName, saveReportFilterRequest.reportFilterName) &&
        Objects.equals(this.parameters, saveReportFilterRequest.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportFilterName, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveReportFilterRequest {\n");
    
    sb.append("    reportFilterName: ").append(toIndentedString(reportFilterName)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

