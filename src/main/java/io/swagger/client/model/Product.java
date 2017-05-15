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
import io.swagger.client.model.BeezUPCommonCatalogCategoryId;
import io.swagger.client.model.BeezUPCommonProductId;
import io.swagger.client.model.ProductValues;

/**
 * Represent a catalog product
 */
@ApiModel(description = "Represent a catalog product")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:58:06.674Z")
public class Product {
  @SerializedName("productId")
  private BeezUPCommonProductId productId = null;

  @SerializedName("categoryId")
  private BeezUPCommonCatalogCategoryId categoryId = null;

  @SerializedName("values")
  private ProductValues values = null;

  public Product productId(BeezUPCommonProductId productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonProductId getProductId() {
    return productId;
  }

  public void setProductId(BeezUPCommonProductId productId) {
    this.productId = productId;
  }

  public Product categoryId(BeezUPCommonCatalogCategoryId categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonCatalogCategoryId getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(BeezUPCommonCatalogCategoryId categoryId) {
    this.categoryId = categoryId;
  }

  public Product values(ProductValues values) {
    this.values = values;
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(example = "null", value = "")
  public ProductValues getValues() {
    return values;
  }

  public void setValues(ProductValues values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.productId, product.productId) &&
        Objects.equals(this.categoryId, product.categoryId) &&
        Objects.equals(this.values, product.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, categoryId, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

