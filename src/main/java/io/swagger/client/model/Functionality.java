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
 * Functionality
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:18:37.107Z")
public class Functionality {
  @SerializedName("code")
  private String code = null;

  @SerializedName("order")
  private Integer order = null;

  public Functionality code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The functionality code
   * @return code
  **/
  @ApiModelProperty(example = "MARKETMANA", value = "The functionality code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Functionality order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * UI purpose: Indicate the position of the functionality
   * @return order
  **/
  @ApiModelProperty(example = "1", value = "UI purpose: Indicate the position of the functionality")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Functionality functionality = (Functionality) o;
    return Objects.equals(this.code, functionality.code) &&
        Objects.equals(this.order, functionality.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Functionality {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

