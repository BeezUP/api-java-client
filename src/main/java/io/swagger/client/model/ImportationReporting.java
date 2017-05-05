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
import io.swagger.client.model.BeezUPCommonUserErrorMessage;
import io.swagger.client.model.BeezUPCommonUserId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * The catalog importation reporting
 */
@ApiModel(description = "The catalog importation reporting")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:43:26.940Z")
public class ImportationReporting {
  @SerializedName("stepName")
  private String stepName = null;

  @SerializedName("userId")
  private BeezUPCommonUserId userId = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("totalProductCount")
  private Integer totalProductCount = null;

  @SerializedName("totalProductErrorCount")
  private Integer totalProductErrorCount = null;

  @SerializedName("totalProductSuccessCount")
  private Integer totalProductSuccessCount = null;

  @SerializedName("errors")
  private List<BeezUPCommonUserErrorMessage> errors = new ArrayList<BeezUPCommonUserErrorMessage>();

  @SerializedName("lastUpdateUtcDate")
  private DateTime lastUpdateUtcDate = null;

  @SerializedName("autoImported")
  private Boolean autoImported = null;

  @SerializedName("beginUtcDate")
  private DateTime beginUtcDate = null;

  @SerializedName("endUtcDate")
  private DateTime endUtcDate = null;

  @SerializedName("inputConfigurationUrl")
  private String inputConfigurationUrl = null;

  @SerializedName("steps")
  private Map<String, Boolean> steps = new HashMap<String, Boolean>();

  public ImportationReporting stepName(String stepName) {
    this.stepName = stepName;
    return this;
  }

   /**
   * The last step name of the importation process
   * @return stepName
  **/
  @ApiModelProperty(example = "IsSaveInDb", value = "The last step name of the importation process")
  public String getStepName() {
    return stepName;
  }

  public void setStepName(String stepName) {
    this.stepName = stepName;
  }

  public ImportationReporting userId(BeezUPCommonUserId userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public BeezUPCommonUserId getUserId() {
    return userId;
  }

  public void setUserId(BeezUPCommonUserId userId) {
    this.userId = userId;
  }

  public ImportationReporting success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Indicate if the importation succeed or not.
   * @return success
  **/
  @ApiModelProperty(example = "true", value = "Indicate if the importation succeed or not.")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ImportationReporting totalProductCount(Integer totalProductCount) {
    this.totalProductCount = totalProductCount;
    return this;
  }

   /**
   * Indicate the total product count detected in the catalog during the importation.
   * @return totalProductCount
  **/
  @ApiModelProperty(example = "101", value = "Indicate the total product count detected in the catalog during the importation.")
  public Integer getTotalProductCount() {
    return totalProductCount;
  }

  public void setTotalProductCount(Integer totalProductCount) {
    this.totalProductCount = totalProductCount;
  }

  public ImportationReporting totalProductErrorCount(Integer totalProductErrorCount) {
    this.totalProductErrorCount = totalProductErrorCount;
    return this;
  }

   /**
   * Indicate the total product count in error detected in the catalog during the importation.
   * @return totalProductErrorCount
  **/
  @ApiModelProperty(example = "0", value = "Indicate the total product count in error detected in the catalog during the importation.")
  public Integer getTotalProductErrorCount() {
    return totalProductErrorCount;
  }

  public void setTotalProductErrorCount(Integer totalProductErrorCount) {
    this.totalProductErrorCount = totalProductErrorCount;
  }

  public ImportationReporting totalProductSuccessCount(Integer totalProductSuccessCount) {
    this.totalProductSuccessCount = totalProductSuccessCount;
    return this;
  }

   /**
   * Indicate the total product count in success in the catalog during the importation.
   * @return totalProductSuccessCount
  **/
  @ApiModelProperty(example = "101", value = "Indicate the total product count in success in the catalog during the importation.")
  public Integer getTotalProductSuccessCount() {
    return totalProductSuccessCount;
  }

  public void setTotalProductSuccessCount(Integer totalProductSuccessCount) {
    this.totalProductSuccessCount = totalProductSuccessCount;
  }

  public ImportationReporting errors(List<BeezUPCommonUserErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public ImportationReporting addErrorsItem(BeezUPCommonUserErrorMessage errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Indicate the error message list related to this importation.
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "Indicate the error message list related to this importation.")
  public List<BeezUPCommonUserErrorMessage> getErrors() {
    return errors;
  }

  public void setErrors(List<BeezUPCommonUserErrorMessage> errors) {
    this.errors = errors;
  }

  public ImportationReporting lastUpdateUtcDate(DateTime lastUpdateUtcDate) {
    this.lastUpdateUtcDate = lastUpdateUtcDate;
    return this;
  }

   /**
   * Indicate the last update UTC date of the reporting.
   * @return lastUpdateUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:10:09Z", required = true, value = "Indicate the last update UTC date of the reporting.")
  public DateTime getLastUpdateUtcDate() {
    return lastUpdateUtcDate;
  }

  public void setLastUpdateUtcDate(DateTime lastUpdateUtcDate) {
    this.lastUpdateUtcDate = lastUpdateUtcDate;
  }

  public ImportationReporting autoImported(Boolean autoImported) {
    this.autoImported = autoImported;
    return this;
  }

   /**
   * Indicate if this importation is an auto import or not.
   * @return autoImported
  **/
  @ApiModelProperty(example = "true", value = "Indicate if this importation is an auto import or not.")
  public Boolean getAutoImported() {
    return autoImported;
  }

  public void setAutoImported(Boolean autoImported) {
    this.autoImported = autoImported;
  }

  public ImportationReporting beginUtcDate(DateTime beginUtcDate) {
    this.beginUtcDate = beginUtcDate;
    return this;
  }

   /**
   * Indicate the begin UTC date of this importation.
   * @return beginUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:01:01Z", required = true, value = "Indicate the begin UTC date of this importation.")
  public DateTime getBeginUtcDate() {
    return beginUtcDate;
  }

  public void setBeginUtcDate(DateTime beginUtcDate) {
    this.beginUtcDate = beginUtcDate;
  }

  public ImportationReporting endUtcDate(DateTime endUtcDate) {
    this.endUtcDate = endUtcDate;
    return this;
  }

   /**
   * Indicate the end UTC date of this importation.
   * @return endUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:10:09Z", value = "Indicate the end UTC date of this importation.")
  public DateTime getEndUtcDate() {
    return endUtcDate;
  }

  public void setEndUtcDate(DateTime endUtcDate) {
    this.endUtcDate = endUtcDate;
  }

  public ImportationReporting inputConfigurationUrl(String inputConfigurationUrl) {
    this.inputConfigurationUrl = inputConfigurationUrl;
    return this;
  }

   /**
   * Indicate the input url of this importation.
   * @return inputConfigurationUrl
  **/
  @ApiModelProperty(example = "http://blal.com/catalog.csv", value = "Indicate the input url of this importation.")
  public String getInputConfigurationUrl() {
    return inputConfigurationUrl;
  }

  public void setInputConfigurationUrl(String inputConfigurationUrl) {
    this.inputConfigurationUrl = inputConfigurationUrl;
  }

  public ImportationReporting steps(Map<String, Boolean> steps) {
    this.steps = steps;
    return this;
  }

  public ImportationReporting putStepsItem(String key, Boolean stepsItem) {
    this.steps.put(key, stepsItem);
    return this;
  }

   /**
   * Indicate the steps that have been passed during the importation process
   * @return steps
  **/
  @ApiModelProperty(example = "{&quot;isCatalogImportPrepareReadCompleted&quot;:false,&quot;isCatalogImportComputeDiffCompleted&quot;:false,&quot;isCatalogUpdateCompleted&quot;:false,&quot;isSavedInDb&quot;:false}", required = true, value = "Indicate the steps that have been passed during the importation process")
  public Map<String, Boolean> getSteps() {
    return steps;
  }

  public void setSteps(Map<String, Boolean> steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportationReporting importationReporting = (ImportationReporting) o;
    return Objects.equals(this.stepName, importationReporting.stepName) &&
        Objects.equals(this.userId, importationReporting.userId) &&
        Objects.equals(this.success, importationReporting.success) &&
        Objects.equals(this.totalProductCount, importationReporting.totalProductCount) &&
        Objects.equals(this.totalProductErrorCount, importationReporting.totalProductErrorCount) &&
        Objects.equals(this.totalProductSuccessCount, importationReporting.totalProductSuccessCount) &&
        Objects.equals(this.errors, importationReporting.errors) &&
        Objects.equals(this.lastUpdateUtcDate, importationReporting.lastUpdateUtcDate) &&
        Objects.equals(this.autoImported, importationReporting.autoImported) &&
        Objects.equals(this.beginUtcDate, importationReporting.beginUtcDate) &&
        Objects.equals(this.endUtcDate, importationReporting.endUtcDate) &&
        Objects.equals(this.inputConfigurationUrl, importationReporting.inputConfigurationUrl) &&
        Objects.equals(this.steps, importationReporting.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepName, userId, success, totalProductCount, totalProductErrorCount, totalProductSuccessCount, errors, lastUpdateUtcDate, autoImported, beginUtcDate, endUtcDate, inputConfigurationUrl, steps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportationReporting {\n");
    
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    totalProductCount: ").append(toIndentedString(totalProductCount)).append("\n");
    sb.append("    totalProductErrorCount: ").append(toIndentedString(totalProductErrorCount)).append("\n");
    sb.append("    totalProductSuccessCount: ").append(toIndentedString(totalProductSuccessCount)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    lastUpdateUtcDate: ").append(toIndentedString(lastUpdateUtcDate)).append("\n");
    sb.append("    autoImported: ").append(toIndentedString(autoImported)).append("\n");
    sb.append("    beginUtcDate: ").append(toIndentedString(beginUtcDate)).append("\n");
    sb.append("    endUtcDate: ").append(toIndentedString(endUtcDate)).append("\n");
    sb.append("    inputConfigurationUrl: ").append(toIndentedString(inputConfigurationUrl)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

