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

/**
 * MapBeezUPColumnRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:57:46.029Z")
public class MapBeezUPColumnRequest {
  @SerializedName("beezUPColumnName")
  private BeezUPCommonBeezUPColumnName beezUPColumnName = null;

  public MapBeezUPColumnRequest beezUPColumnName(BeezUPCommonBeezUPColumnName beezUPColumnName) {
    this.beezUPColumnName = beezUPColumnName;
    return this;
  }

   /**
   * Get beezUPColumnName
   * @return beezUPColumnName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonBeezUPColumnName getBeezUPColumnName() {
    return beezUPColumnName;
  }

  public void setBeezUPColumnName(BeezUPCommonBeezUPColumnName beezUPColumnName) {
    this.beezUPColumnName = beezUPColumnName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapBeezUPColumnRequest mapBeezUPColumnRequest = (MapBeezUPColumnRequest) o;
    return Objects.equals(this.beezUPColumnName, mapBeezUPColumnRequest.beezUPColumnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beezUPColumnName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapBeezUPColumnRequest {\n");
    
    sb.append("    beezUPColumnName: ").append(toIndentedString(beezUPColumnName)).append("\n");
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

