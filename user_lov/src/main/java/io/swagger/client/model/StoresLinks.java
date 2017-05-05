/*
 * Customer
 * This API will gives you the ability to : - manage your account - manage your stores - shares your stores with your friends - manage your contracts - access to your invoices 
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
import io.swagger.client.model.LinksCreateStoreLink;
import io.swagger.client.model.LinksGetStoresLink;

/**
 * The action links
 */
@ApiModel(description = "The action links")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:15:59.675Z")
public class StoresLinks {
  @SerializedName("getStores")
  private LinksGetStoresLink getStores = null;

  @SerializedName("createStore")
  private LinksCreateStoreLink createStore = null;

  public StoresLinks getStores(LinksGetStoresLink getStores) {
    this.getStores = getStores;
    return this;
  }

   /**
   * Get getStores
   * @return getStores
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetStoresLink getGetStores() {
    return getStores;
  }

  public void setGetStores(LinksGetStoresLink getStores) {
    this.getStores = getStores;
  }

  public StoresLinks createStore(LinksCreateStoreLink createStore) {
    this.createStore = createStore;
    return this;
  }

   /**
   * Get createStore
   * @return createStore
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksCreateStoreLink getCreateStore() {
    return createStore;
  }

  public void setCreateStore(LinksCreateStoreLink createStore) {
    this.createStore = createStore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoresLinks storesLinks = (StoresLinks) o;
    return Objects.equals(this.getStores, storesLinks.getStores) &&
        Objects.equals(this.createStore, storesLinks.createStore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getStores, createStore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoresLinks {\n");
    
    sb.append("    getStores: ").append(toIndentedString(getStores)).append("\n");
    sb.append("    createStore: ").append(toIndentedString(createStore)).append("\n");
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
