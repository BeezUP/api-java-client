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
import io.swagger.client.model.AccountId;
import io.swagger.client.model.BeezUPCommonMarketplaceBusinessCode;
import io.swagger.client.model.BeezUPCommonMarketplaceTechnicalCode;
import io.swagger.client.model.BeezUPOrderStatus;
import io.swagger.client.model.DateSearchType;
import io.swagger.client.model.MarketplaceOrderId;
import io.swagger.client.model.OrderBuyerName;
import io.swagger.client.model.OrderMerchantOrderId;
import io.swagger.client.model.PageNumber;
import io.swagger.client.model.PageSize;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * OrderListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:48:39.678Z")
public class OrderListRequest {
  @SerializedName("marketplaceTechnicalCodes")
  private List<BeezUPCommonMarketplaceTechnicalCode> marketplaceTechnicalCodes = new ArrayList<BeezUPCommonMarketplaceTechnicalCode>();

  @SerializedName("marketplaceBusinessCodes")
  private List<BeezUPCommonMarketplaceBusinessCode> marketplaceBusinessCodes = new ArrayList<BeezUPCommonMarketplaceBusinessCode>();

  @SerializedName("accountIds")
  private List<AccountId> accountIds = new ArrayList<AccountId>();

  @SerializedName("beezUPOrderStatuses")
  private List<BeezUPOrderStatus> beezUPOrderStatuses = new ArrayList<BeezUPOrderStatus>();

  @SerializedName("dateSearchType")
  private DateSearchType dateSearchType = null;

  @SerializedName("beginPeriodUtcDate")
  private DateTime beginPeriodUtcDate = null;

  @SerializedName("endPeriodUtcDate")
  private DateTime endPeriodUtcDate = null;

  @SerializedName("order_Buyer_Name")
  private OrderBuyerName orderBuyerName = null;

  @SerializedName("marketplaceOrderIds")
  private List<MarketplaceOrderId> marketplaceOrderIds = new ArrayList<MarketplaceOrderId>();

  @SerializedName("order_MerchantOrderIds")
  private List<OrderMerchantOrderId> orderMerchantOrderIds = new ArrayList<OrderMerchantOrderId>();

  @SerializedName("pageSize")
  private PageSize pageSize = null;

  @SerializedName("pageNumber")
  private PageNumber pageNumber = null;

  public OrderListRequest marketplaceTechnicalCodes(List<BeezUPCommonMarketplaceTechnicalCode> marketplaceTechnicalCodes) {
    this.marketplaceTechnicalCodes = marketplaceTechnicalCodes;
    return this;
  }

  public OrderListRequest addMarketplaceTechnicalCodesItem(BeezUPCommonMarketplaceTechnicalCode marketplaceTechnicalCodesItem) {
    this.marketplaceTechnicalCodes.add(marketplaceTechnicalCodesItem);
    return this;
  }

   /**
   * Get marketplaceTechnicalCodes
   * @return marketplaceTechnicalCodes
  **/
  @ApiModelProperty(example = "[&quot;PriceMinister&quot;]", value = "")
  public List<BeezUPCommonMarketplaceTechnicalCode> getMarketplaceTechnicalCodes() {
    return marketplaceTechnicalCodes;
  }

  public void setMarketplaceTechnicalCodes(List<BeezUPCommonMarketplaceTechnicalCode> marketplaceTechnicalCodes) {
    this.marketplaceTechnicalCodes = marketplaceTechnicalCodes;
  }

  public OrderListRequest marketplaceBusinessCodes(List<BeezUPCommonMarketplaceBusinessCode> marketplaceBusinessCodes) {
    this.marketplaceBusinessCodes = marketplaceBusinessCodes;
    return this;
  }

  public OrderListRequest addMarketplaceBusinessCodesItem(BeezUPCommonMarketplaceBusinessCode marketplaceBusinessCodesItem) {
    this.marketplaceBusinessCodes.add(marketplaceBusinessCodesItem);
    return this;
  }

   /**
   * Get marketplaceBusinessCodes
   * @return marketplaceBusinessCodes
  **/
  @ApiModelProperty(example = "[&quot;PRICEMINISTER&quot;]", value = "")
  public List<BeezUPCommonMarketplaceBusinessCode> getMarketplaceBusinessCodes() {
    return marketplaceBusinessCodes;
  }

  public void setMarketplaceBusinessCodes(List<BeezUPCommonMarketplaceBusinessCode> marketplaceBusinessCodes) {
    this.marketplaceBusinessCodes = marketplaceBusinessCodes;
  }

  public OrderListRequest accountIds(List<AccountId> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public OrderListRequest addAccountIdsItem(AccountId accountIdsItem) {
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * Account id list
   * @return accountIds
  **/
  @ApiModelProperty(example = "[12345]", value = "Account id list")
  public List<AccountId> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(List<AccountId> accountIds) {
    this.accountIds = accountIds;
  }

  public OrderListRequest beezUPOrderStatuses(List<BeezUPOrderStatus> beezUPOrderStatuses) {
    this.beezUPOrderStatuses = beezUPOrderStatuses;
    return this;
  }

  public OrderListRequest addBeezUPOrderStatusesItem(BeezUPOrderStatus beezUPOrderStatusesItem) {
    this.beezUPOrderStatuses.add(beezUPOrderStatusesItem);
    return this;
  }

   /**
   * Get beezUPOrderStatuses
   * @return beezUPOrderStatuses
  **/
  @ApiModelProperty(example = "[&quot;InProgress&quot;]", value = "")
  public List<BeezUPOrderStatus> getBeezUPOrderStatuses() {
    return beezUPOrderStatuses;
  }

  public void setBeezUPOrderStatuses(List<BeezUPOrderStatus> beezUPOrderStatuses) {
    this.beezUPOrderStatuses = beezUPOrderStatuses;
  }

  public OrderListRequest dateSearchType(DateSearchType dateSearchType) {
    this.dateSearchType = dateSearchType;
    return this;
  }

   /**
   * Get dateSearchType
   * @return dateSearchType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateSearchType getDateSearchType() {
    return dateSearchType;
  }

  public void setDateSearchType(DateSearchType dateSearchType) {
    this.dateSearchType = dateSearchType;
  }

  public OrderListRequest beginPeriodUtcDate(DateTime beginPeriodUtcDate) {
    this.beginPeriodUtcDate = beginPeriodUtcDate;
    return this;
  }

   /**
   * The begin period you want to make the search. \\ The period MUST not be greater than 30 days. The begin period MUST be lower than the end period.  
   * @return beginPeriodUtcDate
  **/
  @ApiModelProperty(example = "2017-03-01T13:10:01Z", required = true, value = "The begin period you want to make the search. \\ The period MUST not be greater than 30 days. The begin period MUST be lower than the end period.  ")
  public DateTime getBeginPeriodUtcDate() {
    return beginPeriodUtcDate;
  }

  public void setBeginPeriodUtcDate(DateTime beginPeriodUtcDate) {
    this.beginPeriodUtcDate = beginPeriodUtcDate;
  }

  public OrderListRequest endPeriodUtcDate(DateTime endPeriodUtcDate) {
    this.endPeriodUtcDate = endPeriodUtcDate;
    return this;
  }

   /**
   * The end period of you search. \\ The period MUST not be greater than 30 days. \\ The end period MUST be greater than the begin period.  The end period MUST be lower to the current date. 
   * @return endPeriodUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:10:01Z", required = true, value = "The end period of you search. \\ The period MUST not be greater than 30 days. \\ The end period MUST be greater than the begin period.  The end period MUST be lower to the current date. ")
  public DateTime getEndPeriodUtcDate() {
    return endPeriodUtcDate;
  }

  public void setEndPeriodUtcDate(DateTime endPeriodUtcDate) {
    this.endPeriodUtcDate = endPeriodUtcDate;
  }

  public OrderListRequest orderBuyerName(OrderBuyerName orderBuyerName) {
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

  public OrderListRequest marketplaceOrderIds(List<MarketplaceOrderId> marketplaceOrderIds) {
    this.marketplaceOrderIds = marketplaceOrderIds;
    return this;
  }

  public OrderListRequest addMarketplaceOrderIdsItem(MarketplaceOrderId marketplaceOrderIdsItem) {
    this.marketplaceOrderIds.add(marketplaceOrderIdsItem);
    return this;
  }

   /**
   * Get marketplaceOrderIds
   * @return marketplaceOrderIds
  **/
  @ApiModelProperty(example = "[&quot;AmazonOrderId1234&quot;]", value = "")
  public List<MarketplaceOrderId> getMarketplaceOrderIds() {
    return marketplaceOrderIds;
  }

  public void setMarketplaceOrderIds(List<MarketplaceOrderId> marketplaceOrderIds) {
    this.marketplaceOrderIds = marketplaceOrderIds;
  }

  public OrderListRequest orderMerchantOrderIds(List<OrderMerchantOrderId> orderMerchantOrderIds) {
    this.orderMerchantOrderIds = orderMerchantOrderIds;
    return this;
  }

  public OrderListRequest addOrderMerchantOrderIdsItem(OrderMerchantOrderId orderMerchantOrderIdsItem) {
    this.orderMerchantOrderIds.add(orderMerchantOrderIdsItem);
    return this;
  }

   /**
   * Merchant order id list
   * @return orderMerchantOrderIds
  **/
  @ApiModelProperty(example = "[&quot;MyOrderId1234&quot;]", value = "Merchant order id list")
  public List<OrderMerchantOrderId> getOrderMerchantOrderIds() {
    return orderMerchantOrderIds;
  }

  public void setOrderMerchantOrderIds(List<OrderMerchantOrderId> orderMerchantOrderIds) {
    this.orderMerchantOrderIds = orderMerchantOrderIds;
  }

  public OrderListRequest pageSize(PageSize pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PageSize getPageSize() {
    return pageSize;
  }

  public void setPageSize(PageSize pageSize) {
    this.pageSize = pageSize;
  }

  public OrderListRequest pageNumber(PageNumber pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PageNumber getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(PageNumber pageNumber) {
    this.pageNumber = pageNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderListRequest orderListRequest = (OrderListRequest) o;
    return Objects.equals(this.marketplaceTechnicalCodes, orderListRequest.marketplaceTechnicalCodes) &&
        Objects.equals(this.marketplaceBusinessCodes, orderListRequest.marketplaceBusinessCodes) &&
        Objects.equals(this.accountIds, orderListRequest.accountIds) &&
        Objects.equals(this.beezUPOrderStatuses, orderListRequest.beezUPOrderStatuses) &&
        Objects.equals(this.dateSearchType, orderListRequest.dateSearchType) &&
        Objects.equals(this.beginPeriodUtcDate, orderListRequest.beginPeriodUtcDate) &&
        Objects.equals(this.endPeriodUtcDate, orderListRequest.endPeriodUtcDate) &&
        Objects.equals(this.orderBuyerName, orderListRequest.orderBuyerName) &&
        Objects.equals(this.marketplaceOrderIds, orderListRequest.marketplaceOrderIds) &&
        Objects.equals(this.orderMerchantOrderIds, orderListRequest.orderMerchantOrderIds) &&
        Objects.equals(this.pageSize, orderListRequest.pageSize) &&
        Objects.equals(this.pageNumber, orderListRequest.pageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceTechnicalCodes, marketplaceBusinessCodes, accountIds, beezUPOrderStatuses, dateSearchType, beginPeriodUtcDate, endPeriodUtcDate, orderBuyerName, marketplaceOrderIds, orderMerchantOrderIds, pageSize, pageNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderListRequest {\n");
    
    sb.append("    marketplaceTechnicalCodes: ").append(toIndentedString(marketplaceTechnicalCodes)).append("\n");
    sb.append("    marketplaceBusinessCodes: ").append(toIndentedString(marketplaceBusinessCodes)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    beezUPOrderStatuses: ").append(toIndentedString(beezUPOrderStatuses)).append("\n");
    sb.append("    dateSearchType: ").append(toIndentedString(dateSearchType)).append("\n");
    sb.append("    beginPeriodUtcDate: ").append(toIndentedString(beginPeriodUtcDate)).append("\n");
    sb.append("    endPeriodUtcDate: ").append(toIndentedString(endPeriodUtcDate)).append("\n");
    sb.append("    orderBuyerName: ").append(toIndentedString(orderBuyerName)).append("\n");
    sb.append("    marketplaceOrderIds: ").append(toIndentedString(marketplaceOrderIds)).append("\n");
    sb.append("    orderMerchantOrderIds: ").append(toIndentedString(orderMerchantOrderIds)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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

