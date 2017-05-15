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
import io.swagger.client.model.PromotionalCodeValidity;

/**
 * Describe the discount information related to the offer.
 */
@ApiModel(description = "Describe the discount information related to the offer.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:40:14.157Z")
public class ContractDiscountInfo {
  @SerializedName("amountCodePromoDiscountPerMonth")
  private Double amountCodePromoDiscountPerMonth = null;

  @SerializedName("discountDurationInMonth")
  private Integer discountDurationInMonth = null;

  @SerializedName("percentDiscount")
  private Double percentDiscount = null;

  @SerializedName("promotionalCodeValidity")
  private PromotionalCodeValidity promotionalCodeValidity = null;

  @SerializedName("amountCodePromoDiscount")
  private Double amountCodePromoDiscount = null;

  @SerializedName("couponDiscountCode")
  private String couponDiscountCode = null;

  @SerializedName("couponDiscountId")
  private Integer couponDiscountId = null;

  @SerializedName("isCouponDiscountLinkedToCouponOffer")
  private Boolean isCouponDiscountLinkedToCouponOffer = null;

  @SerializedName("customerHasActualDiscount")
  private Boolean customerHasActualDiscount = null;

  public ContractDiscountInfo amountCodePromoDiscountPerMonth(Double amountCodePromoDiscountPerMonth) {
    this.amountCodePromoDiscountPerMonth = amountCodePromoDiscountPerMonth;
    return this;
  }

   /**
   * The amount discounted per month
   * @return amountCodePromoDiscountPerMonth
  **/
  @ApiModelProperty(example = "101.42", value = "The amount discounted per month")
  public Double getAmountCodePromoDiscountPerMonth() {
    return amountCodePromoDiscountPerMonth;
  }

  public void setAmountCodePromoDiscountPerMonth(Double amountCodePromoDiscountPerMonth) {
    this.amountCodePromoDiscountPerMonth = amountCodePromoDiscountPerMonth;
  }

  public ContractDiscountInfo discountDurationInMonth(Integer discountDurationInMonth) {
    this.discountDurationInMonth = discountDurationInMonth;
    return this;
  }

   /**
   * Duration of the discount in month
   * @return discountDurationInMonth
  **/
  @ApiModelProperty(example = "1", value = "Duration of the discount in month")
  public Integer getDiscountDurationInMonth() {
    return discountDurationInMonth;
  }

  public void setDiscountDurationInMonth(Integer discountDurationInMonth) {
    this.discountDurationInMonth = discountDurationInMonth;
  }

  public ContractDiscountInfo percentDiscount(Double percentDiscount) {
    this.percentDiscount = percentDiscount;
    return this;
  }

   /**
   * Percentage of the discount
   * @return percentDiscount
  **/
  @ApiModelProperty(example = "20.0", value = "Percentage of the discount")
  public Double getPercentDiscount() {
    return percentDiscount;
  }

  public void setPercentDiscount(Double percentDiscount) {
    this.percentDiscount = percentDiscount;
  }

  public ContractDiscountInfo promotionalCodeValidity(PromotionalCodeValidity promotionalCodeValidity) {
    this.promotionalCodeValidity = promotionalCodeValidity;
    return this;
  }

   /**
   * Get promotionalCodeValidity
   * @return promotionalCodeValidity
  **/
  @ApiModelProperty(example = "null", value = "")
  public PromotionalCodeValidity getPromotionalCodeValidity() {
    return promotionalCodeValidity;
  }

  public void setPromotionalCodeValidity(PromotionalCodeValidity promotionalCodeValidity) {
    this.promotionalCodeValidity = promotionalCodeValidity;
  }

  public ContractDiscountInfo amountCodePromoDiscount(Double amountCodePromoDiscount) {
    this.amountCodePromoDiscount = amountCodePromoDiscount;
    return this;
  }

   /**
   * The discount amount
   * @return amountCodePromoDiscount
  **/
  @ApiModelProperty(example = "101.42", value = "The discount amount")
  public Double getAmountCodePromoDiscount() {
    return amountCodePromoDiscount;
  }

  public void setAmountCodePromoDiscount(Double amountCodePromoDiscount) {
    this.amountCodePromoDiscount = amountCodePromoDiscount;
  }

  public ContractDiscountInfo couponDiscountCode(String couponDiscountCode) {
    this.couponDiscountCode = couponDiscountCode;
    return this;
  }

   /**
   * The discount code
   * @return couponDiscountCode
  **/
  @ApiModelProperty(example = "I-LOVE-BEEZUP", value = "The discount code")
  public String getCouponDiscountCode() {
    return couponDiscountCode;
  }

  public void setCouponDiscountCode(String couponDiscountCode) {
    this.couponDiscountCode = couponDiscountCode;
  }

  public ContractDiscountInfo couponDiscountId(Integer couponDiscountId) {
    this.couponDiscountId = couponDiscountId;
    return this;
  }

   /**
   * Internal use: The discount id
   * @return couponDiscountId
  **/
  @ApiModelProperty(example = "1", value = "Internal use: The discount id")
  public Integer getCouponDiscountId() {
    return couponDiscountId;
  }

  public void setCouponDiscountId(Integer couponDiscountId) {
    this.couponDiscountId = couponDiscountId;
  }

  public ContractDiscountInfo isCouponDiscountLinkedToCouponOffer(Boolean isCouponDiscountLinkedToCouponOffer) {
    this.isCouponDiscountLinkedToCouponOffer = isCouponDiscountLinkedToCouponOffer;
    return this;
  }

   /**
   * Is this discount is related to a coupon offer
   * @return isCouponDiscountLinkedToCouponOffer
  **/
  @ApiModelProperty(example = "true", value = "Is this discount is related to a coupon offer")
  public Boolean getIsCouponDiscountLinkedToCouponOffer() {
    return isCouponDiscountLinkedToCouponOffer;
  }

  public void setIsCouponDiscountLinkedToCouponOffer(Boolean isCouponDiscountLinkedToCouponOffer) {
    this.isCouponDiscountLinkedToCouponOffer = isCouponDiscountLinkedToCouponOffer;
  }

  public ContractDiscountInfo customerHasActualDiscount(Boolean customerHasActualDiscount) {
    this.customerHasActualDiscount = customerHasActualDiscount;
    return this;
  }

   /**
   * Do you have currently a discount on your contract ?
   * @return customerHasActualDiscount
  **/
  @ApiModelProperty(example = "true", value = "Do you have currently a discount on your contract ?")
  public Boolean getCustomerHasActualDiscount() {
    return customerHasActualDiscount;
  }

  public void setCustomerHasActualDiscount(Boolean customerHasActualDiscount) {
    this.customerHasActualDiscount = customerHasActualDiscount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractDiscountInfo contractDiscountInfo = (ContractDiscountInfo) o;
    return Objects.equals(this.amountCodePromoDiscountPerMonth, contractDiscountInfo.amountCodePromoDiscountPerMonth) &&
        Objects.equals(this.discountDurationInMonth, contractDiscountInfo.discountDurationInMonth) &&
        Objects.equals(this.percentDiscount, contractDiscountInfo.percentDiscount) &&
        Objects.equals(this.promotionalCodeValidity, contractDiscountInfo.promotionalCodeValidity) &&
        Objects.equals(this.amountCodePromoDiscount, contractDiscountInfo.amountCodePromoDiscount) &&
        Objects.equals(this.couponDiscountCode, contractDiscountInfo.couponDiscountCode) &&
        Objects.equals(this.couponDiscountId, contractDiscountInfo.couponDiscountId) &&
        Objects.equals(this.isCouponDiscountLinkedToCouponOffer, contractDiscountInfo.isCouponDiscountLinkedToCouponOffer) &&
        Objects.equals(this.customerHasActualDiscount, contractDiscountInfo.customerHasActualDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountCodePromoDiscountPerMonth, discountDurationInMonth, percentDiscount, promotionalCodeValidity, amountCodePromoDiscount, couponDiscountCode, couponDiscountId, isCouponDiscountLinkedToCouponOffer, customerHasActualDiscount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractDiscountInfo {\n");
    
    sb.append("    amountCodePromoDiscountPerMonth: ").append(toIndentedString(amountCodePromoDiscountPerMonth)).append("\n");
    sb.append("    discountDurationInMonth: ").append(toIndentedString(discountDurationInMonth)).append("\n");
    sb.append("    percentDiscount: ").append(toIndentedString(percentDiscount)).append("\n");
    sb.append("    promotionalCodeValidity: ").append(toIndentedString(promotionalCodeValidity)).append("\n");
    sb.append("    amountCodePromoDiscount: ").append(toIndentedString(amountCodePromoDiscount)).append("\n");
    sb.append("    couponDiscountCode: ").append(toIndentedString(couponDiscountCode)).append("\n");
    sb.append("    couponDiscountId: ").append(toIndentedString(couponDiscountId)).append("\n");
    sb.append("    isCouponDiscountLinkedToCouponOffer: ").append(toIndentedString(isCouponDiscountLinkedToCouponOffer)).append("\n");
    sb.append("    customerHasActualDiscount: ").append(toIndentedString(customerHasActualDiscount)).append("\n");
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

