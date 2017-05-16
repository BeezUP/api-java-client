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
import io.swagger.client.model.BeezUPCommonLOVLink3;
import io.swagger.client.model.BeezUPCommonLinkParameterProperty3;
import io.swagger.client.model.BeezUPCommonParameterIn;
import io.swagger.client.model.BeezUPCommonParameterType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BeezUPCommonLinkParameter3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T08:52:56.733Z")
public class BeezUPCommonLinkParameter3 {
  @SerializedName("value")
  private Object value = null;

  @SerializedName("required")
  private Boolean required = false;

  @SerializedName("in")
  private BeezUPCommonParameterIn in = null;

  @SerializedName("type")
  private BeezUPCommonParameterType type = null;

  @SerializedName("lovLink")
  private BeezUPCommonLOVLink3 lovLink = null;

  @SerializedName("lovRequired")
  private Boolean lovRequired = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("schema")
  private String schema = null;

  @SerializedName("properties")
  private Map<String, BeezUPCommonLinkParameterProperty3> properties = new HashMap<String, BeezUPCommonLinkParameterProperty3>();

  public BeezUPCommonLinkParameter3 value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the parameter. It can be an integer a string or an object.
   * @return value
  **/
  @ApiModelProperty(example = "&quot;1234&quot;", value = "The value of the parameter. It can be an integer a string or an object.")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public BeezUPCommonLinkParameter3 required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public BeezUPCommonLinkParameter3 in(BeezUPCommonParameterIn in) {
    this.in = in;
    return this;
  }

   /**
   * Get in
   * @return in
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonParameterIn getIn() {
    return in;
  }

  public void setIn(BeezUPCommonParameterIn in) {
    this.in = in;
  }

  public BeezUPCommonLinkParameter3 type(BeezUPCommonParameterType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonParameterType getType() {
    return type;
  }

  public void setType(BeezUPCommonParameterType type) {
    this.type = type;
  }

  public BeezUPCommonLinkParameter3 lovLink(BeezUPCommonLOVLink3 lovLink) {
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

  public BeezUPCommonLinkParameter3 lovRequired(Boolean lovRequired) {
    this.lovRequired = lovRequired;
    return this;
  }

   /**
   * If true, you MUST indicate a value from the list of values otherwise it's a freetext
   * @return lovRequired
  **/
  @ApiModelProperty(example = "true", value = "If true, you MUST indicate a value from the list of values otherwise it's a freetext")
  public Boolean getLovRequired() {
    return lovRequired;
  }

  public void setLovRequired(Boolean lovRequired) {
    this.lovRequired = lovRequired;
  }

  public BeezUPCommonLinkParameter3 description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of the parameter
   * @return description
  **/
  @ApiModelProperty(example = "the store identifier", value = "description of the parameter")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BeezUPCommonLinkParameter3 schema(String schema) {
    this.schema = schema;
    return this;
  }

   /**
   * schema of the parameter
   * @return schema
  **/
  @ApiModelProperty(example = "orderListRequest", value = "schema of the parameter")
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }

  public BeezUPCommonLinkParameter3 properties(Map<String, BeezUPCommonLinkParameterProperty3> properties) {
    this.properties = properties;
    return this;
  }

  public BeezUPCommonLinkParameter3 putPropertiesItem(String key, BeezUPCommonLinkParameterProperty3 propertiesItem) {
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * If the parameter is an object with flexible properties (additionProperties/dictionary), we will describe the properties of the object.
   * @return properties
  **/
  @ApiModelProperty(example = "{&quot;shipOrder&quot;:{&quot;type&quot;:&quot;string&quot;}}", value = "If the parameter is an object with flexible properties (additionProperties/dictionary), we will describe the properties of the object.")
  public Map<String, BeezUPCommonLinkParameterProperty3> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, BeezUPCommonLinkParameterProperty3> properties) {
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
    BeezUPCommonLinkParameter3 beezUPCommonLinkParameter3 = (BeezUPCommonLinkParameter3) o;
    return Objects.equals(this.value, beezUPCommonLinkParameter3.value) &&
        Objects.equals(this.required, beezUPCommonLinkParameter3.required) &&
        Objects.equals(this.in, beezUPCommonLinkParameter3.in) &&
        Objects.equals(this.type, beezUPCommonLinkParameter3.type) &&
        Objects.equals(this.lovLink, beezUPCommonLinkParameter3.lovLink) &&
        Objects.equals(this.lovRequired, beezUPCommonLinkParameter3.lovRequired) &&
        Objects.equals(this.description, beezUPCommonLinkParameter3.description) &&
        Objects.equals(this.schema, beezUPCommonLinkParameter3.schema) &&
        Objects.equals(this.properties, beezUPCommonLinkParameter3.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, required, in, type, lovLink, lovRequired, description, schema, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonLinkParameter3 {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lovLink: ").append(toIndentedString(lovLink)).append("\n");
    sb.append("    lovRequired: ").append(toIndentedString(lovRequired)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

