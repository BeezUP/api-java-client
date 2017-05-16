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
import io.swagger.client.model.AutomaticTransitionInfo;
import io.swagger.client.model.AutomaticTransitionInfosLinks;
import java.util.ArrayList;
import java.util.List;

/**
 * AutomaticTransitionInfos
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-16T09:23:29.795Z")
public class AutomaticTransitionInfos {
  @SerializedName("links")
  private AutomaticTransitionInfosLinks links = null;

  @SerializedName("automaticTransitionInfos")
  private List<AutomaticTransitionInfo> automaticTransitionInfos = new ArrayList<AutomaticTransitionInfo>();

  public AutomaticTransitionInfos links(AutomaticTransitionInfosLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AutomaticTransitionInfosLinks getLinks() {
    return links;
  }

  public void setLinks(AutomaticTransitionInfosLinks links) {
    this.links = links;
  }

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
    return Objects.equals(this.links, automaticTransitionInfos.links) &&
        Objects.equals(this.automaticTransitionInfos, automaticTransitionInfos.automaticTransitionInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, automaticTransitionInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomaticTransitionInfos {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

