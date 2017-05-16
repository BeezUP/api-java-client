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
 * ChannelCatalogExportCacheInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T09:37:28.005Z")
public class ChannelCatalogExportCacheInfo {
  @SerializedName("cacheStatus")
  private String cacheStatus = null;

  @SerializedName("lastUpdateUtcDate")
  private DateTime lastUpdateUtcDate = null;

  @SerializedName("lastContentChangeUtcDate")
  private DateTime lastContentChangeUtcDate = null;

  @SerializedName("expirationUtcDate")
  private DateTime expirationUtcDate = null;

  public ChannelCatalogExportCacheInfo cacheStatus(String cacheStatus) {
    this.cacheStatus = cacheStatus;
    return this;
  }

   /**
   * The cache status
   * @return cacheStatus
  **/
  @ApiModelProperty(example = "ReadyForGeneration", required = true, value = "The cache status")
  public String getCacheStatus() {
    return cacheStatus;
  }

  public void setCacheStatus(String cacheStatus) {
    this.cacheStatus = cacheStatus;
  }

  public ChannelCatalogExportCacheInfo lastUpdateUtcDate(DateTime lastUpdateUtcDate) {
    this.lastUpdateUtcDate = lastUpdateUtcDate;
    return this;
  }

   /**
   * The last update UTC date of the cache
   * @return lastUpdateUtcDate
  **/
  @ApiModelProperty(example = "2014-08-25T07:32:31.584Z", value = "The last update UTC date of the cache")
  public DateTime getLastUpdateUtcDate() {
    return lastUpdateUtcDate;
  }

  public void setLastUpdateUtcDate(DateTime lastUpdateUtcDate) {
    this.lastUpdateUtcDate = lastUpdateUtcDate;
  }

  public ChannelCatalogExportCacheInfo lastContentChangeUtcDate(DateTime lastContentChangeUtcDate) {
    this.lastContentChangeUtcDate = lastContentChangeUtcDate;
    return this;
  }

   /**
   * The last content change UTC date
   * @return lastContentChangeUtcDate
  **/
  @ApiModelProperty(example = "2014-08-25T07:30:31.584Z", value = "The last content change UTC date")
  public DateTime getLastContentChangeUtcDate() {
    return lastContentChangeUtcDate;
  }

  public void setLastContentChangeUtcDate(DateTime lastContentChangeUtcDate) {
    this.lastContentChangeUtcDate = lastContentChangeUtcDate;
  }

  public ChannelCatalogExportCacheInfo expirationUtcDate(DateTime expirationUtcDate) {
    this.expirationUtcDate = expirationUtcDate;
    return this;
  }

   /**
   * The expiration UTC date of the cache
   * @return expirationUtcDate
  **/
  @ApiModelProperty(example = "2014-08-25T08:02:31.584Z", value = "The expiration UTC date of the cache")
  public DateTime getExpirationUtcDate() {
    return expirationUtcDate;
  }

  public void setExpirationUtcDate(DateTime expirationUtcDate) {
    this.expirationUtcDate = expirationUtcDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogExportCacheInfo channelCatalogExportCacheInfo = (ChannelCatalogExportCacheInfo) o;
    return Objects.equals(this.cacheStatus, channelCatalogExportCacheInfo.cacheStatus) &&
        Objects.equals(this.lastUpdateUtcDate, channelCatalogExportCacheInfo.lastUpdateUtcDate) &&
        Objects.equals(this.lastContentChangeUtcDate, channelCatalogExportCacheInfo.lastContentChangeUtcDate) &&
        Objects.equals(this.expirationUtcDate, channelCatalogExportCacheInfo.expirationUtcDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheStatus, lastUpdateUtcDate, lastContentChangeUtcDate, expirationUtcDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogExportCacheInfo {\n");
    
    sb.append("    cacheStatus: ").append(toIndentedString(cacheStatus)).append("\n");
    sb.append("    lastUpdateUtcDate: ").append(toIndentedString(lastUpdateUtcDate)).append("\n");
    sb.append("    lastContentChangeUtcDate: ").append(toIndentedString(lastContentChangeUtcDate)).append("\n");
    sb.append("    expirationUtcDate: ").append(toIndentedString(expirationUtcDate)).append("\n");
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

