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
import io.swagger.client.model.AutomaticTransitionInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * AutomaticTransitionInfos
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T09:13:41.476Z")
public class AutomaticTransitionInfos {
  @SerializedName("automaticTransitionInfos")
  private List<AutomaticTransitionInfo> automaticTransitionInfos = new ArrayList<AutomaticTransitionInfo>();

  public AutomaticTransitionInfos automaticTransitionInfos(List<AutomaticTransitionInfo> automaticTransitionInfos) {
    this.automaticTransitionInfos = automaticTransitionInfos;
    return this;
  }

  public AutomaticTransitionInfos addAutomaticTransitionInfosItem(AutomaticTransitionInfo automaticTransitionInfosItem) {
    this.automaticTransitionInfos.add(automaticTransitionInfosItem);
    return this;
  }

   /**
   * Get automaticTransitionInfos
   * @return automaticTransitionInfos
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AutomaticTransitionInfo> getAutomaticTransitionInfos() {
    return automaticTransitionInfos;
  }

  public void setAutomaticTransitionInfos(List<AutomaticTransitionInfo> automaticTransitionInfos) {
    this.automaticTransitionInfos = automaticTransitionInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomaticTransitionInfos automaticTransitionInfos = (AutomaticTransitionInfos) o;
    return Objects.equals(this.automaticTransitionInfos, automaticTransitionInfos.automaticTransitionInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticTransitionInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomaticTransitionInfos {\n");
    
    sb.append("    automaticTransitionInfos: ").append(toIndentedString(automaticTransitionInfos)).append("\n");
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

