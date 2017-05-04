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
import io.swagger.client.model.CostType;
import java.math.BigDecimal;

/**
 * Depending to the cost type you will have to define a cost value.
 */
@ApiModel(description = "Depending to the cost type you will have to define a cost value.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:10:30.245Z")
public class CostSettings {
  @SerializedName("costType")
  private CostType costType = null;

  @SerializedName("globalCostValue")
  private BigDecimal globalCostValue = null;

  public CostSettings costType(CostType costType) {
    this.costType = costType;
    return this;
  }

   /**
   * Get costType
   * @return costType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CostType getCostType() {
    return costType;
  }

  public void setCostType(CostType costType) {
    this.costType = costType;
  }

  public CostSettings globalCostValue(BigDecimal globalCostValue) {
    this.globalCostValue = globalCostValue;
    return this;
  }

   /**
   * In case of global cost type, you have to indicate the cost value.
   * @return globalCostValue
  **/
  @ApiModelProperty(example = "10.21", value = "In case of global cost type, you have to indicate the cost value.")
  public BigDecimal getGlobalCostValue() {
    return globalCostValue;
  }

  public void setGlobalCostValue(BigDecimal globalCostValue) {
    this.globalCostValue = globalCostValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostSettings costSettings = (CostSettings) o;
    return Objects.equals(this.costType, costSettings.costType) &&
        Objects.equals(this.globalCostValue, costSettings.globalCostValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costType, globalCostValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostSettings {\n");
    
    sb.append("    costType: ").append(toIndentedString(costType)).append("\n");
    sb.append("    globalCostValue: ").append(toIndentedString(globalCostValue)).append("\n");
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

