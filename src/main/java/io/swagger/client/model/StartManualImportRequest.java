/*
 * BeezUP API
 * This API will allow you to create your account and to get your tokens. \\ If you lost your password, you have an operation to get it back. 
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
import io.swagger.client.model.DuplicateProductValueConfiguration;
import io.swagger.client.model.InputConfiguration;

/**
 * The message request start a manual importation process.  Indicate the way to handle duplicate product. Can be null if you want to reuse the configuration of the previous importation succeed.
 */
@ApiModel(description = "The message request start a manual importation process.  Indicate the way to handle duplicate product. Can be null if you want to reuse the configuration of the previous importation succeed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class StartManualImportRequest {
  @SerializedName("input")
  private InputConfiguration input = null;

  @SerializedName("duplicateProductSkuConfiguration")
  private DuplicateProductValueConfiguration duplicateProductSkuConfiguration = null;

  public StartManualImportRequest input(InputConfiguration input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public InputConfiguration getInput() {
    return input;
  }

  public void setInput(InputConfiguration input) {
    this.input = input;
  }

  public StartManualImportRequest duplicateProductSkuConfiguration(DuplicateProductValueConfiguration duplicateProductSkuConfiguration) {
    this.duplicateProductSkuConfiguration = duplicateProductSkuConfiguration;
    return this;
  }

   /**
   * Get duplicateProductSkuConfiguration
   * @return duplicateProductSkuConfiguration
  **/
  @ApiModelProperty(example = "null", value = "")
  public DuplicateProductValueConfiguration getDuplicateProductSkuConfiguration() {
    return duplicateProductSkuConfiguration;
  }

  public void setDuplicateProductSkuConfiguration(DuplicateProductValueConfiguration duplicateProductSkuConfiguration) {
    this.duplicateProductSkuConfiguration = duplicateProductSkuConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartManualImportRequest startManualImportRequest = (StartManualImportRequest) o;
    return Objects.equals(this.input, startManualImportRequest.input) &&
        Objects.equals(this.duplicateProductSkuConfiguration, startManualImportRequest.duplicateProductSkuConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, duplicateProductSkuConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartManualImportRequest {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    duplicateProductSkuConfiguration: ").append(toIndentedString(duplicateProductSkuConfiguration)).append("\n");
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

