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

/**
 * The different actions you can make on this offer
 */
@ApiModel(description = "The different actions you can make on this offer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:59:54.954Z")
public class OfferLinks {
  @SerializedName("createContract")
  private LinksCreateContractLink createContract = null;

  public OfferLinks createContract(LinksCreateContractLink createContract) {
    this.createContract = createContract;
    return this;
  }

   /**
   * Get createContract
   * @return createContract
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksCreateContractLink getCreateContract() {
    return createContract;
  }

  public void setCreateContract(LinksCreateContractLink createContract) {
    this.createContract = createContract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferLinks offerLinks = (OfferLinks) o;
    return Objects.equals(this.createContract, offerLinks.createContract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createContract);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferLinks {\n");
    
    sb.append("    createContract: ").append(toIndentedString(createContract)).append("\n");
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

