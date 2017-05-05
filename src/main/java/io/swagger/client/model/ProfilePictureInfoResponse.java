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
import io.swagger.client.model.ProfilePictureInfoResponseLinks;
import io.swagger.client.model.ProfilePictureInfoWithDefault;

/**
 * ProfilePictureInfoResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:51:26.209Z")
public class ProfilePictureInfoResponse {
  @SerializedName("profilePictureInfo")
  private ProfilePictureInfoWithDefault profilePictureInfo = null;

  @SerializedName("links")
  private ProfilePictureInfoResponseLinks links = null;

  public ProfilePictureInfoResponse profilePictureInfo(ProfilePictureInfoWithDefault profilePictureInfo) {
    this.profilePictureInfo = profilePictureInfo;
    return this;
  }

   /**
   * Get profilePictureInfo
   * @return profilePictureInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ProfilePictureInfoWithDefault getProfilePictureInfo() {
    return profilePictureInfo;
  }

  public void setProfilePictureInfo(ProfilePictureInfoWithDefault profilePictureInfo) {
    this.profilePictureInfo = profilePictureInfo;
  }

  public ProfilePictureInfoResponse links(ProfilePictureInfoResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ProfilePictureInfoResponseLinks getLinks() {
    return links;
  }

  public void setLinks(ProfilePictureInfoResponseLinks links) {
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
    ProfilePictureInfoResponse profilePictureInfoResponse = (ProfilePictureInfoResponse) o;
    return Objects.equals(this.profilePictureInfo, profilePictureInfoResponse.profilePictureInfo) &&
        Objects.equals(this.links, profilePictureInfoResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profilePictureInfo, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfilePictureInfoResponse {\n");
    
    sb.append("    profilePictureInfo: ").append(toIndentedString(profilePictureInfo)).append("\n");
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

