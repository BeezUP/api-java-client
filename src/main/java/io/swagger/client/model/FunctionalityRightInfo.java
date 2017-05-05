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
 * Describe the rights for a functionality
 */
@ApiModel(description = "Describe the rights for a functionality")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:38:53.309Z")
public class FunctionalityRightInfo {
  @SerializedName("functionalityCode")
  private String functionalityCode = null;

  @SerializedName("maxValueInterger")
  private Integer maxValueInterger = null;

  @SerializedName("unlimited")
  private Boolean unlimited = null;

  public FunctionalityRightInfo functionalityCode(String functionalityCode) {
    this.functionalityCode = functionalityCode;
    return this;
  }

   /**
   * The functionality code
   * @return functionalityCode
  **/
  @ApiModelProperty(example = "COMPAMANA", required = true, value = "The functionality code")
  public String getFunctionalityCode() {
    return functionalityCode;
  }

  public void setFunctionalityCode(String functionalityCode) {
    this.functionalityCode = functionalityCode;
  }

  public FunctionalityRightInfo maxValueInterger(Integer maxValueInterger) {
    this.maxValueInterger = maxValueInterger;
    return this;
  }

   /**
   * The max value for this functionality code considering your rights
   * @return maxValueInterger
  **/
  @ApiModelProperty(example = "10", value = "The max value for this functionality code considering your rights")
  public Integer getMaxValueInterger() {
    return maxValueInterger;
  }

  public void setMaxValueInterger(Integer maxValueInterger) {
    this.maxValueInterger = maxValueInterger;
  }

  public FunctionalityRightInfo unlimited(Boolean unlimited) {
    this.unlimited = unlimited;
    return this;
  }

   /**
   * If you can use this functionality unlimitedly
   * @return unlimited
  **/
  @ApiModelProperty(example = "true", value = "If you can use this functionality unlimitedly")
  public Boolean getUnlimited() {
    return unlimited;
  }

  public void setUnlimited(Boolean unlimited) {
    this.unlimited = unlimited;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunctionalityRightInfo functionalityRightInfo = (FunctionalityRightInfo) o;
    return Objects.equals(this.functionalityCode, functionalityRightInfo.functionalityCode) &&
        Objects.equals(this.maxValueInterger, functionalityRightInfo.maxValueInterger) &&
        Objects.equals(this.unlimited, functionalityRightInfo.unlimited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionalityCode, maxValueInterger, unlimited);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionalityRightInfo {\n");
    
    sb.append("    functionalityCode: ").append(toIndentedString(functionalityCode)).append("\n");
    sb.append("    maxValueInterger: ").append(toIndentedString(maxValueInterger)).append("\n");
    sb.append("    unlimited: ").append(toIndentedString(unlimited)).append("\n");
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

