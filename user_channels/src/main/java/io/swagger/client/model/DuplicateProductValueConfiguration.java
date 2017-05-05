/*
 * Catalogs
 * This API allows you to manage your catalogs
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
import io.swagger.client.model.CompareOptions;
import io.swagger.client.model.DuplicateProductValueStrategy;

/**
 * Describe how you
 */
@ApiModel(description = "Describe how you")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:09:47.083Z")
public class DuplicateProductValueConfiguration {
  @SerializedName("strategy")
  private DuplicateProductValueStrategy strategy = null;

  @SerializedName("compareOptions")
  private CompareOptions compareOptions = null;

  public DuplicateProductValueConfiguration strategy(DuplicateProductValueStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DuplicateProductValueStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(DuplicateProductValueStrategy strategy) {
    this.strategy = strategy;
  }

  public DuplicateProductValueConfiguration compareOptions(CompareOptions compareOptions) {
    this.compareOptions = compareOptions;
    return this;
  }

   /**
   * Get compareOptions
   * @return compareOptions
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CompareOptions getCompareOptions() {
    return compareOptions;
  }

  public void setCompareOptions(CompareOptions compareOptions) {
    this.compareOptions = compareOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DuplicateProductValueConfiguration duplicateProductValueConfiguration = (DuplicateProductValueConfiguration) o;
    return Objects.equals(this.strategy, duplicateProductValueConfiguration.strategy) &&
        Objects.equals(this.compareOptions, duplicateProductValueConfiguration.compareOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy, compareOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DuplicateProductValueConfiguration {\n");
    
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    compareOptions: ").append(toIndentedString(compareOptions)).append("\n");
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

