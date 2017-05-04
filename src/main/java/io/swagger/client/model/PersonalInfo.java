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
import io.swagger.client.model.BeezUPTimeZoneId;
import io.swagger.client.model.FirstName;
import io.swagger.client.model.LastName;
import io.swagger.client.model.PhoneNumber;
import io.swagger.client.model.WhatIDo;

/**
 * PersonalInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:19:57.195Z")
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

