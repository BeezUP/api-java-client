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
import io.swagger.client.model.StoreHeader;
import io.swagger.client.model.StoresLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * Stores
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class Stores {
  @SerializedName("links")
  private StoresLinks links = null;

  @SerializedName("storeList")
  private List<StoreHeader> storeList = new ArrayList<StoreHeader>();

  public Stores links(StoresLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public StoresLinks getLinks() {
    return links;
  }

  public void setLinks(StoresLinks links) {
    this.links = links;
  }

  public Stores storeList(List<StoreHeader> storeList) {
    this.storeList = storeList;
    return this;
  }

  public Stores addStoreListItem(StoreHeader storeListItem) {
    this.storeList.add(storeListItem);
    return this;
  }

   /**
   * Get storeList
   * @return storeList
  **/
  @ApiModelProperty(example = "[{&quot;storeId&quot;:&quot;00000000-0000-0000-0000-000000000000&quot;,&quot;userRole&quot;:&quot;Owner&quot;,&quot;status&quot;:&quot;Active&quot;,&quot;ownerUserId&quot;:&quot;00000000-0000-0000-0000-000000000000&quot;,&quot;creationUtcDate&quot;:&quot;2001-01-01T00:00:00&quot;,&quot;name&quot;:&quot;My Store&quot;,&quot;url&quot;:&quot;http://www.mystore.com&quot;,&quot;sectors&quot;:[1],&quot;links&quot;:[{&quot;href&quot;:&quot;/v2/user/stores/{storeId}&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;rel&quot;:&quot;self&quot;,&quot;operationId&quot;:&quot;GetStore&quot;},{&quot;href&quot;:&quot;/v2/user/stores/{storeId}&quot;,&quot;method&quot;:&quot;DELETE&quot;,&quot;rel&quot;:&quot;DeleteStore&quot;,&quot;operationId&quot;:&quot;DeleteStore&quot;},{&quot;href&quot;:&quot;/v2/user/stores/{storeId}&quot;,&quot;method&quot;:&quot;PATCH&quot;,&quot;rel&quot;:&quot;UpdateStore&quot;,&quot;operationId&quot;:&quot;UpdateStore&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;request&quot;,&quot;in&quot;:&quot;body&quot;,&quot;type&quot;:&quot;object&quot;,&quot;required&quot;:true}]},{&quot;href&quot;:&quot;/v2/user/stores/{storeId}/shares&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;rel&quot;:&quot;GetShares&quot;,&quot;operationId&quot;:&quot;GetShares&quot;}]}]", required = true, value = "")
  public List<StoreHeader> getStoreList() {
    return storeList;
  }

  public void setStoreList(List<StoreHeader> storeList) {
    this.storeList = storeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stores stores = (Stores) o;
    return Objects.equals(this.links, stores.links) &&
        Objects.equals(this.storeList, stores.storeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, storeList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stores {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    storeList: ").append(toIndentedString(storeList)).append("\n");
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

