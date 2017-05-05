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
import io.swagger.client.model.LinksDeleteReportFilterLink;
import io.swagger.client.model.LinksGetReportFilterLink;
import io.swagger.client.model.LinksSaveReportFilterLink;

/**
 * Indicates the actions you can do on this report filter
 */
@ApiModel(description = "Indicates the actions you can do on this report filter")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:26:52.821Z")
public class ReportFilterLinks {
  @SerializedName("self")
  private LinksGetReportFilterLink self = null;

  @SerializedName("save")
  private LinksSaveReportFilterLink save = null;

  @SerializedName("delete")
  private LinksDeleteReportFilterLink delete = null;

  public ReportFilterLinks self(LinksGetReportFilterLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetReportFilterLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetReportFilterLink self) {
    this.self = self;
  }

  public ReportFilterLinks save(LinksSaveReportFilterLink save) {
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

  public ReportFilterLinks delete(LinksDeleteReportFilterLink delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksDeleteReportFilterLink getDelete() {
    return delete;
  }

  public void setDelete(LinksDeleteReportFilterLink delete) {
    this.delete = delete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportFilterLinks reportFilterLinks = (ReportFilterLinks) o;
    return Objects.equals(this.self, reportFilterLinks.self) &&
        Objects.equals(this.save, reportFilterLinks.save) &&
        Objects.equals(this.delete, reportFilterLinks.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, save, delete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportFilterLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    save: ").append(toIndentedString(save)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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

