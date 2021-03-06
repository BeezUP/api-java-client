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
import io.swagger.client.model.LinksClearMerchantOrderInfoLink;
import io.swagger.client.model.LinksGetOrderHistoryLink;
import io.swagger.client.model.LinksGetOrderLink;
import io.swagger.client.model.LinksHarvestOrderLink;
import io.swagger.client.model.LinksSetMerchantOrderInfoLink;
import io.swagger.client.model.OrderHeaderLinks;

/**
 * OrderLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class OrderLinks {
  @SerializedName("self")
  private LinksGetOrderLink self = null;

  @SerializedName("history")
  private LinksGetOrderHistoryLink history = null;

  @SerializedName("harvest")
  private LinksHarvestOrderLink harvest = null;

  @SerializedName("setMerchantInfo")
  private LinksSetMerchantOrderInfoLink setMerchantInfo = null;

  @SerializedName("clearMerchantInfo")
  private LinksClearMerchantOrderInfoLink clearMerchantInfo = null;

  public OrderLinks self(LinksGetOrderLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetOrderLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetOrderLink self) {
    this.self = self;
  }

  public OrderLinks history(LinksGetOrderHistoryLink history) {
    this.history = history;
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetOrderHistoryLink getHistory() {
    return history;
  }

  public void setHistory(LinksGetOrderHistoryLink history) {
    this.history = history;
  }

  public OrderLinks harvest(LinksHarvestOrderLink harvest) {
    this.harvest = harvest;
    return this;
  }

   /**
   * Get harvest
   * @return harvest
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksHarvestOrderLink getHarvest() {
    return harvest;
  }

  public void setHarvest(LinksHarvestOrderLink harvest) {
    this.harvest = harvest;
  }

  public OrderLinks setMerchantInfo(LinksSetMerchantOrderInfoLink setMerchantInfo) {
    this.setMerchantInfo = setMerchantInfo;
    return this;
  }

   /**
   * Get setMerchantInfo
   * @return setMerchantInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksSetMerchantOrderInfoLink getSetMerchantInfo() {
    return setMerchantInfo;
  }

  public void setSetMerchantInfo(LinksSetMerchantOrderInfoLink setMerchantInfo) {
    this.setMerchantInfo = setMerchantInfo;
  }

  public OrderLinks clearMerchantInfo(LinksClearMerchantOrderInfoLink clearMerchantInfo) {
    this.clearMerchantInfo = clearMerchantInfo;
    return this;
  }

   /**
   * Get clearMerchantInfo
   * @return clearMerchantInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksClearMerchantOrderInfoLink getClearMerchantInfo() {
    return clearMerchantInfo;
  }

  public void setClearMerchantInfo(LinksClearMerchantOrderInfoLink clearMerchantInfo) {
    this.clearMerchantInfo = clearMerchantInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLinks orderLinks = (OrderLinks) o;
    return Objects.equals(this.self, orderLinks.self) &&
        Objects.equals(this.history, orderLinks.history) &&
        Objects.equals(this.harvest, orderLinks.harvest) &&
        Objects.equals(this.setMerchantInfo, orderLinks.setMerchantInfo) &&
        Objects.equals(this.clearMerchantInfo, orderLinks.clearMerchantInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, history, harvest, setMerchantInfo, clearMerchantInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    harvest: ").append(toIndentedString(harvest)).append("\n");
    sb.append("    setMerchantInfo: ").append(toIndentedString(setMerchantInfo)).append("\n");
    sb.append("    clearMerchantInfo: ").append(toIndentedString(clearMerchantInfo)).append("\n");
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

