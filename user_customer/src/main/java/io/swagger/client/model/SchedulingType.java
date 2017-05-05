/*
 * Catalogs
 * This API allows you to manage your catalogs
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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;


/**
 * Indicate the scheduling type. Schedule or Interval. We recommand you to use interval for a better reporting.
 */
public enum SchedulingType {
  
  @SerializedName("Schedule")
  SCHEDULE("Schedule"),
  
  @SerializedName("Interval")
  INTERVAL("Interval");

  private String value;

  SchedulingType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

