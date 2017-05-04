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
import io.swagger.client.model.BillingPeriodInMonth;
import io.swagger.client.model.CouponDiscountCode;
import io.swagger.client.model.CouponOfferCode;
import io.swagger.client.model.OfferId;
import io.swagger.client.model.OfferRequest;
import io.swagger.client.model.StoreCount;

/**
 * CreateContract
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T17:49:32.058Z")
public class CreateContract {
  @SerializedName("offerId")
  private OfferId offerId = null;

  @SerializedName("storeCount")
  private StoreCount storeCount = null;

  @SerializedName("couponDiscountCode")
  private CouponDiscountCode couponDiscountCode = null;

  @SerializedName("couponOfferCode")
  private CouponOfferCode couponOfferCode = null;

  @SerializedName("billingPeriodInMonth")
  private BillingPeriodInMonth billingPeriodInMonth = null;

  public CreateContract offerId(OfferId offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Get offerId
   * @return offerId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public OfferId getOfferId() {
    return offerId;
  }

  public void setOfferId(OfferId offerId) {
    this.offerId = offerId;
  }

  public CreateContract storeCount(StoreCount storeCount) {
    this.storeCount = storeCount;
    return this;
  }

   /**
   * Get storeCount
   * @return storeCount
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StoreCount getStoreCount() {
    return storeCount;
  }

  public void setStoreCount(StoreCount storeCount) {
    this.storeCount = storeCount;
  }

  public CreateContract couponDiscountCode(CouponDiscountCode couponDiscountCode) {
    this.couponDiscountCode = couponDiscountCode;
    return this;
  }

   /**
   * Get couponDiscountCode
   * @return couponDiscountCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public CouponDiscountCode getCouponDiscountCode() {
    return couponDiscountCode;
  }

  public void setCouponDiscountCode(CouponDiscountCode couponDiscountCode) {
    this.couponDiscountCode = couponDiscountCode;
  }

  public CreateContract couponOfferCode(CouponOfferCode couponOfferCode) {
    this.couponOfferCode = couponOfferCode;
    return this;
  }

   /**
   * Get couponOfferCode
   * @return couponOfferCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public CouponOfferCode getCouponOfferCode() {
    return couponOfferCode;
  }

  public void setCouponOfferCode(CouponOfferCode couponOfferCode) {
    this.couponOfferCode = couponOfferCode;
  }

  public CreateContract billingPeriodInMonth(BillingPeriodInMonth billingPeriodInMonth) {
    this.billingPeriodInMonth = billingPeriodInMonth;
    return this;
  }

   /**
   * Get billingPeriodInMonth
   * @return billingPeriodInMonth
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BillingPeriodInMonth getBillingPeriodInMonth() {
    return billingPeriodInMonth;
  }

  public void setBillingPeriodInMonth(BillingPeriodInMonth billingPeriodInMonth) {
    this.billingPeriodInMonth = billingPeriodInMonth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateContract createContract = (CreateContract) o;
    return Objects.equals(this.offerId, createContract.offerId) &&
        Objects.equals(this.storeCount, createContract.storeCount) &&
        Objects.equals(this.couponDiscountCode, createContract.couponDiscountCode) &&
        Objects.equals(this.couponOfferCode, createContract.couponOfferCode) &&
        Objects.equals(this.billingPeriodInMonth, createContract.billingPeriodInMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, storeCount, couponDiscountCode, couponOfferCode, billingPeriodInMonth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateContract {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    storeCount: ").append(toIndentedString(storeCount)).append("\n");
    sb.append("    couponDiscountCode: ").append(toIndentedString(couponDiscountCode)).append("\n");
    sb.append("    couponOfferCode: ").append(toIndentedString(couponOfferCode)).append("\n");
    sb.append("    billingPeriodInMonth: ").append(toIndentedString(billingPeriodInMonth)).append("\n");
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

