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
import io.swagger.client.model.ColumnConfiguration;
import io.swagger.client.model.UserColumName;

/**
 * In case your catalog column already exists we indicate you the existing configuration.
 */
@ApiModel(description = "In case your catalog column already exists we indicate you the existing configuration.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:58:38.338Z")
public class ExistingCatalogColumnConfiguration {
  @SerializedName("userColumName")
  private UserColumName userColumName = null;

  @SerializedName("configuration")
  private ColumnConfiguration _configuration = null;

  public ExistingCatalogColumnConfiguration userColumName(UserColumName userColumName) {
    this.userColumName = userColumName;
    return this;
  }

   /**
   * Get userColumName
   * @return userColumName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public UserColumName getUserColumName() {
    return userColumName;
  }

  public void setUserColumName(UserColumName userColumName) {
    this.userColumName = userColumName;
  }

  public ExistingCatalogColumnConfiguration _configuration(ColumnConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ColumnConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(ColumnConfiguration _configuration) {
    this._configuration = _configuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExistingCatalogColumnConfiguration existingCatalogColumnConfiguration = (ExistingCatalogColumnConfiguration) o;
    return Objects.equals(this.userColumName, existingCatalogColumnConfiguration.userColumName) &&
        Objects.equals(this._configuration, existingCatalogColumnConfiguration._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userColumName, _configuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExistingCatalogColumnConfiguration {\n");
    
    sb.append("    userColumName: ").append(toIndentedString(userColumName)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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

