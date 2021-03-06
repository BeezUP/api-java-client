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
import io.swagger.client.model.LinksGetProfilePictureInfoLink;
import io.swagger.client.model.LinksSaveProfilePictureInfoLink;

/**
 * ProfilePictureInfoResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class ProfilePictureInfoResponseLinks {
  @SerializedName("self")
  private LinksGetProfilePictureInfoLink self = null;

  @SerializedName("save")
  private LinksSaveProfilePictureInfoLink save = null;

  public ProfilePictureInfoResponseLinks self(LinksGetProfilePictureInfoLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetProfilePictureInfoLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetProfilePictureInfoLink self) {
    this.self = self;
  }

  public ProfilePictureInfoResponseLinks save(LinksSaveProfilePictureInfoLink save) {
    this.save = save;
    return this;
  }

   /**
   * Get save
   * @return save
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksSaveProfilePictureInfoLink getSave() {
    return save;
  }

  public void setSave(LinksSaveProfilePictureInfoLink save) {
    this.save = save;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfilePictureInfoResponseLinks profilePictureInfoResponseLinks = (ProfilePictureInfoResponseLinks) o;
    return Objects.equals(this.self, profilePictureInfoResponseLinks.self) &&
        Objects.equals(this.save, profilePictureInfoResponseLinks.save);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, save);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfilePictureInfoResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    save: ").append(toIndentedString(save)).append("\n");
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

