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
import io.swagger.client.model.LinksShareLink;

/**
 * StoreSharesLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:50:41.747Z")
public class StoreSharesLinks {
  @SerializedName("share")
  private LinksShareLink share = null;

  public StoreSharesLinks share(LinksShareLink share) {
    this.share = share;
    return this;
  }

   /**
   * Get share
   * @return share
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksShareLink getShare() {
    return share;
  }

  public void setShare(LinksShareLink share) {
    this.share = share;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreSharesLinks storeSharesLinks = (StoreSharesLinks) o;
    return Objects.equals(this.share, storeSharesLinks.share);
  }

  @Override
  public int hashCode() {
    return Objects.hash(share);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreSharesLinks {\n");
    
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
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

