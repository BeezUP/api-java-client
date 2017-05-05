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
 * Your api credential
 */
@ApiModel(description = "Your api credential")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:26:33.625Z")
public class ApiCredential {
  @SerializedName("productName")
  private String productName = null;

  @SerializedName("primaryToken")
  private String primaryToken = null;

  @SerializedName("secondaryToken")
  private String secondaryToken = null;

  public ApiCredential productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * The product name related to this credential
   * @return productName
  **/
  @ApiModelProperty(example = "UserAPI", value = "The product name related to this credential")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public ApiCredential primaryToken(String primaryToken) {
    this.primaryToken = primaryToken;
    return this;
  }

   /**
   * The primary token to be used in the next call in the user scope API
   * @return primaryToken
  **/
  @ApiModelProperty(example = "3b22980d8d1143c6ba7adf4e55b9a153", value = "The primary token to be used in the next call in the user scope API")
  public String getPrimaryToken() {
    return primaryToken;
  }

  public void setPrimaryToken(String primaryToken) {
    this.primaryToken = primaryToken;
  }

  public ApiCredential secondaryToken(String secondaryToken) {
    this.secondaryToken = secondaryToken;
    return this;
  }

   /**
   * The secondary token. Could be usefull if you want to share your access with someone else.
   * @return secondaryToken
  **/
  @ApiModelProperty(example = "162ae17fd52044c38cce3388ea5b0c91", value = "The secondary token. Could be usefull if you want to share your access with someone else.")
  public String getSecondaryToken() {
    return secondaryToken;
  }

  public void setSecondaryToken(String secondaryToken) {
    this.secondaryToken = secondaryToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCredential apiCredential = (ApiCredential) o;
    return Objects.equals(this.productName, apiCredential.productName) &&
        Objects.equals(this.primaryToken, apiCredential.primaryToken) &&
        Objects.equals(this.secondaryToken, apiCredential.secondaryToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productName, primaryToken, secondaryToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCredential {\n");
    
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    primaryToken: ").append(toIndentedString(primaryToken)).append("\n");
    sb.append("    secondaryToken: ").append(toIndentedString(secondaryToken)).append("\n");
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

