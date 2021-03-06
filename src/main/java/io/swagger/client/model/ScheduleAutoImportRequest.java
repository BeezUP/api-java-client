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
import java.util.ArrayList;
import java.util.List;

/**
 * The message request to schedule the auto import
 */
@ApiModel(description = "The message request to schedule the auto import")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class ScheduleAutoImportRequest {
  @SerializedName("schedules")
  private List<String> schedules = new ArrayList<String>();

  @SerializedName("localTimeZoneName")
  private String localTimeZoneName = "Romance Standard Time";

  public ScheduleAutoImportRequest schedules(List<String> schedules) {
    this.schedules = schedules;
    return this;
  }

  public ScheduleAutoImportRequest addSchedulesItem(String schedulesItem) {
    this.schedules.add(schedulesItem);
    return this;
  }

   /**
   * Indicate the time span you want to import your catalog. (i.e. \"21:00:00\" to import your catalog at 9PM)
   * @return schedules
  **/
  @ApiModelProperty(example = "[&quot;21:00:00&quot;,&quot;23:00:00&quot;,&quot;08:30:00&quot;]", required = true, value = "Indicate the time span you want to import your catalog. (i.e. \"21:00:00\" to import your catalog at 9PM)")
  public List<String> getSchedules() {
    return schedules;
  }

  public void setSchedules(List<String> schedules) {
    this.schedules = schedules;
  }

  public ScheduleAutoImportRequest localTimeZoneName(String localTimeZoneName) {
    this.localTimeZoneName = localTimeZoneName;
    return this;
  }

   /**
   * If null the local time zone name will be \"Romance Standard Time\"
   * @return localTimeZoneName
  **/
  @ApiModelProperty(example = "Romance Standard Time", value = "If null the local time zone name will be \"Romance Standard Time\"")
  public String getLocalTimeZoneName() {
    return localTimeZoneName;
  }

  public void setLocalTimeZoneName(String localTimeZoneName) {
    this.localTimeZoneName = localTimeZoneName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleAutoImportRequest scheduleAutoImportRequest = (ScheduleAutoImportRequest) o;
    return Objects.equals(this.schedules, scheduleAutoImportRequest.schedules) &&
        Objects.equals(this.localTimeZoneName, scheduleAutoImportRequest.localTimeZoneName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedules, localTimeZoneName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleAutoImportRequest {\n");
    
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
    sb.append("    localTimeZoneName: ").append(toIndentedString(localTimeZoneName)).append("\n");
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

