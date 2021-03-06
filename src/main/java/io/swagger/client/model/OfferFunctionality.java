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

/**
 * OfferFunctionality
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class OfferFunctionality {
  @SerializedName("functionalityCode")
  private String functionalityCode = null;

  @SerializedName("maxValueInteger")
  private Integer maxValueInteger = null;

  @SerializedName("unlimited")
  private Boolean unlimited = null;

  @SerializedName("text")
  private String text = null;

  public OfferFunctionality functionalityCode(String functionalityCode) {
    this.functionalityCode = functionalityCode;
    return this;
  }

   /**
   * The functionality code
   * @return functionalityCode
  **/
  @ApiModelProperty(example = "MARKETMANA", required = true, value = "The functionality code")
  public String getFunctionalityCode() {
    return functionalityCode;
  }

  public void setFunctionalityCode(String functionalityCode) {
    this.functionalityCode = functionalityCode;
  }

  public OfferFunctionality maxValueInteger(Integer maxValueInteger) {
    this.maxValueInteger = maxValueInteger;
    return this;
  }

   /**
   * The max value in integer for this feature in this offer
   * @return maxValueInteger
  **/
  @ApiModelProperty(example = "4", value = "The max value in integer for this feature in this offer")
  public Integer getMaxValueInteger() {
    return maxValueInteger;
  }

  public void setMaxValueInteger(Integer maxValueInteger) {
    this.maxValueInteger = maxValueInteger;
  }

  public OfferFunctionality unlimited(Boolean unlimited) {
    this.unlimited = unlimited;
    return this;
  }

   /**
   * Is this feature is unlimited for this offer?
   * @return unlimited
  **/
  @ApiModelProperty(example = "false", required = true, value = "Is this feature is unlimited for this offer?")
  public Boolean getUnlimited() {
    return unlimited;
  }

  public void setUnlimited(Boolean unlimited) {
    this.unlimited = unlimited;
  }

  public OfferFunctionality text(String text) {
    this.text = text;
    return this;
  }

   /**
   * A description text of this feature
   * @return text
  **/
  @ApiModelProperty(example = "Marketplace management", value = "A description text of this feature")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferFunctionality offerFunctionality = (OfferFunctionality) o;
    return Objects.equals(this.functionalityCode, offerFunctionality.functionalityCode) &&
        Objects.equals(this.maxValueInteger, offerFunctionality.maxValueInteger) &&
        Objects.equals(this.unlimited, offerFunctionality.unlimited) &&
        Objects.equals(this.text, offerFunctionality.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionalityCode, maxValueInteger, unlimited, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferFunctionality {\n");
    
    sb.append("    functionalityCode: ").append(toIndentedString(functionalityCode)).append("\n");
    sb.append("    maxValueInteger: ").append(toIndentedString(maxValueInteger)).append("\n");
    sb.append("    unlimited: ").append(toIndentedString(unlimited)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

