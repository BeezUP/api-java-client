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

/**
 * ChannelInfoTechnicalContact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T17:44:01.940Z")
public class ChannelInfoTechnicalContact {
  @SerializedName("name")
  private String name = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("email")
  private String email = null;

  public ChannelInfoTechnicalContact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The technical contact name
   * @return name
  **/
  @ApiModelProperty(example = "Pierre GuÃ©don", value = "The technical contact name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChannelInfoTechnicalContact phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The technical contact phone number
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "NC", value = "The technical contact phone number")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ChannelInfoTechnicalContact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The technical contact email
   * @return email
  **/
  @ApiModelProperty(example = "pierre.guedon@m6.fr", value = "The technical contact email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelInfoTechnicalContact channelInfoTechnicalContact = (ChannelInfoTechnicalContact) o;
    return Objects.equals(this.name, channelInfoTechnicalContact.name) &&
        Objects.equals(this.phoneNumber, channelInfoTechnicalContact.phoneNumber) &&
        Objects.equals(this.email, channelInfoTechnicalContact.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phoneNumber, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelInfoTechnicalContact {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

