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
import io.swagger.client.model.DefinitionslinksGetOrderHistoryLink;
import io.swagger.client.model.DefinitionslinksGetOrderLink;
import io.swagger.client.model.OrderHeaderLinks;

/**
 * OrderLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:58:38.338Z")
public class OrderLinks {
  @SerializedName("self")
  private DefinitionslinksGetOrderLink self = null;

  @SerializedName("history")
  private DefinitionslinksGetOrderHistoryLink history = null;

  public OrderLinks self(DefinitionslinksGetOrderLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DefinitionslinksGetOrderLink getSelf() {
    return self;
  }

  public void setSelf(DefinitionslinksGetOrderLink self) {
    this.self = self;
  }

  public OrderLinks history(DefinitionslinksGetOrderHistoryLink history) {
    this.history = history;
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @ApiModelProperty(example = "null", value = "")
  public DefinitionslinksGetOrderHistoryLink getHistory() {
    return history;
  }

  public void setHistory(DefinitionslinksGetOrderHistoryLink history) {
    this.history = history;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLinks orderLinks = (OrderLinks) o;
    return Objects.equals(this.self, orderLinks.self) &&
        Objects.equals(this.history, orderLinks.history);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, history);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

