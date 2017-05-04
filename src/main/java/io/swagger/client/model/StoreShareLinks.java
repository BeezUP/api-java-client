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
import io.swagger.client.model.LinksDeleteShareLink;

/**
 * The different actions you can make on this share
 */
@ApiModel(description = "The different actions you can make on this share")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T17:44:01.940Z")
public class StoreShareLinks {
  @SerializedName("deleteShare")
  private LinksDeleteShareLink deleteShare = null;

  public StoreShareLinks deleteShare(LinksDeleteShareLink deleteShare) {
    this.deleteShare = deleteShare;
    return this;
  }

   /**
   * Get deleteShare
   * @return deleteShare
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksDeleteShareLink getDeleteShare() {
    return deleteShare;
  }

  public void setDeleteShare(LinksDeleteShareLink deleteShare) {
    this.deleteShare = deleteShare;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreShareLinks storeShareLinks = (StoreShareLinks) o;
    return Objects.equals(this.deleteShare, storeShareLinks.deleteShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteShare);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreShareLinks {\n");
    
    sb.append("    deleteShare: ").append(toIndentedString(deleteShare)).append("\n");
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

