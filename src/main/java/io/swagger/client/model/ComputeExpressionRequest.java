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
import io.swagger.client.model.EncryptedExpression;
import io.swagger.client.model.ProductValues;

/**
 * The request message to compute an expression based on the provided product values
 */
@ApiModel(description = "The request message to compute an expression based on the provided product values")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:19:57.195Z")
public class ComputeExpressionRequest {
  @SerializedName("productValues")
  private ProductValues productValues = null;

  @SerializedName("encryptedExpression")
  private EncryptedExpression encryptedExpression = null;

  public ComputeExpressionRequest productValues(ProductValues productValues) {
    this.productValues = productValues;
    return this;
  }

   /**
   * Get productValues
   * @return productValues
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ProductValues getProductValues() {
    return productValues;
  }

  public void setProductValues(ProductValues productValues) {
    this.productValues = productValues;
  }

  public ComputeExpressionRequest encryptedExpression(EncryptedExpression encryptedExpression) {
    this.encryptedExpression = encryptedExpression;
    return this;
  }

   /**
   * Get encryptedExpression
   * @return encryptedExpression
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public EncryptedExpression getEncryptedExpression() {
    return encryptedExpression;
  }

  public void setEncryptedExpression(EncryptedExpression encryptedExpression) {
    this.encryptedExpression = encryptedExpression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeExpressionRequest computeExpressionRequest = (ComputeExpressionRequest) o;
    return Objects.equals(this.productValues, computeExpressionRequest.productValues) &&
        Objects.equals(this.encryptedExpression, computeExpressionRequest.encryptedExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productValues, encryptedExpression);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeExpressionRequest {\n");
    
    sb.append("    productValues: ").append(toIndentedString(productValues)).append("\n");
    sb.append("    encryptedExpression: ").append(toIndentedString(encryptedExpression)).append("\n");
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

