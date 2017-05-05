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
import java.math.BigDecimal;

/**
 * Describe an order item. All properties with the prefix orderItem_ are translated in the list of values /user/lov/OrderMetaInfoOrderItems
 */
@ApiModel(description = "Describe an order item. All properties with the prefix orderItem_ are translated in the list of values /user/lov/OrderMetaInfoOrderItems")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:58:38.338Z")
public class OrderItem {
  @SerializedName("beezUPOrderItemId")
  private String beezUPOrderItemId = null;

  @SerializedName("orderItem_OrderItemType")
  private String orderItemOrderItemType = null;

  @SerializedName("orderItem_MerchantImportedProductId")
  private String orderItemMerchantImportedProductId = null;

  @SerializedName("orderItem_MerchantImportedProductIdColumnName")
  private String orderItemMerchantImportedProductIdColumnName = null;

  @SerializedName("orderItem_MerchantImportedProductUrl")
  private String orderItemMerchantImportedProductUrl = null;

  @SerializedName("orderItem_MerchantProductIdColumnName")
  private String orderItemMerchantProductIdColumnName = null;

  @SerializedName("orderItem_BeezUPStoreId")
  private String orderItemBeezUPStoreId = null;

  @SerializedName("orderItem_ItemTax")
  private BigDecimal orderItemItemTax = null;

  @SerializedName("orderItem_Title")
  private String orderItemTitle = null;

  @SerializedName("orderItem_ImageUrl")
  private String orderItemImageUrl = null;

  @SerializedName("orderItem_MerchantProductId")
  private String orderItemMerchantProductId = null;

  @SerializedName("orderItem_MarketPlaceProductId")
  private String orderItemMarketPlaceProductId = null;

  @SerializedName("orderItem_ItemPrice")
  private BigDecimal orderItemItemPrice = null;

  @SerializedName("orderItem_Quantity")
  private BigDecimal orderItemQuantity = null;

  @SerializedName("orderItem_TotalPrice")
  private BigDecimal orderItemTotalPrice = null;

  @SerializedName("orderItem_Shipping_Price")
  private BigDecimal orderItemShippingPrice = null;

  public OrderItem beezUPOrderItemId(String beezUPOrderItemId) {
    this.beezUPOrderItemId = beezUPOrderItemId;
    return this;
  }

   /**
   * The BeezUP identifier of the order Item
   * @return beezUPOrderItemId
  **/
  @ApiModelProperty(example = "1", required = true, value = "The BeezUP identifier of the order Item")
  public String getBeezUPOrderItemId() {
    return beezUPOrderItemId;
  }

  public void setBeezUPOrderItemId(String beezUPOrderItemId) {
    this.beezUPOrderItemId = beezUPOrderItemId;
  }

  public OrderItem orderItemOrderItemType(String orderItemOrderItemType) {
    this.orderItemOrderItemType = orderItemOrderItemType;
    return this;
  }

   /**
   * The order item type of the order item
   * @return orderItemOrderItemType
  **/
  @ApiModelProperty(example = "Product", required = true, value = "The order item type of the order item")
  public String getOrderItemOrderItemType() {
    return orderItemOrderItemType;
  }

  public void setOrderItemOrderItemType(String orderItemOrderItemType) {
    this.orderItemOrderItemType = orderItemOrderItemType;
  }

  public OrderItem orderItemMerchantImportedProductId(String orderItemMerchantImportedProductId) {
    this.orderItemMerchantImportedProductId = orderItemMerchantImportedProductId;
    return this;
  }

   /**
   * The product id indicated in the catalog importation in BeezUP system for this order item. This property will help you to match the order to the inventory system.
   * @return orderItemMerchantImportedProductId
  **/
  @ApiModelProperty(example = "73267", value = "The product id indicated in the catalog importation in BeezUP system for this order item. This property will help you to match the order to the inventory system.")
  public String getOrderItemMerchantImportedProductId() {
    return orderItemMerchantImportedProductId;
  }

  public void setOrderItemMerchantImportedProductId(String orderItemMerchantImportedProductId) {
    this.orderItemMerchantImportedProductId = orderItemMerchantImportedProductId;
  }

  public OrderItem orderItemMerchantImportedProductIdColumnName(String orderItemMerchantImportedProductIdColumnName) {
    this.orderItemMerchantImportedProductIdColumnName = orderItemMerchantImportedProductIdColumnName;
    return this;
  }

   /**
   * The column name for the product id indicated in the catalog importation in BeezUP system related to this order item. This property will help you to match the order to the inventory system.
   * @return orderItemMerchantImportedProductIdColumnName
  **/
  @ApiModelProperty(example = "reference", value = "The column name for the product id indicated in the catalog importation in BeezUP system related to this order item. This property will help you to match the order to the inventory system.")
  public String getOrderItemMerchantImportedProductIdColumnName() {
    return orderItemMerchantImportedProductIdColumnName;
  }

  public void setOrderItemMerchantImportedProductIdColumnName(String orderItemMerchantImportedProductIdColumnName) {
    this.orderItemMerchantImportedProductIdColumnName = orderItemMerchantImportedProductIdColumnName;
  }

  public OrderItem orderItemMerchantImportedProductUrl(String orderItemMerchantImportedProductUrl) {
    this.orderItemMerchantImportedProductUrl = orderItemMerchantImportedProductUrl;
    return this;
  }

   /**
   * The product url indicated in the catalog importation in BeezUP system related to this order item
   * @return orderItemMerchantImportedProductUrl
  **/
  @ApiModelProperty(example = "http://blabla.com/my-folder/73267.html", value = "The product url indicated in the catalog importation in BeezUP system related to this order item")
  public String getOrderItemMerchantImportedProductUrl() {
    return orderItemMerchantImportedProductUrl;
  }

  public void setOrderItemMerchantImportedProductUrl(String orderItemMerchantImportedProductUrl) {
    this.orderItemMerchantImportedProductUrl = orderItemMerchantImportedProductUrl;
  }

  public OrderItem orderItemMerchantProductIdColumnName(String orderItemMerchantProductIdColumnName) {
    this.orderItemMerchantProductIdColumnName = orderItemMerchantProductIdColumnName;
    return this;
  }

   /**
   * The column name indicate in the mapping for the product id related to the order item
   * @return orderItemMerchantProductIdColumnName
  **/
  @ApiModelProperty(example = "reference_produit", value = "The column name indicate in the mapping for the product id related to the order item")
  public String getOrderItemMerchantProductIdColumnName() {
    return orderItemMerchantProductIdColumnName;
  }

  public void setOrderItemMerchantProductIdColumnName(String orderItemMerchantProductIdColumnName) {
    this.orderItemMerchantProductIdColumnName = orderItemMerchantProductIdColumnName;
  }

  public OrderItem orderItemBeezUPStoreId(String orderItemBeezUPStoreId) {
    this.orderItemBeezUPStoreId = orderItemBeezUPStoreId;
    return this;
  }

   /**
   * The store id in the beezup system related to the order item. This property will help you to match the order to the inventory system.
   * @return orderItemBeezUPStoreId
  **/
  @ApiModelProperty(example = "00000000-cceb-4c20-b2c9-000000000000", value = "The store id in the beezup system related to the order item. This property will help you to match the order to the inventory system.")
  public String getOrderItemBeezUPStoreId() {
    return orderItemBeezUPStoreId;
  }

  public void setOrderItemBeezUPStoreId(String orderItemBeezUPStoreId) {
    this.orderItemBeezUPStoreId = orderItemBeezUPStoreId;
  }

  public OrderItem orderItemItemTax(BigDecimal orderItemItemTax) {
    this.orderItemItemTax = orderItemItemTax;
    return this;
  }

   /**
   * The tax of the order item
   * @return orderItemItemTax
  **/
  @ApiModelProperty(example = "0.0", value = "The tax of the order item")
  public BigDecimal getOrderItemItemTax() {
    return orderItemItemTax;
  }

  public void setOrderItemItemTax(BigDecimal orderItemItemTax) {
    this.orderItemItemTax = orderItemItemTax;
  }

  public OrderItem orderItemTitle(String orderItemTitle) {
    this.orderItemTitle = orderItemTitle;
    return this;
  }

   /**
   * The title of the order item
   * @return orderItemTitle
  **/
  @ApiModelProperty(example = "bLA acide-plomb 6v-4.5ah 70x48x106mm", value = "The title of the order item")
  public String getOrderItemTitle() {
    return orderItemTitle;
  }

  public void setOrderItemTitle(String orderItemTitle) {
    this.orderItemTitle = orderItemTitle;
  }

  public OrderItem orderItemImageUrl(String orderItemImageUrl) {
    this.orderItemImageUrl = orderItemImageUrl;
    return this;
  }

   /**
   * The URL of the image of the order item
   * @return orderItemImageUrl
  **/
  @ApiModelProperty(example = "http://blabla.com//das6-45.jpg", value = "The URL of the image of the order item")
  public String getOrderItemImageUrl() {
    return orderItemImageUrl;
  }

  public void setOrderItemImageUrl(String orderItemImageUrl) {
    this.orderItemImageUrl = orderItemImageUrl;
  }

  public OrderItem orderItemMerchantProductId(String orderItemMerchantProductId) {
    this.orderItemMerchantProductId = orderItemMerchantProductId;
    return this;
  }

   /**
   * The merchant product id of the order item
   * @return orderItemMerchantProductId
  **/
  @ApiModelProperty(example = "BlaLdas6-4.5", value = "The merchant product id of the order item")
  public String getOrderItemMerchantProductId() {
    return orderItemMerchantProductId;
  }

  public void setOrderItemMerchantProductId(String orderItemMerchantProductId) {
    this.orderItemMerchantProductId = orderItemMerchantProductId;
  }

  public OrderItem orderItemMarketPlaceProductId(String orderItemMarketPlaceProductId) {
    this.orderItemMarketPlaceProductId = orderItemMarketPlaceProductId;
    return this;
  }

   /**
   * The marketplace product identifier of the order item
   * @return orderItemMarketPlaceProductId
  **/
  @ApiModelProperty(example = "", value = "The marketplace product identifier of the order item")
  public String getOrderItemMarketPlaceProductId() {
    return orderItemMarketPlaceProductId;
  }

  public void setOrderItemMarketPlaceProductId(String orderItemMarketPlaceProductId) {
    this.orderItemMarketPlaceProductId = orderItemMarketPlaceProductId;
  }

  public OrderItem orderItemItemPrice(BigDecimal orderItemItemPrice) {
    this.orderItemItemPrice = orderItemItemPrice;
    return this;
  }

   /**
   * The price of the order item
   * @return orderItemItemPrice
  **/
  @ApiModelProperty(example = "6.86", value = "The price of the order item")
  public BigDecimal getOrderItemItemPrice() {
    return orderItemItemPrice;
  }

  public void setOrderItemItemPrice(BigDecimal orderItemItemPrice) {
    this.orderItemItemPrice = orderItemItemPrice;
  }

  public OrderItem orderItemQuantity(BigDecimal orderItemQuantity) {
    this.orderItemQuantity = orderItemQuantity;
    return this;
  }

   /**
   * The quantity of the order item
   * @return orderItemQuantity
  **/
  @ApiModelProperty(example = "1.0", value = "The quantity of the order item")
  public BigDecimal getOrderItemQuantity() {
    return orderItemQuantity;
  }

  public void setOrderItemQuantity(BigDecimal orderItemQuantity) {
    this.orderItemQuantity = orderItemQuantity;
  }

  public OrderItem orderItemTotalPrice(BigDecimal orderItemTotalPrice) {
    this.orderItemTotalPrice = orderItemTotalPrice;
    return this;
  }

   /**
   * The total price of the order item
   * @return orderItemTotalPrice
  **/
  @ApiModelProperty(example = "6.86", value = "The total price of the order item")
  public BigDecimal getOrderItemTotalPrice() {
    return orderItemTotalPrice;
  }

  public void setOrderItemTotalPrice(BigDecimal orderItemTotalPrice) {
    this.orderItemTotalPrice = orderItemTotalPrice;
  }

  public OrderItem orderItemShippingPrice(BigDecimal orderItemShippingPrice) {
    this.orderItemShippingPrice = orderItemShippingPrice;
    return this;
  }

   /**
   * The shipping price of the order item
   * @return orderItemShippingPrice
  **/
  @ApiModelProperty(example = "0.0", value = "The shipping price of the order item")
  public BigDecimal getOrderItemShippingPrice() {
    return orderItemShippingPrice;
  }

  public void setOrderItemShippingPrice(BigDecimal orderItemShippingPrice) {
    this.orderItemShippingPrice = orderItemShippingPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.beezUPOrderItemId, orderItem.beezUPOrderItemId) &&
        Objects.equals(this.orderItemOrderItemType, orderItem.orderItemOrderItemType) &&
        Objects.equals(this.orderItemMerchantImportedProductId, orderItem.orderItemMerchantImportedProductId) &&
        Objects.equals(this.orderItemMerchantImportedProductIdColumnName, orderItem.orderItemMerchantImportedProductIdColumnName) &&
        Objects.equals(this.orderItemMerchantImportedProductUrl, orderItem.orderItemMerchantImportedProductUrl) &&
        Objects.equals(this.orderItemMerchantProductIdColumnName, orderItem.orderItemMerchantProductIdColumnName) &&
        Objects.equals(this.orderItemBeezUPStoreId, orderItem.orderItemBeezUPStoreId) &&
        Objects.equals(this.orderItemItemTax, orderItem.orderItemItemTax) &&
        Objects.equals(this.orderItemTitle, orderItem.orderItemTitle) &&
        Objects.equals(this.orderItemImageUrl, orderItem.orderItemImageUrl) &&
        Objects.equals(this.orderItemMerchantProductId, orderItem.orderItemMerchantProductId) &&
        Objects.equals(this.orderItemMarketPlaceProductId, orderItem.orderItemMarketPlaceProductId) &&
        Objects.equals(this.orderItemItemPrice, orderItem.orderItemItemPrice) &&
        Objects.equals(this.orderItemQuantity, orderItem.orderItemQuantity) &&
        Objects.equals(this.orderItemTotalPrice, orderItem.orderItemTotalPrice) &&
        Objects.equals(this.orderItemShippingPrice, orderItem.orderItemShippingPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beezUPOrderItemId, orderItemOrderItemType, orderItemMerchantImportedProductId, orderItemMerchantImportedProductIdColumnName, orderItemMerchantImportedProductUrl, orderItemMerchantProductIdColumnName, orderItemBeezUPStoreId, orderItemItemTax, orderItemTitle, orderItemImageUrl, orderItemMerchantProductId, orderItemMarketPlaceProductId, orderItemItemPrice, orderItemQuantity, orderItemTotalPrice, orderItemShippingPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    beezUPOrderItemId: ").append(toIndentedString(beezUPOrderItemId)).append("\n");
    sb.append("    orderItemOrderItemType: ").append(toIndentedString(orderItemOrderItemType)).append("\n");
    sb.append("    orderItemMerchantImportedProductId: ").append(toIndentedString(orderItemMerchantImportedProductId)).append("\n");
    sb.append("    orderItemMerchantImportedProductIdColumnName: ").append(toIndentedString(orderItemMerchantImportedProductIdColumnName)).append("\n");
    sb.append("    orderItemMerchantImportedProductUrl: ").append(toIndentedString(orderItemMerchantImportedProductUrl)).append("\n");
    sb.append("    orderItemMerchantProductIdColumnName: ").append(toIndentedString(orderItemMerchantProductIdColumnName)).append("\n");
    sb.append("    orderItemBeezUPStoreId: ").append(toIndentedString(orderItemBeezUPStoreId)).append("\n");
    sb.append("    orderItemItemTax: ").append(toIndentedString(orderItemItemTax)).append("\n");
    sb.append("    orderItemTitle: ").append(toIndentedString(orderItemTitle)).append("\n");
    sb.append("    orderItemImageUrl: ").append(toIndentedString(orderItemImageUrl)).append("\n");
    sb.append("    orderItemMerchantProductId: ").append(toIndentedString(orderItemMerchantProductId)).append("\n");
    sb.append("    orderItemMarketPlaceProductId: ").append(toIndentedString(orderItemMarketPlaceProductId)).append("\n");
    sb.append("    orderItemItemPrice: ").append(toIndentedString(orderItemItemPrice)).append("\n");
    sb.append("    orderItemQuantity: ").append(toIndentedString(orderItemQuantity)).append("\n");
    sb.append("    orderItemTotalPrice: ").append(toIndentedString(orderItemTotalPrice)).append("\n");
    sb.append("    orderItemShippingPrice: ").append(toIndentedString(orderItemShippingPrice)).append("\n");
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

