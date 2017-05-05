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
import io.swagger.client.model.LinksDeleteNextContractLink;
import io.swagger.client.model.LinksGetContractsLink;

/**
 * NextContractInfoLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:26:52.821Z")
public class NextContractInfoLinks {
  @SerializedName("self")
  private LinksGetContractsLink self = null;

  @SerializedName("delete")
  private LinksDeleteNextContractLink delete = null;

  public NextContractInfoLinks self(LinksGetContractsLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetContractsLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetContractsLink self) {
    this.self = self;
  }

  public NextContractInfoLinks delete(LinksDeleteNextContractLink delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksDeleteNextContractLink getDelete() {
    return delete;
  }

  public void setDelete(LinksDeleteNextContractLink delete) {
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
    NextContractInfoLinks nextContractInfoLinks = (NextContractInfoLinks) o;
    return Objects.equals(this.self, nextContractInfoLinks.self) &&
        Objects.equals(this.delete, nextContractInfoLinks.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, delete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextContractInfoLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

