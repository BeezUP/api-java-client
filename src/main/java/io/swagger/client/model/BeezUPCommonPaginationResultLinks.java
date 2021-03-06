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
import io.swagger.client.model.BeezUPCommonLink3;

/**
 * The navigation links &#39;first&#39;, &#39;last&#39;, &#39;next&#39;, &#39;previous&#39;
 */
@ApiModel(description = "The navigation links 'first', 'last', 'next', 'previous'")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class BeezUPCommonPaginationResultLinks {
  @SerializedName("first")
  private BeezUPCommonLink3 first = null;

  @SerializedName("last")
  private BeezUPCommonLink3 last = null;

  @SerializedName("previous")
  private BeezUPCommonLink3 previous = null;

  @SerializedName("next")
  private BeezUPCommonLink3 next = null;

  public BeezUPCommonPaginationResultLinks first(BeezUPCommonLink3 first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonLink3 getFirst() {
    return first;
  }

  public void setFirst(BeezUPCommonLink3 first) {
    this.first = first;
  }

  public BeezUPCommonPaginationResultLinks last(BeezUPCommonLink3 last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonLink3 getLast() {
    return last;
  }

  public void setLast(BeezUPCommonLink3 last) {
    this.last = last;
  }

  public BeezUPCommonPaginationResultLinks previous(BeezUPCommonLink3 previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonLink3 getPrevious() {
    return previous;
  }

  public void setPrevious(BeezUPCommonLink3 previous) {
    this.previous = previous;
  }

  public BeezUPCommonPaginationResultLinks next(BeezUPCommonLink3 next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonLink3 getNext() {
    return next;
  }

  public void setNext(BeezUPCommonLink3 next) {
    this.next = next;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonPaginationResultLinks beezUPCommonPaginationResultLinks = (BeezUPCommonPaginationResultLinks) o;
    return Objects.equals(this.first, beezUPCommonPaginationResultLinks.first) &&
        Objects.equals(this.last, beezUPCommonPaginationResultLinks.last) &&
        Objects.equals(this.previous, beezUPCommonPaginationResultLinks.previous) &&
        Objects.equals(this.next, beezUPCommonPaginationResultLinks.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, previous, next);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonPaginationResultLinks {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

