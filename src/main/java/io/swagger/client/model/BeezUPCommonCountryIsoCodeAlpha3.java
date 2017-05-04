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
import io.swagger.annotations.ApiModel;

/**
 * The country iso code alpha 3 &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3\&quot;&gt;(ISO 3166-1_alpha-3)&lt;/a&gt;
 */
@ApiModel(description = "The country iso code alpha 3 <a href=\"https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3\">(ISO 3166-1_alpha-3)</a>")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T19:25:59.922Z")
public class BeezUPCommonCountryIsoCodeAlpha3 {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonCountryIsoCodeAlpha3 {\n");
    
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

