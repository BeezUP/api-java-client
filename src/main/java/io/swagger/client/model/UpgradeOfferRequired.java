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

/**
 * The message contains the offer identifier required to execute this operation
 */
@ApiModel(description = "The message contains the offer identifier required to execute this operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:14:01.974Z")
public class UpgradeOfferRequired {
  @SerializedName("offerId")
  private Integer offerId = null;

  public UpgradeOfferRequired offerId(Integer offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * The offer identifier required
   * @return offerId
  **/
  @ApiModelProperty(example = "9", required = true, value = "The offer identifier required")
  public Integer getOfferId() {
    return offerId;
  }

  public void setOfferId(Integer offerId) {
    this.offerId = offerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeOfferRequired upgradeOfferRequired = (UpgradeOfferRequired) o;
    return Objects.equals(this.offerId, upgradeOfferRequired.offerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeOfferRequired {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
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

