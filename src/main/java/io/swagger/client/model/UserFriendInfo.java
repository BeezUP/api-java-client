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
import io.swagger.client.model.FriendCountryIsoCodeAlpha3;
import io.swagger.client.model.FriendEmail;
import io.swagger.client.model.FriendProfilePictureUrl;

/**
 * UserFriendInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:22:45.227Z")
public class UserFriendInfo {
  @SerializedName("userId")
  private String userId = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("email")
  private FriendEmail email = null;

  @SerializedName("profilePictureUrl")
  private FriendProfilePictureUrl profilePictureUrl = null;

  @SerializedName("countryIsoCodeAlpha3")
  private FriendCountryIsoCodeAlpha3 countryIsoCodeAlpha3 = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("whatIDo")
  private String whatIDo = null;

  public UserFriendInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Your friend's user id
   * @return userId
  **/
  @ApiModelProperty(example = "00c4a9d2-fc8e-4b3d-8e52-c4f276245bc1", required = true, value = "Your friend's user id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserFriendInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Your friend's user last name
   * @return lastName
  **/
  @ApiModelProperty(example = "Humphrey", required = true, value = "Your friend's user last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserFriendInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Your friend's user first name
   * @return firstName
  **/
  @ApiModelProperty(example = "Bogart", required = true, value = "Your friend's user first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserFriendInfo email(FriendEmail email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public FriendEmail getEmail() {
    return email;
  }

  public void setEmail(FriendEmail email) {
    this.email = email;
  }

  public UserFriendInfo profilePictureUrl(FriendProfilePictureUrl profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
    return this;
  }

   /**
   * Get profilePictureUrl
   * @return profilePictureUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public FriendProfilePictureUrl getProfilePictureUrl() {
    return profilePictureUrl;
  }

  public void setProfilePictureUrl(FriendProfilePictureUrl profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
  }

  public UserFriendInfo countryIsoCodeAlpha3(FriendCountryIsoCodeAlpha3 countryIsoCodeAlpha3) {
    this.countryIsoCodeAlpha3 = countryIsoCodeAlpha3;
    return this;
  }

   /**
   * Get countryIsoCodeAlpha3
   * @return countryIsoCodeAlpha3
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public FriendCountryIsoCodeAlpha3 getCountryIsoCodeAlpha3() {
    return countryIsoCodeAlpha3;
  }

  public void setCountryIsoCodeAlpha3(FriendCountryIsoCodeAlpha3 countryIsoCodeAlpha3) {
    this.countryIsoCodeAlpha3 = countryIsoCodeAlpha3;
  }

  public UserFriendInfo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Your friend's user company name
   * @return company
  **/
  @ApiModelProperty(example = "World company", required = true, value = "Your friend's user company name")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public UserFriendInfo whatIDo(String whatIDo) {
    this.whatIDo = whatIDo;
    return this;
  }

   /**
   * Your friend's user occupation in his company
   * @return whatIDo
  **/
  @ApiModelProperty(example = "I&#39;m an actor...", required = true, value = "Your friend's user occupation in his company")
  public String getWhatIDo() {
    return whatIDo;
  }

  public void setWhatIDo(String whatIDo) {
    this.whatIDo = whatIDo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFriendInfo userFriendInfo = (UserFriendInfo) o;
    return Objects.equals(this.userId, userFriendInfo.userId) &&
        Objects.equals(this.lastName, userFriendInfo.lastName) &&
        Objects.equals(this.firstName, userFriendInfo.firstName) &&
        Objects.equals(this.email, userFriendInfo.email) &&
        Objects.equals(this.profilePictureUrl, userFriendInfo.profilePictureUrl) &&
        Objects.equals(this.countryIsoCodeAlpha3, userFriendInfo.countryIsoCodeAlpha3) &&
        Objects.equals(this.company, userFriendInfo.company) &&
        Objects.equals(this.whatIDo, userFriendInfo.whatIDo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, lastName, firstName, email, profilePictureUrl, countryIsoCodeAlpha3, company, whatIDo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFriendInfo {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    profilePictureUrl: ").append(toIndentedString(profilePictureUrl)).append("\n");
    sb.append("    countryIsoCodeAlpha3: ").append(toIndentedString(countryIsoCodeAlpha3)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    whatIDo: ").append(toIndentedString(whatIDo)).append("\n");
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

