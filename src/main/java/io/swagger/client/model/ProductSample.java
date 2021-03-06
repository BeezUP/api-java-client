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
import io.swagger.client.model.ProductValues;

/**
 * Describe a product sample
 */
@ApiModel(description = "Describe a product sample")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class ProductSample {
  @SerializedName("productValues")
  private ProductValues productValues = null;

  public ProductSample productValues(ProductValues productValues) {
    this.productValues = productValues;
    return this;
  }

   /**
   * Get productValues
   * @return productValues
  **/
  @ApiModelProperty(example = "null", value = "")
  public ProductValues getProductValues() {
    return productValues;
  }

  public void setProductValues(ProductValues productValues) {
    this.productValues = productValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSample productSample = (ProductSample) o;
    return Objects.equals(this.productValues, productSample.productValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSample {\n");
    
    sb.append("    productValues: ").append(toIndentedString(productValues)).append("\n");
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

