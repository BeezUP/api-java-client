/*
 * BeezUP API
 * # The REST API of BeezUP system ## Overview The REST APIs provide programmatic access to read and write BeezUP data.  Basically, with this API you will be able to do everything like you were with your browser on https://go.beezup.com !  The main features are: - Register and manage your account - Create and manage and share your stores with your friends/co-workers. - Import your product catalog and schedule the auto importation - Search the channels your want to use - Configure your channels for your catalogs to export your product information:     - cost and general settings     - category and columns mappings     - your will be able to create and manage your custom column     - put in place exlusion filters based on simple conditions on your product data     - override product values     - get product vision for a channel catalog scope - Analyze and optimize your performance of your catalogs on all yours channels with different type of reportings by day, channel, category and by product. - Automatize your optimisation by using rules! - And of course... Manage your orders harvested from all your marketplaces:     - Synchronize your orders in an uniformized way     - Get the available actions and update the order status - ...and more!  ## Authentication credentials The public API with the base path **_/v2/public** have been put in place to give you an entry point to our system for the user registration, login and lost password. The public API does not require any credentials. We give you the some public list of values and public channels for our public commercial web site [www.beezup.com](http://www.beezup.com).  The user API with the base path **_/v2/user** requires a token which is available on this page: https://go.beezup.com/Account/MyAccount  ## Things to keep in mind ### API Rate Limits - The BeezUP REST API is limited to 100 calls/minute.  ### Media type The default media type for requests and responses is application/json. Where noted, some operations support other content types. If no additional content type is mentioned for a specific operation, then the media type is application/json.  ### Required content type The required and default encoding for the request and responses is UTF8.  ### Required date time format All our date time are formatted in ISO 8601 format: 2014-06-24T16:25:00Z.  ### Base URL The Base URL of the BeezUP API Order Management REST API conforms to the following template.  https://api.beezup.com  All URLs returned by the BeezUP API are relative to this base URL, and all requests to the REST API must use this base URL template.  You can test our API on https://api-docs.beezup.com/swagger-ui\\ You can contact us on [gitter, #BeezUP/API](https://gitter.im/beezUP/API) 
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BeezUPCommonSuccessSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T14:10:42.368Z")
public class BeezUPCommonSuccessSummary {
  @SerializedName("successCode")
  private String successCode = null;

  @SerializedName("successMessage")
  private String successMessage = null;

  @SerializedName("successArguments")
  private Map<String, String> successArguments = new HashMap<String, String>();

  @SerializedName("propertyName")
  private String propertyName = null;

  @SerializedName("propertyValue")
  private String propertyValue = null;

  @SerializedName("objectName")
  private String objectName = null;

  public BeezUPCommonSuccessSummary successCode(String successCode) {
    this.successCode = successCode;
    return this;
  }

   /**
   * Get successCode
   * @return successCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSuccessCode() {
    return successCode;
  }

  public void setSuccessCode(String successCode) {
    this.successCode = successCode;
  }

  public BeezUPCommonSuccessSummary successMessage(String successMessage) {
    this.successMessage = successMessage;
    return this;
  }

   /**
   * Get successMessage
   * @return successMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSuccessMessage() {
    return successMessage;
  }

  public void setSuccessMessage(String successMessage) {
    this.successMessage = successMessage;
  }

  public BeezUPCommonSuccessSummary successArguments(Map<String, String> successArguments) {
    this.successArguments = successArguments;
    return this;
  }

  public BeezUPCommonSuccessSummary putSuccessArgumentsItem(String key, String successArgumentsItem) {
    this.successArguments.put(key, successArgumentsItem);
    return this;
  }

   /**
   * Get successArguments
   * @return successArguments
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getSuccessArguments() {
    return successArguments;
  }

  public void setSuccessArguments(Map<String, String> successArguments) {
    this.successArguments = successArguments;
  }

  public BeezUPCommonSuccessSummary propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

   /**
   * Get propertyName
   * @return propertyName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public BeezUPCommonSuccessSummary propertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
    return this;
  }

   /**
   * Get propertyValue
   * @return propertyValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPropertyValue() {
    return propertyValue;
  }

  public void setPropertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
  }

  public BeezUPCommonSuccessSummary objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

   /**
   * Get objectName
   * @return objectName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonSuccessSummary beezUPCommonSuccessSummary = (BeezUPCommonSuccessSummary) o;
    return Objects.equals(this.successCode, beezUPCommonSuccessSummary.successCode) &&
        Objects.equals(this.successMessage, beezUPCommonSuccessSummary.successMessage) &&
        Objects.equals(this.successArguments, beezUPCommonSuccessSummary.successArguments) &&
        Objects.equals(this.propertyName, beezUPCommonSuccessSummary.propertyName) &&
        Objects.equals(this.propertyValue, beezUPCommonSuccessSummary.propertyValue) &&
        Objects.equals(this.objectName, beezUPCommonSuccessSummary.objectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successCode, successMessage, successArguments, propertyName, propertyValue, objectName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonSuccessSummary {\n");
    
    sb.append("    successCode: ").append(toIndentedString(successCode)).append("\n");
    sb.append("    successMessage: ").append(toIndentedString(successMessage)).append("\n");
    sb.append("    successArguments: ").append(toIndentedString(successArguments)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
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

