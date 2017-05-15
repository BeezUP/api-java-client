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
import io.swagger.client.model.TrackedClick;
import java.util.ArrayList;
import java.util.List;

/**
 * TrackedClicks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:40:14.157Z")
public class TrackedClicks {
  @SerializedName("clicks")
  private List<TrackedClick> clicks = new ArrayList<TrackedClick>();

  public TrackedClicks clicks(List<TrackedClick> clicks) {
    this.clicks = clicks;
    return this;
  }

  public TrackedClicks addClicksItem(TrackedClick clicksItem) {
    this.clicks.add(clicksItem);
    return this;
  }

   /**
   * Get clicks
   * @return clicks
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<TrackedClick> getClicks() {
    return clicks;
  }

  public void setClicks(List<TrackedClick> clicks) {
    this.clicks = clicks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackedClicks trackedClicks = (TrackedClicks) o;
    return Objects.equals(this.clicks, trackedClicks.clicks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clicks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedClicks {\n");
    
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
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

