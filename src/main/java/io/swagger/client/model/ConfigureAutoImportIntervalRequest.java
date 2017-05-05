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
 * The message request to configure the auto import interval
 */
@ApiModel(description = "The message request to configure the auto import interval")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:18:37.107Z")
public class ConfigureAutoImportIntervalRequest {
  @SerializedName("interval")
  private String interval = null;

  public ConfigureAutoImportIntervalRequest interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Indicate the interval in time span. (i.e. \"04:00:00\" for every 4 hours)
   * @return interval
  **/
  @ApiModelProperty(example = "04:00:00", required = true, value = "Indicate the interval in time span. (i.e. \"04:00:00\" for every 4 hours)")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureAutoImportIntervalRequest configureAutoImportIntervalRequest = (ConfigureAutoImportIntervalRequest) o;
    return Objects.equals(this.interval, configureAutoImportIntervalRequest.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureAutoImportIntervalRequest {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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

