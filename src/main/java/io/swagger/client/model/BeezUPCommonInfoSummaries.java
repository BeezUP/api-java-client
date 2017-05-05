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
import io.swagger.client.model.BeezUPCommonErrorSummary;
import io.swagger.client.model.BeezUPCommonInfoSummary;
import io.swagger.client.model.BeezUPCommonSuccessSummary;
import io.swagger.client.model.BeezUPCommonWarningSummary;
import java.util.ArrayList;
import java.util.List;

/**
 * BeezUPCommonInfoSummaries
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:45:35.731Z")
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

