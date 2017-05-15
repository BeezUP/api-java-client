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
import io.swagger.client.model.InputFileFetchConfiguration;
import io.swagger.client.model.InputFileReadConfiguration;

/**
 * Describe how to get and read a file
 */
@ApiModel(description = "Describe how to get and read a file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T13:43:05.416Z")
public class InputFileConfiguration {
  @SerializedName("fileNumber")
  private Integer fileNumber = null;

  @SerializedName("fetch")
  private InputFileFetchConfiguration fetch = null;

  @SerializedName("read")
  private InputFileReadConfiguration read = null;

  public InputFileConfiguration fileNumber(Integer fileNumber) {
    this.fileNumber = fileNumber;
    return this;
  }

   /**
   * The file number starting by 1
   * minimum: 1
   * @return fileNumber
  **/
  @ApiModelProperty(example = "1", required = true, value = "The file number starting by 1")
  public Integer getFileNumber() {
    return fileNumber;
  }

  public void setFileNumber(Integer fileNumber) {
    this.fileNumber = fileNumber;
  }

  public InputFileConfiguration fetch(InputFileFetchConfiguration fetch) {
    this.fetch = fetch;
    return this;
  }

   /**
   * Get fetch
   * @return fetch
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public InputFileFetchConfiguration getFetch() {
    return fetch;
  }

  public void setFetch(InputFileFetchConfiguration fetch) {
    this.fetch = fetch;
  }

  public InputFileConfiguration read(InputFileReadConfiguration read) {
    this.read = read;
    return this;
  }

   /**
   * Get read
   * @return read
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public InputFileReadConfiguration getRead() {
    return read;
  }

  public void setRead(InputFileReadConfiguration read) {
    this.read = read;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputFileConfiguration inputFileConfiguration = (InputFileConfiguration) o;
    return Objects.equals(this.fileNumber, inputFileConfiguration.fileNumber) &&
        Objects.equals(this.fetch, inputFileConfiguration.fetch) &&
        Objects.equals(this.read, inputFileConfiguration.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileNumber, fetch, read);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputFileConfiguration {\n");
    
    sb.append("    fileNumber: ").append(toIndentedString(fileNumber)).append("\n");
    sb.append("    fetch: ").append(toIndentedString(fetch)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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

