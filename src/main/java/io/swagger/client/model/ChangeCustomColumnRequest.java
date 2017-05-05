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
import io.swagger.client.model.EncryptedBlocklyExpression;
import io.swagger.client.model.EncryptedExpression;
import io.swagger.client.model.UserColumName;

/**
 * The message request to change a custom column expression an user name
 */
@ApiModel(description = "The message request to change a custom column expression an user name")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:14:33.629Z")
public class ChangeCustomColumnRequest {
  @SerializedName("encryptedExpression")
  private EncryptedExpression encryptedExpression = null;

  @SerializedName("encryptedBlocklyExpression")
  private EncryptedBlocklyExpression encryptedBlocklyExpression = null;

  @SerializedName("userColumName")
  private UserColumName userColumName = null;

  public ChangeCustomColumnRequest encryptedExpression(EncryptedExpression encryptedExpression) {
    this.encryptedExpression = encryptedExpression;
    return this;
  }

   /**
   * Get encryptedExpression
   * @return encryptedExpression
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EncryptedExpression getEncryptedExpression() {
    return encryptedExpression;
  }

  public void setEncryptedExpression(EncryptedExpression encryptedExpression) {
    this.encryptedExpression = encryptedExpression;
  }

  public ChangeCustomColumnRequest encryptedBlocklyExpression(EncryptedBlocklyExpression encryptedBlocklyExpression) {
    this.encryptedBlocklyExpression = encryptedBlocklyExpression;
    return this;
  }

   /**
   * Get encryptedBlocklyExpression
   * @return encryptedBlocklyExpression
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EncryptedBlocklyExpression getEncryptedBlocklyExpression() {
    return encryptedBlocklyExpression;
  }

  public void setEncryptedBlocklyExpression(EncryptedBlocklyExpression encryptedBlocklyExpression) {
    this.encryptedBlocklyExpression = encryptedBlocklyExpression;
  }

  public ChangeCustomColumnRequest userColumName(UserColumName userColumName) {
    this.userColumName = userColumName;
    return this;
  }

   /**
   * Get userColumName
   * @return userColumName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public UserColumName getUserColumName() {
    return userColumName;
  }

  public void setUserColumName(UserColumName userColumName) {
    this.userColumName = userColumName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeCustomColumnRequest changeCustomColumnRequest = (ChangeCustomColumnRequest) o;
    return Objects.equals(this.encryptedExpression, changeCustomColumnRequest.encryptedExpression) &&
        Objects.equals(this.encryptedBlocklyExpression, changeCustomColumnRequest.encryptedBlocklyExpression) &&
        Objects.equals(this.userColumName, changeCustomColumnRequest.userColumName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedExpression, encryptedBlocklyExpression, userColumName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeCustomColumnRequest {\n");
    
    sb.append("    encryptedExpression: ").append(toIndentedString(encryptedExpression)).append("\n");
    sb.append("    encryptedBlocklyExpression: ").append(toIndentedString(encryptedBlocklyExpression)).append("\n");
    sb.append("    userColumName: ").append(toIndentedString(userColumName)).append("\n");
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

