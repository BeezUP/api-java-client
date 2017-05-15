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
import io.swagger.client.model.BeezUPTimeZoneId;
import io.swagger.client.model.FirstName;
import io.swagger.client.model.LastName;
import io.swagger.client.model.PhoneNumber;
import io.swagger.client.model.WhatIDo;

/**
 * PersonalInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T11:46:19.000Z")
public class PersonalInfo {
  @SerializedName("lastName")
  private LastName lastName = null;

  @SerializedName("firstName")
  private FirstName firstName = null;

  @SerializedName("phoneNumber")
  private PhoneNumber phoneNumber = null;

  @SerializedName("whatIDo")
  private WhatIDo whatIDo = null;

  @SerializedName("beezUPTimeZoneId")
  private BeezUPTimeZoneId beezUPTimeZoneId = null;

  public PersonalInfo lastName(LastName lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LastName getLastName() {
    return lastName;
  }

  public void setLastName(LastName lastName) {
    this.lastName = lastName;
  }

  public PersonalInfo firstName(FirstName firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public FirstName getFirstName() {
    return firstName;
  }

  public void setFirstName(FirstName firstName) {
    this.firstName = firstName;
  }

  public PersonalInfo phoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public PersonalInfo whatIDo(WhatIDo whatIDo) {
    this.whatIDo = whatIDo;
    return this;
  }

   /**
   * Get whatIDo
   * @return whatIDo
  **/
  @ApiModelProperty(example = "null", value = "")
  public WhatIDo getWhatIDo() {
    return whatIDo;
  }

  public void setWhatIDo(WhatIDo whatIDo) {
    this.whatIDo = whatIDo;
  }

  public PersonalInfo beezUPTimeZoneId(BeezUPTimeZoneId beezUPTimeZoneId) {
    this.beezUPTimeZoneId = beezUPTimeZoneId;
    return this;
  }

   /**
   * Get beezUPTimeZoneId
   * @return beezUPTimeZoneId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPTimeZoneId getBeezUPTimeZoneId() {
    return beezUPTimeZoneId;
  }

  public void setBeezUPTimeZoneId(BeezUPTimeZoneId beezUPTimeZoneId) {
    this.beezUPTimeZoneId = beezUPTimeZoneId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalInfo personalInfo = (PersonalInfo) o;
    return Objects.equals(this.lastName, personalInfo.lastName) &&
        Objects.equals(this.firstName, personalInfo.firstName) &&
        Objects.equals(this.phoneNumber, personalInfo.phoneNumber) &&
        Objects.equals(this.whatIDo, personalInfo.whatIDo) &&
        Objects.equals(this.beezUPTimeZoneId, personalInfo.beezUPTimeZoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastName, firstName, phoneNumber, whatIDo, beezUPTimeZoneId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalInfo {\n");
    
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    whatIDo: ").append(toIndentedString(whatIDo)).append("\n");
    sb.append("    beezUPTimeZoneId: ").append(toIndentedString(beezUPTimeZoneId)).append("\n");
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

