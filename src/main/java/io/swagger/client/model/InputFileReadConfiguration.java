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
import io.swagger.client.model.FileFormatStrategy;
import io.swagger.client.model.InputFileReadCsvConfiguration;
import io.swagger.client.model.InputFileReadXmlConfiguration;

/**
 * Describe how to read the file. If FileFormatStrategy is CSV, csvFileReadProperties is required. Otherwise the xmlFileReadProperties is required. 
 */
@ApiModel(description = "Describe how to read the file. If FileFormatStrategy is CSV, csvFileReadProperties is required. Otherwise the xmlFileReadProperties is required. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T09:59:46.672Z")
public class InputFileReadConfiguration {
  @SerializedName("format")
  private FileFormatStrategy format = null;

  @SerializedName("encodingTypeName")
  private String encodingTypeName = "UTF-8";

  @SerializedName("cultureName")
  private String cultureName = "";

  @SerializedName("csvFileReadProperties")
  private InputFileReadCsvConfiguration csvFileReadProperties = null;

  @SerializedName("xmlFileReadProperties")
  private InputFileReadXmlConfiguration xmlFileReadProperties = null;

  public InputFileReadConfiguration format(FileFormatStrategy format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public FileFormatStrategy getFormat() {
    return format;
  }

  public void setFormat(FileFormatStrategy format) {
    this.format = format;
  }

  public InputFileReadConfiguration encodingTypeName(String encodingTypeName) {
    this.encodingTypeName = encodingTypeName;
    return this;
  }

   /**
   * The encoding type. UTF-8 by default.
   * @return encodingTypeName
  **/
  @ApiModelProperty(example = "UTF-8", value = "The encoding type. UTF-8 by default.")
  public String getEncodingTypeName() {
    return encodingTypeName;
  }

  public void setEncodingTypeName(String encodingTypeName) {
    this.encodingTypeName = encodingTypeName;
  }

  public InputFileReadConfiguration cultureName(String cultureName) {
    this.cultureName = cultureName;
    return this;
  }

   /**
   * The culture name of the file.  (i.e. fr-FR). If null then Invariant culture will be used.
   * @return cultureName
  **/
  @ApiModelProperty(example = "fr-FR", value = "The culture name of the file.  (i.e. fr-FR). If null then Invariant culture will be used.")
  public String getCultureName() {
    return cultureName;
  }

  public void setCultureName(String cultureName) {
    this.cultureName = cultureName;
  }

  public InputFileReadConfiguration csvFileReadProperties(InputFileReadCsvConfiguration csvFileReadProperties) {
    this.csvFileReadProperties = csvFileReadProperties;
    return this;
  }

   /**
   * Get csvFileReadProperties
   * @return csvFileReadProperties
  **/
  @ApiModelProperty(example = "null", value = "")
  public InputFileReadCsvConfiguration getCsvFileReadProperties() {
    return csvFileReadProperties;
  }

  public void setCsvFileReadProperties(InputFileReadCsvConfiguration csvFileReadProperties) {
    this.csvFileReadProperties = csvFileReadProperties;
  }

  public InputFileReadConfiguration xmlFileReadProperties(InputFileReadXmlConfiguration xmlFileReadProperties) {
    this.xmlFileReadProperties = xmlFileReadProperties;
    return this;
  }

   /**
   * Get xmlFileReadProperties
   * @return xmlFileReadProperties
  **/
  @ApiModelProperty(example = "null", value = "")
  public InputFileReadXmlConfiguration getXmlFileReadProperties() {
    return xmlFileReadProperties;
  }

  public void setXmlFileReadProperties(InputFileReadXmlConfiguration xmlFileReadProperties) {
    this.xmlFileReadProperties = xmlFileReadProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputFileReadConfiguration inputFileReadConfiguration = (InputFileReadConfiguration) o;
    return Objects.equals(this.format, inputFileReadConfiguration.format) &&
        Objects.equals(this.encodingTypeName, inputFileReadConfiguration.encodingTypeName) &&
        Objects.equals(this.cultureName, inputFileReadConfiguration.cultureName) &&
        Objects.equals(this.csvFileReadProperties, inputFileReadConfiguration.csvFileReadProperties) &&
        Objects.equals(this.xmlFileReadProperties, inputFileReadConfiguration.xmlFileReadProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, encodingTypeName, cultureName, csvFileReadProperties, xmlFileReadProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputFileReadConfiguration {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    encodingTypeName: ").append(toIndentedString(encodingTypeName)).append("\n");
    sb.append("    cultureName: ").append(toIndentedString(cultureName)).append("\n");
    sb.append("    csvFileReadProperties: ").append(toIndentedString(csvFileReadProperties)).append("\n");
    sb.append("    xmlFileReadProperties: ").append(toIndentedString(xmlFileReadProperties)).append("\n");
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

