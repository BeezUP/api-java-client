/*
 * Analytics
 * This API will help you to manage the tracking of your clicks and your sales, get reporting on this trackings and put in place rules based on this reporting to automatically optimize your channel catalogs. \\ Also, you will be able to consult the rule execution reporting. 
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
import io.swagger.client.model.BeezUPCommonChannelBasicInfo;
import io.swagger.client.model.BeezUPCommonProductBasicInfo;
import org.joda.time.DateTime;

/**
 * TrackedClick
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:12:33.618Z")
public class TrackedClick {
  @SerializedName("utcDate")
  private DateTime utcDate = null;

  @SerializedName("product")
  private BeezUPCommonProductBasicInfo product = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("channel")
  private BeezUPCommonChannelBasicInfo channel = null;

  public TrackedClick utcDate(DateTime utcDate) {
    this.utcDate = utcDate;
    return this;
  }

   /**
   * The utc date of the click
   * @return utcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", required = true, value = "The utc date of the click")
  public DateTime getUtcDate() {
    return utcDate;
  }

  public void setUtcDate(DateTime utcDate) {
    this.utcDate = utcDate;
  }

  public TrackedClick product(BeezUPCommonProductBasicInfo product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonProductBasicInfo getProduct() {
    return product;
  }

  public void setProduct(BeezUPCommonProductBasicInfo product) {
    this.product = product;
  }

  public TrackedClick ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The user's IP address related to this click
   * @return ipAddress
  **/
  @ApiModelProperty(example = "127.0.0.1", required = true, value = "The user's IP address related to this click")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public TrackedClick channel(BeezUPCommonChannelBasicInfo channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelBasicInfo getChannel() {
    return channel;
  }

  public void setChannel(BeezUPCommonChannelBasicInfo channel) {
    this.channel = channel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackedClick trackedClick = (TrackedClick) o;
    return Objects.equals(this.utcDate, trackedClick.utcDate) &&
        Objects.equals(this.product, trackedClick.product) &&
        Objects.equals(this.ipAddress, trackedClick.ipAddress) &&
        Objects.equals(this.channel, trackedClick.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utcDate, product, ipAddress, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedClick {\n");
    
    sb.append("    utcDate: ").append(toIndentedString(utcDate)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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
