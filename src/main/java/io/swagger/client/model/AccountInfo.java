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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T08:52:56.733Z")
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

