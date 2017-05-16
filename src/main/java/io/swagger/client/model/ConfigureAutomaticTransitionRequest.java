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
import io.swagger.client.model.AutomaticTransition;
import java.util.ArrayList;
import java.util.List;

/**
 * ConfigureAutomaticTransitionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T08:52:56.733Z")
public class ConfigureAutomaticTransitionRequest {
  @SerializedName("automaticTransitions")
  private List<AutomaticTransition> automaticTransitions = new ArrayList<AutomaticTransition>();

  public ConfigureAutomaticTransitionRequest automaticTransitions(List<AutomaticTransition> automaticTransitions) {
    this.automaticTransitions = automaticTransitions;
    return this;
  }

  public ConfigureAutomaticTransitionRequest addAutomaticTransitionsItem(AutomaticTransition automaticTransitionsItem) {
    this.automaticTransitions.add(automaticTransitionsItem);
    return this;
  }

   /**
   * Get automaticTransitions
   * @return automaticTransitions
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<AutomaticTransition> getAutomaticTransitions() {
    return automaticTransitions;
  }

  public void setAutomaticTransitions(List<AutomaticTransition> automaticTransitions) {
    this.automaticTransitions = automaticTransitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureAutomaticTransitionRequest configureAutomaticTransitionRequest = (ConfigureAutomaticTransitionRequest) o;
    return Objects.equals(this.automaticTransitions, configureAutomaticTransitionRequest.automaticTransitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticTransitions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureAutomaticTransitionRequest {\n");
    
    sb.append("    automaticTransitions: ").append(toIndentedString(automaticTransitions)).append("\n");
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

