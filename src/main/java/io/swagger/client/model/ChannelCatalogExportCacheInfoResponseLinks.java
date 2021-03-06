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
import io.swagger.client.model.LinksDeleteChannelCatalogExportationCacheLink;
import io.swagger.client.model.LinksGetChannelCatalogExportationCacheInfoLink;

/**
 * ChannelCatalogExportCacheInfoResponseLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class ChannelCatalogExportCacheInfoResponseLinks {
  @SerializedName("self")
  private LinksGetChannelCatalogExportationCacheInfoLink self = null;

  @SerializedName("delete")
  private LinksDeleteChannelCatalogExportationCacheLink delete = null;

  public ChannelCatalogExportCacheInfoResponseLinks self(LinksGetChannelCatalogExportationCacheInfoLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetChannelCatalogExportationCacheInfoLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetChannelCatalogExportationCacheInfoLink self) {
    this.self = self;
  }

  public ChannelCatalogExportCacheInfoResponseLinks delete(LinksDeleteChannelCatalogExportationCacheLink delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksDeleteChannelCatalogExportationCacheLink getDelete() {
    return delete;
  }

  public void setDelete(LinksDeleteChannelCatalogExportationCacheLink delete) {
    this.delete = delete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogExportCacheInfoResponseLinks channelCatalogExportCacheInfoResponseLinks = (ChannelCatalogExportCacheInfoResponseLinks) o;
    return Objects.equals(this.self, channelCatalogExportCacheInfoResponseLinks.self) &&
        Objects.equals(this.delete, channelCatalogExportCacheInfoResponseLinks.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, delete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogExportCacheInfoResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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

