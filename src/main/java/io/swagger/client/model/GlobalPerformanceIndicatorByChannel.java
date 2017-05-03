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
import io.swagger.client.model.BeezUPCommonChannelBasicInfo;
import java.math.BigDecimal;

/**
 * GlobalPerformanceIndicatorByChannel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T10:56:32.379Z")
public class GlobalPerformanceIndicatorByChannel {
  @SerializedName("channel")
  private BeezUPCommonChannelBasicInfo channel = null;

  @SerializedName("globalPerformanceIndicator")
  private BigDecimal globalPerformanceIndicator = null;

  public GlobalPerformanceIndicatorByChannel channel(BeezUPCommonChannelBasicInfo channel) {
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

  public GlobalPerformanceIndicatorByChannel globalPerformanceIndicator(BigDecimal globalPerformanceIndicator) {
    this.globalPerformanceIndicator = globalPerformanceIndicator;
    return this;
  }

   /**
   * Indicates the global performance indicator for this channel
   * @return globalPerformanceIndicator
  **/
  @ApiModelProperty(example = "10.42", required = true, value = "Indicates the global performance indicator for this channel")
  public BigDecimal getGlobalPerformanceIndicator() {
    return globalPerformanceIndicator;
  }

  public void setGlobalPerformanceIndicator(BigDecimal globalPerformanceIndicator) {
    this.globalPerformanceIndicator = globalPerformanceIndicator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalPerformanceIndicatorByChannel globalPerformanceIndicatorByChannel = (GlobalPerformanceIndicatorByChannel) o;
    return Objects.equals(this.channel, globalPerformanceIndicatorByChannel.channel) &&
        Objects.equals(this.globalPerformanceIndicator, globalPerformanceIndicatorByChannel.globalPerformanceIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, globalPerformanceIndicator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalPerformanceIndicatorByChannel {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    globalPerformanceIndicator: ").append(toIndentedString(globalPerformanceIndicator)).append("\n");
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

