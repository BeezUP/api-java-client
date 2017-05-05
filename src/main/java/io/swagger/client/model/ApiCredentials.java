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
import io.swagger.client.model.ApiCredential;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiCredentials
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:32:45.871Z")
public class ApiCredentials {
  @SerializedName("credentials")
  private List<ApiCredential> credentials = new ArrayList<ApiCredential>();

  public ApiCredentials credentials(List<ApiCredential> credentials) {
    this.credentials = credentials;
    return this;
  }

  public ApiCredentials addCredentialsItem(ApiCredential credentialsItem) {
    this.credentials.add(credentialsItem);
    return this;
  }

   /**
   * Your API credential list
   * @return credentials
  **/
  @ApiModelProperty(example = "[{&quot;productName&quot;:&quot;UserApi&quot;,&quot;primaryToken&quot;:&quot;3b22980d8d1143c6ba7adf4e55b9a153&quot;,&quot;secondaryToken&quot;:&quot;162ae17fd52044c38cce3388ea5b0c91&quot;}]", value = "Your API credential list")
  public List<ApiCredential> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<ApiCredential> credentials) {
    this.credentials = credentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCredentials apiCredentials = (ApiCredentials) o;
    return Objects.equals(this.credentials, apiCredentials.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCredentials {\n");
    
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

