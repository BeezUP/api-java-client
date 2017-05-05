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
import io.swagger.client.model.BeezUPCommonUserErrorMessage;
import java.util.ArrayList;
import java.util.List;

/**
 * BeezUPCommonErrorResponseMessage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:22:45.227Z")
public class BeezUPCommonErrorResponseMessage {
  @SerializedName("errors")
  private List<BeezUPCommonUserErrorMessage> errors = new ArrayList<BeezUPCommonUserErrorMessage>();

  public BeezUPCommonErrorResponseMessage errors(List<BeezUPCommonUserErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public BeezUPCommonErrorResponseMessage addErrorsItem(BeezUPCommonUserErrorMessage errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<BeezUPCommonUserErrorMessage> getErrors() {
    return errors;
  }

  public void setErrors(List<BeezUPCommonUserErrorMessage> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonErrorResponseMessage beezUPCommonErrorResponseMessage = (BeezUPCommonErrorResponseMessage) o;
    return Objects.equals(this.errors, beezUPCommonErrorResponseMessage.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonErrorResponseMessage {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

