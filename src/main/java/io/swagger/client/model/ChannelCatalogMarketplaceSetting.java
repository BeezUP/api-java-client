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
import java.util.ArrayList;
import java.util.List;

/**
 * Model for fetching a channel catalog marketplace setting
 */
@ApiModel(description = "Model for fetching a channel catalog marketplace setting")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T10:49:46.695Z")
public class ChannelCatalogMarketplaceSetting {
  @SerializedName("name")
  private String name = null;

  @SerializedName("values")
  private List<String> values = new ArrayList<String>();

  public ChannelCatalogMarketplaceSetting name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Channel catalog marketplace property name
   * @return name
  **/
  @ApiModelProperty(example = "PaypalAddress", required = true, value = "Channel catalog marketplace property name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChannelCatalogMarketplaceSetting values(List<String> values) {
    this.values = values;
    return this;
  }

  public ChannelCatalogMarketplaceSetting addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Channel catalog marketplace property values
   * @return values
  **/
  @ApiModelProperty(example = "[&quot;myemail@mydomain.com&quot;]", value = "Channel catalog marketplace property values")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogMarketplaceSetting channelCatalogMarketplaceSetting = (ChannelCatalogMarketplaceSetting) o;
    return Objects.equals(this.name, channelCatalogMarketplaceSetting.name) &&
        Objects.equals(this.values, channelCatalogMarketplaceSetting.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogMarketplaceSetting {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

