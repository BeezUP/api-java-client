/*
 * Public - Security
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
import io.swagger.client.model.LinksConfigureAutomaticTransitionsLink;
import io.swagger.client.model.LinksGetAutomaticTransitionsLink;

/**
 * AutomaticTransitionInfosLinks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T14:30:06.948Z")
public class AutomaticTransitionInfosLinks {
  @SerializedName("self")
  private LinksGetAutomaticTransitionsLink self = null;

  @SerializedName("configure")
  private LinksConfigureAutomaticTransitionsLink configure = null;

  public AutomaticTransitionInfosLinks self(LinksGetAutomaticTransitionsLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksGetAutomaticTransitionsLink getSelf() {
    return self;
  }

  public void setSelf(LinksGetAutomaticTransitionsLink self) {
    this.self = self;
  }

  public AutomaticTransitionInfosLinks configure(LinksConfigureAutomaticTransitionsLink configure) {
    this.configure = configure;
    return this;
  }

   /**
   * Get configure
   * @return configure
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public LinksConfigureAutomaticTransitionsLink getConfigure() {
    return configure;
  }

  public void setConfigure(LinksConfigureAutomaticTransitionsLink configure) {
    this.configure = configure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomaticTransitionInfosLinks automaticTransitionInfosLinks = (AutomaticTransitionInfosLinks) o;
    return Objects.equals(this.self, automaticTransitionInfosLinks.self) &&
        Objects.equals(this.configure, automaticTransitionInfosLinks.configure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, configure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomaticTransitionInfosLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    configure: ").append(toIndentedString(configure)).append("\n");
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

