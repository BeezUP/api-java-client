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
import io.swagger.client.model.BeezUPCommonBeezUPColumnName;
import io.swagger.client.model.ColumnCustomConfiguration;

/**
 * Indicates the configuration applied on the column (catalog or custom) during the importation process. You have to define the BeezUP Column Name property OR the custom configuration property.
 */
@ApiModel(description = "Indicates the configuration applied on the column (catalog or custom) during the importation process. You have to define the BeezUP Column Name property OR the custom configuration property.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T09:59:46.672Z")
public class ColumnConfiguration {
  @SerializedName("beezUPColumnName")
  private BeezUPCommonBeezUPColumnName beezUPColumnName = null;

  @SerializedName("customConfiguration")
  private ColumnCustomConfiguration customConfiguration = null;

  public ColumnConfiguration beezUPColumnName(BeezUPCommonBeezUPColumnName beezUPColumnName) {
    this.beezUPColumnName = beezUPColumnName;
    return this;
  }

   /**
   * Get beezUPColumnName
   * @return beezUPColumnName
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonBeezUPColumnName getBeezUPColumnName() {
    return beezUPColumnName;
  }

  public void setBeezUPColumnName(BeezUPCommonBeezUPColumnName beezUPColumnName) {
    this.beezUPColumnName = beezUPColumnName;
  }

  public ColumnConfiguration customConfiguration(ColumnCustomConfiguration customConfiguration) {
    this.customConfiguration = customConfiguration;
    return this;
  }

   /**
   * Get customConfiguration
   * @return customConfiguration
  **/
  @ApiModelProperty(example = "null", value = "")
  public ColumnCustomConfiguration getCustomConfiguration() {
    return customConfiguration;
  }

  public void setCustomConfiguration(ColumnCustomConfiguration customConfiguration) {
    this.customConfiguration = customConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnConfiguration columnConfiguration = (ColumnConfiguration) o;
    return Objects.equals(this.beezUPColumnName, columnConfiguration.beezUPColumnName) &&
        Objects.equals(this.customConfiguration, columnConfiguration.customConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beezUPColumnName, customConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnConfiguration {\n");
    
    sb.append("    beezUPColumnName: ").append(toIndentedString(beezUPColumnName)).append("\n");
    sb.append("    customConfiguration: ").append(toIndentedString(customConfiguration)).append("\n");
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

