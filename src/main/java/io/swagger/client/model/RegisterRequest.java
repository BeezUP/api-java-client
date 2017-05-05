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
import java.util.UUID;

/**
 * RegisterRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:15:23.720Z")
public class RegisterRequest {
  @SerializedName("email")
  private String email = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("cultureName")
  private String cultureName = null;

  @SerializedName("commercialOwnerUserId")
  private UUID commercialOwnerUserId = null;

  public RegisterRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Your email. We refuse disposable email.
   * @return email
  **/
  @ApiModelProperty(example = "myemail@mycompany.com", required = true, value = "Your email. We refuse disposable email.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public RegisterRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password you want to use for your new account. \\ The password length must be greater or equals to 6 and lower or equals to 128. \\ The password must contains at least one number and one special character 
   * @return password
  **/
  @ApiModelProperty(example = "I@mW0nder$Full", required = true, value = "The password you want to use for your new account. \\ The password length must be greater or equals to 6 and lower or equals to 128. \\ The password must contains at least one number and one special character ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public RegisterRequest cultureName(String cultureName) {
    this.cultureName = cultureName;
    return this;
  }

   /**
   * Can be null. Default: en-GB. The culture name you want to use. FYI. \\ The email activation will use this culture. 
   * @return cultureName
  **/
  @ApiModelProperty(example = "en-GB", value = "Can be null. Default: en-GB. The culture name you want to use. FYI. \\ The email activation will use this culture. ")
  public String getCultureName() {
    return cultureName;
  }

  public void setCultureName(String cultureName) {
    this.cultureName = cultureName;
  }

  public RegisterRequest commercialOwnerUserId(UUID commercialOwnerUserId) {
    this.commercialOwnerUserId = commercialOwnerUserId;
    return this;
  }

   /**
   * The user id of your commercial in BeezUP.
   * @return commercialOwnerUserId
  **/
  @ApiModelProperty(example = "47ea14ab-195d-4f9a-a24e-32c329ee40f6", value = "The user id of your commercial in BeezUP.")
  public UUID getCommercialOwnerUserId() {
    return commercialOwnerUserId;
  }

  public void setCommercialOwnerUserId(UUID commercialOwnerUserId) {
    this.commercialOwnerUserId = commercialOwnerUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterRequest registerRequest = (RegisterRequest) o;
    return Objects.equals(this.email, registerRequest.email) &&
        Objects.equals(this.password, registerRequest.password) &&
        Objects.equals(this.cultureName, registerRequest.cultureName) &&
        Objects.equals(this.commercialOwnerUserId, registerRequest.commercialOwnerUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password, cultureName, commercialOwnerUserId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterRequest {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    commercialOwnerUserId: ").append(toIndentedString(commercialOwnerUserId)).append("\n");
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

