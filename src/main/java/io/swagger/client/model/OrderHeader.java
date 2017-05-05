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
import io.swagger.client.model.AccountId;
import io.swagger.client.model.BeezUPCommonCurrencyCode;
import io.swagger.client.model.BeezUPCommonHttpUrl;
import io.swagger.client.model.BeezUPOrderId;
import io.swagger.client.model.BeezUPOrderStatus;
import io.swagger.client.model.DefinitionsorderHeaderLinks;
import io.swagger.client.model.Etag;
import io.swagger.client.model.MarketplaceBusinessCode;
import io.swagger.client.model.MarketplaceOrderId;
import io.swagger.client.model.MarketplaceOrderStatus;
import io.swagger.client.model.MarketplaceTechnicalCode;
import io.swagger.client.model.OrderBuyerName;
import io.swagger.client.model.OrderMerchantECommerceSoftwareName;
import io.swagger.client.model.OrderMerchantECommerceSoftwareVersion;
import io.swagger.client.model.OrderMerchantOrderId;
import io.swagger.client.model.Processing;
import java.math.BigDecimal;
import org.joda.time.DateTime;

/**
 * Describe the basic information related to an order. All properties with the prefix order_ are translated in the list of values /user/lov/OrderMetaInfoOrderDetails
 */
@ApiModel(description = "Describe the basic information related to an order. All properties with the prefix order_ are translated in the list of values /user/lov/OrderMetaInfoOrderDetails")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:43:26.940Z")
public class OrderHeader {
  @SerializedName("marketplaceTechnicalCode")
  private MarketplaceTechnicalCode marketplaceTechnicalCode = null;

  @SerializedName("accountId")
  private AccountId accountId = null;

  @SerializedName("beezUPOrderId")
  private BeezUPOrderId beezUPOrderId = null;

  @SerializedName("beezUPOrderUrl")
  private BeezUPCommonHttpUrl beezUPOrderUrl = null;

  @SerializedName("marketplaceBusinessCode")
  private MarketplaceBusinessCode marketplaceBusinessCode = null;

  @SerializedName("order_MarketplaceOrderId")
  private MarketplaceOrderId orderMarketplaceOrderId = null;

  @SerializedName("order_Status_BeezUPOrderStatus")
  private BeezUPOrderStatus orderStatusBeezUPOrderStatus = null;

  @SerializedName("order_Status_MarketplaceOrderStatus")
  private MarketplaceOrderStatus orderStatusMarketplaceOrderStatus = null;

  @SerializedName("order_MerchantOrderId")
  private OrderMerchantOrderId orderMerchantOrderId = null;

  @SerializedName("order_MerchantECommerceSoftwareName")
  private OrderMerchantECommerceSoftwareName orderMerchantECommerceSoftwareName = null;

  @SerializedName("order_MerchantECommerceSoftwareVersion")
  private OrderMerchantECommerceSoftwareVersion orderMerchantECommerceSoftwareVersion = null;

  @SerializedName("order_PurchaseUtcDate")
  private DateTime orderPurchaseUtcDate = null;

  @SerializedName("order_LastModificationUtcDate")
  private DateTime orderLastModificationUtcDate = null;

  @SerializedName("order_MarketplaceLastModificationUtcDate")
  private DateTime orderMarketplaceLastModificationUtcDate = null;

  @SerializedName("order_Buyer_Name")
  private OrderBuyerName orderBuyerName = null;

  @SerializedName("order_TotalPrice")
  private BigDecimal orderTotalPrice = null;

  @SerializedName("order_CurrencyCode")
  private BeezUPCommonCurrencyCode orderCurrencyCode = null;

  @SerializedName("processing")
  private Processing processing = null;

  @SerializedName("etag")
  private Etag etag = null;

  @SerializedName("links")
  private DefinitionsorderHeaderLinks links = null;

  public OrderHeader marketplaceTechnicalCode(MarketplaceTechnicalCode marketplaceTechnicalCode) {
    this.marketplaceTechnicalCode = marketplaceTechnicalCode;
    return this;
  }

   /**
   * Get marketplaceTechnicalCode
   * @return marketplaceTechnicalCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public MarketplaceTechnicalCode getMarketplaceTechnicalCode() {
    return marketplaceTechnicalCode;
  }

  public void setMarketplaceTechnicalCode(MarketplaceTechnicalCode marketplaceTechnicalCode) {
    this.marketplaceTechnicalCode = marketplaceTechnicalCode;
  }

  public OrderHeader accountId(AccountId accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AccountId getAccountId() {
    return accountId;
  }

  public void setAccountId(AccountId accountId) {
    this.accountId = accountId;
  }

  public OrderHeader beezUPOrderId(BeezUPOrderId beezUPOrderId) {
    this.beezUPOrderId = beezUPOrderId;
    return this;
  }

   /**
   * Get beezUPOrderId
   * @return beezUPOrderId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPOrderId getBeezUPOrderId() {
    return beezUPOrderId;
  }

  public void setBeezUPOrderId(BeezUPOrderId beezUPOrderId) {
    this.beezUPOrderId = beezUPOrderId;
  }

  public OrderHeader beezUPOrderUrl(BeezUPCommonHttpUrl beezUPOrderUrl) {
    this.beezUPOrderUrl = beezUPOrderUrl;
    return this;
  }

   /**
   * Get beezUPOrderUrl
   * @return beezUPOrderUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonHttpUrl getBeezUPOrderUrl() {
    return beezUPOrderUrl;
  }

  public void setBeezUPOrderUrl(BeezUPCommonHttpUrl beezUPOrderUrl) {
    this.beezUPOrderUrl = beezUPOrderUrl;
  }

  public OrderHeader marketplaceBusinessCode(MarketplaceBusinessCode marketplaceBusinessCode) {
    this.marketplaceBusinessCode = marketplaceBusinessCode;
    return this;
  }

   /**
   * Get marketplaceBusinessCode
   * @return marketplaceBusinessCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public MarketplaceBusinessCode getMarketplaceBusinessCode() {
    return marketplaceBusinessCode;
  }

  public void setMarketplaceBusinessCode(MarketplaceBusinessCode marketplaceBusinessCode) {
    this.marketplaceBusinessCode = marketplaceBusinessCode;
  }

  public OrderHeader orderMarketplaceOrderId(MarketplaceOrderId orderMarketplaceOrderId) {
    this.orderMarketplaceOrderId = orderMarketplaceOrderId;
    return this;
  }

   /**
   * Get orderMarketplaceOrderId
   * @return orderMarketplaceOrderId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public MarketplaceOrderId getOrderMarketplaceOrderId() {
    return orderMarketplaceOrderId;
  }

  public void setOrderMarketplaceOrderId(MarketplaceOrderId orderMarketplaceOrderId) {
    this.orderMarketplaceOrderId = orderMarketplaceOrderId;
  }

  public OrderHeader orderStatusBeezUPOrderStatus(BeezUPOrderStatus orderStatusBeezUPOrderStatus) {
    this.orderStatusBeezUPOrderStatus = orderStatusBeezUPOrderStatus;
    return this;
  }

   /**
   * Get orderStatusBeezUPOrderStatus
   * @return orderStatusBeezUPOrderStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPOrderStatus getOrderStatusBeezUPOrderStatus() {
    return orderStatusBeezUPOrderStatus;
  }

  public void setOrderStatusBeezUPOrderStatus(BeezUPOrderStatus orderStatusBeezUPOrderStatus) {
    this.orderStatusBeezUPOrderStatus = orderStatusBeezUPOrderStatus;
  }

  public OrderHeader orderStatusMarketplaceOrderStatus(MarketplaceOrderStatus orderStatusMarketplaceOrderStatus) {
    this.orderStatusMarketplaceOrderStatus = orderStatusMarketplaceOrderStatus;
    return this;
  }

   /**
   * Get orderStatusMarketplaceOrderStatus
   * @return orderStatusMarketplaceOrderStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public MarketplaceOrderStatus getOrderStatusMarketplaceOrderStatus() {
    return orderStatusMarketplaceOrderStatus;
  }

  public void setOrderStatusMarketplaceOrderStatus(MarketplaceOrderStatus orderStatusMarketplaceOrderStatus) {
    this.orderStatusMarketplaceOrderStatus = orderStatusMarketplaceOrderStatus;
  }

  public OrderHeader orderMerchantOrderId(OrderMerchantOrderId orderMerchantOrderId) {
    this.orderMerchantOrderId = orderMerchantOrderId;
    return this;
  }

   /**
   * Get orderMerchantOrderId
   * @return orderMerchantOrderId
  **/
  @ApiModelProperty(example = "null", value = "")
  public OrderMerchantOrderId getOrderMerchantOrderId() {
    return orderMerchantOrderId;
  }

  public void setOrderMerchantOrderId(OrderMerchantOrderId orderMerchantOrderId) {
    this.orderMerchantOrderId = orderMerchantOrderId;
  }

  public OrderHeader orderMerchantECommerceSoftwareName(OrderMerchantECommerceSoftwareName orderMerchantECommerceSoftwareName) {
    this.orderMerchantECommerceSoftwareName = orderMerchantECommerceSoftwareName;
    return this;
  }

   /**
   * Get orderMerchantECommerceSoftwareName
   * @return orderMerchantECommerceSoftwareName
  **/
  @ApiModelProperty(example = "null", value = "")
  public OrderMerchantECommerceSoftwareName getOrderMerchantECommerceSoftwareName() {
    return orderMerchantECommerceSoftwareName;
  }

  public void setOrderMerchantECommerceSoftwareName(OrderMerchantECommerceSoftwareName orderMerchantECommerceSoftwareName) {
    this.orderMerchantECommerceSoftwareName = orderMerchantECommerceSoftwareName;
  }

  public OrderHeader orderMerchantECommerceSoftwareVersion(OrderMerchantECommerceSoftwareVersion orderMerchantECommerceSoftwareVersion) {
    this.orderMerchantECommerceSoftwareVersion = orderMerchantECommerceSoftwareVersion;
    return this;
  }

   /**
   * Get orderMerchantECommerceSoftwareVersion
   * @return orderMerchantECommerceSoftwareVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public OrderMerchantECommerceSoftwareVersion getOrderMerchantECommerceSoftwareVersion() {
    return orderMerchantECommerceSoftwareVersion;
  }

  public void setOrderMerchantECommerceSoftwareVersion(OrderMerchantECommerceSoftwareVersion orderMerchantECommerceSoftwareVersion) {
    this.orderMerchantECommerceSoftwareVersion = orderMerchantECommerceSoftwareVersion;
  }

  public OrderHeader orderPurchaseUtcDate(DateTime orderPurchaseUtcDate) {
    this.orderPurchaseUtcDate = orderPurchaseUtcDate;
    return this;
  }

   /**
   * The purchase date of this order
   * @return orderPurchaseUtcDate
  **/
  @ApiModelProperty(example = "2017-03-31T21:30:23Z", required = true, value = "The purchase date of this order")
  public DateTime getOrderPurchaseUtcDate() {
    return orderPurchaseUtcDate;
  }

  public void setOrderPurchaseUtcDate(DateTime orderPurchaseUtcDate) {
    this.orderPurchaseUtcDate = orderPurchaseUtcDate;
  }

  public OrderHeader orderLastModificationUtcDate(DateTime orderLastModificationUtcDate) {
    this.orderLastModificationUtcDate = orderLastModificationUtcDate;
    return this;
  }

   /**
   * The last modification UTC date done by BeezUP of this order
   * @return orderLastModificationUtcDate
  **/
  @ApiModelProperty(example = "2017-04-16T10:30:23Z", required = true, value = "The last modification UTC date done by BeezUP of this order")
  public DateTime getOrderLastModificationUtcDate() {
    return orderLastModificationUtcDate;
  }

  public void setOrderLastModificationUtcDate(DateTime orderLastModificationUtcDate) {
    this.orderLastModificationUtcDate = orderLastModificationUtcDate;
  }

  public OrderHeader orderMarketplaceLastModificationUtcDate(DateTime orderMarketplaceLastModificationUtcDate) {
    this.orderMarketplaceLastModificationUtcDate = orderMarketplaceLastModificationUtcDate;
    return this;
  }

   /**
   * The last modification UTC date done by the marketplace on this order
   * @return orderMarketplaceLastModificationUtcDate
  **/
  @ApiModelProperty(example = "2017-04-16T10:25:23Z", required = true, value = "The last modification UTC date done by the marketplace on this order")
  public DateTime getOrderMarketplaceLastModificationUtcDate() {
    return orderMarketplaceLastModificationUtcDate;
  }

  public void setOrderMarketplaceLastModificationUtcDate(DateTime orderMarketplaceLastModificationUtcDate) {
    this.orderMarketplaceLastModificationUtcDate = orderMarketplaceLastModificationUtcDate;
  }

  public OrderHeader orderBuyerName(OrderBuyerName orderBuyerName) {
    this.orderBuyerName = orderBuyerName;
    return this;
  }

   /**
   * Get orderBuyerName
   * @return orderBuyerName
  **/
  @ApiModelProperty(example = "null", value = "")
  public OrderBuyerName getOrderBuyerName() {
    return orderBuyerName;
  }

  public void setOrderBuyerName(OrderBuyerName orderBuyerName) {
    this.orderBuyerName = orderBuyerName;
  }

  public OrderHeader orderTotalPrice(BigDecimal orderTotalPrice) {
    this.orderTotalPrice = orderTotalPrice;
    return this;
  }

   /**
   * The total price of this order (corresponding to the amount paid by the customer)
   * @return orderTotalPrice
  **/
  @ApiModelProperty(example = "101.42", value = "The total price of this order (corresponding to the amount paid by the customer)")
  public BigDecimal getOrderTotalPrice() {
    return orderTotalPrice;
  }

  public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
    this.orderTotalPrice = orderTotalPrice;
  }

  public OrderHeader orderCurrencyCode(BeezUPCommonCurrencyCode orderCurrencyCode) {
    this.orderCurrencyCode = orderCurrencyCode;
    return this;
  }

   /**
   * Get orderCurrencyCode
   * @return orderCurrencyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonCurrencyCode getOrderCurrencyCode() {
    return orderCurrencyCode;
  }

  public void setOrderCurrencyCode(BeezUPCommonCurrencyCode orderCurrencyCode) {
    this.orderCurrencyCode = orderCurrencyCode;
  }

  public OrderHeader processing(Processing processing) {
    this.processing = processing;
    return this;
  }

   /**
   * Get processing
   * @return processing
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Processing getProcessing() {
    return processing;
  }

  public void setProcessing(Processing processing) {
    this.processing = processing;
  }

  public OrderHeader etag(Etag etag) {
    this.etag = etag;
    return this;
  }

   /**
   * Get etag
   * @return etag
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Etag getEtag() {
    return etag;
  }

  public void setEtag(Etag etag) {
    this.etag = etag;
  }

  public OrderHeader links(DefinitionsorderHeaderLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DefinitionsorderHeaderLinks getLinks() {
    return links;
  }

  public void setLinks(DefinitionsorderHeaderLinks links) {
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
    OrderHeader orderHeader = (OrderHeader) o;
    return Objects.equals(this.marketplaceTechnicalCode, orderHeader.marketplaceTechnicalCode) &&
        Objects.equals(this.accountId, orderHeader.accountId) &&
        Objects.equals(this.beezUPOrderId, orderHeader.beezUPOrderId) &&
        Objects.equals(this.beezUPOrderUrl, orderHeader.beezUPOrderUrl) &&
        Objects.equals(this.marketplaceBusinessCode, orderHeader.marketplaceBusinessCode) &&
        Objects.equals(this.orderMarketplaceOrderId, orderHeader.orderMarketplaceOrderId) &&
        Objects.equals(this.orderStatusBeezUPOrderStatus, orderHeader.orderStatusBeezUPOrderStatus) &&
        Objects.equals(this.orderStatusMarketplaceOrderStatus, orderHeader.orderStatusMarketplaceOrderStatus) &&
        Objects.equals(this.orderMerchantOrderId, orderHeader.orderMerchantOrderId) &&
        Objects.equals(this.orderMerchantECommerceSoftwareName, orderHeader.orderMerchantECommerceSoftwareName) &&
        Objects.equals(this.orderMerchantECommerceSoftwareVersion, orderHeader.orderMerchantECommerceSoftwareVersion) &&
        Objects.equals(this.orderPurchaseUtcDate, orderHeader.orderPurchaseUtcDate) &&
        Objects.equals(this.orderLastModificationUtcDate, orderHeader.orderLastModificationUtcDate) &&
        Objects.equals(this.orderMarketplaceLastModificationUtcDate, orderHeader.orderMarketplaceLastModificationUtcDate) &&
        Objects.equals(this.orderBuyerName, orderHeader.orderBuyerName) &&
        Objects.equals(this.orderTotalPrice, orderHeader.orderTotalPrice) &&
        Objects.equals(this.orderCurrencyCode, orderHeader.orderCurrencyCode) &&
        Objects.equals(this.processing, orderHeader.processing) &&
        Objects.equals(this.etag, orderHeader.etag) &&
        Objects.equals(this.links, orderHeader.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceTechnicalCode, accountId, beezUPOrderId, beezUPOrderUrl, marketplaceBusinessCode, orderMarketplaceOrderId, orderStatusBeezUPOrderStatus, orderStatusMarketplaceOrderStatus, orderMerchantOrderId, orderMerchantECommerceSoftwareName, orderMerchantECommerceSoftwareVersion, orderPurchaseUtcDate, orderLastModificationUtcDate, orderMarketplaceLastModificationUtcDate, orderBuyerName, orderTotalPrice, orderCurrencyCode, processing, etag, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderHeader {\n");
    
    sb.append("    marketplaceTechnicalCode: ").append(toIndentedString(marketplaceTechnicalCode)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    beezUPOrderId: ").append(toIndentedString(beezUPOrderId)).append("\n");
    sb.append("    beezUPOrderUrl: ").append(toIndentedString(beezUPOrderUrl)).append("\n");
    sb.append("    marketplaceBusinessCode: ").append(toIndentedString(marketplaceBusinessCode)).append("\n");
    sb.append("    orderMarketplaceOrderId: ").append(toIndentedString(orderMarketplaceOrderId)).append("\n");
    sb.append("    orderStatusBeezUPOrderStatus: ").append(toIndentedString(orderStatusBeezUPOrderStatus)).append("\n");
    sb.append("    orderStatusMarketplaceOrderStatus: ").append(toIndentedString(orderStatusMarketplaceOrderStatus)).append("\n");
    sb.append("    orderMerchantOrderId: ").append(toIndentedString(orderMerchantOrderId)).append("\n");
    sb.append("    orderMerchantECommerceSoftwareName: ").append(toIndentedString(orderMerchantECommerceSoftwareName)).append("\n");
    sb.append("    orderMerchantECommerceSoftwareVersion: ").append(toIndentedString(orderMerchantECommerceSoftwareVersion)).append("\n");
    sb.append("    orderPurchaseUtcDate: ").append(toIndentedString(orderPurchaseUtcDate)).append("\n");
    sb.append("    orderLastModificationUtcDate: ").append(toIndentedString(orderLastModificationUtcDate)).append("\n");
    sb.append("    orderMarketplaceLastModificationUtcDate: ").append(toIndentedString(orderMarketplaceLastModificationUtcDate)).append("\n");
    sb.append("    orderBuyerName: ").append(toIndentedString(orderBuyerName)).append("\n");
    sb.append("    orderTotalPrice: ").append(toIndentedString(orderTotalPrice)).append("\n");
    sb.append("    orderCurrencyCode: ").append(toIndentedString(orderCurrencyCode)).append("\n");
    sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

