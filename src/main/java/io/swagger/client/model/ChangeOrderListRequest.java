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
import io.swagger.client.model.ChangeOrderListRequestItem;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains all change order operations you want to make
 */
@ApiModel(description = "Contains all change order operations you want to make")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:17:16.769Z")
public class ChangeOrderListRequest {
  @SerializedName("changeOrders")
  private List<ChangeOrderListRequestItem> changeOrders = new ArrayList<ChangeOrderListRequestItem>();

  public ChangeOrderListRequest changeOrders(List<ChangeOrderListRequestItem> changeOrders) {
    this.changeOrders = changeOrders;
    return this;
  }

  public ChangeOrderListRequest addChangeOrdersItem(ChangeOrderListRequestItem changeOrdersItem) {
    this.changeOrders.add(changeOrdersItem);
    return this;
  }

   /**
   * The change order operations
   * @return changeOrders
  **/
  @ApiModelProperty(example = "null", required = true, value = "The change order operations")
  public List<ChangeOrderListRequestItem> getChangeOrders() {
    return changeOrders;
  }

  public void setChangeOrders(List<ChangeOrderListRequestItem> changeOrders) {
    this.changeOrders = changeOrders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeOrderListRequest changeOrderListRequest = (ChangeOrderListRequest) o;
    return Objects.equals(this.changeOrders, changeOrderListRequest.changeOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeOrders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeOrderListRequest {\n");
    
    sb.append("    changeOrders: ").append(toIndentedString(changeOrders)).append("\n");
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

