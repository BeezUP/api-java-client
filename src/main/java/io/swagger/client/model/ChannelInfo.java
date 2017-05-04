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
import io.swagger.client.model.BeezUPCommonChannelId;
import io.swagger.client.model.BeezUPCommonChannelName;
import io.swagger.client.model.BeezUPCommonHttpUrl;
import io.swagger.client.model.ChannelInfoDetails;
import io.swagger.client.model.ChannelInfoKeyNumbers;
import io.swagger.client.model.ChannelInfoSalesContact;
import io.swagger.client.model.ChannelInfoTechnicalContact;

/**
 * ChannelInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T19:25:59.922Z")
public class ChannelInfo {
  @SerializedName("channelId")
  private BeezUPCommonChannelId channelId = null;

  @SerializedName("channelName")
  private BeezUPCommonChannelName channelName = null;

  @SerializedName("channelLogoUrl")
  private BeezUPCommonHttpUrl channelLogoUrl = null;

  @SerializedName("channelDescription")
  private String channelDescription = null;

  @SerializedName("beezUPOffer")
  private String beezUPOffer = null;

  @SerializedName("salesContact")
  private ChannelInfoSalesContact salesContact = null;

  @SerializedName("details")
  private ChannelInfoDetails details = null;

  @SerializedName("keyNumbers")
  private ChannelInfoKeyNumbers keyNumbers = null;

  @SerializedName("technicalContact")
  private ChannelInfoTechnicalContact technicalContact = null;

  public ChannelInfo channelId(BeezUPCommonChannelId channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelId getChannelId() {
    return channelId;
  }

  public void setChannelId(BeezUPCommonChannelId channelId) {
    this.channelId = channelId;
  }

  public ChannelInfo channelName(BeezUPCommonChannelName channelName) {
    this.channelName = channelName;
    return this;
  }

   /**
   * Get channelName
   * @return channelName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelName getChannelName() {
    return channelName;
  }

  public void setChannelName(BeezUPCommonChannelName channelName) {
    this.channelName = channelName;
  }

  public ChannelInfo channelLogoUrl(BeezUPCommonHttpUrl channelLogoUrl) {
    this.channelLogoUrl = channelLogoUrl;
    return this;
  }

   /**
   * Get channelLogoUrl
   * @return channelLogoUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonHttpUrl getChannelLogoUrl() {
    return channelLogoUrl;
  }

  public void setChannelLogoUrl(BeezUPCommonHttpUrl channelLogoUrl) {
    this.channelLogoUrl = channelLogoUrl;
  }

  public ChannelInfo channelDescription(String channelDescription) {
    this.channelDescription = channelDescription;
    return this;
  }

   /**
   * Indicae a description to the channel
   * @return channelDescription
  **/
  @ApiModelProperty(example = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia dolorum, animi voluptatibus maiores, assumenda maxime illum, labore quae quas ducimus laudantium provident veritatis doloremque dignissimos eum. Error magni illum autem.", value = "Indicae a description to the channel")
  public String getChannelDescription() {
    return channelDescription;
  }

  public void setChannelDescription(String channelDescription) {
    this.channelDescription = channelDescription;
  }

  public ChannelInfo beezUPOffer(String beezUPOffer) {
    this.beezUPOffer = beezUPOffer;
    return this;
  }

   /**
   * Indicate the BeezUP offer
   * @return beezUPOffer
  **/
  @ApiModelProperty(example = "First month free", value = "Indicate the BeezUP offer")
  public String getBeezUPOffer() {
    return beezUPOffer;
  }

  public void setBeezUPOffer(String beezUPOffer) {
    this.beezUPOffer = beezUPOffer;
  }

  public ChannelInfo salesContact(ChannelInfoSalesContact salesContact) {
    this.salesContact = salesContact;
    return this;
  }

   /**
   * Get salesContact
   * @return salesContact
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelInfoSalesContact getSalesContact() {
    return salesContact;
  }

  public void setSalesContact(ChannelInfoSalesContact salesContact) {
    this.salesContact = salesContact;
  }

  public ChannelInfo details(ChannelInfoDetails details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelInfoDetails getDetails() {
    return details;
  }

  public void setDetails(ChannelInfoDetails details) {
    this.details = details;
  }

  public ChannelInfo keyNumbers(ChannelInfoKeyNumbers keyNumbers) {
    this.keyNumbers = keyNumbers;
    return this;
  }

   /**
   * Get keyNumbers
   * @return keyNumbers
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelInfoKeyNumbers getKeyNumbers() {
    return keyNumbers;
  }

  public void setKeyNumbers(ChannelInfoKeyNumbers keyNumbers) {
    this.keyNumbers = keyNumbers;
  }

  public ChannelInfo technicalContact(ChannelInfoTechnicalContact technicalContact) {
    this.technicalContact = technicalContact;
    return this;
  }

   /**
   * Get technicalContact
   * @return technicalContact
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelInfoTechnicalContact getTechnicalContact() {
    return technicalContact;
  }

  public void setTechnicalContact(ChannelInfoTechnicalContact technicalContact) {
    this.technicalContact = technicalContact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelInfo channelInfo = (ChannelInfo) o;
    return Objects.equals(this.channelId, channelInfo.channelId) &&
        Objects.equals(this.channelName, channelInfo.channelName) &&
        Objects.equals(this.channelLogoUrl, channelInfo.channelLogoUrl) &&
        Objects.equals(this.channelDescription, channelInfo.channelDescription) &&
        Objects.equals(this.beezUPOffer, channelInfo.beezUPOffer) &&
        Objects.equals(this.salesContact, channelInfo.salesContact) &&
        Objects.equals(this.details, channelInfo.details) &&
        Objects.equals(this.keyNumbers, channelInfo.keyNumbers) &&
        Objects.equals(this.technicalContact, channelInfo.technicalContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelName, channelLogoUrl, channelDescription, beezUPOffer, salesContact, details, keyNumbers, technicalContact);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelInfo {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    channelLogoUrl: ").append(toIndentedString(channelLogoUrl)).append("\n");
    sb.append("    channelDescription: ").append(toIndentedString(channelDescription)).append("\n");
    sb.append("    beezUPOffer: ").append(toIndentedString(beezUPOffer)).append("\n");
    sb.append("    salesContact: ").append(toIndentedString(salesContact)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    keyNumbers: ").append(toIndentedString(keyNumbers)).append("\n");
    sb.append("    technicalContact: ").append(toIndentedString(technicalContact)).append("\n");
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

