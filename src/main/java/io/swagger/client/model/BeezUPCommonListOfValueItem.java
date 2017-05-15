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

/**
 * This object is used by LOV apis
 */
@ApiModel(description = "This object is used by LOV apis")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:58:06.674Z")
public class BeezUPCommonListOfValueItem {
  @SerializedName("position")
  private Integer position = null;

  @SerializedName("codeIdentifier")
  private String codeIdentifier = null;

  @SerializedName("translationText")
  private String translationText = null;

  @SerializedName("intIdentifier")
  private Integer intIdentifier = null;

  public BeezUPCommonListOfValueItem position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public BeezUPCommonListOfValueItem codeIdentifier(String codeIdentifier) {
    this.codeIdentifier = codeIdentifier;
    return this;
  }

   /**
   * Get codeIdentifier
   * @return codeIdentifier
  **/
  @ApiModelProperty(example = "FRA", required = true, value = "")
  public String getCodeIdentifier() {
    return codeIdentifier;
  }

  public void setCodeIdentifier(String codeIdentifier) {
    this.codeIdentifier = codeIdentifier;
  }

  public BeezUPCommonListOfValueItem translationText(String translationText) {
    this.translationText = translationText;
    return this;
  }

   /**
   * Get translationText
   * @return translationText
  **/
  @ApiModelProperty(example = "France", value = "")
  public String getTranslationText() {
    return translationText;
  }

  public void setTranslationText(String translationText) {
    this.translationText = translationText;
  }

  public BeezUPCommonListOfValueItem intIdentifier(Integer intIdentifier) {
    this.intIdentifier = intIdentifier;
    return this;
  }

   /**
   * Get intIdentifier
   * @return intIdentifier
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getIntIdentifier() {
    return intIdentifier;
  }

  public void setIntIdentifier(Integer intIdentifier) {
    this.intIdentifier = intIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonListOfValueItem beezUPCommonListOfValueItem = (BeezUPCommonListOfValueItem) o;
    return Objects.equals(this.position, beezUPCommonListOfValueItem.position) &&
        Objects.equals(this.codeIdentifier, beezUPCommonListOfValueItem.codeIdentifier) &&
        Objects.equals(this.translationText, beezUPCommonListOfValueItem.translationText) &&
        Objects.equals(this.intIdentifier, beezUPCommonListOfValueItem.intIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, codeIdentifier, translationText, intIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonListOfValueItem {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    codeIdentifier: ").append(toIndentedString(codeIdentifier)).append("\n");
    sb.append("    translationText: ").append(toIndentedString(translationText)).append("\n");
    sb.append("    intIdentifier: ").append(toIndentedString(intIdentifier)).append("\n");
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

