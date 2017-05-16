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
import io.swagger.client.model.TrackedExternalOrder;
import java.util.ArrayList;
import java.util.List;

/**
 * TrackedExternalOrders
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T08:52:56.733Z")
public class TrackedExternalOrders {
  @SerializedName("externalOrders")
  private List<TrackedExternalOrder> externalOrders = new ArrayList<TrackedExternalOrder>();

  public TrackedExternalOrders externalOrders(List<TrackedExternalOrder> externalOrders) {
    this.externalOrders = externalOrders;
    return this;
  }

  public TrackedExternalOrders addExternalOrdersItem(TrackedExternalOrder externalOrdersItem) {
    this.externalOrders.add(externalOrdersItem);
    return this;
  }

   /**
   * Get externalOrders
   * @return externalOrders
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<TrackedExternalOrder> getExternalOrders() {
    return externalOrders;
  }

  public void setExternalOrders(List<TrackedExternalOrder> externalOrders) {
    this.externalOrders = externalOrders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackedExternalOrders trackedExternalOrders = (TrackedExternalOrders) o;
    return Objects.equals(this.externalOrders, trackedExternalOrders.externalOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalOrders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackedExternalOrders {\n");
    
    sb.append("    externalOrders: ").append(toIndentedString(externalOrders)).append("\n");
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

