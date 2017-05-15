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
import io.swagger.client.model.BeezUPCommonListOfValueItem;
import io.swagger.client.model.PublicListOfValuesResponseLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * PublicListOfValuesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:26:19.914Z")
public class PublicListOfValuesResponse {
  @SerializedName("links")
  private PublicListOfValuesResponseLinks links = null;

  @SerializedName("items")
  private List<BeezUPCommonListOfValueItem> items = new ArrayList<BeezUPCommonListOfValueItem>();

  public PublicListOfValuesResponse links(PublicListOfValuesResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public PublicListOfValuesResponseLinks getLinks() {
    return links;
  }

  public void setLinks(PublicListOfValuesResponseLinks links) {
    this.links = links;
  }

  public PublicListOfValuesResponse items(List<BeezUPCommonListOfValueItem> items) {
    this.items = items;
    return this;
  }

  public PublicListOfValuesResponse addItemsItem(BeezUPCommonListOfValueItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BeezUPCommonListOfValueItem> getItems() {
    return items;
  }

  public void setItems(List<BeezUPCommonListOfValueItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicListOfValuesResponse publicListOfValuesResponse = (PublicListOfValuesResponse) o;
    return Objects.equals(this.links, publicListOfValuesResponse.links) &&
        Objects.equals(this.items, publicListOfValuesResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicListOfValuesResponse {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

