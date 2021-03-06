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
import io.swagger.client.model.ChangeOrderReporting;
import io.swagger.client.model.HarvestOrderReporting;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Describe the history related to an order
 */
@ApiModel(description = "Describe the history related to an order")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class OrderHistory {
  @SerializedName("changeOrderReportings")
  private List<ChangeOrderReporting> changeOrderReportings = new ArrayList<ChangeOrderReporting>();

  @SerializedName("harvestOrderReportings")
  private List<HarvestOrderReporting> harvestOrderReportings = new ArrayList<HarvestOrderReporting>();

  @SerializedName("lastModificationUtcDate")
  private DateTime lastModificationUtcDate = null;

  public OrderHistory changeOrderReportings(List<ChangeOrderReporting> changeOrderReportings) {
    this.changeOrderReportings = changeOrderReportings;
    return this;
  }

  public OrderHistory addChangeOrderReportingsItem(ChangeOrderReporting changeOrderReportingsItem) {
    this.changeOrderReportings.add(changeOrderReportingsItem);
    return this;
  }

   /**
   * The list of change order operation
   * @return changeOrderReportings
  **/
  @ApiModelProperty(example = "null", value = "The list of change order operation")
  public List<ChangeOrderReporting> getChangeOrderReportings() {
    return changeOrderReportings;
  }

  public void setChangeOrderReportings(List<ChangeOrderReporting> changeOrderReportings) {
    this.changeOrderReportings = changeOrderReportings;
  }

  public OrderHistory harvestOrderReportings(List<HarvestOrderReporting> harvestOrderReportings) {
    this.harvestOrderReportings = harvestOrderReportings;
    return this;
  }

  public OrderHistory addHarvestOrderReportingsItem(HarvestOrderReporting harvestOrderReportingsItem) {
    this.harvestOrderReportings.add(harvestOrderReportingsItem);
    return this;
  }

   /**
   * Get harvestOrderReportings
   * @return harvestOrderReportings
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<HarvestOrderReporting> getHarvestOrderReportings() {
    return harvestOrderReportings;
  }

  public void setHarvestOrderReportings(List<HarvestOrderReporting> harvestOrderReportings) {
    this.harvestOrderReportings = harvestOrderReportings;
  }

  public OrderHistory lastModificationUtcDate(DateTime lastModificationUtcDate) {
    this.lastModificationUtcDate = lastModificationUtcDate;
    return this;
  }

   /**
   * Get lastModificationUtcDate
   * @return lastModificationUtcDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getLastModificationUtcDate() {
    return lastModificationUtcDate;
  }

  public void setLastModificationUtcDate(DateTime lastModificationUtcDate) {
    this.lastModificationUtcDate = lastModificationUtcDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderHistory orderHistory = (OrderHistory) o;
    return Objects.equals(this.changeOrderReportings, orderHistory.changeOrderReportings) &&
        Objects.equals(this.harvestOrderReportings, orderHistory.harvestOrderReportings) &&
        Objects.equals(this.lastModificationUtcDate, orderHistory.lastModificationUtcDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeOrderReportings, harvestOrderReportings, lastModificationUtcDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderHistory {\n");
    
    sb.append("    changeOrderReportings: ").append(toIndentedString(changeOrderReportings)).append("\n");
    sb.append("    harvestOrderReportings: ").append(toIndentedString(harvestOrderReportings)).append("\n");
    sb.append("    lastModificationUtcDate: ").append(toIndentedString(lastModificationUtcDate)).append("\n");
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

