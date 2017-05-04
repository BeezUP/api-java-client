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
import io.swagger.client.model.BeezUPCommonDocUrl;
import io.swagger.client.model.BeezUPCommonUserErrorMessageArguments;
import java.util.ArrayList;
import java.util.List;

/**
 * BeezUPCommonUserErrorMessage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:19:12.808Z")
public class BeezUPCommonUserErrorMessage {
  @SerializedName("docUrl")
  private BeezUPCommonDocUrl docUrl = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("cultureName")
  private String cultureName = null;

  @SerializedName("arguments")
  private List<BeezUPCommonUserErrorMessageArguments> arguments = new ArrayList<BeezUPCommonUserErrorMessageArguments>();

  public BeezUPCommonUserErrorMessage docUrl(BeezUPCommonDocUrl docUrl) {
    this.docUrl = docUrl;
    return this;
  }

   /**
   * Get docUrl
   * @return docUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonDocUrl getDocUrl() {
    return docUrl;
  }

  public void setDocUrl(BeezUPCommonDocUrl docUrl) {
    this.docUrl = docUrl;
  }

  public BeezUPCommonUserErrorMessage code(String code) {
    this.code = code;
    return this;
  }

   /**
   * the error code. The error code can be a pattern containing the argument's name
   * @return code
  **/
  @ApiModelProperty(example = "CatalogImportationAlreadyInProgress(ExecutionId currentCatalogImportationId)", required = true, value = "the error code. The error code can be a pattern containing the argument's name")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BeezUPCommonUserErrorMessage message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The error message
   * @return message
  **/
  @ApiModelProperty(example = "There is already an importation in progress: b24d0dd8-a561-478a-9b26-34f573f03527
", required = true, value = "The error message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BeezUPCommonUserErrorMessage cultureName(String cultureName) {
    this.cultureName = cultureName;
    return this;
  }

   /**
   * If the error is translated, the culture name will be indicated
   * @return cultureName
  **/
  @ApiModelProperty(example = "en", value = "If the error is translated, the culture name will be indicated")
  public String getCultureName() {
    return cultureName;
  }

  public void setCultureName(String cultureName) {
    this.cultureName = cultureName;
  }

  public BeezUPCommonUserErrorMessage arguments(List<BeezUPCommonUserErrorMessageArguments> arguments) {
    this.arguments = arguments;
    return this;
  }

  public BeezUPCommonUserErrorMessage addArgumentsItem(BeezUPCommonUserErrorMessageArguments argumentsItem) {
    this.arguments.add(argumentsItem);
    return this;
  }

   /**
   * a dictionary string/object
   * @return arguments
  **/
  @ApiModelProperty(example = "null", value = "a dictionary string/object")
  public List<BeezUPCommonUserErrorMessageArguments> getArguments() {
    return arguments;
  }

  public void setArguments(List<BeezUPCommonUserErrorMessageArguments> arguments) {
    this.arguments = arguments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonUserErrorMessage beezUPCommonUserErrorMessage = (BeezUPCommonUserErrorMessage) o;
    return Objects.equals(this.docUrl, beezUPCommonUserErrorMessage.docUrl) &&
        Objects.equals(this.code, beezUPCommonUserErrorMessage.code) &&
        Objects.equals(this.message, beezUPCommonUserErrorMessage.message) &&
        Objects.equals(this.cultureName, beezUPCommonUserErrorMessage.cultureName) &&
        Objects.equals(this.arguments, beezUPCommonUserErrorMessage.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docUrl, code, message, cultureName, arguments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonUserErrorMessage {\n");
    
    sb.append("    docUrl: ").append(toIndentedString(docUrl)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

