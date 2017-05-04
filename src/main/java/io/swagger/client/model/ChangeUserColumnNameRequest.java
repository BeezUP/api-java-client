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
import io.swagger.client.model.UserColumName;

/**
 * The message request for the change user column name
 */
@ApiModel(description = "The message request for the change user column name")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T10:49:46.695Z")
public class ChangeUserColumnNameRequest {
  @SerializedName("userColumName")
  private UserColumName userColumName = null;

  public ChangeUserColumnNameRequest userColumName(UserColumName userColumName) {
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
    ChangeUserColumnNameRequest changeUserColumnNameRequest = (ChangeUserColumnNameRequest) o;
    return Objects.equals(this.userColumName, changeUserColumnNameRequest.userColumName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userColumName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeUserColumnNameRequest {\n");
    
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

