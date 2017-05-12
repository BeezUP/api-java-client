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

/**
 * Describe the pricing information related to the offer.
 */
@ApiModel(description = "Describe the pricing information related to the offer.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:18:37.107Z")
public class ContractMoneyInfo {
  @SerializedName("amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount")
  private Double amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount = null;

  @SerializedName("amountExcludingTaxesIncludingDiscounts")
  private Double amountExcludingTaxesIncludingDiscounts = null;

  @SerializedName("amountTaxesExcludingDiscountIncludingBillingPeriodDiscount")
  private Double amountTaxesExcludingDiscountIncludingBillingPeriodDiscount = null;

  @SerializedName("amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount")
  private Double amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount = null;

  @SerializedName("currencyCode")
  private BeezUPCommonCurrencyCode currencyCode = null;

  @SerializedName("vatPercent")
  private Double vatPercent = null;

  @SerializedName("amountExcludingTaxesIncludingDiscountsPerMonth")
  private Double amountExcludingTaxesIncludingDiscountsPerMonth = null;

  @SerializedName("amountExcludingTaxesAndExcludingDiscounts")
  private Double amountExcludingTaxesAndExcludingDiscounts = null;

  @SerializedName("amountTaxesIncludingDiscounts")
  private Double amountTaxesIncludingDiscounts = null;

  @SerializedName("amountIncludingTaxesIncludingDiscounts")
  private Double amountIncludingTaxesIncludingDiscounts = null;

  @SerializedName("initialOfferFixedPrice")
  private Double initialOfferFixedPrice = null;

  public ContractMoneyInfo amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount(Double amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount) {
    this.amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount = amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount;
    return this;
  }

   /**
   * The amount excluding taxes and excluding code promo discount including billing period discount.
   * @return amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount
  **/
  @ApiModelProperty(example = "null", value = "The amount excluding taxes and excluding code promo discount including billing period discount.")
  public Double getAmountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount() {
    return amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount;
  }

  public void setAmountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount(Double amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount) {
    this.amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount = amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount;
  }

  public ContractMoneyInfo amountExcludingTaxesIncludingDiscounts(Double amountExcludingTaxesIncludingDiscounts) {
    this.amountExcludingTaxesIncludingDiscounts = amountExcludingTaxesIncludingDiscounts;
    return this;
  }

   /**
   * The amount excluding taxes including discounts.
   * @return amountExcludingTaxesIncludingDiscounts
  **/
  @ApiModelProperty(example = "null", value = "The amount excluding taxes including discounts.")
  public Double getAmountExcludingTaxesIncludingDiscounts() {
    return amountExcludingTaxesIncludingDiscounts;
  }

  public void setAmountExcludingTaxesIncludingDiscounts(Double amountExcludingTaxesIncludingDiscounts) {
    this.amountExcludingTaxesIncludingDiscounts = amountExcludingTaxesIncludingDiscounts;
  }

  public ContractMoneyInfo amountTaxesExcludingDiscountIncludingBillingPeriodDiscount(Double amountTaxesExcludingDiscountIncludingBillingPeriodDiscount) {
    this.amountTaxesExcludingDiscountIncludingBillingPeriodDiscount = amountTaxesExcludingDiscountIncludingBillingPeriodDiscount;
    return this;
  }

   /**
   * The taxes excluding discount including billing period discount.
   * @return amountTaxesExcludingDiscountIncludingBillingPeriodDiscount
  **/
  @ApiModelProperty(example = "null", value = "The taxes excluding discount including billing period discount.")
  public Double getAmountTaxesExcludingDiscountIncludingBillingPeriodDiscount() {
    return amountTaxesExcludingDiscountIncludingBillingPeriodDiscount;
  }

  public void setAmountTaxesExcludingDiscountIncludingBillingPeriodDiscount(Double amountTaxesExcludingDiscountIncludingBillingPeriodDiscount) {
    this.amountTaxesExcludingDiscountIncludingBillingPeriodDiscount = amountTaxesExcludingDiscountIncludingBillingPeriodDiscount;
  }

  public ContractMoneyInfo amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount(Double amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount) {
    this.amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount = amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount;
    return this;
  }

   /**
   * The amount including taxes excluding discount including billing period discount.
   * @return amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount
  **/
  @ApiModelProperty(example = "null", value = "The amount including taxes excluding discount including billing period discount.")
  public Double getAmountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount() {
    return amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount;
  }

  public void setAmountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount(Double amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount) {
    this.amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount = amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount;
  }

  public ContractMoneyInfo currencyCode(BeezUPCommonCurrencyCode currencyCode) {
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

  public ContractMoneyInfo vatPercent(Double vatPercent) {
    this.vatPercent = vatPercent;
    return this;
  }

   /**
   * The VAT percent.
   * @return vatPercent
  **/
  @ApiModelProperty(example = "null", value = "The VAT percent.")
  public Double getVatPercent() {
    return vatPercent;
  }

  public void setVatPercent(Double vatPercent) {
    this.vatPercent = vatPercent;
  }

  public ContractMoneyInfo amountExcludingTaxesIncludingDiscountsPerMonth(Double amountExcludingTaxesIncludingDiscountsPerMonth) {
    this.amountExcludingTaxesIncludingDiscountsPerMonth = amountExcludingTaxesIncludingDiscountsPerMonth;
    return this;
  }

   /**
   * The amount excluding taxes including discounts per month.
   * @return amountExcludingTaxesIncludingDiscountsPerMonth
  **/
  @ApiModelProperty(example = "null", value = "The amount excluding taxes including discounts per month.")
  public Double getAmountExcludingTaxesIncludingDiscountsPerMonth() {
    return amountExcludingTaxesIncludingDiscountsPerMonth;
  }

  public void setAmountExcludingTaxesIncludingDiscountsPerMonth(Double amountExcludingTaxesIncludingDiscountsPerMonth) {
    this.amountExcludingTaxesIncludingDiscountsPerMonth = amountExcludingTaxesIncludingDiscountsPerMonth;
  }

  public ContractMoneyInfo amountExcludingTaxesAndExcludingDiscounts(Double amountExcludingTaxesAndExcludingDiscounts) {
    this.amountExcludingTaxesAndExcludingDiscounts = amountExcludingTaxesAndExcludingDiscounts;
    return this;
  }

   /**
   * The amount excluding taxes and excluding discounts.
   * @return amountExcludingTaxesAndExcludingDiscounts
  **/
  @ApiModelProperty(example = "null", value = "The amount excluding taxes and excluding discounts.")
  public Double getAmountExcludingTaxesAndExcludingDiscounts() {
    return amountExcludingTaxesAndExcludingDiscounts;
  }

  public void setAmountExcludingTaxesAndExcludingDiscounts(Double amountExcludingTaxesAndExcludingDiscounts) {
    this.amountExcludingTaxesAndExcludingDiscounts = amountExcludingTaxesAndExcludingDiscounts;
  }

  public ContractMoneyInfo amountTaxesIncludingDiscounts(Double amountTaxesIncludingDiscounts) {
    this.amountTaxesIncludingDiscounts = amountTaxesIncludingDiscounts;
    return this;
  }

   /**
   * Taxes including discounts.
   * @return amountTaxesIncludingDiscounts
  **/
  @ApiModelProperty(example = "null", value = "Taxes including discounts.")
  public Double getAmountTaxesIncludingDiscounts() {
    return amountTaxesIncludingDiscounts;
  }

  public void setAmountTaxesIncludingDiscounts(Double amountTaxesIncludingDiscounts) {
    this.amountTaxesIncludingDiscounts = amountTaxesIncludingDiscounts;
  }

  public ContractMoneyInfo amountIncludingTaxesIncludingDiscounts(Double amountIncludingTaxesIncludingDiscounts) {
    this.amountIncludingTaxesIncludingDiscounts = amountIncludingTaxesIncludingDiscounts;
    return this;
  }

   /**
   * The amount including taxes including discounts.
   * @return amountIncludingTaxesIncludingDiscounts
  **/
  @ApiModelProperty(example = "null", value = "The amount including taxes including discounts.")
  public Double getAmountIncludingTaxesIncludingDiscounts() {
    return amountIncludingTaxesIncludingDiscounts;
  }

  public void setAmountIncludingTaxesIncludingDiscounts(Double amountIncludingTaxesIncludingDiscounts) {
    this.amountIncludingTaxesIncludingDiscounts = amountIncludingTaxesIncludingDiscounts;
  }

  public ContractMoneyInfo initialOfferFixedPrice(Double initialOfferFixedPrice) {
    this.initialOfferFixedPrice = initialOfferFixedPrice;
    return this;
  }

   /**
   * The initial offer fixed price.
   * @return initialOfferFixedPrice
  **/
  @ApiModelProperty(example = "null", value = "The initial offer fixed price.")
  public Double getInitialOfferFixedPrice() {
    return initialOfferFixedPrice;
  }

  public void setInitialOfferFixedPrice(Double initialOfferFixedPrice) {
    this.initialOfferFixedPrice = initialOfferFixedPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractMoneyInfo contractMoneyInfo = (ContractMoneyInfo) o;
    return Objects.equals(this.amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount, contractMoneyInfo.amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount) &&
        Objects.equals(this.amountExcludingTaxesIncludingDiscounts, contractMoneyInfo.amountExcludingTaxesIncludingDiscounts) &&
        Objects.equals(this.amountTaxesExcludingDiscountIncludingBillingPeriodDiscount, contractMoneyInfo.amountTaxesExcludingDiscountIncludingBillingPeriodDiscount) &&
        Objects.equals(this.amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount, contractMoneyInfo.amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount) &&
        Objects.equals(this.currencyCode, contractMoneyInfo.currencyCode) &&
        Objects.equals(this.vatPercent, contractMoneyInfo.vatPercent) &&
        Objects.equals(this.amountExcludingTaxesIncludingDiscountsPerMonth, contractMoneyInfo.amountExcludingTaxesIncludingDiscountsPerMonth) &&
        Objects.equals(this.amountExcludingTaxesAndExcludingDiscounts, contractMoneyInfo.amountExcludingTaxesAndExcludingDiscounts) &&
        Objects.equals(this.amountTaxesIncludingDiscounts, contractMoneyInfo.amountTaxesIncludingDiscounts) &&
        Objects.equals(this.amountIncludingTaxesIncludingDiscounts, contractMoneyInfo.amountIncludingTaxesIncludingDiscounts) &&
        Objects.equals(this.initialOfferFixedPrice, contractMoneyInfo.initialOfferFixedPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount, amountExcludingTaxesIncludingDiscounts, amountTaxesExcludingDiscountIncludingBillingPeriodDiscount, amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount, currencyCode, vatPercent, amountExcludingTaxesIncludingDiscountsPerMonth, amountExcludingTaxesAndExcludingDiscounts, amountTaxesIncludingDiscounts, amountIncludingTaxesIncludingDiscounts, initialOfferFixedPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractMoneyInfo {\n");
    
    sb.append("    amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount: ").append(toIndentedString(amountExcludingTaxesAndExcludingCodePromoDiscountIncludingBillingPeriodDiscount)).append("\n");
    sb.append("    amountExcludingTaxesIncludingDiscounts: ").append(toIndentedString(amountExcludingTaxesIncludingDiscounts)).append("\n");
    sb.append("    amountTaxesExcludingDiscountIncludingBillingPeriodDiscount: ").append(toIndentedString(amountTaxesExcludingDiscountIncludingBillingPeriodDiscount)).append("\n");
    sb.append("    amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount: ").append(toIndentedString(amountIncludingTaxesExcludingDiscountIncludingBillingPeriodDiscount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    vatPercent: ").append(toIndentedString(vatPercent)).append("\n");
    sb.append("    amountExcludingTaxesIncludingDiscountsPerMonth: ").append(toIndentedString(amountExcludingTaxesIncludingDiscountsPerMonth)).append("\n");
    sb.append("    amountExcludingTaxesAndExcludingDiscounts: ").append(toIndentedString(amountExcludingTaxesAndExcludingDiscounts)).append("\n");
    sb.append("    amountTaxesIncludingDiscounts: ").append(toIndentedString(amountTaxesIncludingDiscounts)).append("\n");
    sb.append("    amountIncludingTaxesIncludingDiscounts: ").append(toIndentedString(amountIncludingTaxesIncludingDiscounts)).append("\n");
    sb.append("    initialOfferFixedPrice: ").append(toIndentedString(initialOfferFixedPrice)).append("\n");
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

