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

/**
 * The request message to change the custom column expression
 */
@ApiModel(description = "The request message to change the custom column expression")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T12:20:31.147Z")
public class ChangeCustomColumnExpressionRequest {
  @SerializedName("encryptedExpression")
  private EncryptedExpression encryptedExpression = null;

  @SerializedName("encryptedBlocklyExpression")
  private EncryptedBlocklyExpression encryptedBlocklyExpression = null;

  public ChangeCustomColumnExpressionRequest encryptedExpression(EncryptedExpression encryptedExpression) {
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

  public ChangeCustomColumnExpressionRequest encryptedBlocklyExpression(EncryptedBlocklyExpression encryptedBlocklyExpression) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeCustomColumnExpressionRequest changeCustomColumnExpressionRequest = (ChangeCustomColumnExpressionRequest) o;
    return Objects.equals(this.encryptedExpression, changeCustomColumnExpressionRequest.encryptedExpression) &&
        Objects.equals(this.encryptedBlocklyExpression, changeCustomColumnExpressionRequest.encryptedBlocklyExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedExpression, encryptedBlocklyExpression);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeCustomColumnExpressionRequest {\n");
    
    sb.append("    encryptedExpression: ").append(toIndentedString(encryptedExpression)).append("\n");
    sb.append("    encryptedBlocklyExpression: ").append(toIndentedString(encryptedBlocklyExpression)).append("\n");
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

