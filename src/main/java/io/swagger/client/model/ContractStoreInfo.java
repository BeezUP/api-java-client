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
import io.swagger.client.model.StoreCount;

/**
 * Describe the store information related to the offer.
 */
@ApiModel(description = "Describe the store information related to the offer.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:51:26.209Z")
public class ContractStoreInfo {
  @SerializedName("storeCount")
  private StoreCount storeCount = null;

  @SerializedName("maxStoreCount")
  private Integer maxStoreCount = null;

  @SerializedName("minStoreCount")
  private Integer minStoreCount = null;

  @SerializedName("ownedStoreCount")
  private Integer ownedStoreCount = null;

  @SerializedName("additionalStorePrice")
  private Double additionalStorePrice = null;

  @SerializedName("storeIncluded")
  private Integer storeIncluded = null;

  public ContractStoreInfo storeCount(StoreCount storeCount) {
    this.storeCount = storeCount;
    return this;
  }

   /**
   * Get storeCount
   * @return storeCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public StoreCount getStoreCount() {
    return storeCount;
  }

  public void setStoreCount(StoreCount storeCount) {
    this.storeCount = storeCount;
  }

  public ContractStoreInfo maxStoreCount(Integer maxStoreCount) {
    this.maxStoreCount = maxStoreCount;
    return this;
  }

   /**
   * The maximum store count related to the offer.
   * @return maxStoreCount
  **/
  @ApiModelProperty(example = "null", value = "The maximum store count related to the offer.")
  public Integer getMaxStoreCount() {
    return maxStoreCount;
  }

  public void setMaxStoreCount(Integer maxStoreCount) {
    this.maxStoreCount = maxStoreCount;
  }

  public ContractStoreInfo minStoreCount(Integer minStoreCount) {
    this.minStoreCount = minStoreCount;
    return this;
  }

   /**
   * The minimum store count related to the offer.
   * @return minStoreCount
  **/
  @ApiModelProperty(example = "null", value = "The minimum store count related to the offer.")
  public Integer getMinStoreCount() {
    return minStoreCount;
  }

  public void setMinStoreCount(Integer minStoreCount) {
    this.minStoreCount = minStoreCount;
  }

  public ContractStoreInfo ownedStoreCount(Integer ownedStoreCount) {
    this.ownedStoreCount = ownedStoreCount;
    return this;
  }

   /**
   * The owned store count.
   * @return ownedStoreCount
  **/
  @ApiModelProperty(example = "null", value = "The owned store count.")
  public Integer getOwnedStoreCount() {
    return ownedStoreCount;
  }

  public void setOwnedStoreCount(Integer ownedStoreCount) {
    this.ownedStoreCount = ownedStoreCount;
  }

  public ContractStoreInfo additionalStorePrice(Double additionalStorePrice) {
    this.additionalStorePrice = additionalStorePrice;
    return this;
  }

   /**
   * The additional store price.
   * @return additionalStorePrice
  **/
  @ApiModelProperty(example = "null", value = "The additional store price.")
  public Double getAdditionalStorePrice() {
    return additionalStorePrice;
  }

  public void setAdditionalStorePrice(Double additionalStorePrice) {
    this.additionalStorePrice = additionalStorePrice;
  }

  public ContractStoreInfo storeIncluded(Integer storeIncluded) {
    this.storeIncluded = storeIncluded;
    return this;
  }

   /**
   * The store count included in the offer.
   * @return storeIncluded
  **/
  @ApiModelProperty(example = "null", value = "The store count included in the offer.")
  public Integer getStoreIncluded() {
    return storeIncluded;
  }

  public void setStoreIncluded(Integer storeIncluded) {
    this.storeIncluded = storeIncluded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractStoreInfo contractStoreInfo = (ContractStoreInfo) o;
    return Objects.equals(this.storeCount, contractStoreInfo.storeCount) &&
        Objects.equals(this.maxStoreCount, contractStoreInfo.maxStoreCount) &&
        Objects.equals(this.minStoreCount, contractStoreInfo.minStoreCount) &&
        Objects.equals(this.ownedStoreCount, contractStoreInfo.ownedStoreCount) &&
        Objects.equals(this.additionalStorePrice, contractStoreInfo.additionalStorePrice) &&
        Objects.equals(this.storeIncluded, contractStoreInfo.storeIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeCount, maxStoreCount, minStoreCount, ownedStoreCount, additionalStorePrice, storeIncluded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractStoreInfo {\n");
    
    sb.append("    storeCount: ").append(toIndentedString(storeCount)).append("\n");
    sb.append("    maxStoreCount: ").append(toIndentedString(maxStoreCount)).append("\n");
    sb.append("    minStoreCount: ").append(toIndentedString(minStoreCount)).append("\n");
    sb.append("    ownedStoreCount: ").append(toIndentedString(ownedStoreCount)).append("\n");
    sb.append("    additionalStorePrice: ").append(toIndentedString(additionalStorePrice)).append("\n");
    sb.append("    storeIncluded: ").append(toIndentedString(storeIncluded)).append("\n");
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

