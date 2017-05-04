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
import io.swagger.client.model.ColumnId;
import io.swagger.client.model.UserColumName;

/**
 * The custom column configuration
 */
@ApiModel(description = "The custom column configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T19:24:57.307Z")
public class CustomColumn {
  @SerializedName("id")
  private ColumnId id = null;

  @SerializedName("userColumName")
  private UserColumName userColumName = null;

  @SerializedName("configuration")
  private ColumnConfiguration _configuration = null;

  public CustomColumn id(ColumnId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ColumnId getId() {
    return id;
  }

  public void setId(ColumnId id) {
    this.id = id;
  }

  public CustomColumn userColumName(UserColumName userColumName) {
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

  public CustomColumn _configuration(ColumnConfiguration _configuration) {
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
    CustomColumn customColumn = (CustomColumn) o;
    return Objects.equals(this.id, customColumn.id) &&
        Objects.equals(this.userColumName, customColumn.userColumName) &&
        Objects.equals(this._configuration, customColumn._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userColumName, _configuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomColumn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

