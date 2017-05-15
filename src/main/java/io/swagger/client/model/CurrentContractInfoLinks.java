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
import io.swagger.client.model.LinksGetContractsLink;
import io.swagger.client.model.LinksReactivateCurrentContractLink;
import io.swagger.client.model.LinksTerminateCurrentContractLink;

/**
 * CurrentContractInfoLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:58:06.674Z")
public class CurrentContractInfoLinks {
  @SerializedName("self")
  private LinksGetContractsLink self = null;

  @SerializedName("disable")
  private LinksTerminateCurrentContractLink disable = null;

  @SerializedName("reenable")
  private LinksReactivateCurrentContractLink reenable = null;

  public CurrentContractInfoLinks self(LinksGetContractsLink self) {
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

  public CurrentContractInfoLinks disable(LinksTerminateCurrentContractLink disable) {
    this.disable = disable;
    return this;
  }

   /**
   * Get disable
   * @return disable
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksTerminateCurrentContractLink getDisable() {
    return disable;
  }

  public void setDisable(LinksTerminateCurrentContractLink disable) {
    this.disable = disable;
  }

  public CurrentContractInfoLinks reenable(LinksReactivateCurrentContractLink reenable) {
    this.reenable = reenable;
    return this;
  }

   /**
   * Get reenable
   * @return reenable
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksReactivateCurrentContractLink getReenable() {
    return reenable;
  }

  public void setReenable(LinksReactivateCurrentContractLink reenable) {
    this.reenable = reenable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentContractInfoLinks currentContractInfoLinks = (CurrentContractInfoLinks) o;
    return Objects.equals(this.self, currentContractInfoLinks.self) &&
        Objects.equals(this.disable, currentContractInfoLinks.disable) &&
        Objects.equals(this.reenable, currentContractInfoLinks.reenable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, disable, reenable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentContractInfoLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
    sb.append("    reenable: ").append(toIndentedString(reenable)).append("\n");
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

