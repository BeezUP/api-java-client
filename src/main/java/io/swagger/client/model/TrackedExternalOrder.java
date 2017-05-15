/*
 * BeezUP API
 * # The REST API of BeezUP system ## Overview The REST APIs provide programmatic access to read and write BeezUP data.  Basically, with this API you will be able to do everything like you were with your browser on https://go.beezup.com !  The main features are: - Register and manage your account - Create and manage and share your stores with your friends/co-workers. - Import your product catalog and schedule the auto importation - Search the channels your want to use - Configure your channels for your catalogs to export your product information:     - cost and general settings     - category and columns mappings     - your will be able to create and manage your custom column     - put in place exlusion filters based on simple conditions on your product data     - override product values     - get product vision for a channel catalog scope - Analyze and optimize your performance of your catalogs on all yours channels with different type of reportings by day, channel, category and by product. - Automatize your optimisation by using rules! - And of course... Manage your orders harvested from all your marketplaces:     - Synchronize your orders in an uniformized way     - Get the available actions and update the order status - ...and more!  ## Authentication credentials The public API with the base path **_/v2/public** have been put in place to give you an entry point to our system for the user registration, login and lost password. The public API does not require any credentials. We give you the some public list of values and public channels for our public commercial web site [www.beezup.com](http://www.beezup.com).  The user API with the base path **_/v2/user** requires a token which is available on this page: https://go.beezup.com/Account/MyAccount  ## Things to keep in mind ### API Rate Limits - The BeezUP REST API is limited to 100 calls/minute.  ### Media type The default media type for requests and responses is application/json. Where noted, some operations support other content types. If no additional content type is mentioned for a specific operation, then the media type is application/json.  ### Required content type The required and default encoding for the request and responses is UTF8.  ### Required date time format All our date time are formatted in ISO 8601 format: 2014-06-24T16:25:00Z.  ### Base URL The Base URL of the BeezUP API Order Management REST API conforms to the following template.  https://api.beezup.com  All URLs returned by the BeezUP API are relative to this base URL, and all requests to the REST API must use this base URL template.  You can test our API on https://api-docs.beezup.com/swagger-ui\\ You can contact us on [gitter, #BeezUP/API](https://gitter.im/beezUP/API) 
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T13:43:05.416Z")
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

