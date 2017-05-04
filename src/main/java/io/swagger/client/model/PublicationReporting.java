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
import io.swagger.client.model.PublicationFeedReporting;
import io.swagger.client.model.PublicationType;
import java.util.ArrayList;
import java.util.List;

/**
 * Model for a publication reporting, can have multiple feeds
 */
@ApiModel(description = "Model for a publication reporting, can have multiple feeds")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:10:30.245Z")
public class PublicationReporting {
  @SerializedName("publicationType")
  private PublicationType publicationType = null;

  @SerializedName("feeds")
  private List<PublicationFeedReporting> feeds = new ArrayList<PublicationFeedReporting>();

  public PublicationReporting publicationType(PublicationType publicationType) {
    this.publicationType = publicationType;
    return this;
  }

   /**
   * Get publicationType
   * @return publicationType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PublicationType getPublicationType() {
    return publicationType;
  }

  public void setPublicationType(PublicationType publicationType) {
    this.publicationType = publicationType;
  }

  public PublicationReporting feeds(List<PublicationFeedReporting> feeds) {
    this.feeds = feeds;
    return this;
  }

  public PublicationReporting addFeedsItem(PublicationFeedReporting feedsItem) {
    this.feeds.add(feedsItem);
    return this;
  }

   /**
   * The feeds that were published
   * @return feeds
  **/
  @ApiModelProperty(example = "[{&quot;feedType&quot;:&quot;Offers&quot;,&quot;startUtcDate&quot;:&quot;2016-02-13T12:01:11Z&quot;,&quot;endUtcDate&quot;:&quot;2016-02-13T12:02:00Z&quot;,&quot;processingStatus&quot;:&quot;Done&quot;,&quot;exportedProducts&quot;:10142,&quot;transmittedItems&quot;:10042,&quot;publishedItems&quot;:10041,&quot;publishedItemsWithWarning&quot;:123,&quot;failedItems&quot;:1,&quot;errorMessage&quot;:&quot;&quot;,&quot;htmlReportUrl&quot;:&quot;http://www.myreporthtml.com&quot;,&quot;htmlReportGenerationErrorMessage&quot;:&quot;&quot;}]", required = true, value = "The feeds that were published")
  public List<PublicationFeedReporting> getFeeds() {
    return feeds;
  }

  public void setFeeds(List<PublicationFeedReporting> feeds) {
    this.feeds = feeds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationReporting publicationReporting = (PublicationReporting) o;
    return Objects.equals(this.publicationType, publicationReporting.publicationType) &&
        Objects.equals(this.feeds, publicationReporting.feeds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationType, feeds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationReporting {\n");
    
    sb.append("    publicationType: ").append(toIndentedString(publicationType)).append("\n");
    sb.append("    feeds: ").append(toIndentedString(feeds)).append("\n");
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

