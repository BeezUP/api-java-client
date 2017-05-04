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
import io.swagger.client.model.BeezUPCommonLink2;
import io.swagger.client.model.BeezUPCommonPaginationResult;
import io.swagger.client.model.ReportByChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportByChannelResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T11:13:58.502Z")
public class ReportByChannelResponse {
  @SerializedName("paginationResult")
  private BeezUPCommonPaginationResult paginationResult = null;

  @SerializedName("currencyCode")
  private BeezUPCommonCurrencyCode currencyCode = null;

  @SerializedName("channels")
  private List<ReportByChannel> channels = new ArrayList<ReportByChannel>();

  @SerializedName("links")
  private List<BeezUPCommonLink2> links = new ArrayList<BeezUPCommonLink2>();

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

  public ReportByChannelResponse links(List<BeezUPCommonLink2> links) {
    this.links = links;
    return this;
  }

  public ReportByChannelResponse addLinksItem(BeezUPCommonLink2 linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "[{&quot;href&quot;:&quot;/v2/user/analytics/{storeId}/optimisations/{actionName}&quot;,&quot;operationId&quot;:&quot;Optimise&quot;,&quot;rel&quot;:&quot;EnableAllProducts&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;8f95eb1a-3691-4750-950d-a13c4a8a9bcc&quot;},{&quot;name&quot;:&quot;storeId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;reenable&quot;},{&quot;name&quot;:&quot;request&quot;,&quot;in&quot;:&quot;body&quot;,&quot;type&quot;:&quot;object&quot;,&quot;value&quot;:&quot;$request.body&quot;}]},{&quot;href&quot;:&quot;/v2/user/analytics/{storeId}/optimisations/{actionName}&quot;,&quot;operationId&quot;:&quot;Optimise&quot;,&quot;rel&quot;:&quot;DisableAllProducts&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;8f95eb1a-3691-4750-950d-a13c4a8a9bcc&quot;},{&quot;name&quot;:&quot;storeId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;type&quot;:&quot;string&quot;,&quot;value&quot;:&quot;disable&quot;},{&quot;name&quot;:&quot;request&quot;,&quot;in&quot;:&quot;body&quot;,&quot;type&quot;:&quot;object&quot;,&quot;value&quot;:&quot;$request.body&quot;}]}]", required = true, value = "")
  public List<BeezUPCommonLink2> getLinks() {
    return links;
  }

  public void setLinks(List<BeezUPCommonLink2> links) {
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

