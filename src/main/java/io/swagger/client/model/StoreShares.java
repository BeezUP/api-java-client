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
import io.swagger.client.model.StoreShare;
import io.swagger.client.model.StoreSharesLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * StoreShares
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:50:41.747Z")
public class StoreShares {
  @SerializedName("links")
  private StoreSharesLinks links = null;

  @SerializedName("shares")
  private List<StoreShare> shares = new ArrayList<StoreShare>();

  public StoreShares links(StoreSharesLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public StoreSharesLinks getLinks() {
    return links;
  }

  public void setLinks(StoreSharesLinks links) {
    this.links = links;
  }

  public StoreShares shares(List<StoreShare> shares) {
    this.shares = shares;
    return this;
  }

  public StoreShares addSharesItem(StoreShare sharesItem) {
    this.shares.add(sharesItem);
    return this;
  }

   /**
   * Get shares
   * @return shares
  **/
  @ApiModelProperty(example = "[{&quot;userId&quot;:&quot;277596c1-a5a9-4cce-9f34-b5906451a98f&quot;,&quot;storeRole&quot;:&quot;User&quot;,&quot;links&quot;:{&quot;deleteShare&quot;:{&quot;href&quot;:&quot;/v2/user/stores/{storeId}/shares/{userId}&quot;,&quot;method&quot;:&quot;DELETE&quot;,&quot;operationId&quot;:&quot;DeleteShare&quot;,&quot;parameters&quot;:{&quot;storeId&quot;:&quot;51afae05-277e-4902-8b17-5a811a23a2c6&quot;,&quot;userId&quot;:&quot;277596c1-a5a9-4cce-9f34-b5906451a98f&quot;}}}}]", required = true, value = "")
  public List<StoreShare> getShares() {
    return shares;
  }

  public void setShares(List<StoreShare> shares) {
    this.shares = shares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreShares storeShares = (StoreShares) o;
    return Objects.equals(this.links, storeShares.links) &&
        Objects.equals(this.shares, storeShares.shares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, shares);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreShares {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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

