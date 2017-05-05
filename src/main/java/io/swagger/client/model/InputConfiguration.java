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
import io.swagger.client.model.InputFileConfiguration;
import java.util.ArrayList;
import java.util.List;

/**
 * Describe the input configuration
 */
@ApiModel(description = "Describe the input configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:50:41.747Z")
public class InputConfiguration {
  @SerializedName("transformFileUrl")
  private String transformFileUrl = null;

  @SerializedName("files")
  private List<InputFileConfiguration> files = new ArrayList<InputFileConfiguration>();

  public InputConfiguration transformFileUrl(String transformFileUrl) {
    this.transformFileUrl = transformFileUrl;
    return this;
  }

   /**
   * Can be null. Use to transform multiple files with an XSLT file.
   * @return transformFileUrl
  **/
  @ApiModelProperty(example = "http://beezupblob.com/Mytransformation.xslt", value = "Can be null. Use to transform multiple files with an XSLT file.")
  public String getTransformFileUrl() {
    return transformFileUrl;
  }

  public void setTransformFileUrl(String transformFileUrl) {
    this.transformFileUrl = transformFileUrl;
  }

  public InputConfiguration files(List<InputFileConfiguration> files) {
    this.files = files;
    return this;
  }

  public InputConfiguration addFilesItem(InputFileConfiguration filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * The list of files to get and read
   * @return files
  **/
  @ApiModelProperty(example = "null", required = true, value = "The list of files to get and read")
  public List<InputFileConfiguration> getFiles() {
    return files;
  }

  public void setFiles(List<InputFileConfiguration> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputConfiguration inputConfiguration = (InputConfiguration) o;
    return Objects.equals(this.transformFileUrl, inputConfiguration.transformFileUrl) &&
        Objects.equals(this.files, inputConfiguration.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transformFileUrl, files);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputConfiguration {\n");
    
    sb.append("    transformFileUrl: ").append(toIndentedString(transformFileUrl)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

