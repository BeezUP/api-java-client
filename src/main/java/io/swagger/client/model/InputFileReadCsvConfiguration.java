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
 * The CSV file description
 */
@ApiModel(description = "The CSV file description")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:40:14.157Z")
public class InputFileReadCsvConfiguration {
  @SerializedName("hasHeaderRecord")
  private Boolean hasHeaderRecord = true;

  @SerializedName("ignoreHeaderRecord")
  private Boolean ignoreHeaderRecord = false;

  @SerializedName("csvSeparator")
  private String csvSeparator = ";";

  @SerializedName("csvTextQualifier")
  private String csvTextQualifier = "\"";

  public InputFileReadCsvConfiguration hasHeaderRecord(Boolean hasHeaderRecord) {
    this.hasHeaderRecord = hasHeaderRecord;
    return this;
  }

   /**
   * Indicate if the csv file contains the column name at the first row
   * @return hasHeaderRecord
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicate if the csv file contains the column name at the first row")
  public Boolean getHasHeaderRecord() {
    return hasHeaderRecord;
  }

  public void setHasHeaderRecord(Boolean hasHeaderRecord) {
    this.hasHeaderRecord = hasHeaderRecord;
  }

  public InputFileReadCsvConfiguration ignoreHeaderRecord(Boolean ignoreHeaderRecord) {
    this.ignoreHeaderRecord = ignoreHeaderRecord;
    return this;
  }

   /**
   * Indicate if the importation should not use the csv column name from the file
   * @return ignoreHeaderRecord
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicate if the importation should not use the csv column name from the file")
  public Boolean getIgnoreHeaderRecord() {
    return ignoreHeaderRecord;
  }

  public void setIgnoreHeaderRecord(Boolean ignoreHeaderRecord) {
    this.ignoreHeaderRecord = ignoreHeaderRecord;
  }

  public InputFileReadCsvConfiguration csvSeparator(String csvSeparator) {
    this.csvSeparator = csvSeparator;
    return this;
  }

   /**
   * Indicate the separator of the values in the CSV file. Generally \";\"
   * @return csvSeparator
  **/
  @ApiModelProperty(example = ";", required = true, value = "Indicate the separator of the values in the CSV file. Generally \";\"")
  public String getCsvSeparator() {
    return csvSeparator;
  }

  public void setCsvSeparator(String csvSeparator) {
    this.csvSeparator = csvSeparator;
  }

  public InputFileReadCsvConfiguration csvTextQualifier(String csvTextQualifier) {
    this.csvTextQualifier = csvTextQualifier;
    return this;
  }

   /**
   * Indicate the text qualifier of the CSV file. Generally the value is \"
   * @return csvTextQualifier
  **/
  @ApiModelProperty(example = "&quot;", required = true, value = "Indicate the text qualifier of the CSV file. Generally the value is \"")
  public String getCsvTextQualifier() {
    return csvTextQualifier;
  }

  public void setCsvTextQualifier(String csvTextQualifier) {
    this.csvTextQualifier = csvTextQualifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputFileReadCsvConfiguration inputFileReadCsvConfiguration = (InputFileReadCsvConfiguration) o;
    return Objects.equals(this.hasHeaderRecord, inputFileReadCsvConfiguration.hasHeaderRecord) &&
        Objects.equals(this.ignoreHeaderRecord, inputFileReadCsvConfiguration.ignoreHeaderRecord) &&
        Objects.equals(this.csvSeparator, inputFileReadCsvConfiguration.csvSeparator) &&
        Objects.equals(this.csvTextQualifier, inputFileReadCsvConfiguration.csvTextQualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasHeaderRecord, ignoreHeaderRecord, csvSeparator, csvTextQualifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputFileReadCsvConfiguration {\n");
    
    sb.append("    hasHeaderRecord: ").append(toIndentedString(hasHeaderRecord)).append("\n");
    sb.append("    ignoreHeaderRecord: ").append(toIndentedString(ignoreHeaderRecord)).append("\n");
    sb.append("    csvSeparator: ").append(toIndentedString(csvSeparator)).append("\n");
    sb.append("    csvTextQualifier: ").append(toIndentedString(csvTextQualifier)).append("\n");
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

