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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ImportationTechnicalProgression
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T13:54:25.397Z")
public class ImportationTechnicalProgression {
  @SerializedName("stepsProgression")
  private Map<String, List<String>> stepsProgression = new HashMap<String, List<String>>();

  public ImportationTechnicalProgression stepsProgression(Map<String, List<String>> stepsProgression) {
    this.stepsProgression = stepsProgression;
    return this;
  }

  public ImportationTechnicalProgression putStepsProgressionItem(String key, List<String> stepsProgressionItem) {
    this.stepsProgression.put(key, stepsProgressionItem);
    return this;
  }

   /**
   * Indicate for each step of the importation the uris to look at
   * @return stepsProgression
  **/
  @ApiModelProperty(example = "null", value = "Indicate for each step of the importation the uris to look at")
  public Map<String, List<String>> getStepsProgression() {
    return stepsProgression;
  }

  public void setStepsProgression(Map<String, List<String>> stepsProgression) {
    this.stepsProgression = stepsProgression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportationTechnicalProgression importationTechnicalProgression = (ImportationTechnicalProgression) o;
    return Objects.equals(this.stepsProgression, importationTechnicalProgression.stepsProgression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepsProgression);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportationTechnicalProgression {\n");
    
    sb.append("    stepsProgression: ").append(toIndentedString(stepsProgression)).append("\n");
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

