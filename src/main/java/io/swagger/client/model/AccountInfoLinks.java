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
import io.swagger.client.model.LinksChangePasswordLink;
import io.swagger.client.model.LinksGetCreditCardInfoLink;
import io.swagger.client.model.LinksGetProfilePictureInfoLink;
import io.swagger.client.model.LinksSaveCompanyInfoLink;
import io.swagger.client.model.LinksSaveCreditCardInfoLink;
import io.swagger.client.model.LinksSavePersonalInfoLink;
import io.swagger.client.model.LinksSaveProfilePictureInfoLink;

/**
 * The different actions you can make on this account
 */
@ApiModel(description = "The different actions you can make on this account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:58:38.338Z")
public class AccountInfoLinks {
  @SerializedName("savePersonalInfo")
  private LinksSavePersonalInfoLink savePersonalInfo = null;

  @SerializedName("changePassword")
  private LinksChangePasswordLink changePassword = null;

  @SerializedName("saveCompanyInfo")
  private LinksSaveCompanyInfoLink saveCompanyInfo = null;

  @SerializedName("getProfilePictureInfo")
  private LinksGetProfilePictureInfoLink getProfilePictureInfo = null;

  @SerializedName("saveProfilePictureInfo")
  private LinksSaveProfilePictureInfoLink saveProfilePictureInfo = null;

  @SerializedName("getCreditCardInfo")
  private LinksGetCreditCardInfoLink getCreditCardInfo = null;

  @SerializedName("saveUserCreditCardLink")
  private LinksSaveCreditCardInfoLink saveUserCreditCardLink = null;

  public AccountInfoLinks savePersonalInfo(LinksSavePersonalInfoLink savePersonalInfo) {
    this.savePersonalInfo = savePersonalInfo;
    return this;
  }

   /**
   * Get savePersonalInfo
   * @return savePersonalInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksSavePersonalInfoLink getSavePersonalInfo() {
    return savePersonalInfo;
  }

  public void setSavePersonalInfo(LinksSavePersonalInfoLink savePersonalInfo) {
    this.savePersonalInfo = savePersonalInfo;
  }

  public AccountInfoLinks changePassword(LinksChangePasswordLink changePassword) {
    this.changePassword = changePassword;
    return this;
  }

   /**
   * Get changePassword
   * @return changePassword
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksChangePasswordLink getChangePassword() {
    return changePassword;
  }

  public void setChangePassword(LinksChangePasswordLink changePassword) {
    this.changePassword = changePassword;
  }

  public AccountInfoLinks saveCompanyInfo(LinksSaveCompanyInfoLink saveCompanyInfo) {
    this.saveCompanyInfo = saveCompanyInfo;
    return this;
  }

   /**
   * Get saveCompanyInfo
   * @return saveCompanyInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksSaveCompanyInfoLink getSaveCompanyInfo() {
    return saveCompanyInfo;
  }

  public void setSaveCompanyInfo(LinksSaveCompanyInfoLink saveCompanyInfo) {
    this.saveCompanyInfo = saveCompanyInfo;
  }

  public AccountInfoLinks getProfilePictureInfo(LinksGetProfilePictureInfoLink getProfilePictureInfo) {
    this.getProfilePictureInfo = getProfilePictureInfo;
    return this;
  }

   /**
   * Get getProfilePictureInfo
   * @return getProfilePictureInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetProfilePictureInfoLink getGetProfilePictureInfo() {
    return getProfilePictureInfo;
  }

  public void setGetProfilePictureInfo(LinksGetProfilePictureInfoLink getProfilePictureInfo) {
    this.getProfilePictureInfo = getProfilePictureInfo;
  }

  public AccountInfoLinks saveProfilePictureInfo(LinksSaveProfilePictureInfoLink saveProfilePictureInfo) {
    this.saveProfilePictureInfo = saveProfilePictureInfo;
    return this;
  }

   /**
   * Get saveProfilePictureInfo
   * @return saveProfilePictureInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksSaveProfilePictureInfoLink getSaveProfilePictureInfo() {
    return saveProfilePictureInfo;
  }

  public void setSaveProfilePictureInfo(LinksSaveProfilePictureInfoLink saveProfilePictureInfo) {
    this.saveProfilePictureInfo = saveProfilePictureInfo;
  }

  public AccountInfoLinks getCreditCardInfo(LinksGetCreditCardInfoLink getCreditCardInfo) {
    this.getCreditCardInfo = getCreditCardInfo;
    return this;
  }

   /**
   * Get getCreditCardInfo
   * @return getCreditCardInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetCreditCardInfoLink getGetCreditCardInfo() {
    return getCreditCardInfo;
  }

  public void setGetCreditCardInfo(LinksGetCreditCardInfoLink getCreditCardInfo) {
    this.getCreditCardInfo = getCreditCardInfo;
  }

  public AccountInfoLinks saveUserCreditCardLink(LinksSaveCreditCardInfoLink saveUserCreditCardLink) {
    this.saveUserCreditCardLink = saveUserCreditCardLink;
    return this;
  }

   /**
   * Get saveUserCreditCardLink
   * @return saveUserCreditCardLink
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksSaveCreditCardInfoLink getSaveUserCreditCardLink() {
    return saveUserCreditCardLink;
  }

  public void setSaveUserCreditCardLink(LinksSaveCreditCardInfoLink saveUserCreditCardLink) {
    this.saveUserCreditCardLink = saveUserCreditCardLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInfoLinks accountInfoLinks = (AccountInfoLinks) o;
    return Objects.equals(this.savePersonalInfo, accountInfoLinks.savePersonalInfo) &&
        Objects.equals(this.changePassword, accountInfoLinks.changePassword) &&
        Objects.equals(this.saveCompanyInfo, accountInfoLinks.saveCompanyInfo) &&
        Objects.equals(this.getProfilePictureInfo, accountInfoLinks.getProfilePictureInfo) &&
        Objects.equals(this.saveProfilePictureInfo, accountInfoLinks.saveProfilePictureInfo) &&
        Objects.equals(this.getCreditCardInfo, accountInfoLinks.getCreditCardInfo) &&
        Objects.equals(this.saveUserCreditCardLink, accountInfoLinks.saveUserCreditCardLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savePersonalInfo, changePassword, saveCompanyInfo, getProfilePictureInfo, saveProfilePictureInfo, getCreditCardInfo, saveUserCreditCardLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInfoLinks {\n");
    
    sb.append("    savePersonalInfo: ").append(toIndentedString(savePersonalInfo)).append("\n");
    sb.append("    changePassword: ").append(toIndentedString(changePassword)).append("\n");
    sb.append("    saveCompanyInfo: ").append(toIndentedString(saveCompanyInfo)).append("\n");
    sb.append("    getProfilePictureInfo: ").append(toIndentedString(getProfilePictureInfo)).append("\n");
    sb.append("    saveProfilePictureInfo: ").append(toIndentedString(saveProfilePictureInfo)).append("\n");
    sb.append("    getCreditCardInfo: ").append(toIndentedString(getCreditCardInfo)).append("\n");
    sb.append("    saveUserCreditCardLink: ").append(toIndentedString(saveUserCreditCardLink)).append("\n");
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

