/*
 * Catalogs
 * This API allows you to manage your catalogs
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
import io.swagger.client.model.BeezUPCommonLink2;
import io.swagger.client.model.BeezUPCommonUserErrorMessage;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse409
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T15:09:47.083Z")
public class InlineResponse409 {
  @SerializedName("errors")
  private List<BeezUPCommonUserErrorMessage> errors = new ArrayList<BeezUPCommonUserErrorMessage>();

  @SerializedName("links")
  private List<BeezUPCommonLink2> links = new ArrayList<BeezUPCommonLink2>();

  public InlineResponse409 errors(List<BeezUPCommonUserErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public InlineResponse409 addErrorsItem(BeezUPCommonUserErrorMessage errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BeezUPCommonUserErrorMessage> getErrors() {
    return errors;
  }

  public void setErrors(List<BeezUPCommonUserErrorMessage> errors) {
    this.errors = errors;
  }

  public InlineResponse409 links(List<BeezUPCommonLink2> links) {
    this.links = links;
    return this;
  }

  public InlineResponse409 addLinksItem(BeezUPCommonLink2 linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * contains the link to the current importation. rel=currentImportation
   * @return links
  **/
  @ApiModelProperty(example = "[{&quot;rel&quot;:&quot;currentImportation&quot;,&quot;href&quot;:&quot;/v2/user/catalogs/{storeId}/importations/{executionId}&quot;,&quot;operationId&quot;:&quot;Importation_GetImportationMonitoring&quot;,&quot;method&quot;:&quot;GET&quot;,&quot;parameters&quot;:[{&quot;name&quot;:&quot;storeId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;required&quot;:true,&quot;value&quot;:&quot;1c1b7ffd-4c4f-4261-881a-1f089b9cf0eb&quot;},{&quot;name&quot;:&quot;executionId&quot;,&quot;in&quot;:&quot;path&quot;,&quot;required&quot;:true,&quot;value&quot;:&quot;b24d0dd8-a561-478a-9b26-34f573f03527&quot;}]}]", value = "contains the link to the current importation. rel=currentImportation")
  public List<BeezUPCommonLink2> getLinks() {
    return links;
  }

  public void setLinks(List<BeezUPCommonLink2> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse409 inlineResponse409 = (InlineResponse409) o;
    return Objects.equals(this.errors, inlineResponse409.errors) &&
        Objects.equals(this.links, inlineResponse409.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse409 {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

