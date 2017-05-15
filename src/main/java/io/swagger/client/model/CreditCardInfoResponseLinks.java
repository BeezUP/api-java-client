/*
 * Public - Security
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
import io.swagger.client.model.LinksGetCreditCardInfoLink;
import io.swagger.client.model.LinksSaveCreditCardInfoLink;

/**
 * The different actions you can make on this offer
 */
@ApiModel(description = "The different actions you can make on this offer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:14:52.070Z")
public class CreditCardInfoResponseLinks {
  @SerializedName("self")
  private LinksGetCreditCardInfoLink self = null;

  @SerializedName("saveCreditCardInfo")
  private LinksSaveCreditCardInfoLink saveCreditCardInfo = null;

  public CreditCardInfoResponseLinks self(LinksGetCreditCardInfoLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetCreditCardInfoLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetCreditCardInfoLink self) {
    this.self = self;
  }

  public CreditCardInfoResponseLinks saveCreditCardInfo(LinksSaveCreditCardInfoLink saveCreditCardInfo) {
    this.saveCreditCardInfo = saveCreditCardInfo;
    return this;
  }

   /**
   * Get saveCreditCardInfo
   * @return saveCreditCardInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksSaveCreditCardInfoLink getSaveCreditCardInfo() {
    return saveCreditCardInfo;
  }

  public void setSaveCreditCardInfo(LinksSaveCreditCardInfoLink saveCreditCardInfo) {
    this.saveCreditCardInfo = saveCreditCardInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardInfoResponseLinks creditCardInfoResponseLinks = (CreditCardInfoResponseLinks) o;
    return Objects.equals(this.self, creditCardInfoResponseLinks.self) &&
        Objects.equals(this.saveCreditCardInfo, creditCardInfoResponseLinks.saveCreditCardInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, saveCreditCardInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardInfoResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    saveCreditCardInfo: ").append(toIndentedString(saveCreditCardInfo)).append("\n");
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

