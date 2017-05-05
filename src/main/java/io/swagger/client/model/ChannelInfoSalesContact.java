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
 * ChannelInfoSalesContact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:13:16.265Z")
public class ChannelInfoSalesContact {
  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  public ChannelInfoSalesContact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Indicate the BeezUP offer
   * @return name
  **/
  @ApiModelProperty(example = "StÃ©phanie Gregis", value = "Indicate the BeezUP offer")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChannelInfoSalesContact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Indicate the sales contact email
   * @return email
  **/
  @ApiModelProperty(example = "stephanie.gregis@m6.fr", value = "Indicate the sales contact email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ChannelInfoSalesContact phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The sales contact phone number
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "0033 6 08 87 85 45", value = "The sales contact phone number")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelInfoSalesContact channelInfoSalesContact = (ChannelInfoSalesContact) o;
    return Objects.equals(this.name, channelInfoSalesContact.name) &&
        Objects.equals(this.email, channelInfoSalesContact.email) &&
        Objects.equals(this.phoneNumber, channelInfoSalesContact.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelInfoSalesContact {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

