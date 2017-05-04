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
import io.swagger.client.model.BeezUPCommonLOVLink2;

/**
 * BeezUPCommonLinkParameter3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:14:54.205Z")
public class BeezUPCommonLinkParameter3 {
  @SerializedName("value")
  private Object value = null;

  @SerializedName("required")
  private Boolean required = null;

  /**
   * * path: if the parameter must be pass in the path uri * header: if the parameter must be passed in http header * query: if the parameter must be passed in querystring * body: if the paramter must be passed in the body 
   */
  public enum InEnum {
    @SerializedName("path")
    PATH("path"),
    
    @SerializedName("header")
    HEADER("header"),
    
    @SerializedName("query")
    QUERY("query"),
    
    @SerializedName("body")
    BODY("body");

    private String value;

    InEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("in")
  private InEnum in = null;

  /**
   * The value type of the parameter
   */
  public enum TypeEnum {
    @SerializedName("string")
    STRING("string"),
    
    @SerializedName("integer")
    INTEGER("integer"),
    
    @SerializedName("number")
    NUMBER("number"),
    
    @SerializedName("boolean")
    BOOLEAN("boolean"),
    
    @SerializedName("object")
    OBJECT("object"),
    
    @SerializedName("array")
    ARRAY("array"),
    
    @SerializedName("date")
    DATE("date"),
    
    @SerializedName("date-time")
    DATE_TIME("date-time");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("lovLink")
  private BeezUPCommonLOVLink2 lovLink = null;

  @SerializedName("lovRequired")
  private Boolean lovRequired = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("schema")
  private String schema = null;

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

  public BeezUPCommonLinkParameter3 in(InEnum in) {
    this.in = in;
    return this;
  }

   /**
   * * path: if the parameter must be pass in the path uri * header: if the parameter must be passed in http header * query: if the parameter must be passed in querystring * body: if the paramter must be passed in the body 
   * @return in
  **/
  @ApiModelProperty(example = "path", value = "* path: if the parameter must be pass in the path uri * header: if the parameter must be passed in http header * query: if the parameter must be passed in querystring * body: if the paramter must be passed in the body ")
  public InEnum getIn() {
    return in;
  }

  public void setIn(InEnum in) {
    this.in = in;
  }

  public BeezUPCommonLinkParameter3 type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The value type of the parameter
   * @return type
  **/
  @ApiModelProperty(example = "string", value = "The value type of the parameter")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BeezUPCommonLinkParameter3 lovLink(BeezUPCommonLOVLink2 lovLink) {
    this.lovLink = lovLink;
    return this;
  }

   /**
   * This parameter expect the values indicated in this list of values.
   * @return lovLink
  **/
  @ApiModelProperty(example = "null", value = "This parameter expect the values indicated in this list of values.")
  public BeezUPCommonLOVLink2 getLovLink() {
    return lovLink;
  }

  public void setLovLink(BeezUPCommonLOVLink2 lovLink) {
    this.lovLink = lovLink;
  }

  public BeezUPCommonLinkParameter3 lovRequired(Boolean lovRequired) {
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
        Objects.equals(this.schema, beezUPCommonLinkParameter3.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, required, in, type, lovLink, lovRequired, description, schema);
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

