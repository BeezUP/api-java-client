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
import io.swagger.client.model.Email;

/**
 * LoginRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T09:59:46.672Z")
public class LoginRequest {
  @SerializedName("login")
  private Email login = null;

  @SerializedName("password")
  private String password = null;

  public LoginRequest login(Email login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Email getLogin() {
    return login;
  }

  public void setLogin(Email login) {
    this.login = login;
  }

  public LoginRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Your password
   * @return password
  **/
  @ApiModelProperty(example = "I@mW0nder$Full", required = true, value = "Your password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginRequest loginRequest = (LoginRequest) o;
    return Objects.equals(this.login, loginRequest.login) &&
        Objects.equals(this.password, loginRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginRequest {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

