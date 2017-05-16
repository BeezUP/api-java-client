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
import org.joda.time.DateTime;

/**
 * ChannelCatalogExportationReporting
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T09:37:28.005Z")
public class ChannelCatalogExportationReporting {
  @SerializedName("exportationUtcDate")
  private DateTime exportationUtcDate = null;

  @SerializedName("exportationDuration")
  private String exportationDuration = null;

  /**
   * The cache status during the exportation
   */
  public enum CacheStatusEnum {
    @SerializedName("Error")
    ERROR("Error"),
    
    @SerializedName("Available")
    AVAILABLE("Available"),
    
    @SerializedName("GeneratedManually")
    GENERATEDMANUALLY("GeneratedManually");

    private String value;

    CacheStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("cacheStatus")
  private CacheStatusEnum cacheStatus = null;

  @SerializedName("exportedProductCount")
  private Integer exportedProductCount = null;

  @SerializedName("clientIpAddress")
  private String clientIpAddress = null;

  @SerializedName("clientUserAgent")
  private String clientUserAgent = null;

  public ChannelCatalogExportationReporting exportationUtcDate(DateTime exportationUtcDate) {
    this.exportationUtcDate = exportationUtcDate;
    return this;
  }

   /**
   * The exportation UTC date
   * @return exportationUtcDate
  **/
  @ApiModelProperty(example = "2014-08-25T07:32:31.584Z", required = true, value = "The exportation UTC date")
  public DateTime getExportationUtcDate() {
    return exportationUtcDate;
  }

  public void setExportationUtcDate(DateTime exportationUtcDate) {
    this.exportationUtcDate = exportationUtcDate;
  }

  public ChannelCatalogExportationReporting exportationDuration(String exportationDuration) {
    this.exportationDuration = exportationDuration;
    return this;
  }

   /**
   * The exportation duration. \\ '00:01:00' measn 1 minute. 
   * @return exportationDuration
  **/
  @ApiModelProperty(example = "00:01:00", value = "The exportation duration. \\ '00:01:00' measn 1 minute. ")
  public String getExportationDuration() {
    return exportationDuration;
  }

  public void setExportationDuration(String exportationDuration) {
    this.exportationDuration = exportationDuration;
  }

  public ChannelCatalogExportationReporting cacheStatus(CacheStatusEnum cacheStatus) {
    this.cacheStatus = cacheStatus;
    return this;
  }

   /**
   * The cache status during the exportation
   * @return cacheStatus
  **/
  @ApiModelProperty(example = "Available", value = "The cache status during the exportation")
  public CacheStatusEnum getCacheStatus() {
    return cacheStatus;
  }

  public void setCacheStatus(CacheStatusEnum cacheStatus) {
    this.cacheStatus = cacheStatus;
  }

  public ChannelCatalogExportationReporting exportedProductCount(Integer exportedProductCount) {
    this.exportedProductCount = exportedProductCount;
    return this;
  }

   /**
   * The exportated product count during this exportation
   * @return exportedProductCount
  **/
  @ApiModelProperty(example = "10142", value = "The exportated product count during this exportation")
  public Integer getExportedProductCount() {
    return exportedProductCount;
  }

  public void setExportedProductCount(Integer exportedProductCount) {
    this.exportedProductCount = exportedProductCount;
  }

  public ChannelCatalogExportationReporting clientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
    return this;
  }

   /**
   * The IP address of the client who requests this exportation
   * @return clientIpAddress
  **/
  @ApiModelProperty(example = "42.101.42.101", required = true, value = "The IP address of the client who requests this exportation")
  public String getClientIpAddress() {
    return clientIpAddress;
  }

  public void setClientIpAddress(String clientIpAddress) {
    this.clientIpAddress = clientIpAddress;
  }

  public ChannelCatalogExportationReporting clientUserAgent(String clientUserAgent) {
    this.clientUserAgent = clientUserAgent;
    return this;
  }

   /**
   * The http header User-Agent sent by the client who requests this operation
   * @return clientUserAgent
  **/
  @ApiModelProperty(example = "Wget/1.13.4 (linux-gnu)", required = true, value = "The http header User-Agent sent by the client who requests this operation")
  public String getClientUserAgent() {
    return clientUserAgent;
  }

  public void setClientUserAgent(String clientUserAgent) {
    this.clientUserAgent = clientUserAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogExportationReporting channelCatalogExportationReporting = (ChannelCatalogExportationReporting) o;
    return Objects.equals(this.exportationUtcDate, channelCatalogExportationReporting.exportationUtcDate) &&
        Objects.equals(this.exportationDuration, channelCatalogExportationReporting.exportationDuration) &&
        Objects.equals(this.cacheStatus, channelCatalogExportationReporting.cacheStatus) &&
        Objects.equals(this.exportedProductCount, channelCatalogExportationReporting.exportedProductCount) &&
        Objects.equals(this.clientIpAddress, channelCatalogExportationReporting.clientIpAddress) &&
        Objects.equals(this.clientUserAgent, channelCatalogExportationReporting.clientUserAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportationUtcDate, exportationDuration, cacheStatus, exportedProductCount, clientIpAddress, clientUserAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogExportationReporting {\n");
    
    sb.append("    exportationUtcDate: ").append(toIndentedString(exportationUtcDate)).append("\n");
    sb.append("    exportationDuration: ").append(toIndentedString(exportationDuration)).append("\n");
    sb.append("    cacheStatus: ").append(toIndentedString(cacheStatus)).append("\n");
    sb.append("    exportedProductCount: ").append(toIndentedString(exportedProductCount)).append("\n");
    sb.append("    clientIpAddress: ").append(toIndentedString(clientIpAddress)).append("\n");
    sb.append("    clientUserAgent: ").append(toIndentedString(clientUserAgent)).append("\n");
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

