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
import io.swagger.client.model.BeezUPCommonUserId;
import io.swagger.client.model.DuplicateProductValueConfiguration;
import io.swagger.client.model.InputConfiguration;
import io.swagger.client.model.SchedulingType;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * AutoImportConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T14:10:34.021Z")
public class AutoImportConfiguration {
  @SerializedName("input")
  private InputConfiguration input = null;

  @SerializedName("inputConfiguredByUserId")
  private BeezUPCommonUserId inputConfiguredByUserId = null;

  @SerializedName("schedulingType")
  private SchedulingType schedulingType = null;

  @SerializedName("scheduledByUserId")
  private BeezUPCommonUserId scheduledByUserId = null;

  @SerializedName("schedulingValue")
  private List<String> schedulingValue = new ArrayList<String>();

  @SerializedName("paused")
  private Boolean paused = false;

  @SerializedName("pauseStatusChangedByUserId")
  private BeezUPCommonUserId pauseStatusChangedByUserId = null;

  @SerializedName("pauseStatusChangedUtcDate")
  private DateTime pauseStatusChangedUtcDate = null;

  @SerializedName("duplicateProductConfiguration")
  private DuplicateProductValueConfiguration duplicateProductConfiguration = null;

  @SerializedName("schedulingLocalTimeZoneName")
  private String schedulingLocalTimeZoneName = "Romance Standard Time";

  public AutoImportConfiguration input(InputConfiguration input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public InputConfiguration getInput() {
    return input;
  }

  public void setInput(InputConfiguration input) {
    this.input = input;
  }

  public AutoImportConfiguration inputConfiguredByUserId(BeezUPCommonUserId inputConfiguredByUserId) {
    this.inputConfiguredByUserId = inputConfiguredByUserId;
    return this;
  }

   /**
   * Get inputConfiguredByUserId
   * @return inputConfiguredByUserId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonUserId getInputConfiguredByUserId() {
    return inputConfiguredByUserId;
  }

  public void setInputConfiguredByUserId(BeezUPCommonUserId inputConfiguredByUserId) {
    this.inputConfiguredByUserId = inputConfiguredByUserId;
  }

  public AutoImportConfiguration schedulingType(SchedulingType schedulingType) {
    this.schedulingType = schedulingType;
    return this;
  }

   /**
   * Get schedulingType
   * @return schedulingType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public SchedulingType getSchedulingType() {
    return schedulingType;
  }

  public void setSchedulingType(SchedulingType schedulingType) {
    this.schedulingType = schedulingType;
  }

  public AutoImportConfiguration scheduledByUserId(BeezUPCommonUserId scheduledByUserId) {
    this.scheduledByUserId = scheduledByUserId;
    return this;
  }

   /**
   * Get scheduledByUserId
   * @return scheduledByUserId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonUserId getScheduledByUserId() {
    return scheduledByUserId;
  }

  public void setScheduledByUserId(BeezUPCommonUserId scheduledByUserId) {
    this.scheduledByUserId = scheduledByUserId;
  }

  public AutoImportConfiguration schedulingValue(List<String> schedulingValue) {
    this.schedulingValue = schedulingValue;
    return this;
  }

  public AutoImportConfiguration addSchedulingValueItem(String schedulingValueItem) {
    this.schedulingValue.add(schedulingValueItem);
    return this;
  }

   /**
   * Indicate the scheduling value. If the scheduling type is Interval then the value will be a duration otherwise the values will be the time.
   * @return schedulingValue
  **/
  @ApiModelProperty(example = "[&quot;21:00:00&quot;,&quot;23:00:00&quot;,&quot;08:30:00&quot;]", required = true, value = "Indicate the scheduling value. If the scheduling type is Interval then the value will be a duration otherwise the values will be the time.")
  public List<String> getSchedulingValue() {
    return schedulingValue;
  }

  public void setSchedulingValue(List<String> schedulingValue) {
    this.schedulingValue = schedulingValue;
  }

  public AutoImportConfiguration paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Indicate if the auto import is in pause or not.
   * @return paused
  **/
  @ApiModelProperty(example = "false", required = true, value = "Indicate if the auto import is in pause or not.")
  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public AutoImportConfiguration pauseStatusChangedByUserId(BeezUPCommonUserId pauseStatusChangedByUserId) {
    this.pauseStatusChangedByUserId = pauseStatusChangedByUserId;
    return this;
  }

   /**
   * Get pauseStatusChangedByUserId
   * @return pauseStatusChangedByUserId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonUserId getPauseStatusChangedByUserId() {
    return pauseStatusChangedByUserId;
  }

  public void setPauseStatusChangedByUserId(BeezUPCommonUserId pauseStatusChangedByUserId) {
    this.pauseStatusChangedByUserId = pauseStatusChangedByUserId;
  }

  public AutoImportConfiguration pauseStatusChangedUtcDate(DateTime pauseStatusChangedUtcDate) {
    this.pauseStatusChangedUtcDate = pauseStatusChangedUtcDate;
    return this;
  }

   /**
   * Indicate when the pause status has changed in UTC date.
   * @return pauseStatusChangedUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:21:42Z", value = "Indicate when the pause status has changed in UTC date.")
  public DateTime getPauseStatusChangedUtcDate() {
    return pauseStatusChangedUtcDate;
  }

  public void setPauseStatusChangedUtcDate(DateTime pauseStatusChangedUtcDate) {
    this.pauseStatusChangedUtcDate = pauseStatusChangedUtcDate;
  }

  public AutoImportConfiguration duplicateProductConfiguration(DuplicateProductValueConfiguration duplicateProductConfiguration) {
    this.duplicateProductConfiguration = duplicateProductConfiguration;
    return this;
  }

   /**
   * Get duplicateProductConfiguration
   * @return duplicateProductConfiguration
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DuplicateProductValueConfiguration getDuplicateProductConfiguration() {
    return duplicateProductConfiguration;
  }

  public void setDuplicateProductConfiguration(DuplicateProductValueConfiguration duplicateProductConfiguration) {
    this.duplicateProductConfiguration = duplicateProductConfiguration;
  }

  public AutoImportConfiguration schedulingLocalTimeZoneName(String schedulingLocalTimeZoneName) {
    this.schedulingLocalTimeZoneName = schedulingLocalTimeZoneName;
    return this;
  }

   /**
   * Indicate the time zone name of the scheduling. If the scheduling type is \"Schedule\"
   * @return schedulingLocalTimeZoneName
  **/
  @ApiModelProperty(example = "Romance Standard Time", value = "Indicate the time zone name of the scheduling. If the scheduling type is \"Schedule\"")
  public String getSchedulingLocalTimeZoneName() {
    return schedulingLocalTimeZoneName;
  }

  public void setSchedulingLocalTimeZoneName(String schedulingLocalTimeZoneName) {
    this.schedulingLocalTimeZoneName = schedulingLocalTimeZoneName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoImportConfiguration autoImportConfiguration = (AutoImportConfiguration) o;
    return Objects.equals(this.input, autoImportConfiguration.input) &&
        Objects.equals(this.inputConfiguredByUserId, autoImportConfiguration.inputConfiguredByUserId) &&
        Objects.equals(this.schedulingType, autoImportConfiguration.schedulingType) &&
        Objects.equals(this.scheduledByUserId, autoImportConfiguration.scheduledByUserId) &&
        Objects.equals(this.schedulingValue, autoImportConfiguration.schedulingValue) &&
        Objects.equals(this.paused, autoImportConfiguration.paused) &&
        Objects.equals(this.pauseStatusChangedByUserId, autoImportConfiguration.pauseStatusChangedByUserId) &&
        Objects.equals(this.pauseStatusChangedUtcDate, autoImportConfiguration.pauseStatusChangedUtcDate) &&
        Objects.equals(this.duplicateProductConfiguration, autoImportConfiguration.duplicateProductConfiguration) &&
        Objects.equals(this.schedulingLocalTimeZoneName, autoImportConfiguration.schedulingLocalTimeZoneName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, inputConfiguredByUserId, schedulingType, scheduledByUserId, schedulingValue, paused, pauseStatusChangedByUserId, pauseStatusChangedUtcDate, duplicateProductConfiguration, schedulingLocalTimeZoneName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoImportConfiguration {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    inputConfiguredByUserId: ").append(toIndentedString(inputConfiguredByUserId)).append("\n");
    sb.append("    schedulingType: ").append(toIndentedString(schedulingType)).append("\n");
    sb.append("    scheduledByUserId: ").append(toIndentedString(scheduledByUserId)).append("\n");
    sb.append("    schedulingValue: ").append(toIndentedString(schedulingValue)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    pauseStatusChangedByUserId: ").append(toIndentedString(pauseStatusChangedByUserId)).append("\n");
    sb.append("    pauseStatusChangedUtcDate: ").append(toIndentedString(pauseStatusChangedUtcDate)).append("\n");
    sb.append("    duplicateProductConfiguration: ").append(toIndentedString(duplicateProductConfiguration)).append("\n");
    sb.append("    schedulingLocalTimeZoneName: ").append(toIndentedString(schedulingLocalTimeZoneName)).append("\n");
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

