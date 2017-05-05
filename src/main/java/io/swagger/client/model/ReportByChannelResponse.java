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
import io.swagger.client.model.BeezUPCommonCurrencyCode;
import io.swagger.client.model.BeezUPCommonPaginationResult;
import io.swagger.client.model.ReportByChannel;
import io.swagger.client.model.ReportByChannelResponseLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportByChannelResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:22:45.227Z")
public class ReportByChannelResponse {
  @SerializedName("paginationResult")
  private BeezUPCommonPaginationResult paginationResult = null;

  @SerializedName("currencyCode")
  private BeezUPCommonCurrencyCode currencyCode = null;

  @SerializedName("channels")
  private List<ReportByChannel> channels = new ArrayList<ReportByChannel>();

  @SerializedName("links")
  private ReportByChannelResponseLinks links = null;

  public ReportByChannelResponse paginationResult(BeezUPCommonPaginationResult paginationResult) {
    this.paginationResult = paginationResult;
    return this;
  }

   /**
   * Get paginationResult
   * @return paginationResult
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonPaginationResult getPaginationResult() {
    return paginationResult;
  }

  public void setPaginationResult(BeezUPCommonPaginationResult paginationResult) {
    this.paginationResult = paginationResult;
  }

  public ReportByChannelResponse currencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonCurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public ReportByChannelResponse channels(List<ReportByChannel> channels) {
    this.channels = channels;
    return this;
  }

  public ReportByChannelResponse addChannelsItem(ReportByChannel channelsItem) {
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<ReportByChannel> getChannels() {
    return channels;
  }

  public void setChannels(List<ReportByChannel> channels) {
    this.channels = channels;
  }

  public ReportByChannelResponse links(ReportByChannelResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ReportByChannelResponseLinks getLinks() {
    return links;
  }

  public void setLinks(ReportByChannelResponseLinks links) {
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
    ReportByChannelResponse reportByChannelResponse = (ReportByChannelResponse) o;
    return Objects.equals(this.paginationResult, reportByChannelResponse.paginationResult) &&
        Objects.equals(this.currencyCode, reportByChannelResponse.currencyCode) &&
        Objects.equals(this.channels, reportByChannelResponse.channels) &&
        Objects.equals(this.links, reportByChannelResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginationResult, currencyCode, channels, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByChannelResponse {\n");
    
    sb.append("    paginationResult: ").append(toIndentedString(paginationResult)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

