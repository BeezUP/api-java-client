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
 * BeezUPCommonLinkParameter2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T11:26:52.821Z")
public class BeezUPCommonLinkParameter2 {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

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

  public BeezUPCommonLinkParameter2 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the parameter
   * @return name
  **/
  @ApiModelProperty(example = "marketplaceTechnicalCode", required = true, value = "The name of the parameter")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BeezUPCommonLinkParameter2 value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the parameter
   * @return value
  **/
  @ApiModelProperty(example = "1234", value = "The value of the parameter")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public BeezUPCommonLinkParameter2 required(Boolean required) {
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

  public BeezUPCommonLinkParameter2 in(InEnum in) {
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

  public BeezUPCommonLinkParameter2 type(TypeEnum type) {
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

  public BeezUPCommonLinkParameter2 lovLink(BeezUPCommonLOVLink2 lovLink) {
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

  public BeezUPCommonLinkParameter2 lovRequired(Boolean lovRequired) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonLinkParameter2 beezUPCommonLinkParameter2 = (BeezUPCommonLinkParameter2) o;
    return Objects.equals(this.name, beezUPCommonLinkParameter2.name) &&
        Objects.equals(this.value, beezUPCommonLinkParameter2.value) &&
        Objects.equals(this.required, beezUPCommonLinkParameter2.required) &&
        Objects.equals(this.in, beezUPCommonLinkParameter2.in) &&
        Objects.equals(this.type, beezUPCommonLinkParameter2.type) &&
        Objects.equals(this.lovLink, beezUPCommonLinkParameter2.lovLink) &&
        Objects.equals(this.lovRequired, beezUPCommonLinkParameter2.lovRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, required, in, type, lovLink, lovRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonLinkParameter2 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lovLink: ").append(toIndentedString(lovLink)).append("\n");
    sb.append("    lovRequired: ").append(toIndentedString(lovRequired)).append("\n");
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

