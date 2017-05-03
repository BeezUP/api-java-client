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
import io.swagger.client.model.BeezUPCommonChannelId;
import io.swagger.client.model.BeezUPCommonStoreId;

/**
 * CreateChannelCatalogRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-03T10:56:32.379Z")
public class CreateChannelCatalogRequest {
  @SerializedName("channelId")
  private BeezUPCommonChannelId channelId = null;

  @SerializedName("storeId")
  private BeezUPCommonStoreId storeId = null;

  public CreateChannelCatalogRequest channelId(BeezUPCommonChannelId channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelId getChannelId() {
    return channelId;
  }

  public void setChannelId(BeezUPCommonChannelId channelId) {
    this.channelId = channelId;
  }

  public CreateChannelCatalogRequest storeId(BeezUPCommonStoreId storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonStoreId getStoreId() {
    return storeId;
  }

  public void setStoreId(BeezUPCommonStoreId storeId) {
    this.storeId = storeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChannelCatalogRequest createChannelCatalogRequest = (CreateChannelCatalogRequest) o;
    return Objects.equals(this.channelId, createChannelCatalogRequest.channelId) &&
        Objects.equals(this.storeId, createChannelCatalogRequest.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, storeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChannelCatalogRequest {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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

