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
import io.swagger.client.model.LinksCreateContractLink;
import io.swagger.client.model.LinksGetContractsLink;

/**
 * ContractsLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T11:13:58.502Z")
public class ContractsLinks {
  @SerializedName("self")
  private LinksGetContractsLink self = null;

  @SerializedName("create")
  private LinksCreateContractLink create = null;

  public ContractsLinks self(LinksGetContractsLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetContractsLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetContractsLink self) {
    this.self = self;
  }

  public ContractsLinks create(LinksCreateContractLink create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksCreateContractLink getCreate() {
    return create;
  }

  public void setCreate(LinksCreateContractLink create) {
    this.create = create;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractsLinks contractsLinks = (ContractsLinks) o;
    return Objects.equals(this.self, contractsLinks.self) &&
        Objects.equals(this.create, contractsLinks.create);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, create);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractsLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
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

