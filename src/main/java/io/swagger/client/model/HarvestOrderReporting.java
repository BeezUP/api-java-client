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
import io.swagger.client.model.BeezUPOrderStatus;
import io.swagger.client.model.ExecutionUUID;
import org.joda.time.DateTime;

/**
 * The reporting related to a harvest order operation
 */
@ApiModel(description = "The reporting related to a harvest order operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T12:03:05.460Z")
public class HarvestOrderReporting {
  @SerializedName("executionUUID")
  private ExecutionUUID executionUUID = null;

  @SerializedName("creationUtcDate")
  private DateTime creationUtcDate = null;

  @SerializedName("processingStatus")
  private String processingStatus = null;

  @SerializedName("lastUpdateUtcDate")
  private DateTime lastUpdateUtcDate = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  @SerializedName("warningMessage")
  private String warningMessage = null;

  @SerializedName("beezUPStatus")
  private BeezUPOrderStatus beezUPStatus = null;

  @SerializedName("marketplaceStatus")
  private String marketplaceStatus = null;

  @SerializedName("beezUPForcedStatus")
  private String beezUPForcedStatus = null;

  public HarvestOrderReporting executionUUID(ExecutionUUID executionUUID) {
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

  public HarvestOrderReporting creationUtcDate(DateTime creationUtcDate) {
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

  public HarvestOrderReporting processingStatus(String processingStatus) {
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

  public HarvestOrderReporting lastUpdateUtcDate(DateTime lastUpdateUtcDate) {
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

  public HarvestOrderReporting errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The warning message during the execution
   * @return errorMessage
  **/
  @ApiModelProperty(example = "This is an error message", value = "The warning message during the execution")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public HarvestOrderReporting warningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
    return this;
  }

   /**
   * The warning message during the execution
   * @return warningMessage
  **/
  @ApiModelProperty(example = "This is a warning", value = "The warning message during the execution")
  public String getWarningMessage() {
    return warningMessage;
  }

  public void setWarningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
  }

  public HarvestOrderReporting beezUPStatus(BeezUPOrderStatus beezUPStatus) {
    this.beezUPStatus = beezUPStatus;
    return this;
  }

   /**
   * Get beezUPStatus
   * @return beezUPStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPOrderStatus getBeezUPStatus() {
    return beezUPStatus;
  }

  public void setBeezUPStatus(BeezUPOrderStatus beezUPStatus) {
    this.beezUPStatus = beezUPStatus;
  }

  public HarvestOrderReporting marketplaceStatus(String marketplaceStatus) {
    this.marketplaceStatus = marketplaceStatus;
    return this;
  }

   /**
   * The order marketplace status
   * @return marketplaceStatus
  **/
  @ApiModelProperty(example = "In_progress_3", value = "The order marketplace status")
  public String getMarketplaceStatus() {
    return marketplaceStatus;
  }

  public void setMarketplaceStatus(String marketplaceStatus) {
    this.marketplaceStatus = marketplaceStatus;
  }

  public HarvestOrderReporting beezUPForcedStatus(String beezUPForcedStatus) {
    this.beezUPForcedStatus = beezUPForcedStatus;
    return this;
  }

   /**
   * The marketplace order status forced by BeezUP during the order change oepration. This could happend when there is no status on the marketplace side.
   * @return beezUPForcedStatus
  **/
  @ApiModelProperty(example = "In_progress_3", value = "The marketplace order status forced by BeezUP during the order change oepration. This could happend when there is no status on the marketplace side.")
  public String getBeezUPForcedStatus() {
    return beezUPForcedStatus;
  }

  public void setBeezUPForcedStatus(String beezUPForcedStatus) {
    this.beezUPForcedStatus = beezUPForcedStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HarvestOrderReporting harvestOrderReporting = (HarvestOrderReporting) o;
    return Objects.equals(this.executionUUID, harvestOrderReporting.executionUUID) &&
        Objects.equals(this.creationUtcDate, harvestOrderReporting.creationUtcDate) &&
        Objects.equals(this.processingStatus, harvestOrderReporting.processingStatus) &&
        Objects.equals(this.lastUpdateUtcDate, harvestOrderReporting.lastUpdateUtcDate) &&
        Objects.equals(this.errorMessage, harvestOrderReporting.errorMessage) &&
        Objects.equals(this.warningMessage, harvestOrderReporting.warningMessage) &&
        Objects.equals(this.beezUPStatus, harvestOrderReporting.beezUPStatus) &&
        Objects.equals(this.marketplaceStatus, harvestOrderReporting.marketplaceStatus) &&
        Objects.equals(this.beezUPForcedStatus, harvestOrderReporting.beezUPForcedStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionUUID, creationUtcDate, processingStatus, lastUpdateUtcDate, errorMessage, warningMessage, beezUPStatus, marketplaceStatus, beezUPForcedStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HarvestOrderReporting {\n");
    
    sb.append("    executionUUID: ").append(toIndentedString(executionUUID)).append("\n");
    sb.append("    creationUtcDate: ").append(toIndentedString(creationUtcDate)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    lastUpdateUtcDate: ").append(toIndentedString(lastUpdateUtcDate)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    warningMessage: ").append(toIndentedString(warningMessage)).append("\n");
    sb.append("    beezUPStatus: ").append(toIndentedString(beezUPStatus)).append("\n");
    sb.append("    marketplaceStatus: ").append(toIndentedString(marketplaceStatus)).append("\n");
    sb.append("    beezUPForcedStatus: ").append(toIndentedString(beezUPForcedStatus)).append("\n");
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

