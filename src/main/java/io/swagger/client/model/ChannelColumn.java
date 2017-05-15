/*
 * BeezUP API
 * # The REST API of BeezUP system ## Overview The REST APIs provide programmatic access to read and write BeezUP data.  Basically, with this API you will be able to do everything like you were with your browser on https://go.beezup.com !  The main features are: - Register and manage your account - Create and manage and share your stores with your friends/co-workers. - Import your product catalog and schedule the auto importation - Search the channels your want to use - Configure your channels for your catalogs to export your product information:     - cost and general settings     - category and columns mappings     - your will be able to create and manage your custom column     - put in place exlusion filters based on simple conditions on your product data     - override product values     - get product vision for a channel catalog scope - Analyze and optimize your performance of your catalogs on all yours channels with different type of reportings by day, channel, category and by product. - Automatize your optimisation by using rules! - And of course... Manage your orders harvested from all your marketplaces:     - Synchronize your orders in an uniformized way     - Get the available actions and update the order status - ...and more!  ## Authentication credentials The public API with the base path **_/v2/public** have been put in place to give you an entry point to our system for the user registration, login and lost password. The public API does not require any credentials. We give you the some public list of values and public channels for our public commercial web site [www.beezup.com](http://www.beezup.com).  The user API with the base path **_/v2/user** requires a token which is available on this page: https://go.beezup.com/Account/MyAccount  ## Things to keep in mind ### API Rate Limits - The BeezUP REST API is limited to 100 calls/minute.  ### Media type The default media type for requests and responses is application/json. Where noted, some operations support other content types. If no additional content type is mentioned for a specific operation, then the media type is application/json.  ### Required content type The required and default encoding for the request and responses is UTF8.  ### Required date time format All our date time are formatted in ISO 8601 format: 2014-06-24T16:25:00Z.  ### Base URL The Base URL of the BeezUP API Order Management REST API conforms to the following template.  https://api.beezup.com  All URLs returned by the BeezUP API are relative to this base URL, and all requests to the REST API must use this base URL template.  You can test our API on https://api-docs.beezup.com/swagger-ui\\ You can contact us on [gitter, #BeezUP/API](https://gitter.im/beezUP/API) 
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
import io.swagger.client.model.BeezUPCommonChannelColumnId;
import io.swagger.client.model.BeezUPCommonChannelColumnName;
import io.swagger.client.model.ChannelColumnConfiguration;
import io.swagger.client.model.ChannelColumnDescription;
import io.swagger.client.model.ChannelColumnRestrictedValues;
import io.swagger.client.model.ChannelColumnShowInMapping;

/**
 * The channel column
 */
@ApiModel(description = "The channel column")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T13:43:05.416Z")
public class ChannelColumn {
  @SerializedName("channelColumnId")
  private BeezUPCommonChannelColumnId channelColumnId = null;

  @SerializedName("channelColumnName")
  private BeezUPCommonChannelColumnName channelColumnName = null;

  @SerializedName("channelColumnDescription")
  private ChannelColumnDescription channelColumnDescription = null;

  @SerializedName("showInMapping")
  private ChannelColumnShowInMapping showInMapping = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("configuration")
  private ChannelColumnConfiguration _configuration = null;

  @SerializedName("restrictedValues")
  private ChannelColumnRestrictedValues restrictedValues = null;

  public ChannelColumn channelColumnId(BeezUPCommonChannelColumnId channelColumnId) {
    this.channelColumnId = channelColumnId;
    return this;
  }

   /**
   * Get channelColumnId
   * @return channelColumnId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelColumnId getChannelColumnId() {
    return channelColumnId;
  }

  public void setChannelColumnId(BeezUPCommonChannelColumnId channelColumnId) {
    this.channelColumnId = channelColumnId;
  }

  public ChannelColumn channelColumnName(BeezUPCommonChannelColumnName channelColumnName) {
    this.channelColumnName = channelColumnName;
    return this;
  }

   /**
   * Get channelColumnName
   * @return channelColumnName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelColumnName getChannelColumnName() {
    return channelColumnName;
  }

  public void setChannelColumnName(BeezUPCommonChannelColumnName channelColumnName) {
    this.channelColumnName = channelColumnName;
  }

  public ChannelColumn channelColumnDescription(ChannelColumnDescription channelColumnDescription) {
    this.channelColumnDescription = channelColumnDescription;
    return this;
  }

   /**
   * Get channelColumnDescription
   * @return channelColumnDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelColumnDescription getChannelColumnDescription() {
    return channelColumnDescription;
  }

  public void setChannelColumnDescription(ChannelColumnDescription channelColumnDescription) {
    this.channelColumnDescription = channelColumnDescription;
  }

  public ChannelColumn showInMapping(ChannelColumnShowInMapping showInMapping) {
    this.showInMapping = showInMapping;
    return this;
  }

   /**
   * Get showInMapping
   * @return showInMapping
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelColumnShowInMapping getShowInMapping() {
    return showInMapping;
  }

  public void setShowInMapping(ChannelColumnShowInMapping showInMapping) {
    this.showInMapping = showInMapping;
  }

  public ChannelColumn position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * The position of the column starting from 1
   * @return position
  **/
  @ApiModelProperty(example = "1", required = true, value = "The position of the column starting from 1")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public ChannelColumn _configuration(ChannelColumnConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ChannelColumnConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(ChannelColumnConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public ChannelColumn restrictedValues(ChannelColumnRestrictedValues restrictedValues) {
    this.restrictedValues = restrictedValues;
    return this;
  }

   /**
   * Get restrictedValues
   * @return restrictedValues
  **/
  @ApiModelProperty(example = "null", value = "")
  public ChannelColumnRestrictedValues getRestrictedValues() {
    return restrictedValues;
  }

  public void setRestrictedValues(ChannelColumnRestrictedValues restrictedValues) {
    this.restrictedValues = restrictedValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelColumn channelColumn = (ChannelColumn) o;
    return Objects.equals(this.channelColumnId, channelColumn.channelColumnId) &&
        Objects.equals(this.channelColumnName, channelColumn.channelColumnName) &&
        Objects.equals(this.channelColumnDescription, channelColumn.channelColumnDescription) &&
        Objects.equals(this.showInMapping, channelColumn.showInMapping) &&
        Objects.equals(this.position, channelColumn.position) &&
        Objects.equals(this._configuration, channelColumn._configuration) &&
        Objects.equals(this.restrictedValues, channelColumn.restrictedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelColumnId, channelColumnName, channelColumnDescription, showInMapping, position, _configuration, restrictedValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelColumn {\n");
    
    sb.append("    channelColumnId: ").append(toIndentedString(channelColumnId)).append("\n");
    sb.append("    channelColumnName: ").append(toIndentedString(channelColumnName)).append("\n");
    sb.append("    channelColumnDescription: ").append(toIndentedString(channelColumnDescription)).append("\n");
    sb.append("    showInMapping: ").append(toIndentedString(showInMapping)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    restrictedValues: ").append(toIndentedString(restrictedValues)).append("\n");
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

