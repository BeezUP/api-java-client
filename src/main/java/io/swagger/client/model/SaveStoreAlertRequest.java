/*
 * Public - Security
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
import io.swagger.client.model.AlertIsActive;
import io.swagger.client.model.StoreAlertProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SaveStoreAlertRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:14:52.070Z")
public class SaveStoreAlertRequest {
  @SerializedName("active")
  private AlertIsActive active = null;

  @SerializedName("properties")
  private List<StoreAlertProperty> properties = new ArrayList<StoreAlertProperty>();

  public SaveStoreAlertRequest active(AlertIsActive active) {
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

  public SaveStoreAlertRequest properties(List<StoreAlertProperty> properties) {
    this.properties = properties;
    return this;
  }

  public SaveStoreAlertRequest addPropertiesItem(StoreAlertProperty propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Properties to configure the alert
   * @return properties
  **/
  @ApiModelProperty(example = "[{&quot;propertyId&quot;:2,&quot;propertyValue&quot;:&quot;3&quot;}]", value = "Properties to configure the alert")
  public List<StoreAlertProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<StoreAlertProperty> properties) {
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
    SaveStoreAlertRequest saveStoreAlertRequest = (SaveStoreAlertRequest) o;
    return Objects.equals(this.active, saveStoreAlertRequest.active) &&
        Objects.equals(this.properties, saveStoreAlertRequest.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveStoreAlertRequest {\n");
    
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

