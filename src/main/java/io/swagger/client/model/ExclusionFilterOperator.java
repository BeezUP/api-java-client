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
import io.swagger.client.model.ExclusionFilterOperatorDataType;
import io.swagger.client.model.ExclusionFilterOperatorName;

/**
 * The exclusion filter operator
 */
@ApiModel(description = "The exclusion filter operator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T10:49:46.695Z")
public class ExclusionFilterOperator {
  @SerializedName("name")
  private ExclusionFilterOperatorName name = null;

  @SerializedName("expectedChannelColumnDataType")
  private ExclusionFilterOperatorDataType expectedChannelColumnDataType = null;

  @SerializedName("valueRequired")
  private Boolean valueRequired = null;

  @SerializedName("expectedValueDataType")
  private ExclusionFilterOperatorDataType expectedValueDataType = null;

  public ExclusionFilterOperator name(ExclusionFilterOperatorName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public ExclusionFilterOperatorName getName() {
    return name;
  }

  public void setName(ExclusionFilterOperatorName name) {
    this.name = name;
  }

  public ExclusionFilterOperator expectedChannelColumnDataType(ExclusionFilterOperatorDataType expectedChannelColumnDataType) {
    this.expectedChannelColumnDataType = expectedChannelColumnDataType;
    return this;
  }

   /**
   * Get expectedChannelColumnDataType
   * @return expectedChannelColumnDataType
  **/
  @ApiModelProperty(example = "null", value = "")
  public ExclusionFilterOperatorDataType getExpectedChannelColumnDataType() {
    return expectedChannelColumnDataType;
  }

  public void setExpectedChannelColumnDataType(ExclusionFilterOperatorDataType expectedChannelColumnDataType) {
    this.expectedChannelColumnDataType = expectedChannelColumnDataType;
  }

  public ExclusionFilterOperator valueRequired(Boolean valueRequired) {
    this.valueRequired = valueRequired;
    return this;
  }

   /**
   * This operator requires a value
   * @return valueRequired
  **/
  @ApiModelProperty(example = "true", value = "This operator requires a value")
  public Boolean getValueRequired() {
    return valueRequired;
  }

  public void setValueRequired(Boolean valueRequired) {
    this.valueRequired = valueRequired;
  }

  public ExclusionFilterOperator expectedValueDataType(ExclusionFilterOperatorDataType expectedValueDataType) {
    this.expectedValueDataType = expectedValueDataType;
    return this;
  }

   /**
   * Get expectedValueDataType
   * @return expectedValueDataType
  **/
  @ApiModelProperty(example = "null", value = "")
  public ExclusionFilterOperatorDataType getExpectedValueDataType() {
    return expectedValueDataType;
  }

  public void setExpectedValueDataType(ExclusionFilterOperatorDataType expectedValueDataType) {
    this.expectedValueDataType = expectedValueDataType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExclusionFilterOperator exclusionFilterOperator = (ExclusionFilterOperator) o;
    return Objects.equals(this.name, exclusionFilterOperator.name) &&
        Objects.equals(this.expectedChannelColumnDataType, exclusionFilterOperator.expectedChannelColumnDataType) &&
        Objects.equals(this.valueRequired, exclusionFilterOperator.valueRequired) &&
        Objects.equals(this.expectedValueDataType, exclusionFilterOperator.expectedValueDataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, expectedChannelColumnDataType, valueRequired, expectedValueDataType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExclusionFilterOperator {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expectedChannelColumnDataType: ").append(toIndentedString(expectedChannelColumnDataType)).append("\n");
    sb.append("    valueRequired: ").append(toIndentedString(valueRequired)).append("\n");
    sb.append("    expectedValueDataType: ").append(toIndentedString(expectedValueDataType)).append("\n");
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

