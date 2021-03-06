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
import io.swagger.client.model.ContractsLinks;
import io.swagger.client.model.CurrentContractInfo;
import io.swagger.client.model.NextContractInfo;

/**
 * Contracts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class Contracts {
  @SerializedName("links")
  private ContractsLinks links = null;

  @SerializedName("current")
  private CurrentContractInfo current = null;

  @SerializedName("next")
  private NextContractInfo next = null;

  public Contracts links(ContractsLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public ContractsLinks getLinks() {
    return links;
  }

  public void setLinks(ContractsLinks links) {
    this.links = links;
  }

  public Contracts current(CurrentContractInfo current) {
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(example = "null", value = "")
  public CurrentContractInfo getCurrent() {
    return current;
  }

  public void setCurrent(CurrentContractInfo current) {
    this.current = current;
  }

  public Contracts next(NextContractInfo next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(example = "null", value = "")
  public NextContractInfo getNext() {
    return next;
  }

  public void setNext(NextContractInfo next) {
    this.next = next;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contracts contracts = (Contracts) o;
    return Objects.equals(this.links, contracts.links) &&
        Objects.equals(this.current, contracts.current) &&
        Objects.equals(this.next, contracts.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, current, next);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contracts {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

