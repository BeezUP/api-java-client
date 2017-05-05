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
import io.swagger.client.model.BeezUPCommonStoreId;
import io.swagger.client.model.Store;
import io.swagger.client.model.StoreCountryIsoCodeAlpha3;
import io.swagger.client.model.StoreHeaderLinks;
import io.swagger.client.model.StoreName;
import io.swagger.client.model.StoreSectors;
import io.swagger.client.model.StoreStatus;
import io.swagger.client.model.StoreUrl;
import io.swagger.client.model.StoreUserRole;
import org.joda.time.DateTime;

/**
 * StoreHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T09:59:46.672Z")
public class StoreHeader {
  @SerializedName("name")
  private StoreName name = null;

  @SerializedName("url")
  private StoreUrl url = null;

  @SerializedName("countryIsoCodeAlpha3")
  private StoreCountryIsoCodeAlpha3 countryIsoCodeAlpha3 = null;

  @SerializedName("sectors")
  private StoreSectors sectors = null;

  @SerializedName("storeId")
  private BeezUPCommonStoreId storeId = null;

  @SerializedName("userRole")
  private StoreUserRole userRole = null;

  @SerializedName("status")
  private StoreStatus status = null;

  @SerializedName("ownerUserId")
  private String ownerUserId = null;

  @SerializedName("shareCount")
  private Integer shareCount = null;

  @SerializedName("creationUtcDate")
  private DateTime creationUtcDate = null;

  @SerializedName("links")
  private StoreHeaderLinks links = null;

  public StoreHeader name(StoreName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StoreName getName() {
    return name;
  }

  public void setName(StoreName name) {
    this.name = name;
  }

  public StoreHeader url(StoreUrl url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StoreUrl getUrl() {
    return url;
  }

  public void setUrl(StoreUrl url) {
    this.url = url;
  }

  public StoreHeader countryIsoCodeAlpha3(StoreCountryIsoCodeAlpha3 countryIsoCodeAlpha3) {
    this.countryIsoCodeAlpha3 = countryIsoCodeAlpha3;
    return this;
  }

   /**
   * Get countryIsoCodeAlpha3
   * @return countryIsoCodeAlpha3
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StoreCountryIsoCodeAlpha3 getCountryIsoCodeAlpha3() {
    return countryIsoCodeAlpha3;
  }

  public void setCountryIsoCodeAlpha3(StoreCountryIsoCodeAlpha3 countryIsoCodeAlpha3) {
    this.countryIsoCodeAlpha3 = countryIsoCodeAlpha3;
  }

  public StoreHeader sectors(StoreSectors sectors) {
    this.sectors = sectors;
    return this;
  }

   /**
   * Get sectors
   * @return sectors
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StoreSectors getSectors() {
    return sectors;
  }

  public void setSectors(StoreSectors sectors) {
    this.sectors = sectors;
  }

  public StoreHeader storeId(BeezUPCommonStoreId storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonStoreId getStoreId() {
    return storeId;
  }

  public void setStoreId(BeezUPCommonStoreId storeId) {
    this.storeId = storeId;
  }

  public StoreHeader userRole(StoreUserRole userRole) {
    this.userRole = userRole;
    return this;
  }

   /**
   * Get userRole
   * @return userRole
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StoreUserRole getUserRole() {
    return userRole;
  }

  public void setUserRole(StoreUserRole userRole) {
    this.userRole = userRole;
  }

  public StoreHeader status(StoreStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StoreStatus getStatus() {
    return status;
  }

  public void setStatus(StoreStatus status) {
    this.status = status;
  }

  public StoreHeader ownerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

   /**
   * The user id of the owner of the store
   * @return ownerUserId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "The user id of the owner of the store")
  public String getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public StoreHeader shareCount(Integer shareCount) {
    this.shareCount = shareCount;
    return this;
  }

   /**
   * The share count related to this store
   * @return shareCount
  **/
  @ApiModelProperty(example = "5", required = true, value = "The share count related to this store")
  public Integer getShareCount() {
    return shareCount;
  }

  public void setShareCount(Integer shareCount) {
    this.shareCount = shareCount;
  }

  public StoreHeader creationUtcDate(DateTime creationUtcDate) {
    this.creationUtcDate = creationUtcDate;
    return this;
  }

   /**
   * The creation date of the store
   * @return creationUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T22:30:00Z", required = true, value = "The creation date of the store")
  public DateTime getCreationUtcDate() {
    return creationUtcDate;
  }

  public void setCreationUtcDate(DateTime creationUtcDate) {
    this.creationUtcDate = creationUtcDate;
  }

  public StoreHeader links(StoreHeaderLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public StoreHeaderLinks getLinks() {
    return links;
  }

  public void setLinks(StoreHeaderLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreHeader storeHeader = (StoreHeader) o;
    return Objects.equals(this.name, storeHeader.name) &&
        Objects.equals(this.url, storeHeader.url) &&
        Objects.equals(this.countryIsoCodeAlpha3, storeHeader.countryIsoCodeAlpha3) &&
        Objects.equals(this.sectors, storeHeader.sectors) &&
        Objects.equals(this.storeId, storeHeader.storeId) &&
        Objects.equals(this.userRole, storeHeader.userRole) &&
        Objects.equals(this.status, storeHeader.status) &&
        Objects.equals(this.ownerUserId, storeHeader.ownerUserId) &&
        Objects.equals(this.shareCount, storeHeader.shareCount) &&
        Objects.equals(this.creationUtcDate, storeHeader.creationUtcDate) &&
        Objects.equals(this.links, storeHeader.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, countryIsoCodeAlpha3, sectors, storeId, userRole, status, ownerUserId, shareCount, creationUtcDate, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreHeader {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    countryIsoCodeAlpha3: ").append(toIndentedString(countryIsoCodeAlpha3)).append("\n");
    sb.append("    sectors: ").append(toIndentedString(sectors)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    userRole: ").append(toIndentedString(userRole)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    shareCount: ").append(toIndentedString(shareCount)).append("\n");
    sb.append("    creationUtcDate: ").append(toIndentedString(creationUtcDate)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
