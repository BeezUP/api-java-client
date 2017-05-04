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
 * Describe the way you have to follow to get access to the LOV
 */
@ApiModel(description = "Describe the way you have to follow to get access to the LOV")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T10:49:46.695Z")
public class BeezUPCommonLOVLink2 {
  @SerializedName("rel")
  private String rel = null;

  @SerializedName("href")
  private String href = "/v2/user/{listName}";

  @SerializedName("listName")
  private String listName = null;

  public BeezUPCommonLOVLink2 rel(String rel) {
    this.rel = rel;
    return this;
  }

   /**
   * Indicate the relation name related to the link
   * @return rel
  **/
  @ApiModelProperty(example = "LOV_Go2CultureName", value = "Indicate the relation name related to the link")
  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public BeezUPCommonLOVLink2 href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Indicate the relative uri pattern to the list of value
   * @return href
  **/
  @ApiModelProperty(example = "/v2/public/{listName}", value = "Indicate the relative uri pattern to the list of value")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public BeezUPCommonLOVLink2 listName(String listName) {
    this.listName = listName;
    return this;
  }

   /**
   * The name of the list of value
   * @return listName
  **/
  @ApiModelProperty(example = "Go2CultureName", required = true, value = "The name of the list of value")
  public String getListName() {
    return listName;
  }

  public void setListName(String listName) {
    this.listName = listName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonLOVLink2 beezUPCommonLOVLink2 = (BeezUPCommonLOVLink2) o;
    return Objects.equals(this.rel, beezUPCommonLOVLink2.rel) &&
        Objects.equals(this.href, beezUPCommonLOVLink2.href) &&
        Objects.equals(this.listName, beezUPCommonLOVLink2.listName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel, href, listName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonLOVLink2 {\n");
    
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
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

