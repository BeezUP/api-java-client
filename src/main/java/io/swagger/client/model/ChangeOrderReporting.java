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
import io.swagger.client.model.BusinessOperationType;
import io.swagger.client.model.ExecutionUUID;
import io.swagger.client.model.SourceType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * The reporting related to a change order operation
 */
@ApiModel(description = "The reporting related to a change order operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T12:03:05.460Z")
public class ChangeOrderReporting {
  @SerializedName("executionUUID")
  private ExecutionUUID executionUUID = null;

  @SerializedName("changeOrderType")
  private BusinessOperationType changeOrderType = null;

  @SerializedName("sourceType")
  private SourceType sourceType = null;

  @SerializedName("sourceUserId")
  private BeezUPCommonUserId sourceUserId = null;

  @SerializedName("sourceUserName")
  private String sourceUserName = null;

  @SerializedName("creationUtcDate")
  private DateTime creationUtcDate = null;

  @SerializedName("processingStatus")
  private String processingStatus = null;

  @SerializedName("lastUpdateUtcDate")
  private DateTime lastUpdateUtcDate = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("testMode")
  private Boolean testMode = null;

  @SerializedName("details")
  private Map<String, Object> details = new HashMap<String, Object>();

  public ChangeOrderReporting executionUUID(ExecutionUUID executionUUID) {
    this.executionUUID = executionUUID;
    return this;
  }

   /**
   * Get executionUUID
   * @return executionUUID
  **/
  @ApiModelProperty(example = "null", value = "")
  public ExecutionUUID getExecutionUUID() {
    return executionUUID;
  }

  public void setExecutionUUID(ExecutionUUID executionUUID) {
    this.executionUUID = executionUUID;
  }

  public ChangeOrderReporting changeOrderType(BusinessOperationType changeOrderType) {
    this.changeOrderType = changeOrderType;
    return this;
  }

   /**
   * Get changeOrderType
   * @return changeOrderType
  **/
  @ApiModelProperty(example = "null", value = "")
  public BusinessOperationType getChangeOrderType() {
    return changeOrderType;
  }

  public void setChangeOrderType(BusinessOperationType changeOrderType) {
    this.changeOrderType = changeOrderType;
  }

  public ChangeOrderReporting sourceType(SourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @ApiModelProperty(example = "null", value = "")
  public SourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceType sourceType) {
    this.sourceType = sourceType;
  }

  public ChangeOrderReporting sourceUserId(BeezUPCommonUserId sourceUserId) {
    this.sourceUserId = sourceUserId;
    return this;
  }

   /**
   * Get sourceUserId
   * @return sourceUserId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonUserId getSourceUserId() {
    return sourceUserId;
  }

  public void setSourceUserId(BeezUPCommonUserId sourceUserId) {
    this.sourceUserId = sourceUserId;
  }

  public ChangeOrderReporting sourceUserName(String sourceUserName) {
    this.sourceUserName = sourceUserName;
    return this;
  }

   /**
   * Get sourceUserName
   * @return sourceUserName
  **/
  @ApiModelProperty(example = "Guillaume Tell", value = "")
  public String getSourceUserName() {
    return sourceUserName;
  }

  public void setSourceUserName(String sourceUserName) {
    this.sourceUserName = sourceUserName;
  }

  public ChangeOrderReporting creationUtcDate(DateTime creationUtcDate) {
    this.creationUtcDate = creationUtcDate;
    return this;
  }

   /**
   * The creation UTC date of the execution
   * @return creationUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:10:03Z", value = "The creation UTC date of the execution")
  public DateTime getCreationUtcDate() {
    return creationUtcDate;
  }

  public void setCreationUtcDate(DateTime creationUtcDate) {
    this.creationUtcDate = creationUtcDate;
  }

  public ChangeOrderReporting processingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

   /**
   * The processing status of the execution
   * @return processingStatus
  **/
  @ApiModelProperty(example = "Done", value = "The processing status of the execution")
  public String getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
  }

  public ChangeOrderReporting lastUpdateUtcDate(DateTime lastUpdateUtcDate) {
    this.lastUpdateUtcDate = lastUpdateUtcDate;
    return this;
  }

   /**
   * The last update UTC date of the execution
   * @return lastUpdateUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:10:05Z", value = "The last update UTC date of the execution")
  public DateTime getLastUpdateUtcDate() {
    return lastUpdateUtcDate;
  }

  public void setLastUpdateUtcDate(DateTime lastUpdateUtcDate) {
    this.lastUpdateUtcDate = lastUpdateUtcDate;
  }

  public ChangeOrderReporting errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The error message during the execution
   * @return errorMessage
  **/
  @ApiModelProperty(example = "This is an error message", value = "The error message during the execution")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ChangeOrderReporting ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The IP address who request this operation
   * @return ipAddress
  **/
  @ApiModelProperty(example = "127.0.0.1", value = "The IP address who request this operation")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public ChangeOrderReporting testMode(Boolean testMode) {
    this.testMode = testMode;
    return this;
  }

   /**
   * This operation was a test
   * @return testMode
  **/
  @ApiModelProperty(example = "false", value = "This operation was a test")
  public Boolean getTestMode() {
    return testMode;
  }

  public void setTestMode(Boolean testMode) {
    this.testMode = testMode;
  }

  public ChangeOrderReporting details(Map<String, Object> details) {
    this.details = details;
    return this;
  }

  public ChangeOrderReporting putDetailsItem(String key, Object detailsItem) {
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getDetails() {
    return details;
  }

  public void setDetails(Map<String, Object> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeOrderReporting changeOrderReporting = (ChangeOrderReporting) o;
    return Objects.equals(this.executionUUID, changeOrderReporting.executionUUID) &&
        Objects.equals(this.changeOrderType, changeOrderReporting.changeOrderType) &&
        Objects.equals(this.sourceType, changeOrderReporting.sourceType) &&
        Objects.equals(this.sourceUserId, changeOrderReporting.sourceUserId) &&
        Objects.equals(this.sourceUserName, changeOrderReporting.sourceUserName) &&
        Objects.equals(this.creationUtcDate, changeOrderReporting.creationUtcDate) &&
        Objects.equals(this.processingStatus, changeOrderReporting.processingStatus) &&
        Objects.equals(this.lastUpdateUtcDate, changeOrderReporting.lastUpdateUtcDate) &&
        Objects.equals(this.errorMessage, changeOrderReporting.errorMessage) &&
        Objects.equals(this.ipAddress, changeOrderReporting.ipAddress) &&
        Objects.equals(this.testMode, changeOrderReporting.testMode) &&
        Objects.equals(this.details, changeOrderReporting.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionUUID, changeOrderType, sourceType, sourceUserId, sourceUserName, creationUtcDate, processingStatus, lastUpdateUtcDate, errorMessage, ipAddress, testMode, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeOrderReporting {\n");
    
    sb.append("    executionUUID: ").append(toIndentedString(executionUUID)).append("\n");
    sb.append("    changeOrderType: ").append(toIndentedString(changeOrderType)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceUserId: ").append(toIndentedString(sourceUserId)).append("\n");
    sb.append("    sourceUserName: ").append(toIndentedString(sourceUserName)).append("\n");
    sb.append("    creationUtcDate: ").append(toIndentedString(creationUtcDate)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    lastUpdateUtcDate: ").append(toIndentedString(lastUpdateUtcDate)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

