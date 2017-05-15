/*
 * BeezUP API
 * # The REST API of BeezUP system ## Overview The REST APIs provide programmatic access to read and write BeezUP data.  Basically, with this API you will be able to do everything like you were with your browser on https://go.beezup.com !  The main features are: - Register and manage your account - Create and manage and share your stores with your friends/co-workers. - Import your product catalog and schedule the auto importation - Search the channels your want to use - Configure your channels for your catalogs to export your product information:     - cost and general settings     - category and columns mappings     - your will be able to create and manage your custom column     - put in place exlusion filters based on simple conditions on your product data     - override product values     - get product vision for a channel catalog scope - Analyze and optimize your performance of your catalogs on all yours channels with different type of reportings by day, channel, category and by product. - Automatize your optimisation by using rules! - And of course... Manage your orders harvested from all your marketplaces:     - Synchronize your orders in an uniformized way     - Get the available actions and update the order status - ...and more!  ## Authentication credentials The public API with the base path **_/v2/public** have been put in place to give you an entry point to our system for the user registration, login and lost password. The public API does not require any credentials. We give you the some public list of values and public channels for our public commercial web site [www.beezup.com](http://www.beezup.com).  The user API with the base path **_/v2/user** requires a token which is available on this page: https://go.beezup.com/Account/MyAccount  ## Things to keep in mind ### API Rate Limits - The BeezUP REST API is limited to 100 calls/minute.  ### Media type The default media type for requests and responses is application/json. Where noted, some operations support other content types. If no additional content type is mentioned for a specific operation, then the media type is application/json.  ### Required content type The required and default encoding for the request and responses is UTF8.  ### Required date time format All our date time are formatted in ISO 8601 format: 2014-06-24T16:25:00Z.  ### Base URL The Base URL of the BeezUP API Order Management REST API conforms to the following template.  https://api.beezup.com  All URLs returned by the BeezUP API are relative to this base URL, and all requests to the REST API must use this base URL template.  You can test our API on https://api-docs.beezup.com/swagger-ui\\ You can contact us on [gitter, #BeezUP/API](https://gitter.im/beezUP/API) 
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
import io.swagger.client.model.BeezUPCommonErrorSummary;
import io.swagger.client.model.BeezUPCommonInfoSummary;
import io.swagger.client.model.BeezUPCommonSuccessSummary;
import io.swagger.client.model.BeezUPCommonWarningSummary;
import java.util.ArrayList;
import java.util.List;

/**
 * BeezUPCommonInfoSummaries
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T14:10:42.368Z")
public class BeezUPCommonInfoSummaries {
  @SerializedName("successes")
  private List<BeezUPCommonSuccessSummary> successes = new ArrayList<BeezUPCommonSuccessSummary>();

  @SerializedName("errors")
  private List<BeezUPCommonErrorSummary> errors = new ArrayList<BeezUPCommonErrorSummary>();

  @SerializedName("warnings")
  private List<BeezUPCommonWarningSummary> warnings = new ArrayList<BeezUPCommonWarningSummary>();

  @SerializedName("informations")
  private List<BeezUPCommonInfoSummary> informations = new ArrayList<BeezUPCommonInfoSummary>();

  public BeezUPCommonInfoSummaries successes(List<BeezUPCommonSuccessSummary> successes) {
    this.successes = successes;
    return this;
  }

  public BeezUPCommonInfoSummaries addSuccessesItem(BeezUPCommonSuccessSummary successesItem) {
    this.successes.add(successesItem);
    return this;
  }

   /**
   * Get successes
   * @return successes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BeezUPCommonSuccessSummary> getSuccesses() {
    return successes;
  }

  public void setSuccesses(List<BeezUPCommonSuccessSummary> successes) {
    this.successes = successes;
  }

  public BeezUPCommonInfoSummaries errors(List<BeezUPCommonErrorSummary> errors) {
    this.errors = errors;
    return this;
  }

  public BeezUPCommonInfoSummaries addErrorsItem(BeezUPCommonErrorSummary errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BeezUPCommonErrorSummary> getErrors() {
    return errors;
  }

  public void setErrors(List<BeezUPCommonErrorSummary> errors) {
    this.errors = errors;
  }

  public BeezUPCommonInfoSummaries warnings(List<BeezUPCommonWarningSummary> warnings) {
    this.warnings = warnings;
    return this;
  }

  public BeezUPCommonInfoSummaries addWarningsItem(BeezUPCommonWarningSummary warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BeezUPCommonWarningSummary> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<BeezUPCommonWarningSummary> warnings) {
    this.warnings = warnings;
  }

  public BeezUPCommonInfoSummaries informations(List<BeezUPCommonInfoSummary> informations) {
    this.informations = informations;
    return this;
  }

  public BeezUPCommonInfoSummaries addInformationsItem(BeezUPCommonInfoSummary informationsItem) {
    this.informations.add(informationsItem);
    return this;
  }

   /**
   * Get informations
   * @return informations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BeezUPCommonInfoSummary> getInformations() {
    return informations;
  }

  public void setInformations(List<BeezUPCommonInfoSummary> informations) {
    this.informations = informations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeezUPCommonInfoSummaries beezUPCommonInfoSummaries = (BeezUPCommonInfoSummaries) o;
    return Objects.equals(this.successes, beezUPCommonInfoSummaries.successes) &&
        Objects.equals(this.errors, beezUPCommonInfoSummaries.errors) &&
        Objects.equals(this.warnings, beezUPCommonInfoSummaries.warnings) &&
        Objects.equals(this.informations, beezUPCommonInfoSummaries.informations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successes, errors, warnings, informations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeezUPCommonInfoSummaries {\n");
    
    sb.append("    successes: ").append(toIndentedString(successes)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    informations: ").append(toIndentedString(informations)).append("\n");
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

