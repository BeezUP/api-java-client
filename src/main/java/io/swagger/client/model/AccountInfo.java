/*
 * BeezUP API
 * # The REST API of BeezUP system ## Overview The REST APIs provide programmatic access to read and write BeezUP data.  Basically, with this API you will be able to do everything like you were with your browser on https://go.beezup.com !  The main features are: - Register and manage your account - Create and manage and share your stores with your friends/co-workers. - Import your product catalog and schedule the auto importation - Search the channels your want to use - Configure your channels for your catalogs to export your product information:     - cost and general settings     - category and columns mappings     - your will be able to create and manage your custom column     - put in place exlusion filters based on simple conditions on your product data     - override product values     - get product vision for a channel catalog scope - Analyze and optimize your performance of your catalogs on all yours channels with different type of reportings by day, channel, category and by product. - Automatize your optimisation by using rules! - And of course... Manage your orders harvested from all your marketplaces:     - Synchronize your orders in an uniformized way     - Get the available actions and update the order status - ...and more!  ## Authentication credentials The public API with the base path **_/v2/public** have been put in place to give you an entry point to our system for the user registration, login and lost password. The public API does not require any credentials. We give you the some public list of values and public channels for our public commercial web site [www.beezup.com](http://www.beezup.com).  The user API with the base path **_/v2/user** requires a token which is available on this page: https://go.beezup.com/Account/MyAccount  ## Things to keep in mind ### API Rate Limits - The BeezUP REST API is limited to 100 calls/minute.  ### Media type The default media type for requests and responses is application/json. Where noted, some operations support other content types. If no additional content type is mentioned for a specific operation, then the media type is application/json.  ### Required content type The required and default encoding for the request and responses is UTF8.  ### Required date time format All our date time are formatted in ISO 8601 format: 2014-06-24T16:25:00Z.  ### Base URL The Base URL of the BeezUP API Order Management REST API conforms to the following template.  https://api.beezup.com  All URLs returned by the BeezUP API are relative to this base URL, and all requests to the REST API must use this base URL template.  You can test our API on https://api-docs.beezup.com/swagger-ui\\ You can contact us on [gitter, #BeezUP/API](https://gitter.im/beezUP/API) 
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
import io.swagger.client.model.AccountInfoLinks;
import io.swagger.client.model.AccountStatus;
import io.swagger.client.model.BeezUPCommonEmail;
import io.swagger.client.model.BeezUPCommonInfoSummaries;
import io.swagger.client.model.BeezUPCommonUserId;
import io.swagger.client.model.CompanyInfo;
import io.swagger.client.model.PersonalInfo;
import io.swagger.client.model.ProfilePictureUrl;

/**
 * AccountInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T11:46:19.000Z")
public class AccountInfo {
  @SerializedName("userId")
  private BeezUPCommonUserId userId = null;

  @SerializedName("email")
  private BeezUPCommonEmail email = null;

  @SerializedName("personalInfo")
  private PersonalInfo personalInfo = null;

  @SerializedName("status")
  private AccountStatus status = null;

  @SerializedName("companyInfo")
  private CompanyInfo companyInfo = null;

  @SerializedName("profilePictureUrl")
  private ProfilePictureUrl profilePictureUrl = null;

  @SerializedName("links")
  private AccountInfoLinks links = null;

  @SerializedName("info")
  private BeezUPCommonInfoSummaries info = null;

  public AccountInfo userId(BeezUPCommonUserId userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonUserId getUserId() {
    return userId;
  }

  public void setUserId(BeezUPCommonUserId userId) {
    this.userId = userId;
  }

  public AccountInfo email(BeezUPCommonEmail email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonEmail getEmail() {
    return email;
  }

  public void setEmail(BeezUPCommonEmail email) {
    this.email = email;
  }

  public AccountInfo personalInfo(PersonalInfo personalInfo) {
    this.personalInfo = personalInfo;
    return this;
  }

   /**
   * Get personalInfo
   * @return personalInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PersonalInfo getPersonalInfo() {
    return personalInfo;
  }

  public void setPersonalInfo(PersonalInfo personalInfo) {
    this.personalInfo = personalInfo;
  }

  public AccountInfo status(AccountStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AccountStatus getStatus() {
    return status;
  }

  public void setStatus(AccountStatus status) {
    this.status = status;
  }

  public AccountInfo companyInfo(CompanyInfo companyInfo) {
    this.companyInfo = companyInfo;
    return this;
  }

   /**
   * Get companyInfo
   * @return companyInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CompanyInfo getCompanyInfo() {
    return companyInfo;
  }

  public void setCompanyInfo(CompanyInfo companyInfo) {
    this.companyInfo = companyInfo;
  }

  public AccountInfo profilePictureUrl(ProfilePictureUrl profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
    return this;
  }

   /**
   * Get profilePictureUrl
   * @return profilePictureUrl
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ProfilePictureUrl getProfilePictureUrl() {
    return profilePictureUrl;
  }

  public void setProfilePictureUrl(ProfilePictureUrl profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
  }

  public AccountInfo links(AccountInfoLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AccountInfoLinks getLinks() {
    return links;
  }

  public void setLinks(AccountInfoLinks links) {
    this.links = links;
  }

  public AccountInfo info(BeezUPCommonInfoSummaries info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonInfoSummaries getInfo() {
    return info;
  }

  public void setInfo(BeezUPCommonInfoSummaries info) {
    this.info = info;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInfo accountInfo = (AccountInfo) o;
    return Objects.equals(this.userId, accountInfo.userId) &&
        Objects.equals(this.email, accountInfo.email) &&
        Objects.equals(this.personalInfo, accountInfo.personalInfo) &&
        Objects.equals(this.status, accountInfo.status) &&
        Objects.equals(this.companyInfo, accountInfo.companyInfo) &&
        Objects.equals(this.profilePictureUrl, accountInfo.profilePictureUrl) &&
        Objects.equals(this.links, accountInfo.links) &&
        Objects.equals(this.info, accountInfo.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, email, personalInfo, status, companyInfo, profilePictureUrl, links, info);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInfo {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    personalInfo: ").append(toIndentedString(personalInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    companyInfo: ").append(toIndentedString(companyInfo)).append("\n");
    sb.append("    profilePictureUrl: ").append(toIndentedString(profilePictureUrl)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

