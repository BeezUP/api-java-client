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
 * ChannelInfoDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T14:10:34.021Z")
public class ChannelInfoDetails {
  @SerializedName("costs")
  private String costs = null;

  @SerializedName("businessModel")
  private String businessModel = null;

  @SerializedName("channelType")
  private String channelType = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("homeUrl")
  private String homeUrl = null;

  @SerializedName("subscriptionLink")
  private String subscriptionLink = null;

  public ChannelInfoDetails costs(String costs) {
    this.costs = costs;
    return this;
  }

   /**
   * The cost's description of the channel
   * @return costs
  **/
  @ApiModelProperty(example = "CPC variation from 0.10â‚¬ to 0.20â‚¬", value = "The cost's description of the channel")
  public String getCosts() {
    return costs;
  }

  public void setCosts(String costs) {
    this.costs = costs;
  }

  public ChannelInfoDetails businessModel(String businessModel) {
    this.businessModel = businessModel;
    return this;
  }

   /**
   * The business model of the channel
   * @return businessModel
  **/
  @ApiModelProperty(example = "CPC", value = "The business model of the channel")
  public String getBusinessModel() {
    return businessModel;
  }

  public void setBusinessModel(String businessModel) {
    this.businessModel = businessModel;
  }

  public ChannelInfoDetails channelType(String channelType) {
    this.channelType = channelType;
    return this;
  }

   /**
   * The channel type
   * @return channelType
  **/
  @ApiModelProperty(example = "Comparator", value = "The channel type")
  public String getChannelType() {
    return channelType;
  }

  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }

  public ChannelInfoDetails category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The channel category
   * @return category
  **/
  @ApiModelProperty(example = "NULL", value = "The channel category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ChannelInfoDetails homeUrl(String homeUrl) {
    this.homeUrl = homeUrl;
    return this;
  }

   /**
   * The home url of the channel
   * @return homeUrl
  **/
  @ApiModelProperty(example = "http://www.achetezfacile.com", value = "The home url of the channel")
  public String getHomeUrl() {
    return homeUrl;
  }

  public void setHomeUrl(String homeUrl) {
    this.homeUrl = homeUrl;
  }

  public ChannelInfoDetails subscriptionLink(String subscriptionLink) {
    this.subscriptionLink = subscriptionLink;
    return this;
  }

   /**
   * The subscription link to the channel
   * @return subscriptionLink
  **/
  @ApiModelProperty(example = "By Email at : stephanie.gregis@m6.fr
", value = "The subscription link to the channel")
  public String getSubscriptionLink() {
    return subscriptionLink;
  }

  public void setSubscriptionLink(String subscriptionLink) {
    this.subscriptionLink = subscriptionLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelInfoDetails channelInfoDetails = (ChannelInfoDetails) o;
    return Objects.equals(this.costs, channelInfoDetails.costs) &&
        Objects.equals(this.businessModel, channelInfoDetails.businessModel) &&
        Objects.equals(this.channelType, channelInfoDetails.channelType) &&
        Objects.equals(this.category, channelInfoDetails.category) &&
        Objects.equals(this.homeUrl, channelInfoDetails.homeUrl) &&
        Objects.equals(this.subscriptionLink, channelInfoDetails.subscriptionLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costs, businessModel, channelType, category, homeUrl, subscriptionLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelInfoDetails {\n");
    
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    businessModel: ").append(toIndentedString(businessModel)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    homeUrl: ").append(toIndentedString(homeUrl)).append("\n");
    sb.append("    subscriptionLink: ").append(toIndentedString(subscriptionLink)).append("\n");
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

