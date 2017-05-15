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
import io.swagger.client.model.BeezUPCommonUserId;
import io.swagger.client.model.StoreShareLinks;
import io.swagger.client.model.StoreUserRole;

/**
 * StoreShare
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:58:06.674Z")
public class StoreShare {
  @SerializedName("userId")
  private BeezUPCommonUserId userId = null;

  @SerializedName("userRole")
  private StoreUserRole userRole = null;

  @SerializedName("links")
  private StoreShareLinks links = null;

  public StoreShare userId(BeezUPCommonUserId userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonUserId getUserId() {
    return userId;
  }

  public void setUserId(BeezUPCommonUserId userId) {
    this.userId = userId;
  }

  public StoreShare userRole(StoreUserRole userRole) {
    this.userRole = userRole;
    return this;
  }

   /**
   * Get userRole
   * @return userRole
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StoreUserRole getUserRole() {
    return userRole;
  }

  public void setUserRole(StoreUserRole userRole) {
    this.userRole = userRole;
  }

  public StoreShare links(StoreShareLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public StoreShareLinks getLinks() {
    return links;
  }

  public void setLinks(StoreShareLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreShare storeShare = (StoreShare) o;
    return Objects.equals(this.userId, storeShare.userId) &&
        Objects.equals(this.userRole, storeShare.userRole) &&
        Objects.equals(this.links, storeShare.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userRole, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreShare {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userRole: ").append(toIndentedString(userRole)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

