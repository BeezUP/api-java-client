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
import io.swagger.client.model.ReportByDayAllChannels;
import io.swagger.client.model.ReportByDayByChannel;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/**
 * ReportByDay
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:45:35.731Z")
public class ReportByDay {
  @SerializedName("day")
  private LocalDate day = null;

  @SerializedName("allChannels")
  private ReportByDayAllChannels allChannels = null;

  @SerializedName("byChannels")
  private List<ReportByDayByChannel> byChannels = new ArrayList<ReportByDayByChannel>();

  public ReportByDay day(LocalDate day) {
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @ApiModelProperty(example = "2017-02-22", required = true, value = "")
  public LocalDate getDay() {
    return day;
  }

  public void setDay(LocalDate day) {
    this.day = day;
  }

  public ReportByDay allChannels(ReportByDayAllChannels allChannels) {
    this.allChannels = allChannels;
    return this;
  }

   /**
   * Get allChannels
   * @return allChannels
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ReportByDayAllChannels getAllChannels() {
    return allChannels;
  }

  public void setAllChannels(ReportByDayAllChannels allChannels) {
    this.allChannels = allChannels;
  }

  public ReportByDay byChannels(List<ReportByDayByChannel> byChannels) {
    this.byChannels = byChannels;
    return this;
  }

  public ReportByDay addByChannelsItem(ReportByDayByChannel byChannelsItem) {
    this.byChannels.add(byChannelsItem);
    return this;
  }

   /**
   * Get byChannels
   * @return byChannels
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<ReportByDayByChannel> getByChannels() {
    return byChannels;
  }

  public void setByChannels(List<ReportByDayByChannel> byChannels) {
    this.byChannels = byChannels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportByDay reportByDay = (ReportByDay) o;
    return Objects.equals(this.day, reportByDay.day) &&
        Objects.equals(this.allChannels, reportByDay.allChannels) &&
        Objects.equals(this.byChannels, reportByDay.byChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, allChannels, byChannels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportByDay {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    allChannels: ").append(toIndentedString(allChannels)).append("\n");
    sb.append("    byChannels: ").append(toIndentedString(byChannels)).append("\n");
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

