/*
 * Marketplaces - Channel catalogs
 * This API allows you to manage your channel catalogs\\' marketplace settings and fetch your account\\'s catalog publication history
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
import io.swagger.client.model.BeezUPCommonInfoSummaries;
import io.swagger.client.model.BeezUPCommonLOVLink3;
import io.swagger.client.model.ChannelCatalogMarketplaceSetting;
import io.swagger.client.model.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * ChannelCatalogMarketplaceProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:18:00.350Z")
public class ChannelCatalogMarketplaceProperty {
  @SerializedName("name")
  private String name = null;

  @SerializedName("values")
  private List<String> values = new ArrayList<String>();

  @SerializedName("info")
  private BeezUPCommonInfoSummaries info = null;

  @SerializedName("default")
  private List<String> _default = new ArrayList<String>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("readOnly")
  private Boolean readOnly = false;

  @SerializedName("minLength")
  private Integer minLength = 0;

  @SerializedName("maxLength")
  private Integer maxLength = null;

  @SerializedName("minItems")
  private Integer minItems = 1;

  @SerializedName("maxItems")
  private Integer maxItems = 1;

  @SerializedName("lovLink")
  private BeezUPCommonLOVLink3 lovLink = null;

  @SerializedName("lovRequired")
  private Boolean lovRequired = false;

  @SerializedName("required")
  private Boolean required = false;

  @SerializedName("offerIdRequired")
  private Integer offerIdRequired = null;

  @SerializedName("visible")
  private Boolean visible = true;

  @SerializedName("type")
  private Type type = null;

  @SerializedName("pattern")
  private String pattern = null;

  public ChannelCatalogMarketplaceProperty name(String name) {
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

  public ChannelCatalogMarketplaceProperty values(List<String> values) {
    this.values = values;
    return this;
  }

  public ChannelCatalogMarketplaceProperty addValuesItem(String valuesItem) {
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

  public ChannelCatalogMarketplaceProperty info(BeezUPCommonInfoSummaries info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonInfoSummaries getInfo() {
    return info;
  }

  public void setInfo(BeezUPCommonInfoSummaries info) {
    this.info = info;
  }

  public ChannelCatalogMarketplaceProperty _default(List<String> _default) {
    this._default = _default;
    return this;
  }

  public ChannelCatalogMarketplaceProperty addDefaultItem(String _defaultItem) {
    this._default.add(_defaultItem);
    return this;
  }

   /**
   * Indicate the default values of the property
   * @return _default
  **/
  @ApiModelProperty(example = "[&quot;true&quot;]", value = "Indicate the default values of the property")
  public List<String> getDefault() {
    return _default;
  }

  public void setDefault(List<String> _default) {
    this._default = _default;
  }

  public ChannelCatalogMarketplaceProperty description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Indicate the description of the property
   * @return description
  **/
  @ApiModelProperty(example = "If true allows to retireve one marketplace country only", value = "Indicate the description of the property")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChannelCatalogMarketplaceProperty position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Indicate the position of the property in the display group
   * minimum: 1
   * @return position
  **/
  @ApiModelProperty(example = "1", required = true, value = "Indicate the position of the property in the display group")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public ChannelCatalogMarketplaceProperty readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Indicate if the value cannot be changed. This is used for example for ebay token that should not be changed.
   * @return readOnly
  **/
  @ApiModelProperty(example = "false", required = true, value = "Indicate if the value cannot be changed. This is used for example for ebay token that should not be changed.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public ChannelCatalogMarketplaceProperty minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Indicates the minimum size of the property value
   * minimum: 0
   * @return minLength
  **/
  @ApiModelProperty(example = "1", value = "Indicates the minimum size of the property value")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public ChannelCatalogMarketplaceProperty maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Indicates the maximum size of the property value
   * minimum: 1
   * @return maxLength
  **/
  @ApiModelProperty(example = "500", value = "Indicates the maximum size of the property value")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public ChannelCatalogMarketplaceProperty minItems(Integer minItems) {
    this.minItems = minItems;
    return this;
  }

   /**
   * Indicates the minimum item count of the property value.
   * minimum: 0
   * @return minItems
  **/
  @ApiModelProperty(example = "1", value = "Indicates the minimum item count of the property value.")
  public Integer getMinItems() {
    return minItems;
  }

  public void setMinItems(Integer minItems) {
    this.minItems = minItems;
  }

  public ChannelCatalogMarketplaceProperty maxItems(Integer maxItems) {
    this.maxItems = maxItems;
    return this;
  }

   /**
   * Indicates the maximum item count of the property value
   * minimum: 1
   * @return maxItems
  **/
  @ApiModelProperty(example = "2", value = "Indicates the maximum item count of the property value")
  public Integer getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Integer maxItems) {
    this.maxItems = maxItems;
  }

  public ChannelCatalogMarketplaceProperty lovLink(BeezUPCommonLOVLink3 lovLink) {
    this.lovLink = lovLink;
    return this;
  }

   /**
   * Get lovLink
   * @return lovLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonLOVLink3 getLovLink() {
    return lovLink;
  }

  public void setLovLink(BeezUPCommonLOVLink3 lovLink) {
    this.lovLink = lovLink;
  }

  public ChannelCatalogMarketplaceProperty lovRequired(Boolean lovRequired) {
    this.lovRequired = lovRequired;
    return this;
  }

   /**
   * Indicates if the property value must be in the list of value.
   * @return lovRequired
  **/
  @ApiModelProperty(example = "true", value = "Indicates if the property value must be in the list of value.")
  public Boolean getLovRequired() {
    return lovRequired;
  }

  public void setLovRequired(Boolean lovRequired) {
    this.lovRequired = lovRequired;
  }

  public ChannelCatalogMarketplaceProperty required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Indicate if the property is required or not
   * @return required
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicate if the property is required or not")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public ChannelCatalogMarketplaceProperty offerIdRequired(Integer offerIdRequired) {
    this.offerIdRequired = offerIdRequired;
    return this;
  }

   /**
   * Indicates the offer identifier required to configure this property.
   * @return offerIdRequired
  **/
  @ApiModelProperty(example = "10", value = "Indicates the offer identifier required to configure this property.")
  public Integer getOfferIdRequired() {
    return offerIdRequired;
  }

  public void setOfferIdRequired(Integer offerIdRequired) {
    this.offerIdRequired = offerIdRequired;
  }

  public ChannelCatalogMarketplaceProperty visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Indicates if this property should be displayed in the configuration page.
   * @return visible
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if this property should be displayed in the configuration page.")
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public ChannelCatalogMarketplaceProperty type(Type type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public ChannelCatalogMarketplaceProperty pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Channel catalog marketplace setting value format validation regular expression
   * @return pattern
  **/
  @ApiModelProperty(example = "(?:[a-z0-9!#$%&amp;&#39;*+/&#x3D;?^_&#x60;{|}~-]+(?:\.[a-z0-9!#$%&amp;&#39;*+/&#x3D;?^_&#x60;{|}~-]+)*|&quot;(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])*&quot;)@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]|\\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])", value = "Channel catalog marketplace setting value format validation regular expression")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCatalogMarketplaceProperty channelCatalogMarketplaceProperty = (ChannelCatalogMarketplaceProperty) o;
    return Objects.equals(this.name, channelCatalogMarketplaceProperty.name) &&
        Objects.equals(this.values, channelCatalogMarketplaceProperty.values) &&
        Objects.equals(this.info, channelCatalogMarketplaceProperty.info) &&
        Objects.equals(this._default, channelCatalogMarketplaceProperty._default) &&
        Objects.equals(this.description, channelCatalogMarketplaceProperty.description) &&
        Objects.equals(this.position, channelCatalogMarketplaceProperty.position) &&
        Objects.equals(this.readOnly, channelCatalogMarketplaceProperty.readOnly) &&
        Objects.equals(this.minLength, channelCatalogMarketplaceProperty.minLength) &&
        Objects.equals(this.maxLength, channelCatalogMarketplaceProperty.maxLength) &&
        Objects.equals(this.minItems, channelCatalogMarketplaceProperty.minItems) &&
        Objects.equals(this.maxItems, channelCatalogMarketplaceProperty.maxItems) &&
        Objects.equals(this.lovLink, channelCatalogMarketplaceProperty.lovLink) &&
        Objects.equals(this.lovRequired, channelCatalogMarketplaceProperty.lovRequired) &&
        Objects.equals(this.required, channelCatalogMarketplaceProperty.required) &&
        Objects.equals(this.offerIdRequired, channelCatalogMarketplaceProperty.offerIdRequired) &&
        Objects.equals(this.visible, channelCatalogMarketplaceProperty.visible) &&
        Objects.equals(this.type, channelCatalogMarketplaceProperty.type) &&
        Objects.equals(this.pattern, channelCatalogMarketplaceProperty.pattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values, info, _default, description, position, readOnly, minLength, maxLength, minItems, maxItems, lovLink, lovRequired, required, offerIdRequired, visible, type, pattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCatalogMarketplaceProperty {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    minItems: ").append(toIndentedString(minItems)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    lovLink: ").append(toIndentedString(lovLink)).append("\n");
    sb.append("    lovRequired: ").append(toIndentedString(lovRequired)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    offerIdRequired: ").append(toIndentedString(offerIdRequired)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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

