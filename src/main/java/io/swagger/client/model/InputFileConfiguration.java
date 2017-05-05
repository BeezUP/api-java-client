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
import io.swagger.client.model.InputFileFetchConfiguration;
import io.swagger.client.model.InputFileReadConfiguration;

/**
 * Describe how to get and read a file
 */
@ApiModel(description = "Describe how to get and read a file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:32:45.871Z")
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

