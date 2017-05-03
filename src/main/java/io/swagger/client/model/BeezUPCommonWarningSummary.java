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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BeezUPCommonWarningSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T10:56:32.379Z")
public class BeezUPCommonWarningSummary {
  @SerializedName("technicalErrorMessage")
  private String technicalErrorMessage = null;

  @SerializedName("warningMessage")
  private String warningMessage = null;

  @SerializedName("warningCode")
  private String warningCode = null;

  @SerializedName("warningArguments")
  private Map<String, String> warningArguments = new HashMap<String, String>();

  public BeezUPCommonWarningSummary technicalErrorMessage(String technicalErrorMessage) {
    this.technicalErrorMessage = technicalErrorMessage;
    return this;
  }

   /**
   * Get technicalErrorMessage
   * @return technicalErrorMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTechnicalErrorMessage() {
    return technicalErrorMessage;
  }

  public void setTechnicalErrorMessage(String technicalErrorMessage) {
    this.technicalErrorMessage = technicalErrorMessage;
  }

  public BeezUPCommonWarningSummary warningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
    return this;
  }

   /**
   * Get warningMessage
   * @return warningMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWarningMessage() {
    return warningMessage;
  }

  public void setWarningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
  }

  public BeezUPCommonWarningSummary warningCode(String warningCode) {
    this.warningCode = warningCode;
    return this;
  }

   /**
   * Get warningCode
   * @return warningCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWarningCode() {
    return warningCode;
  }

  public void setWarningCode(String warningCode) {
    this.warningCode = warningCode;
  }

  public BeezUPCommonWarningSummary warningArguments(Map<String, String> warningArguments) {
    this.warningArguments = warningArguments;
    return this;
  }

  public BeezUPCommonWarningSummary putWarningArgumentsItem(String key, String warningArgumentsItem) {
    this.warningArguments.put(key, warningArgumentsItem);
    return this;
  }

   /**
   * Get warningArguments
   * @return warningArguments
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getWarningArguments() {
    return warningArguments;
  }

  public void setWarningArguments(Map<String, String> warningArguments) {
    this.warningArguments = warningArguments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonWarningSummary beezUPCommonWarningSummary = (BeezUPCommonWarningSummary) o;
    return Objects.equals(this.technicalErrorMessage, beezUPCommonWarningSummary.technicalErrorMessage) &&
        Objects.equals(this.warningMessage, beezUPCommonWarningSummary.warningMessage) &&
        Objects.equals(this.warningCode, beezUPCommonWarningSummary.warningCode) &&
        Objects.equals(this.warningArguments, beezUPCommonWarningSummary.warningArguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technicalErrorMessage, warningMessage, warningCode, warningArguments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonWarningSummary {\n");
    
    sb.append("    technicalErrorMessage: ").append(toIndentedString(technicalErrorMessage)).append("\n");
    sb.append("    warningMessage: ").append(toIndentedString(warningMessage)).append("\n");
    sb.append("    warningCode: ").append(toIndentedString(warningCode)).append("\n");
    sb.append("    warningArguments: ").append(toIndentedString(warningArguments)).append("\n");
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

