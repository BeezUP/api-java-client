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
import io.swagger.client.model.BeezUPCommonCurrencyCode;
import io.swagger.client.model.OfferFunctionality;
import java.util.ArrayList;
import java.util.List;

/**
 * StandardOffer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T10:49:46.695Z")
public class StandardOffer {
  @SerializedName("additionalClickPrice")
  private Double additionalClickPrice = null;

  @SerializedName("includedClick")
  private Integer includedClick = null;

  @SerializedName("isMostPopular")
  private Boolean isMostPopular = null;

  @SerializedName("isOldOffer")
  private Boolean isOldOffer = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("offerId")
  private Integer offerId = null;

  @SerializedName("fixedPrice")
  private Double fixedPrice = null;

  @SerializedName("currencyCode")
  private BeezUPCommonCurrencyCode currencyCode = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("functionalities")
  private List<OfferFunctionality> functionalities = new ArrayList<OfferFunctionality>();

  public StandardOffer additionalClickPrice(Double additionalClickPrice) {
    this.additionalClickPrice = additionalClickPrice;
    return this;
  }

   /**
   * The additional click price
   * @return additionalClickPrice
  **/
  @ApiModelProperty(example = "0.1234", value = "The additional click price")
  public Double getAdditionalClickPrice() {
    return additionalClickPrice;
  }

  public void setAdditionalClickPrice(Double additionalClickPrice) {
    this.additionalClickPrice = additionalClickPrice;
  }

  public StandardOffer includedClick(Integer includedClick) {
    this.includedClick = includedClick;
    return this;
  }

   /**
   * The included click
   * @return includedClick
  **/
  @ApiModelProperty(example = "1200", value = "The included click")
  public Integer getIncludedClick() {
    return includedClick;
  }

  public void setIncludedClick(Integer includedClick) {
    this.includedClick = includedClick;
  }

  public StandardOffer isMostPopular(Boolean isMostPopular) {
    this.isMostPopular = isMostPopular;
    return this;
  }

   /**
   * UI purpose. Is the offer is the most popular
   * @return isMostPopular
  **/
  @ApiModelProperty(example = "true", value = "UI purpose. Is the offer is the most popular")
  public Boolean getIsMostPopular() {
    return isMostPopular;
  }

  public void setIsMostPopular(Boolean isMostPopular) {
    this.isMostPopular = isMostPopular;
  }

  public StandardOffer isOldOffer(Boolean isOldOffer) {
    this.isOldOffer = isOldOffer;
    return this;
  }

   /**
   * Is an old offer
   * @return isOldOffer
  **/
  @ApiModelProperty(example = "false", value = "Is an old offer")
  public Boolean getIsOldOffer() {
    return isOldOffer;
  }

  public void setIsOldOffer(Boolean isOldOffer) {
    this.isOldOffer = isOldOffer;
  }

  public StandardOffer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The offer name
   * @return name
  **/
  @ApiModelProperty(example = "Wonder offer", value = "The offer name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StandardOffer offerId(Integer offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * The offer Id
   * @return offerId
  **/
  @ApiModelProperty(example = "1234", value = "The offer Id")
  public Integer getOfferId() {
    return offerId;
  }

  public void setOfferId(Integer offerId) {
    this.offerId = offerId;
  }

  public StandardOffer fixedPrice(Double fixedPrice) {
    this.fixedPrice = fixedPrice;
    return this;
  }

   /**
   * The fixed price of the offer
   * @return fixedPrice
  **/
  @ApiModelProperty(example = "101.42", value = "The fixed price of the offer")
  public Double getFixedPrice() {
    return fixedPrice;
  }

  public void setFixedPrice(Double fixedPrice) {
    this.fixedPrice = fixedPrice;
  }

  public StandardOffer currencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonCurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public StandardOffer position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * UI purpose. The position of the offer
   * @return position
  **/
  @ApiModelProperty(example = "1", value = "UI purpose. The position of the offer")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public StandardOffer functionalities(List<OfferFunctionality> functionalities) {
    this.functionalities = functionalities;
    return this;
  }

  public StandardOffer addFunctionalitiesItem(OfferFunctionality functionalitiesItem) {
    this.functionalities.add(functionalitiesItem);
    return this;
  }

   /**
   * Get functionalities
   * @return functionalities
  **/
  @ApiModelProperty(example = "[{&quot;functionalityCode&quot;:&quot;MARKETMANA&quot;,&quot;maxValueInteger&quot;:4,&quot;unlimited&quot;:false,&quot;text&quot;:&quot;Marketplace management&quot;}]", value = "")
  public List<OfferFunctionality> getFunctionalities() {
    return functionalities;
  }

  public void setFunctionalities(List<OfferFunctionality> functionalities) {
    this.functionalities = functionalities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardOffer standardOffer = (StandardOffer) o;
    return Objects.equals(this.additionalClickPrice, standardOffer.additionalClickPrice) &&
        Objects.equals(this.includedClick, standardOffer.includedClick) &&
        Objects.equals(this.isMostPopular, standardOffer.isMostPopular) &&
        Objects.equals(this.isOldOffer, standardOffer.isOldOffer) &&
        Objects.equals(this.name, standardOffer.name) &&
        Objects.equals(this.offerId, standardOffer.offerId) &&
        Objects.equals(this.fixedPrice, standardOffer.fixedPrice) &&
        Objects.equals(this.currencyCode, standardOffer.currencyCode) &&
        Objects.equals(this.position, standardOffer.position) &&
        Objects.equals(this.functionalities, standardOffer.functionalities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalClickPrice, includedClick, isMostPopular, isOldOffer, name, offerId, fixedPrice, currencyCode, position, functionalities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardOffer {\n");
    
    sb.append("    additionalClickPrice: ").append(toIndentedString(additionalClickPrice)).append("\n");
    sb.append("    includedClick: ").append(toIndentedString(includedClick)).append("\n");
    sb.append("    isMostPopular: ").append(toIndentedString(isMostPopular)).append("\n");
    sb.append("    isOldOffer: ").append(toIndentedString(isOldOffer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    functionalities: ").append(toIndentedString(functionalities)).append("\n");
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

