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
import io.swagger.client.model.BeezUPCommonChannelBasicInfo;
import io.swagger.client.model.BeezUPCommonCurrencyCode;
import io.swagger.client.model.TrackedOrderProduct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * TrackedOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class TrackedOrder {
  @SerializedName("utcDate")
  private DateTime utcDate = null;

  @SerializedName("channel")
  private BeezUPCommonChannelBasicInfo channel = null;

  @SerializedName("merchantOrderId")
  private String merchantOrderId = null;

  @SerializedName("totalAmount")
  private BigDecimal totalAmount = null;

  @SerializedName("currencyCode")
  private BeezUPCommonCurrencyCode currencyCode = null;

  @SerializedName("paymentValidated")
  private Boolean paymentValidated = null;

  @SerializedName("products")
  private List<TrackedOrderProduct> products = new ArrayList<TrackedOrderProduct>();

  public TrackedOrder utcDate(DateTime utcDate) {
    this.utcDate = utcDate;
    return this;
  }

   /**
   * The utc date of the order.
   * @return utcDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", required = true, value = "The utc date of the order.")
  public DateTime getUtcDate() {
    return utcDate;
  }

  public void setUtcDate(DateTime utcDate) {
    this.utcDate = utcDate;
  }

  public TrackedOrder channel(BeezUPCommonChannelBasicInfo channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelBasicInfo getChannel() {
    return channel;
  }

  public void setChannel(BeezUPCommonChannelBasicInfo channel) {
    this.channel = channel;
  }

  public TrackedOrder merchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
    return this;
  }

   /**
   * The merchant order identifier
   * @return merchantOrderId
  **/
  @ApiModelProperty(example = "My_Merchant_Order_Id", required = true, value = "The merchant order identifier")
  public String getMerchantOrderId() {
    return merchantOrderId;
  }

  public void setMerchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
  }

  public TrackedOrder totalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * The total amount related to the order.
   * @return totalAmount
  **/
  @ApiModelProperty(example = "101.42", required = true, value = "The total amount related to the order.")
  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public TrackedOrder currencyCode(BeezUPCommonCurrencyCode currencyCode) {
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

  public TrackedOrder paymentValidated(Boolean paymentValidated) {
    this.paymentValidated = paymentValidated;
    return this;
  }

   /**
   * Indicate if the payment of this order has been validated or not.
   * @return paymentValidated
  **/
  @ApiModelProperty(example = "false", required = true, value = "Indicate if the payment of this order has been validated or not.")
  public Boolean getPaymentValidated() {
    return paymentValidated;
  }

  public void setPaymentValidated(Boolean paymentValidated) {
    this.paymentValidated = paymentValidated;
  }

  public TrackedOrder products(List<TrackedOrderProduct> products) {
    this.products = products;
    return this;
  }

  public TrackedOrder addProductsItem(TrackedOrderProduct productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * the product list related to this order.
   * @return products
  **/
  @ApiModelProperty(example = "[{&quot;productId&quot;:&quot;00000000-0000-0000-0000-000000000000&quot;,&quot;productSku&quot;:&quot;SKU123345&quot;,&quot;productTitle&quot;:&quot;My super product title&quot;,&quot;productImageUrl&quot;:&quot;http://i2.cdscdn.com/pdt2/3/9/0/1/550x550/hai6901018043390/rw/haier-b20fwrss-refrigerateur-americain.jpg&quot;,&quot;productActive&quot;:true,&quot;unitPrice&quot;:101.42,&quot;quantity&quot;:1.0,&quot;margin&quot;:9.66}]", required = true, value = "the product list related to this order.")
  public List<TrackedOrderProduct> getProducts() {
    return products;
  }

  public void setProducts(List<TrackedOrderProduct> products) {
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
    TrackedOrder trackedOrder = (TrackedOrder) o;
    return Objects.equals(this.utcDate, trackedOrder.utcDate) &&
        Objects.equals(this.channel, trackedOrder.channel) &&
        Objects.equals(this.merchantOrderId, trackedOrder.merchantOrderId) &&
        Objects.equals(this.totalAmount, trackedOrder.totalAmount) &&
        Objects.equals(this.currencyCode, trackedOrder.currencyCode) &&
        Objects.equals(this.paymentValidated, trackedOrder.paymentValidated) &&
        Objects.equals(this.products, trackedOrder.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utcDate, channel, merchantOrderId, totalAmount, currencyCode, paymentValidated, products);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedOrder {\n");
    
    sb.append("    utcDate: ").append(toIndentedString(utcDate)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    merchantOrderId: ").append(toIndentedString(merchantOrderId)).append("\n");
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

