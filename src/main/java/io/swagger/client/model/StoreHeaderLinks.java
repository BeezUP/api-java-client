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
import io.swagger.client.model.LinksDeleteStoreLink;
import io.swagger.client.model.LinksGetSharesLink;
import io.swagger.client.model.LinksGetStoreLink;
import io.swagger.client.model.LinksShareLink;
import io.swagger.client.model.LinksUpdateStoreLink;

/**
 * The action links for this store
 */
@ApiModel(description = "The action links for this store")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:51:26.209Z")
public class StoreHeaderLinks {
  @SerializedName("self")
  private LinksGetStoreLink self = null;

  @SerializedName("deleteStore")
  private LinksDeleteStoreLink deleteStore = null;

  @SerializedName("updateStore")
  private LinksUpdateStoreLink updateStore = null;

  @SerializedName("getShares")
  private LinksGetSharesLink getShares = null;

  @SerializedName("share")
  private LinksShareLink share = null;

  public StoreHeaderLinks self(LinksGetStoreLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetStoreLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetStoreLink self) {
    this.self = self;
  }

  public StoreHeaderLinks deleteStore(LinksDeleteStoreLink deleteStore) {
    this.deleteStore = deleteStore;
    return this;
  }

   /**
   * Get deleteStore
   * @return deleteStore
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksDeleteStoreLink getDeleteStore() {
    return deleteStore;
  }

  public void setDeleteStore(LinksDeleteStoreLink deleteStore) {
    this.deleteStore = deleteStore;
  }

  public StoreHeaderLinks updateStore(LinksUpdateStoreLink updateStore) {
    this.updateStore = updateStore;
    return this;
  }

   /**
   * Get updateStore
   * @return updateStore
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksUpdateStoreLink getUpdateStore() {
    return updateStore;
  }

  public void setUpdateStore(LinksUpdateStoreLink updateStore) {
    this.updateStore = updateStore;
  }

  public StoreHeaderLinks getShares(LinksGetSharesLink getShares) {
    this.getShares = getShares;
    return this;
  }

   /**
   * Get getShares
   * @return getShares
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksGetSharesLink getGetShares() {
    return getShares;
  }

  public void setGetShares(LinksGetSharesLink getShares) {
    this.getShares = getShares;
  }

  public StoreHeaderLinks share(LinksShareLink share) {
    this.share = share;
    return this;
  }

   /**
   * Get share
   * @return share
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksShareLink getShare() {
    return share;
  }

  public void setShare(LinksShareLink share) {
    this.share = share;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreHeaderLinks storeHeaderLinks = (StoreHeaderLinks) o;
    return Objects.equals(this.self, storeHeaderLinks.self) &&
        Objects.equals(this.deleteStore, storeHeaderLinks.deleteStore) &&
        Objects.equals(this.updateStore, storeHeaderLinks.updateStore) &&
        Objects.equals(this.getShares, storeHeaderLinks.getShares) &&
        Objects.equals(this.share, storeHeaderLinks.share);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, deleteStore, updateStore, getShares, share);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreHeaderLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    deleteStore: ").append(toIndentedString(deleteStore)).append("\n");
    sb.append("    updateStore: ").append(toIndentedString(updateStore)).append("\n");
    sb.append("    getShares: ").append(toIndentedString(getShares)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
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

