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

/**
 * The XML file description
 */
@ApiModel(description = "The XML file description")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:14:54.205Z")
public class InputFileReadXmlConfiguration {
  @SerializedName("useXmlAttributes")
  private Boolean useXmlAttributes = null;

  @SerializedName("flattenXmlChildElements")
  private Boolean flattenXmlChildElements = null;

  public InputFileReadXmlConfiguration useXmlAttributes(Boolean useXmlAttributes) {
    this.useXmlAttributes = useXmlAttributes;
    return this;
  }

   /**
   * Indicate if the importation should take in account the attribute in the xml nodes.
   * @return useXmlAttributes
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicate if the importation should take in account the attribute in the xml nodes.")
  public Boolean getUseXmlAttributes() {
    return useXmlAttributes;
  }

  public void setUseXmlAttributes(Boolean useXmlAttributes) {
    this.useXmlAttributes = useXmlAttributes;
  }

  public InputFileReadXmlConfiguration flattenXmlChildElements(Boolean flattenXmlChildElements) {
    this.flattenXmlChildElements = flattenXmlChildElements;
    return this;
  }

   /**
   * Indicate if the children xml nodes should be flatten with there parent to take in account the sub node values.
   * @return flattenXmlChildElements
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicate if the children xml nodes should be flatten with there parent to take in account the sub node values.")
  public Boolean getFlattenXmlChildElements() {
    return flattenXmlChildElements;
  }

  public void setFlattenXmlChildElements(Boolean flattenXmlChildElements) {
    this.flattenXmlChildElements = flattenXmlChildElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputFileReadXmlConfiguration inputFileReadXmlConfiguration = (InputFileReadXmlConfiguration) o;
    return Objects.equals(this.useXmlAttributes, inputFileReadXmlConfiguration.useXmlAttributes) &&
        Objects.equals(this.flattenXmlChildElements, inputFileReadXmlConfiguration.flattenXmlChildElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useXmlAttributes, flattenXmlChildElements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputFileReadXmlConfiguration {\n");
    
    sb.append("    useXmlAttributes: ").append(toIndentedString(useXmlAttributes)).append("\n");
    sb.append("    flattenXmlChildElements: ").append(toIndentedString(flattenXmlChildElements)).append("\n");
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

