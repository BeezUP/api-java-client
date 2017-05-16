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
import io.swagger.client.model.LinksImportationGetImportationMonitoringLink;

/**
 * The action links
 */
@ApiModel(description = "The action links")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T09:23:29.795Z")
public class InlineResponse409Links {
  @SerializedName("currentImportation")
  private LinksImportationGetImportationMonitoringLink currentImportation = null;

  public InlineResponse409Links currentImportation(LinksImportationGetImportationMonitoringLink currentImportation) {
    this.currentImportation = currentImportation;
    return this;
  }

   /**
   * Get currentImportation
   * @return currentImportation
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksImportationGetImportationMonitoringLink getCurrentImportation() {
    return currentImportation;
  }

  public void setCurrentImportation(LinksImportationGetImportationMonitoringLink currentImportation) {
    this.currentImportation = currentImportation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse409Links inlineResponse409Links = (InlineResponse409Links) o;
    return Objects.equals(this.currentImportation, inlineResponse409Links.currentImportation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentImportation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse409Links {\n");
    
    sb.append("    currentImportation: ").append(toIndentedString(currentImportation)).append("\n");
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

