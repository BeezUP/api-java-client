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
 * BeezUPCommonUserErrorMessageArguments
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:27:39.504Z")
public class BeezUPCommonUserErrorMessageArguments {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private Object value = null;

  public BeezUPCommonUserErrorMessageArguments name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The key of the parameter
   * @return name
  **/
  @ApiModelProperty(example = "currentCatalogImportationId", required = true, value = "The key of the parameter")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BeezUPCommonUserErrorMessageArguments value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the parameter. Depending to the type.
   * @return value
  **/
  @ApiModelProperty(example = "&quot;b24d0dd8-a561-478a-9b26-34f573f03527&quot;", required = true, value = "The value of the parameter. Depending to the type.")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonUserErrorMessageArguments beezUPCommonUserErrorMessageArguments = (BeezUPCommonUserErrorMessageArguments) o;
    return Objects.equals(this.name, beezUPCommonUserErrorMessageArguments.name) &&
        Objects.equals(this.value, beezUPCommonUserErrorMessageArguments.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonUserErrorMessageArguments {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

