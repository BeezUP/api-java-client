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
import io.swagger.client.model.BeezUPCommonLOVLink3;
import io.swagger.client.model.BeezUPCommonParameterType;

/**
 * BeezUPCommonLinkParameterProperty3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:40:14.157Z")
public class BeezUPCommonLinkParameterProperty3 {
  @SerializedName("value")
  private Object value = null;

  @SerializedName("required")
  private Boolean required = null;

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

  public BeezUPCommonLinkParameterProperty3 value(Object value) {
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

  public BeezUPCommonLinkParameterProperty3 required(Boolean required) {
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

  public BeezUPCommonLinkParameterProperty3 type(BeezUPCommonParameterType type) {
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

  public BeezUPCommonLinkParameterProperty3 lovLink(BeezUPCommonLOVLink3 lovLink) {
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

  public BeezUPCommonLinkParameterProperty3 lovRequired(Boolean lovRequired) {
    this.lovRequired = lovRequired;
    return this;
  }

   /**
   * If true, you MUST use indicate a value from the list of values otherwise it's a freetext
   * @return lovRequired
  **/
  @ApiModelProperty(example = "true", value = "If true, you MUST use indicate a value from the list of values otherwise it's a freetext")
  public Boolean getLovRequired() {
    return lovRequired;
  }

  public void setLovRequired(Boolean lovRequired) {
    this.lovRequired = lovRequired;
  }

  public BeezUPCommonLinkParameterProperty3 description(String description) {
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

  public BeezUPCommonLinkParameterProperty3 schema(String schema) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonLinkParameterProperty3 beezUPCommonLinkParameterProperty3 = (BeezUPCommonLinkParameterProperty3) o;
    return Objects.equals(this.value, beezUPCommonLinkParameterProperty3.value) &&
        Objects.equals(this.required, beezUPCommonLinkParameterProperty3.required) &&
        Objects.equals(this.type, beezUPCommonLinkParameterProperty3.type) &&
        Objects.equals(this.lovLink, beezUPCommonLinkParameterProperty3.lovLink) &&
        Objects.equals(this.lovRequired, beezUPCommonLinkParameterProperty3.lovRequired) &&
        Objects.equals(this.description, beezUPCommonLinkParameterProperty3.description) &&
        Objects.equals(this.schema, beezUPCommonLinkParameterProperty3.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, required, type, lovLink, lovRequired, description, schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonLinkParameterProperty3 {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lovLink: ").append(toIndentedString(lovLink)).append("\n");
    sb.append("    lovRequired: ").append(toIndentedString(lovRequired)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

