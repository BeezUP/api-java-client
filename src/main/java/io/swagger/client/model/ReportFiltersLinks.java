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
import io.swagger.client.model.LinksGetReportFiltersLink;
import io.swagger.client.model.LinksSaveReportFilterLink;

/**
 * ReportFiltersLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T09:07:09.864Z")
public class ReportFiltersLinks {
  @SerializedName("self")
  private LinksGetReportFiltersLink self = null;

  @SerializedName("save")
  private LinksSaveReportFilterLink save = null;

  public ReportFiltersLinks self(LinksGetReportFiltersLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetReportFiltersLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetReportFiltersLink self) {
    this.self = self;
  }

  public ReportFiltersLinks save(LinksSaveReportFilterLink save) {
    this.save = save;
    return this;
  }

   /**
   * Get save
   * @return save
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksSaveReportFilterLink getSave() {
    return save;
  }

  public void setSave(LinksSaveReportFilterLink save) {
    this.save = save;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportFiltersLinks reportFiltersLinks = (ReportFiltersLinks) o;
    return Objects.equals(this.self, reportFiltersLinks.self) &&
        Objects.equals(this.save, reportFiltersLinks.save);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, save);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportFiltersLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    save: ").append(toIndentedString(save)).append("\n");
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

