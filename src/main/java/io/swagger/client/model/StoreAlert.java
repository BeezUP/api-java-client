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
import io.swagger.client.model.AlertId;
import io.swagger.client.model.AlertIsActive;
import io.swagger.client.model.AlertName;
import io.swagger.client.model.StoreAlertLinks;
import io.swagger.client.model.StoreAlertPropertyInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * StoreAlert
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:40:14.157Z")
public class StoreAlert {
  @SerializedName("links")
  private StoreAlertLinks links = null;

  @SerializedName("alertId")
  private AlertId alertId = null;

  @SerializedName("alertName")
  private AlertName alertName = null;

  @SerializedName("active")
  private AlertIsActive active = null;

  @SerializedName("properties")
  private List<StoreAlertPropertyInfo> properties = new ArrayList<StoreAlertPropertyInfo>();

  public StoreAlert links(StoreAlertLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public StoreAlertLinks getLinks() {
    return links;
  }

  public void setLinks(StoreAlertLinks links) {
    this.links = links;
  }

  public StoreAlert alertId(AlertId alertId) {
    this.alertId = alertId;
    return this;
  }

   /**
   * Get alertId
   * @return alertId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AlertId getAlertId() {
    return alertId;
  }

  public void setAlertId(AlertId alertId) {
    this.alertId = alertId;
  }

  public StoreAlert alertName(AlertName alertName) {
    this.alertName = alertName;
    return this;
  }

   /**
   * Get alertName
   * @return alertName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AlertName getAlertName() {
    return alertName;
  }

  public void setAlertName(AlertName alertName) {
    this.alertName = alertName;
  }

  public StoreAlert active(AlertIsActive active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AlertIsActive getActive() {
    return active;
  }

  public void setActive(AlertIsActive active) {
    this.active = active;
  }

  public StoreAlert properties(List<StoreAlertPropertyInfo> properties) {
    this.properties = properties;
    return this;
  }

  public StoreAlert addPropertiesItem(StoreAlertPropertyInfo propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * The current configuration properties of the alert
   * @return properties
  **/
  @ApiModelProperty(example = "[{&quot;propertyId&quot;:2,&quot;propertyValidationExpression&quot;:&quot;\\b0*([1-9]|[12][0-9]|30)\\b&quot;,&quot;propertyValue&quot;:&quot;2&quot;}]", value = "The current configuration properties of the alert")
  public List<StoreAlertPropertyInfo> getProperties() {
    return properties;
  }

  public void setProperties(List<StoreAlertPropertyInfo> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreAlert storeAlert = (StoreAlert) o;
    return Objects.equals(this.links, storeAlert.links) &&
        Objects.equals(this.alertId, storeAlert.alertId) &&
        Objects.equals(this.alertName, storeAlert.alertName) &&
        Objects.equals(this.active, storeAlert.active) &&
        Objects.equals(this.properties, storeAlert.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, alertId, alertName, active, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreAlert {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
    sb.append("    alertName: ").append(toIndentedString(alertName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

