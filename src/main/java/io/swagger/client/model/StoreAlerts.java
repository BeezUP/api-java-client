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
import io.swagger.client.model.StoreAlert;
import java.util.ArrayList;
import java.util.List;

/**
 * StoreAlerts
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:13:16.265Z")
public class StoreAlerts {
  @SerializedName("alerts")
  private List<StoreAlert> alerts = new ArrayList<StoreAlert>();

  public StoreAlerts alerts(List<StoreAlert> alerts) {
    this.alerts = alerts;
    return this;
  }

  public StoreAlerts addAlertsItem(StoreAlert alertsItem) {
    this.alerts.add(alertsItem);
    return this;
  }

   /**
   * Get alerts
   * @return alerts
  **/
  @ApiModelProperty(example = "[{&quot;alertId&quot;:8,&quot;alertName&quot;:&quot;NoImportSinceXDays&quot;,&quot;isActive&quot;:true,&quot;properties&quot;:[{&quot;propertyId&quot;:2,&quot;propertyValidationExpression&quot;:&quot;\\b0*([1-9]|[12][0-9]|30)\\b&quot;,&quot;propertyValue&quot;:2}]}]", value = "")
  public List<StoreAlert> getAlerts() {
    return alerts;
  }

  public void setAlerts(List<StoreAlert> alerts) {
    this.alerts = alerts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreAlerts storeAlerts = (StoreAlerts) o;
    return Objects.equals(this.alerts, storeAlerts.alerts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alerts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreAlerts {\n");
    
    sb.append("    alerts: ").append(toIndentedString(alerts)).append("\n");
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

