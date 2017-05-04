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
import io.swagger.client.model.FeedType;
import org.joda.time.DateTime;

/**
 * Publication feed reporting
 */
@ApiModel(description = "Publication feed reporting")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T12:05:37.723Z")
public class PublicationFeedReporting {
  @SerializedName("feedType")
  private FeedType feedType = null;

  @SerializedName("startUtcDate")
  private DateTime startUtcDate = null;

  @SerializedName("endUtcDate")
  private DateTime endUtcDate = null;

  @SerializedName("processingStatus")
  private String processingStatus = null;

  @SerializedName("exportedProducts")
  private Integer exportedProducts = null;

  @SerializedName("transmittedItems")
  private Integer transmittedItems = null;

  @SerializedName("publishedItems")
  private Integer publishedItems = null;

  @SerializedName("publishedItemsWithWarning")
  private Integer publishedItemsWithWarning = null;

  @SerializedName("failedItems")
  private Integer failedItems = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  @SerializedName("htmlReportUrl")
  private String htmlReportUrl = null;

  @SerializedName("htmlReportGenerationErrorMessage")
  private String htmlReportGenerationErrorMessage = null;

  @SerializedName("completed")
  private Boolean completed = null;

  public PublicationFeedReporting feedType(FeedType feedType) {
    this.feedType = feedType;
    return this;
  }

   /**
   * Get feedType
   * @return feedType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public FeedType getFeedType() {
    return feedType;
  }

  public void setFeedType(FeedType feedType) {
    this.feedType = feedType;
  }

  public PublicationFeedReporting startUtcDate(DateTime startUtcDate) {
    this.startUtcDate = startUtcDate;
    return this;
  }

   /**
   * The feed publication start time (UTC timezone)
   * @return startUtcDate
  **/
  @ApiModelProperty(example = "2016-02-13T12:01:11Z", required = true, value = "The feed publication start time (UTC timezone)")
  public DateTime getStartUtcDate() {
    return startUtcDate;
  }

  public void setStartUtcDate(DateTime startUtcDate) {
    this.startUtcDate = startUtcDate;
  }

  public PublicationFeedReporting endUtcDate(DateTime endUtcDate) {
    this.endUtcDate = endUtcDate;
    return this;
  }

   /**
   * The feed publication end time (UTC timezone)
   * @return endUtcDate
  **/
  @ApiModelProperty(example = "2016-02-13T12:02:00Z", value = "The feed publication end time (UTC timezone)")
  public DateTime getEndUtcDate() {
    return endUtcDate;
  }

  public void setEndUtcDate(DateTime endUtcDate) {
    this.endUtcDate = endUtcDate;
  }

  public PublicationFeedReporting processingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

   /**
   * The processing status
   * @return processingStatus
  **/
  @ApiModelProperty(example = "Done", required = true, value = "The processing status")
  public String getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
  }

  public PublicationFeedReporting exportedProducts(Integer exportedProducts) {
    this.exportedProducts = exportedProducts;
    return this;
  }

   /**
   * The product count downloaded from BeezUP Export
   * @return exportedProducts
  **/
  @ApiModelProperty(example = "10142", value = "The product count downloaded from BeezUP Export")
  public Integer getExportedProducts() {
    return exportedProducts;
  }

  public void setExportedProducts(Integer exportedProducts) {
    this.exportedProducts = exportedProducts;
  }

  public PublicationFeedReporting transmittedItems(Integer transmittedItems) {
    this.transmittedItems = transmittedItems;
    return this;
  }

   /**
   * The item count (products or offers) sent to the marketplace
   * @return transmittedItems
  **/
  @ApiModelProperty(example = "10042", value = "The item count (products or offers) sent to the marketplace")
  public Integer getTransmittedItems() {
    return transmittedItems;
  }

  public void setTransmittedItems(Integer transmittedItems) {
    this.transmittedItems = transmittedItems;
  }

  public PublicationFeedReporting publishedItems(Integer publishedItems) {
    this.publishedItems = publishedItems;
    return this;
  }

   /**
   * The item count (products or offers) the marketplace flagged as successful
   * @return publishedItems
  **/
  @ApiModelProperty(example = "10041", value = "The item count (products or offers) the marketplace flagged as successful")
  public Integer getPublishedItems() {
    return publishedItems;
  }

  public void setPublishedItems(Integer publishedItems) {
    this.publishedItems = publishedItems;
  }

  public PublicationFeedReporting publishedItemsWithWarning(Integer publishedItemsWithWarning) {
    this.publishedItemsWithWarning = publishedItemsWithWarning;
    return this;
  }

   /**
   * The item count (products or offers) the marketplace flagged as successful with warnings
   * @return publishedItemsWithWarning
  **/
  @ApiModelProperty(example = "123", value = "The item count (products or offers) the marketplace flagged as successful with warnings")
  public Integer getPublishedItemsWithWarning() {
    return publishedItemsWithWarning;
  }

  public void setPublishedItemsWithWarning(Integer publishedItemsWithWarning) {
    this.publishedItemsWithWarning = publishedItemsWithWarning;
  }

  public PublicationFeedReporting failedItems(Integer failedItems) {
    this.failedItems = failedItems;
    return this;
  }

   /**
   * The item count (products or offers) the marketplace flagged as failed
   * @return failedItems
  **/
  @ApiModelProperty(example = "1", value = "The item count (products or offers) the marketplace flagged as failed")
  public Integer getFailedItems() {
    return failedItems;
  }

  public void setFailedItems(Integer failedItems) {
    this.failedItems = failedItems;
  }

  public PublicationFeedReporting errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The error message
   * @return errorMessage
  **/
  @ApiModelProperty(example = "", value = "The error message")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public PublicationFeedReporting htmlReportUrl(String htmlReportUrl) {
    this.htmlReportUrl = htmlReportUrl;
    return this;
  }

   /**
   * The Url for the Html Report generated
   * @return htmlReportUrl
  **/
  @ApiModelProperty(example = "http://www.myreporthtml.com", value = "The Url for the Html Report generated")
  public String getHtmlReportUrl() {
    return htmlReportUrl;
  }

  public void setHtmlReportUrl(String htmlReportUrl) {
    this.htmlReportUrl = htmlReportUrl;
  }

  public PublicationFeedReporting htmlReportGenerationErrorMessage(String htmlReportGenerationErrorMessage) {
    this.htmlReportGenerationErrorMessage = htmlReportGenerationErrorMessage;
    return this;
  }

   /**
   * The error message if the Html Report generation failed
   * @return htmlReportGenerationErrorMessage
  **/
  @ApiModelProperty(example = "null", value = "The error message if the Html Report generation failed")
  public String getHtmlReportGenerationErrorMessage() {
    return htmlReportGenerationErrorMessage;
  }

  public void setHtmlReportGenerationErrorMessage(String htmlReportGenerationErrorMessage) {
    this.htmlReportGenerationErrorMessage = htmlReportGenerationErrorMessage;
  }

  public PublicationFeedReporting completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Indicates if the publication is completed or not
   * @return completed
  **/
  @ApiModelProperty(example = "true", value = "Indicates if the publication is completed or not")
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationFeedReporting publicationFeedReporting = (PublicationFeedReporting) o;
    return Objects.equals(this.feedType, publicationFeedReporting.feedType) &&
        Objects.equals(this.startUtcDate, publicationFeedReporting.startUtcDate) &&
        Objects.equals(this.endUtcDate, publicationFeedReporting.endUtcDate) &&
        Objects.equals(this.processingStatus, publicationFeedReporting.processingStatus) &&
        Objects.equals(this.exportedProducts, publicationFeedReporting.exportedProducts) &&
        Objects.equals(this.transmittedItems, publicationFeedReporting.transmittedItems) &&
        Objects.equals(this.publishedItems, publicationFeedReporting.publishedItems) &&
        Objects.equals(this.publishedItemsWithWarning, publicationFeedReporting.publishedItemsWithWarning) &&
        Objects.equals(this.failedItems, publicationFeedReporting.failedItems) &&
        Objects.equals(this.errorMessage, publicationFeedReporting.errorMessage) &&
        Objects.equals(this.htmlReportUrl, publicationFeedReporting.htmlReportUrl) &&
        Objects.equals(this.htmlReportGenerationErrorMessage, publicationFeedReporting.htmlReportGenerationErrorMessage) &&
        Objects.equals(this.completed, publicationFeedReporting.completed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedType, startUtcDate, endUtcDate, processingStatus, exportedProducts, transmittedItems, publishedItems, publishedItemsWithWarning, failedItems, errorMessage, htmlReportUrl, htmlReportGenerationErrorMessage, completed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationFeedReporting {\n");
    
    sb.append("    feedType: ").append(toIndentedString(feedType)).append("\n");
    sb.append("    startUtcDate: ").append(toIndentedString(startUtcDate)).append("\n");
    sb.append("    endUtcDate: ").append(toIndentedString(endUtcDate)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    exportedProducts: ").append(toIndentedString(exportedProducts)).append("\n");
    sb.append("    transmittedItems: ").append(toIndentedString(transmittedItems)).append("\n");
    sb.append("    publishedItems: ").append(toIndentedString(publishedItems)).append("\n");
    sb.append("    publishedItemsWithWarning: ").append(toIndentedString(publishedItemsWithWarning)).append("\n");
    sb.append("    failedItems: ").append(toIndentedString(failedItems)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    htmlReportUrl: ").append(toIndentedString(htmlReportUrl)).append("\n");
    sb.append("    htmlReportGenerationErrorMessage: ").append(toIndentedString(htmlReportGenerationErrorMessage)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
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

