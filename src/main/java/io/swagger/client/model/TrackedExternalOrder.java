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
import io.swagger.client.model.TrackedExternalOrderProduct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * TrackedExternalOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:58:38.338Z")
public class TrackedExternalOrder {
  @SerializedName("utcDate")
  private DateTime utcDate = null;

  @SerializedName("merchantOrderId")
  private String merchantOrderId = null;

  @SerializedName("visitorId")
  private String visitorId = null;

  @SerializedName("totalAmount")
  private BigDecimal totalAmount = null;

  @SerializedName("currencyCode")
  private BeezUPCommonCurrencyCode currencyCode = null;

  @SerializedName("paymentValidated")
  private Boolean paymentValidated = null;

  @SerializedName("products")
  private List<TrackedExternalOrderProduct> products = new ArrayList<TrackedExternalOrderProduct>();

  public TrackedExternalOrder utcDate(DateTime utcDate) {
    this.utcDate = utcDate;
    return this;
  }

   /**
   * The utc date of the external order.
   * @return utcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", required = true, value = "The utc date of the external order.")
  public DateTime getUtcDate() {
    return utcDate;
  }

  public void setUtcDate(DateTime utcDate) {
    this.utcDate = utcDate;
  }

  public TrackedExternalOrder merchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
    return this;
  }

   /**
   * The merchant order identifier
   * @return merchantOrderId
  **/
  @ApiModelProperty(example = "My_Order_Merchant_Id", required = true, value = "The merchant order identifier")
  public String getMerchantOrderId() {
    return merchantOrderId;
  }

  public void setMerchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
  }

  public TrackedExternalOrder visitorId(String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

   /**
   * Can be null. The visitor identifier related to this external order
   * @return visitorId
  **/
  @ApiModelProperty(example = "A_VISITOR_ID", value = "Can be null. The visitor identifier related to this external order")
  public String getVisitorId() {
    return visitorId;
  }

  public void setVisitorId(String visitorId) {
    this.visitorId = visitorId;
  }

  public TrackedExternalOrder totalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * The total amount related to the external order.
   * @return totalAmount
  **/
  @ApiModelProperty(example = "101.42", required = true, value = "The total amount related to the external order.")
  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public TrackedExternalOrder currencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonCurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public TrackedExternalOrder paymentValidated(Boolean paymentValidated) {
    this.paymentValidated = paymentValidated;
    return this;
  }

   /**
   * Indicate if the payment of this external order has been validated or not.
   * @return paymentValidated
  **/
  @ApiModelProperty(example = "false", required = true, value = "Indicate if the payment of this external order has been validated or not.")
  public Boolean getPaymentValidated() {
    return paymentValidated;
  }

  public void setPaymentValidated(Boolean paymentValidated) {
    this.paymentValidated = paymentValidated;
  }

  public TrackedExternalOrder products(List<TrackedExternalOrderProduct> products) {
    this.products = products;
    return this;
  }

  public TrackedExternalOrder addProductsItem(TrackedExternalOrderProduct productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * Can be null. the product list related to this external order.
   * @return products
  **/
  @ApiModelProperty(example = "[{&quot;productSku&quot;:&quot;something&quot;,&quot;productTitle&quot;:&quot;Something great&quot;,&quot;productImageUrl&quot;:&quot;http://cdn3.sarenza.net/static/_img/productsV4/0000010744/MD_0000010744_29411_09.jpg?201308142051&quot;,&quot;productActive&quot;:true,&quot;merchantOrderId&quot;:&quot;My_Merchant_Order_Id&quot;,&quot;unitPrice&quot;:&quot;101.42&quot;,&quot;quantity&quot;:&quot;1.00&quot;,&quot;margin&quot;:&quot;9.66&quot;}]", value = "Can be null. the product list related to this external order.")
  public List<TrackedExternalOrderProduct> getProducts() {
    return products;
  }

  public void setProducts(List<TrackedExternalOrderProduct> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackedExternalOrder trackedExternalOrder = (TrackedExternalOrder) o;
    return Objects.equals(this.utcDate, trackedExternalOrder.utcDate) &&
        Objects.equals(this.merchantOrderId, trackedExternalOrder.merchantOrderId) &&
        Objects.equals(this.visitorId, trackedExternalOrder.visitorId) &&
        Objects.equals(this.totalAmount, trackedExternalOrder.totalAmount) &&
        Objects.equals(this.currencyCode, trackedExternalOrder.currencyCode) &&
        Objects.equals(this.paymentValidated, trackedExternalOrder.paymentValidated) &&
        Objects.equals(this.products, trackedExternalOrder.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utcDate, merchantOrderId, visitorId, totalAmount, currencyCode, paymentValidated, products);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedExternalOrder {\n");
    
    sb.append("    utcDate: ").append(toIndentedString(utcDate)).append("\n");
    sb.append("    merchantOrderId: ").append(toIndentedString(merchantOrderId)).append("\n");
    sb.append("    visitorId: ").append(toIndentedString(visitorId)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    paymentValidated: ").append(toIndentedString(paymentValidated)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

