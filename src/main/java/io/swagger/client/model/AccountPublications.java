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
import io.swagger.client.model.AccountPublicationsLinks;
import io.swagger.client.model.PublicationReporting;
import java.util.ArrayList;
import java.util.List;

/**
 * The publication history for an account
 */
@ApiModel(description = "The publication history for an account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:43:26.940Z")
public class AccountPublications {
  @SerializedName("links")
  private AccountPublicationsLinks links = null;

  @SerializedName("publications")
  private List<PublicationReporting> publications = new ArrayList<PublicationReporting>();

  public AccountPublications links(AccountPublicationsLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AccountPublicationsLinks getLinks() {
    return links;
  }

  public void setLinks(AccountPublicationsLinks links) {
    this.links = links;
  }

  public AccountPublications publications(List<PublicationReporting> publications) {
    this.publications = publications;
    return this;
  }

  public AccountPublications addPublicationsItem(PublicationReporting publicationsItem) {
    this.publications.add(publicationsItem);
    return this;
  }

   /**
   * The recent publications for the requested account
   * @return publications
  **/
  @ApiModelProperty(example = "[{&quot;publicationType&quot;:&quot;PublishOffers&quot;,&quot;feeds&quot;:[{&quot;feedType&quot;:&quot;Offers&quot;,&quot;startUtcDate&quot;:&quot;2016-02-13T12:01:11Z&quot;,&quot;endUtcDate&quot;:&quot;2016-02-13T12:02:00Z&quot;,&quot;processingStatus&quot;:&quot;Done&quot;,&quot;exportedProducts&quot;:10142,&quot;transmittedItems&quot;:10042,&quot;publishedItems&quot;:10041,&quot;publishedItemsWithWarning&quot;:123,&quot;failedItems&quot;:1,&quot;errorMessage&quot;:&quot;&quot;,&quot;htmlReportUrl&quot;:&quot;http://www.myreporthtml.com&quot;,&quot;htmlReportGenerationErrorMessage&quot;:&quot;&quot;},{&quot;feedType&quot;:&quot;Inventory&quot;,&quot;startUtcDate&quot;:&quot;2016-02-13T12:01:11Z&quot;,&quot;endUtcDate&quot;:&quot;2016-02-13T12:02:00Z&quot;,&quot;processingStatus&quot;:&quot;Done&quot;,&quot;exportedProducts&quot;:10142,&quot;transmittedItems&quot;:10042,&quot;publishedItems&quot;:10041,&quot;publishedItemsWithWarning&quot;:123,&quot;failedItems&quot;:1,&quot;errorMessage&quot;:&quot;&quot;,&quot;htmlReportUrl&quot;:&quot;http://www.myreporthtml.com&quot;,&quot;htmlReportGenerationErrorMessage&quot;:&quot;&quot;},{&quot;feedType&quot;:&quot;Pricing&quot;,&quot;startUtcDate&quot;:&quot;2016-02-13T12:01:11Z&quot;,&quot;processingStatus&quot;:&quot;InProgress&quot;,&quot;exportedProducts&quot;:10142,&quot;transmittedItems&quot;:10042,&quot;publishedItems&quot;:10041,&quot;publishedItemsWithWarning&quot;:123,&quot;failedItems&quot;:1,&quot;errorMessage&quot;:&quot;&quot;,&quot;htmlReportUrl&quot;:&quot;http://www.myreporthtml.com&quot;,&quot;htmlReportGenerationErrorMessage&quot;:&quot;&quot;}]},{&quot;publicationType&quot;:&quot;PublishProducts&quot;,&quot;feeds&quot;:[{&quot;feedType&quot;:&quot;Product&quot;,&quot;startUtcDate&quot;:&quot;2016-02-13T12:01:11Z&quot;,&quot;endUtcDate&quot;:&quot;2016-02-13T12:02:00Z&quot;,&quot;processingStatus&quot;:&quot;Done&quot;,&quot;exportedProducts&quot;:10142,&quot;transmittedItems&quot;:10042,&quot;publishedItems&quot;:10041,&quot;publishedItemsWithWarning&quot;:123,&quot;failedItems&quot;:1,&quot;errorMessage&quot;:&quot;&quot;,&quot;htmlReportUrl&quot;:&quot;http://www.myreporthtml.com&quot;,&quot;htmlReportGenerationErrorMessage&quot;:&quot;&quot;},{&quot;feedType&quot;:&quot;Inventory&quot;,&quot;startUtcDate&quot;:&quot;2016-02-13T12:01:11Z&quot;,&quot;endUtcDate&quot;:&quot;2016-02-13T12:02:00Z&quot;,&quot;processingStatus&quot;:&quot;Done&quot;,&quot;exportedProducts&quot;:10142,&quot;transmittedItems&quot;:10042,&quot;publishedItems&quot;:10041,&quot;publishedItemsWithWarning&quot;:123,&quot;failedItems&quot;:1,&quot;errorMessage&quot;:&quot;&quot;,&quot;htmlReportUrl&quot;:&quot;http://www.myreporthtml.com&quot;,&quot;htmlReportGenerationErrorMessage&quot;:&quot;&quot;},{&quot;feedType&quot;:&quot;Pricing&quot;,&quot;startUtcDate&quot;:&quot;2016-02-13T12:01:11Z&quot;,&quot;processingStatus&quot;:&quot;InProgress&quot;,&quot;exportedProducts&quot;:10142,&quot;transmittedItems&quot;:10042,&quot;publishedItems&quot;:10041,&quot;publishedItemsWithWarning&quot;:123,&quot;failedItems&quot;:1,&quot;errorMessage&quot;:&quot;&quot;,&quot;htmlReportUrl&quot;:&quot;http://www.myreporthtml.com&quot;,&quot;htmlReportGenerationErrorMessage&quot;:&quot;&quot;}]}]", required = true, value = "The recent publications for the requested account")
  public List<PublicationReporting> getPublications() {
    return publications;
  }

  public void setPublications(List<PublicationReporting> publications) {
    this.publications = publications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPublications accountPublications = (AccountPublications) o;
    return Objects.equals(this.links, accountPublications.links) &&
        Objects.equals(this.publications, accountPublications.publications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, publications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPublications {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
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

