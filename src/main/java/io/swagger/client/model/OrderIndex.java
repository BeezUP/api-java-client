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
import io.swagger.client.model.OrderIndexLinks;
import io.swagger.client.model.OrderIndexLovLinks;

/**
 * OrderIndex
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:58:06.674Z")
public class OrderIndex {
  @SerializedName("links")
  private OrderIndexLinks links = null;

  @SerializedName("lovLinks")
  private OrderIndexLovLinks lovLinks = null;

  public OrderIndex links(OrderIndexLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public OrderIndexLinks getLinks() {
    return links;
  }

  public void setLinks(OrderIndexLinks links) {
    this.links = links;
  }

  public OrderIndex lovLinks(OrderIndexLovLinks lovLinks) {
    this.lovLinks = lovLinks;
    return this;
  }

   /**
   * Get lovLinks
   * @return lovLinks
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public OrderIndexLovLinks getLovLinks() {
    return lovLinks;
  }

  public void setLovLinks(OrderIndexLovLinks lovLinks) {
    this.lovLinks = lovLinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderIndex orderIndex = (OrderIndex) o;
    return Objects.equals(this.links, orderIndex.links) &&
        Objects.equals(this.lovLinks, orderIndex.lovLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, lovLinks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderIndex {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    lovLinks: ").append(toIndentedString(lovLinks)).append("\n");
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

