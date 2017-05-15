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
import io.swagger.client.model.LinksClearMerchantOrderInfoListLink;
import io.swagger.client.model.LinksExportOrdersLink;
import io.swagger.client.model.LinksGetMarketplaceAccountsSynchronizationLink;
import io.swagger.client.model.LinksGetOrderListFullLink;
import io.swagger.client.model.LinksHarvestAllLink;
import io.swagger.client.model.LinksSetMerchantOrderInfoListLink;
import io.swagger.client.model.OrderListLinks;

/**
 * OrderListFullLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T11:46:19.000Z")
public class OrderListFullLinks {
  @SerializedName("harvest")
  private LinksHarvestAllLink harvest = null;

  @SerializedName("setMerchantInfos")
  private LinksSetMerchantOrderInfoListLink setMerchantInfos = null;

  @SerializedName("clearMerchantInfos")
  private LinksClearMerchantOrderInfoListLink clearMerchantInfos = null;

  @SerializedName("export")
  private LinksExportOrdersLink export = null;

  @SerializedName("status")
  private LinksGetMarketplaceAccountsSynchronizationLink status = null;

  @SerializedName("self")
  private LinksGetOrderListFullLink self = null;

  public OrderListFullLinks harvest(LinksHarvestAllLink harvest) {
    this.harvest = harvest;
    return this;
  }

   /**
   * Get harvest
   * @return harvest
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksHarvestAllLink getHarvest() {
    return harvest;
  }

  public void setHarvest(LinksHarvestAllLink harvest) {
    this.harvest = harvest;
  }

  public OrderListFullLinks setMerchantInfos(LinksSetMerchantOrderInfoListLink setMerchantInfos) {
    this.setMerchantInfos = setMerchantInfos;
    return this;
  }

   /**
   * Get setMerchantInfos
   * @return setMerchantInfos
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksSetMerchantOrderInfoListLink getSetMerchantInfos() {
    return setMerchantInfos;
  }

  public void setSetMerchantInfos(LinksSetMerchantOrderInfoListLink setMerchantInfos) {
    this.setMerchantInfos = setMerchantInfos;
  }

  public OrderListFullLinks clearMerchantInfos(LinksClearMerchantOrderInfoListLink clearMerchantInfos) {
    this.clearMerchantInfos = clearMerchantInfos;
    return this;
  }

   /**
   * Get clearMerchantInfos
   * @return clearMerchantInfos
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksClearMerchantOrderInfoListLink getClearMerchantInfos() {
    return clearMerchantInfos;
  }

  public void setClearMerchantInfos(LinksClearMerchantOrderInfoListLink clearMerchantInfos) {
    this.clearMerchantInfos = clearMerchantInfos;
  }

  public OrderListFullLinks export(LinksExportOrdersLink export) {
    this.export = export;
    return this;
  }

   /**
   * Get export
   * @return export
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksExportOrdersLink getExport() {
    return export;
  }

  public void setExport(LinksExportOrdersLink export) {
    this.export = export;
  }

  public OrderListFullLinks status(LinksGetMarketplaceAccountsSynchronizationLink status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetMarketplaceAccountsSynchronizationLink getStatus() {
    return status;
  }

  public void setStatus(LinksGetMarketplaceAccountsSynchronizationLink status) {
    this.status = status;
  }

  public OrderListFullLinks self(LinksGetOrderListFullLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetOrderListFullLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetOrderListFullLink self) {
    this.self = self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderListFullLinks orderListFullLinks = (OrderListFullLinks) o;
    return Objects.equals(this.harvest, orderListFullLinks.harvest) &&
        Objects.equals(this.setMerchantInfos, orderListFullLinks.setMerchantInfos) &&
        Objects.equals(this.clearMerchantInfos, orderListFullLinks.clearMerchantInfos) &&
        Objects.equals(this.export, orderListFullLinks.export) &&
        Objects.equals(this.status, orderListFullLinks.status) &&
        Objects.equals(this.self, orderListFullLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(harvest, setMerchantInfos, clearMerchantInfos, export, status, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderListFullLinks {\n");
    
    sb.append("    harvest: ").append(toIndentedString(harvest)).append("\n");
    sb.append("    setMerchantInfos: ").append(toIndentedString(setMerchantInfos)).append("\n");
    sb.append("    clearMerchantInfos: ").append(toIndentedString(clearMerchantInfos)).append("\n");
    sb.append("    export: ").append(toIndentedString(export)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

