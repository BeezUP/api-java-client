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
import io.swagger.client.model.DisplayGroupName;
import io.swagger.client.model.EncryptedBlocklyExpression;
import io.swagger.client.model.EncryptedExpression;
import io.swagger.client.model.UserColumName;

/**
 * The request message to create a custom column
 */
@ApiModel(description = "The request message to create a custom column")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class CreateCustomColumnRequest {
  @SerializedName("userColumnName")
  private UserColumName userColumnName = null;

  @SerializedName("encryptedExpression")
  private EncryptedExpression encryptedExpression = null;

  @SerializedName("encryptedBlocklyExpression")
  private EncryptedBlocklyExpression encryptedBlocklyExpression = null;

  @SerializedName("displayGroupName")
  private DisplayGroupName displayGroupName = null;

  public CreateCustomColumnRequest userColumnName(UserColumName userColumnName) {
    this.userColumnName = userColumnName;
    return this;
  }

   /**
   * Get userColumnName
   * @return userColumnName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public UserColumName getUserColumnName() {
    return userColumnName;
  }

  public void setUserColumnName(UserColumName userColumnName) {
    this.userColumnName = userColumnName;
  }

  public CreateCustomColumnRequest encryptedExpression(EncryptedExpression encryptedExpression) {
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

  public CreateCustomColumnRequest encryptedBlocklyExpression(EncryptedBlocklyExpression encryptedBlocklyExpression) {
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

  public CreateCustomColumnRequest displayGroupName(DisplayGroupName displayGroupName) {
    this.displayGroupName = displayGroupName;
    return this;
  }

   /**
   * Get displayGroupName
   * @return displayGroupName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DisplayGroupName getDisplayGroupName() {
    return displayGroupName;
  }

  public void setDisplayGroupName(DisplayGroupName displayGroupName) {
    this.displayGroupName = displayGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomColumnRequest createCustomColumnRequest = (CreateCustomColumnRequest) o;
    return Objects.equals(this.userColumnName, createCustomColumnRequest.userColumnName) &&
        Objects.equals(this.encryptedExpression, createCustomColumnRequest.encryptedExpression) &&
        Objects.equals(this.encryptedBlocklyExpression, createCustomColumnRequest.encryptedBlocklyExpression) &&
        Objects.equals(this.displayGroupName, createCustomColumnRequest.displayGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userColumnName, encryptedExpression, encryptedBlocklyExpression, displayGroupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomColumnRequest {\n");
    
    sb.append("    userColumnName: ").append(toIndentedString(userColumnName)).append("\n");
    sb.append("    encryptedExpression: ").append(toIndentedString(encryptedExpression)).append("\n");
    sb.append("    encryptedBlocklyExpression: ").append(toIndentedString(encryptedBlocklyExpression)).append("\n");
    sb.append("    displayGroupName: ").append(toIndentedString(displayGroupName)).append("\n");
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

