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
import io.swagger.client.model.LinksGetChannelsIndexLink;
import io.swagger.client.model.LinksGetPublicListOfValuesLink;

/**
 * PublicChannelIndexLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T09:23:29.795Z")
public class PublicChannelIndexLinks {
  @SerializedName("self")
  private LinksGetChannelsIndexLink self = null;

  @SerializedName("channelCountryLov")
  private LinksGetPublicListOfValuesLink channelCountryLov = null;

  @SerializedName("channelTypeLov")
  private LinksGetPublicListOfValuesLink channelTypeLov = null;

  public PublicChannelIndexLinks self(LinksGetChannelsIndexLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetChannelsIndexLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetChannelsIndexLink self) {
    this.self = self;
  }

  public PublicChannelIndexLinks channelCountryLov(LinksGetPublicListOfValuesLink channelCountryLov) {
    this.channelCountryLov = channelCountryLov;
    return this;
  }

   /**
   * Get channelCountryLov
   * @return channelCountryLov
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetPublicListOfValuesLink getChannelCountryLov() {
    return channelCountryLov;
  }

  public void setChannelCountryLov(LinksGetPublicListOfValuesLink channelCountryLov) {
    this.channelCountryLov = channelCountryLov;
  }

  public PublicChannelIndexLinks channelTypeLov(LinksGetPublicListOfValuesLink channelTypeLov) {
    this.channelTypeLov = channelTypeLov;
    return this;
  }

   /**
   * Get channelTypeLov
   * @return channelTypeLov
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetPublicListOfValuesLink getChannelTypeLov() {
    return channelTypeLov;
  }

  public void setChannelTypeLov(LinksGetPublicListOfValuesLink channelTypeLov) {
    this.channelTypeLov = channelTypeLov;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicChannelIndexLinks publicChannelIndexLinks = (PublicChannelIndexLinks) o;
    return Objects.equals(this.self, publicChannelIndexLinks.self) &&
        Objects.equals(this.channelCountryLov, publicChannelIndexLinks.channelCountryLov) &&
        Objects.equals(this.channelTypeLov, publicChannelIndexLinks.channelTypeLov);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, channelCountryLov, channelTypeLov);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicChannelIndexLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    channelCountryLov: ").append(toIndentedString(channelCountryLov)).append("\n");
    sb.append("    channelTypeLov: ").append(toIndentedString(channelTypeLov)).append("\n");
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

