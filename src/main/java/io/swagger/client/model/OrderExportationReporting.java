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
import io.swagger.client.model.OrderExportationReportingProcessingStatus;
import io.swagger.client.model.SourceType;
import java.util.UUID;
import org.joda.time.DateTime;

/**
 * Represent the reporting of the Order report exportations
 */
@ApiModel(description = "Represent the reporting of the Order report exportations")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T12:43:33.063Z")
public class OrderExportationReporting {
  @SerializedName("abortionUtcDate")
  private DateTime abortionUtcDate = null;

  @SerializedName("beginUtcDate")
  private DateTime beginUtcDate = null;

  @SerializedName("blobNameUri")
  private String blobNameUri = null;

  @SerializedName("endUtcDate")
  private DateTime endUtcDate = null;

  @SerializedName("enqueuedUtcDate")
  private DateTime enqueuedUtcDate = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  @SerializedName("executionUUID")
  private UUID executionUUID = null;

  @SerializedName("expirationUtcDate")
  private DateTime expirationUtcDate = null;

  @SerializedName("failureUtcDate")
  private DateTime failureUtcDate = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("jsonCriteria")
  private String jsonCriteria = null;

  @SerializedName("lastUpdateUtcDate")
  private DateTime lastUpdateUtcDate = null;

  @SerializedName("orderCount")
  private Integer orderCount = null;

  @SerializedName("processingStatus")
  private OrderExportationReportingProcessingStatus processingStatus = null;

  @SerializedName("remainingOrderCount")
  private Integer remainingOrderCount = null;

  @SerializedName("resumedUtcDate")
  private DateTime resumedUtcDate = null;

  @SerializedName("sourceType")
  private SourceType sourceType = null;

  @SerializedName("sourceUserId")
  private BeezUPCommonUserId sourceUserId = null;

  @SerializedName("sourceUserName")
  private String sourceUserName = null;

  @SerializedName("suspendedUtcDate")
  private DateTime suspendedUtcDate = null;

  @SerializedName("timeoutDuration")
  private String timeoutDuration = null;

  @SerializedName("warningMessage")
  private String warningMessage = null;

  public OrderExportationReporting abortionUtcDate(DateTime abortionUtcDate) {
    this.abortionUtcDate = abortionUtcDate;
    return this;
  }

   /**
   * Get abortionUtcDate
   * @return abortionUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:10:12Z", value = "")
  public DateTime getAbortionUtcDate() {
    return abortionUtcDate;
  }

  public void setAbortionUtcDate(DateTime abortionUtcDate) {
    this.abortionUtcDate = abortionUtcDate;
  }

  public OrderExportationReporting beginUtcDate(DateTime beginUtcDate) {
    this.beginUtcDate = beginUtcDate;
    return this;
  }

   /**
   * Get beginUtcDate
   * @return beginUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:10:12Z", value = "")
  public DateTime getBeginUtcDate() {
    return beginUtcDate;
  }

  public void setBeginUtcDate(DateTime beginUtcDate) {
    this.beginUtcDate = beginUtcDate;
  }

  public OrderExportationReporting blobNameUri(String blobNameUri) {
    this.blobNameUri = blobNameUri;
    return this;
  }

   /**
   * Get blobNameUri
   * @return blobNameUri
  **/
  @ApiModelProperty(example = "http://beezuporder2.blob.com/yourReport.csv", value = "")
  public String getBlobNameUri() {
    return blobNameUri;
  }

  public void setBlobNameUri(String blobNameUri) {
    this.blobNameUri = blobNameUri;
  }

  public OrderExportationReporting endUtcDate(DateTime endUtcDate) {
    this.endUtcDate = endUtcDate;
    return this;
  }

   /**
   * Get endUtcDate
   * @return endUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T15:10:12Z", value = "")
  public DateTime getEndUtcDate() {
    return endUtcDate;
  }

  public void setEndUtcDate(DateTime endUtcDate) {
    this.endUtcDate = endUtcDate;
  }

  public OrderExportationReporting enqueuedUtcDate(DateTime enqueuedUtcDate) {
    this.enqueuedUtcDate = enqueuedUtcDate;
    return this;
  }

   /**
   * Get enqueuedUtcDate
   * @return enqueuedUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:09:12Z", required = true, value = "")
  public DateTime getEnqueuedUtcDate() {
    return enqueuedUtcDate;
  }

  public void setEnqueuedUtcDate(DateTime enqueuedUtcDate) {
    this.enqueuedUtcDate = enqueuedUtcDate;
  }

  public OrderExportationReporting errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(example = "You have an error here", value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public OrderExportationReporting executionUUID(UUID executionUUID) {
    this.executionUUID = executionUUID;
    return this;
  }

   /**
   * Get executionUUID
   * @return executionUUID
  **/
  @ApiModelProperty(example = "00000000000000000000000000000000000000000000000", required = true, value = "")
  public UUID getExecutionUUID() {
    return executionUUID;
  }

  public void setExecutionUUID(UUID executionUUID) {
    this.executionUUID = executionUUID;
  }

  public OrderExportationReporting expirationUtcDate(DateTime expirationUtcDate) {
    this.expirationUtcDate = expirationUtcDate;
    return this;
  }

   /**
   * Get expirationUtcDate
   * @return expirationUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:39:12Z", value = "")
  public DateTime getExpirationUtcDate() {
    return expirationUtcDate;
  }

  public void setExpirationUtcDate(DateTime expirationUtcDate) {
    this.expirationUtcDate = expirationUtcDate;
  }

  public OrderExportationReporting failureUtcDate(DateTime failureUtcDate) {
    this.failureUtcDate = failureUtcDate;
    return this;
  }

   /**
   * Get failureUtcDate
   * @return failureUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:39:12Z", value = "")
  public DateTime getFailureUtcDate() {
    return failureUtcDate;
  }

  public void setFailureUtcDate(DateTime failureUtcDate) {
    this.failureUtcDate = failureUtcDate;
  }

  public OrderExportationReporting ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @ApiModelProperty(example = "127.0.0.1", required = true, value = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public OrderExportationReporting jsonCriteria(String jsonCriteria) {
    this.jsonCriteria = jsonCriteria;
    return this;
  }

   /**
   * Raw representation of the JSON
   * @return jsonCriteria
  **/
  @ApiModelProperty(example = "{&quot;StartDate:&quot;2016-09-30T22:00:00Z&quot;,&quot;EndDate:&quot;2016-10-30T23:00:00Z&quot;,&quot;OrderListingFilterDateSearchType:0,&quot;MarketPlaceOrderIds:null,&quot;BeezUPOrderStatusNames:null,&quot;ResultByPage:20,&quot;MerchantOrderIds:null,&quot;PageIndex:0,&quot;MarketPlaceTechnicalCodes:[&quot;PriceMinister&quot;,&quot;Amazon&quot;,&quot;CDiscount&quot;,&quot;Mirakl&quot;],&quot;MarketPlaceBusinessCodes:[&quot;PRICEMINISTER&quot;],&quot;AccountIds:[1234,987],&quot;StoreIds:[&quot;00000000-0000-0000-0000-00000000007c&quot;],&quot;BuyerFullName:null}", value = "Raw representation of the JSON")
  public String getJsonCriteria() {
    return jsonCriteria;
  }

  public void setJsonCriteria(String jsonCriteria) {
    this.jsonCriteria = jsonCriteria;
  }

  public OrderExportationReporting lastUpdateUtcDate(DateTime lastUpdateUtcDate) {
    this.lastUpdateUtcDate = lastUpdateUtcDate;
    return this;
  }

   /**
   * Get lastUpdateUtcDate
   * @return lastUpdateUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T15:10:12Z", value = "")
  public DateTime getLastUpdateUtcDate() {
    return lastUpdateUtcDate;
  }

  public void setLastUpdateUtcDate(DateTime lastUpdateUtcDate) {
    this.lastUpdateUtcDate = lastUpdateUtcDate;
  }

  public OrderExportationReporting orderCount(Integer orderCount) {
    this.orderCount = orderCount;
    return this;
  }

   /**
   * Get orderCount
   * @return orderCount
  **/
  @ApiModelProperty(example = "1024", value = "")
  public Integer getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
  }

  public OrderExportationReporting processingStatus(OrderExportationReportingProcessingStatus processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

   /**
   * Get processingStatus
   * @return processingStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public OrderExportationReportingProcessingStatus getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(OrderExportationReportingProcessingStatus processingStatus) {
    this.processingStatus = processingStatus;
  }

  public OrderExportationReporting remainingOrderCount(Integer remainingOrderCount) {
    this.remainingOrderCount = remainingOrderCount;
    return this;
  }

   /**
   * Get remainingOrderCount
   * @return remainingOrderCount
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getRemainingOrderCount() {
    return remainingOrderCount;
  }

  public void setRemainingOrderCount(Integer remainingOrderCount) {
    this.remainingOrderCount = remainingOrderCount;
  }

  public OrderExportationReporting resumedUtcDate(DateTime resumedUtcDate) {
    this.resumedUtcDate = resumedUtcDate;
    return this;
  }

   /**
   * Get resumedUtcDate
   * @return resumedUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:39:12Z", value = "")
  public DateTime getResumedUtcDate() {
    return resumedUtcDate;
  }

  public void setResumedUtcDate(DateTime resumedUtcDate) {
    this.resumedUtcDate = resumedUtcDate;
  }

  public OrderExportationReporting sourceType(SourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public SourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceType sourceType) {
    this.sourceType = sourceType;
  }

  public OrderExportationReporting sourceUserId(BeezUPCommonUserId sourceUserId) {
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

  public OrderExportationReporting sourceUserName(String sourceUserName) {
    this.sourceUserName = sourceUserName;
    return this;
  }

   /**
   * Get sourceUserName
   * @return sourceUserName
  **/
  @ApiModelProperty(example = "Marilyn monroe", required = true, value = "")
  public String getSourceUserName() {
    return sourceUserName;
  }

  public void setSourceUserName(String sourceUserName) {
    this.sourceUserName = sourceUserName;
  }

  public OrderExportationReporting suspendedUtcDate(DateTime suspendedUtcDate) {
    this.suspendedUtcDate = suspendedUtcDate;
    return this;
  }

   /**
   * Get suspendedUtcDate
   * @return suspendedUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:39:12Z", value = "")
  public DateTime getSuspendedUtcDate() {
    return suspendedUtcDate;
  }

  public void setSuspendedUtcDate(DateTime suspendedUtcDate) {
    this.suspendedUtcDate = suspendedUtcDate;
  }

  public OrderExportationReporting timeoutDuration(String timeoutDuration) {
    this.timeoutDuration = timeoutDuration;
    return this;
  }

   /**
   * Get timeoutDuration
   * @return timeoutDuration
  **/
  @ApiModelProperty(example = "00:30:00", value = "")
  public String getTimeoutDuration() {
    return timeoutDuration;
  }

  public void setTimeoutDuration(String timeoutDuration) {
    this.timeoutDuration = timeoutDuration;
  }

  public OrderExportationReporting warningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
    return this;
  }

   /**
   * Get warningMessage
   * @return warningMessage
  **/
  @ApiModelProperty(example = "You have a warning here", value = "")
  public String getWarningMessage() {
    return warningMessage;
  }

  public void setWarningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderExportationReporting orderExportationReporting = (OrderExportationReporting) o;
    return Objects.equals(this.abortionUtcDate, orderExportationReporting.abortionUtcDate) &&
        Objects.equals(this.beginUtcDate, orderExportationReporting.beginUtcDate) &&
        Objects.equals(this.blobNameUri, orderExportationReporting.blobNameUri) &&
        Objects.equals(this.endUtcDate, orderExportationReporting.endUtcDate) &&
        Objects.equals(this.enqueuedUtcDate, orderExportationReporting.enqueuedUtcDate) &&
        Objects.equals(this.errorMessage, orderExportationReporting.errorMessage) &&
        Objects.equals(this.executionUUID, orderExportationReporting.executionUUID) &&
        Objects.equals(this.expirationUtcDate, orderExportationReporting.expirationUtcDate) &&
        Objects.equals(this.failureUtcDate, orderExportationReporting.failureUtcDate) &&
        Objects.equals(this.ipAddress, orderExportationReporting.ipAddress) &&
        Objects.equals(this.jsonCriteria, orderExportationReporting.jsonCriteria) &&
        Objects.equals(this.lastUpdateUtcDate, orderExportationReporting.lastUpdateUtcDate) &&
        Objects.equals(this.orderCount, orderExportationReporting.orderCount) &&
        Objects.equals(this.processingStatus, orderExportationReporting.processingStatus) &&
        Objects.equals(this.remainingOrderCount, orderExportationReporting.remainingOrderCount) &&
        Objects.equals(this.resumedUtcDate, orderExportationReporting.resumedUtcDate) &&
        Objects.equals(this.sourceType, orderExportationReporting.sourceType) &&
        Objects.equals(this.sourceUserId, orderExportationReporting.sourceUserId) &&
        Objects.equals(this.sourceUserName, orderExportationReporting.sourceUserName) &&
        Objects.equals(this.suspendedUtcDate, orderExportationReporting.suspendedUtcDate) &&
        Objects.equals(this.timeoutDuration, orderExportationReporting.timeoutDuration) &&
        Objects.equals(this.warningMessage, orderExportationReporting.warningMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abortionUtcDate, beginUtcDate, blobNameUri, endUtcDate, enqueuedUtcDate, errorMessage, executionUUID, expirationUtcDate, failureUtcDate, ipAddress, jsonCriteria, lastUpdateUtcDate, orderCount, processingStatus, remainingOrderCount, resumedUtcDate, sourceType, sourceUserId, sourceUserName, suspendedUtcDate, timeoutDuration, warningMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderExportationReporting {\n");
    
    sb.append("    abortionUtcDate: ").append(toIndentedString(abortionUtcDate)).append("\n");
    sb.append("    beginUtcDate: ").append(toIndentedString(beginUtcDate)).append("\n");
    sb.append("    blobNameUri: ").append(toIndentedString(blobNameUri)).append("\n");
    sb.append("    endUtcDate: ").append(toIndentedString(endUtcDate)).append("\n");
    sb.append("    enqueuedUtcDate: ").append(toIndentedString(enqueuedUtcDate)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    executionUUID: ").append(toIndentedString(executionUUID)).append("\n");
    sb.append("    expirationUtcDate: ").append(toIndentedString(expirationUtcDate)).append("\n");
    sb.append("    failureUtcDate: ").append(toIndentedString(failureUtcDate)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    jsonCriteria: ").append(toIndentedString(jsonCriteria)).append("\n");
    sb.append("    lastUpdateUtcDate: ").append(toIndentedString(lastUpdateUtcDate)).append("\n");
    sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    remainingOrderCount: ").append(toIndentedString(remainingOrderCount)).append("\n");
    sb.append("    resumedUtcDate: ").append(toIndentedString(resumedUtcDate)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceUserId: ").append(toIndentedString(sourceUserId)).append("\n");
    sb.append("    sourceUserName: ").append(toIndentedString(sourceUserName)).append("\n");
    sb.append("    suspendedUtcDate: ").append(toIndentedString(suspendedUtcDate)).append("\n");
    sb.append("    timeoutDuration: ").append(toIndentedString(timeoutDuration)).append("\n");
    sb.append("    warningMessage: ").append(toIndentedString(warningMessage)).append("\n");
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

