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
import io.swagger.client.model.GravatarProfilePictureUrl;
import io.swagger.client.model.InitialsProfilePictureUrl;
import io.swagger.client.model.ProfilePictureInfo;
import io.swagger.client.model.ProfilePictureSelected;
import io.swagger.client.model.ProfilePictureUrl;

/**
 * ProfilePictureInfoWithDefault
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:26:19.914Z")
public class ProfilePictureInfoWithDefault {
  @SerializedName("profilePictureUrl")
  private ProfilePictureUrl profilePictureUrl = null;

  @SerializedName("profilePictureSelected")
  private ProfilePictureSelected profilePictureSelected = null;

  @SerializedName("initialsProfilePictureUrl")
  private InitialsProfilePictureUrl initialsProfilePictureUrl = null;

  @SerializedName("gravatarProfilePictureUrl")
  private GravatarProfilePictureUrl gravatarProfilePictureUrl = null;

  public ProfilePictureInfoWithDefault profilePictureUrl(ProfilePictureUrl profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
    return this;
  }

   /**
   * Get profilePictureUrl
   * @return profilePictureUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public ProfilePictureUrl getProfilePictureUrl() {
    return profilePictureUrl;
  }

  public void setProfilePictureUrl(ProfilePictureUrl profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
  }

  public ProfilePictureInfoWithDefault profilePictureSelected(ProfilePictureSelected profilePictureSelected) {
    this.profilePictureSelected = profilePictureSelected;
    return this;
  }

   /**
   * Get profilePictureSelected
   * @return profilePictureSelected
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ProfilePictureSelected getProfilePictureSelected() {
    return profilePictureSelected;
  }

  public void setProfilePictureSelected(ProfilePictureSelected profilePictureSelected) {
    this.profilePictureSelected = profilePictureSelected;
  }

  public ProfilePictureInfoWithDefault initialsProfilePictureUrl(InitialsProfilePictureUrl initialsProfilePictureUrl) {
    this.initialsProfilePictureUrl = initialsProfilePictureUrl;
    return this;
  }

   /**
   * Get initialsProfilePictureUrl
   * @return initialsProfilePictureUrl
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public InitialsProfilePictureUrl getInitialsProfilePictureUrl() {
    return initialsProfilePictureUrl;
  }

  public void setInitialsProfilePictureUrl(InitialsProfilePictureUrl initialsProfilePictureUrl) {
    this.initialsProfilePictureUrl = initialsProfilePictureUrl;
  }

  public ProfilePictureInfoWithDefault gravatarProfilePictureUrl(GravatarProfilePictureUrl gravatarProfilePictureUrl) {
    this.gravatarProfilePictureUrl = gravatarProfilePictureUrl;
    return this;
  }

   /**
   * Get gravatarProfilePictureUrl
   * @return gravatarProfilePictureUrl
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public GravatarProfilePictureUrl getGravatarProfilePictureUrl() {
    return gravatarProfilePictureUrl;
  }

  public void setGravatarProfilePictureUrl(GravatarProfilePictureUrl gravatarProfilePictureUrl) {
    this.gravatarProfilePictureUrl = gravatarProfilePictureUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfilePictureInfoWithDefault profilePictureInfoWithDefault = (ProfilePictureInfoWithDefault) o;
    return Objects.equals(this.profilePictureUrl, profilePictureInfoWithDefault.profilePictureUrl) &&
        Objects.equals(this.profilePictureSelected, profilePictureInfoWithDefault.profilePictureSelected) &&
        Objects.equals(this.initialsProfilePictureUrl, profilePictureInfoWithDefault.initialsProfilePictureUrl) &&
        Objects.equals(this.gravatarProfilePictureUrl, profilePictureInfoWithDefault.gravatarProfilePictureUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profilePictureUrl, profilePictureSelected, initialsProfilePictureUrl, gravatarProfilePictureUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfilePictureInfoWithDefault {\n");
    
    sb.append("    profilePictureUrl: ").append(toIndentedString(profilePictureUrl)).append("\n");
    sb.append("    profilePictureSelected: ").append(toIndentedString(profilePictureSelected)).append("\n");
    sb.append("    initialsProfilePictureUrl: ").append(toIndentedString(initialsProfilePictureUrl)).append("\n");
    sb.append("    gravatarProfilePictureUrl: ").append(toIndentedString(gravatarProfilePictureUrl)).append("\n");
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

