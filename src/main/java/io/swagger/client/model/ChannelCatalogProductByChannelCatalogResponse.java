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
import io.swagger.client.model.ChannelCatalogProductInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ChannelCatalogProductByChannelCatalogResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class ChannelCatalogProductByChannelCatalogResponse {
  @SerializedName("channelCatalogs")
  private Map<String, ChannelCatalogProductInfo> channelCatalogs = new HashMap<String, ChannelCatalogProductInfo>();

  public ChannelCatalogProductByChannelCatalogResponse channelCatalogs(Map<String, ChannelCatalogProductInfo> channelCatalogs) {
    this.channelCatalogs = channelCatalogs;
    return this;
  }

  public ChannelCatalogProductByChannelCatalogResponse putChannelCatalogsItem(String key, ChannelCatalogProductInfo channelCatalogsItem) {
    this.channelCatalogs.put(key, channelCatalogsItem);
    return this;
  }

   /**
   * The channel catalog product by channel catalog. The key is the channel catalog identifier
   * @return channelCatalogs
  **/
  @ApiModelProperty(example = "null", value = "The channel catalog product by channel catalog. The key is the channel catalog identifier")
  public Map<String, ChannelCatalogProductInfo> getChannelCatalogs() {
    return channelCatalogs;
  }

  public void setChannelCatalogs(Map<String, ChannelCatalogProductInfo> channelCatalogs) {
    this.channelCatalogs = channelCatalogs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogProductByChannelCatalogResponse channelCatalogProductByChannelCatalogResponse = (ChannelCatalogProductByChannelCatalogResponse) o;
    return Objects.equals(this.channelCatalogs, channelCatalogProductByChannelCatalogResponse.channelCatalogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelCatalogs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogProductByChannelCatalogResponse {\n");
    
    sb.append("    channelCatalogs: ").append(toIndentedString(channelCatalogs)).append("\n");
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

