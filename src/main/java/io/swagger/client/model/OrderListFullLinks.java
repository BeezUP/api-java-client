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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
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

