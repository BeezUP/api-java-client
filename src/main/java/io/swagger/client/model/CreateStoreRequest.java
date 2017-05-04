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
import io.swagger.client.model.Store;
import io.swagger.client.model.StoreCountryIsoCodeAlpha3;
import io.swagger.client.model.StoreName;
import io.swagger.client.model.StoreSectors;
import io.swagger.client.model.StoreUrl;

/**
 * CreateStoreRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T13:44:04.202Z")
public class CreateStoreRequest {
  @SerializedName("name")
  private StoreName name = null;

  @SerializedName("url")
  private StoreUrl url = null;

  @SerializedName("countryIsoCodeAlpha3")
  private StoreCountryIsoCodeAlpha3 countryIsoCodeAlpha3 = null;

  @SerializedName("sectors")
  private StoreSectors sectors = null;

  public CreateStoreRequest name(StoreName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StoreName getName() {
    return name;
  }

  public void setName(StoreName name) {
    this.name = name;
  }

  public CreateStoreRequest url(StoreUrl url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StoreUrl getUrl() {
    return url;
  }

  public void setUrl(StoreUrl url) {
    this.url = url;
  }

  public CreateStoreRequest countryIsoCodeAlpha3(StoreCountryIsoCodeAlpha3 countryIsoCodeAlpha3) {
    this.countryIsoCodeAlpha3 = countryIsoCodeAlpha3;
    return this;
  }

   /**
   * Get countryIsoCodeAlpha3
   * @return countryIsoCodeAlpha3
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StoreCountryIsoCodeAlpha3 getCountryIsoCodeAlpha3() {
    return countryIsoCodeAlpha3;
  }

  public void setCountryIsoCodeAlpha3(StoreCountryIsoCodeAlpha3 countryIsoCodeAlpha3) {
    this.countryIsoCodeAlpha3 = countryIsoCodeAlpha3;
  }

  public CreateStoreRequest sectors(StoreSectors sectors) {
    this.sectors = sectors;
    return this;
  }

   /**
   * Get sectors
   * @return sectors
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public StoreSectors getSectors() {
    return sectors;
  }

  public void setSectors(StoreSectors sectors) {
    this.sectors = sectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStoreRequest createStoreRequest = (CreateStoreRequest) o;
    return Objects.equals(this.name, createStoreRequest.name) &&
        Objects.equals(this.url, createStoreRequest.url) &&
        Objects.equals(this.countryIsoCodeAlpha3, createStoreRequest.countryIsoCodeAlpha3) &&
        Objects.equals(this.sectors, createStoreRequest.sectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, countryIsoCodeAlpha3, sectors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStoreRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    countryIsoCodeAlpha3: ").append(toIndentedString(countryIsoCodeAlpha3)).append("\n");
    sb.append("    sectors: ").append(toIndentedString(sectors)).append("\n");
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

