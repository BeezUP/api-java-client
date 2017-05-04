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
import io.swagger.client.model.ExecutionId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Describe the reporting of the catalog importation
 */
@ApiModel(description = "Describe the reporting of the catalog importation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T11:55:43.788Z")
public class ImportationMonitoring {
  @SerializedName("userId")
  private BeezUPCommonUserId userId = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("executionId")
  private ExecutionId executionId = null;

  @SerializedName("lastUpdateUtcDate")
  private DateTime lastUpdateUtcDate = null;

  @SerializedName("beginUtcDate")
  private DateTime beginUtcDate = null;

  @SerializedName("errors")
  private List<BeezUPCommonUserErrorMessage> errors = new ArrayList<BeezUPCommonUserErrorMessage>();

  @SerializedName("steps")
  private Map<String, Boolean> steps = new HashMap<String, Boolean>();

  public ImportationMonitoring userId(BeezUPCommonUserId userId) {
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

  public ImportationMonitoring success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Indicates if the importation was successfully completed or not
   * @return success
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the importation was successfully completed or not")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ImportationMonitoring executionId(ExecutionId executionId) {
    this.executionId = executionId;
    return this;
  }

   /**
   * Get executionId
   * @return executionId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ExecutionId getExecutionId() {
    return executionId;
  }

  public void setExecutionId(ExecutionId executionId) {
    this.executionId = executionId;
  }

  public ImportationMonitoring lastUpdateUtcDate(DateTime lastUpdateUtcDate) {
    this.lastUpdateUtcDate = lastUpdateUtcDate;
    return this;
  }

   /**
   * The last update of the reporting
   * @return lastUpdateUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:10:09Z", required = true, value = "The last update of the reporting")
  public DateTime getLastUpdateUtcDate() {
    return lastUpdateUtcDate;
  }

  public void setLastUpdateUtcDate(DateTime lastUpdateUtcDate) {
    this.lastUpdateUtcDate = lastUpdateUtcDate;
  }

  public ImportationMonitoring beginUtcDate(DateTime beginUtcDate) {
    this.beginUtcDate = beginUtcDate;
    return this;
  }

   /**
   * The start date of the importation
   * @return beginUtcDate
  **/
  @ApiModelProperty(example = "2017-04-01T13:01:01Z", required = true, value = "The start date of the importation")
  public DateTime getBeginUtcDate() {
    return beginUtcDate;
  }

  public void setBeginUtcDate(DateTime beginUtcDate) {
    this.beginUtcDate = beginUtcDate;
  }

  public ImportationMonitoring errors(List<BeezUPCommonUserErrorMessage> errors) {
    this.errors = errors;
    return this;
  }

  public ImportationMonitoring addErrorsItem(BeezUPCommonUserErrorMessage errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * In case of error a description will be indicated
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "In case of error a description will be indicated")
  public List<BeezUPCommonUserErrorMessage> getErrors() {
    return errors;
  }

  public void setErrors(List<BeezUPCommonUserErrorMessage> errors) {
    this.errors = errors;
  }

  public ImportationMonitoring steps(Map<String, Boolean> steps) {
    this.steps = steps;
    return this;
  }

  public ImportationMonitoring putStepsItem(String key, Boolean stepsItem) {
    this.steps.put(key, stepsItem);
    return this;
  }

   /**
   * Contains all steps of the importation process with a boolean. If true the step has been passed, false the step is not complete
   * @return steps
  **/
  @ApiModelProperty(example = "{&quot;isCatalogImportPrepareReadCompleted&quot;:false,&quot;isCatalogImportComputeDiffCompleted&quot;:false,&quot;isCatalogUpdateCompleted&quot;:false,&quot;isSavedInDb&quot;:false}", required = true, value = "Contains all steps of the importation process with a boolean. If true the step has been passed, false the step is not complete")
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
    ImportationMonitoring importationMonitoring = (ImportationMonitoring) o;
    return Objects.equals(this.userId, importationMonitoring.userId) &&
        Objects.equals(this.success, importationMonitoring.success) &&
        Objects.equals(this.executionId, importationMonitoring.executionId) &&
        Objects.equals(this.lastUpdateUtcDate, importationMonitoring.lastUpdateUtcDate) &&
        Objects.equals(this.beginUtcDate, importationMonitoring.beginUtcDate) &&
        Objects.equals(this.errors, importationMonitoring.errors) &&
        Objects.equals(this.steps, importationMonitoring.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, success, executionId, lastUpdateUtcDate, beginUtcDate, errors, steps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportationMonitoring {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    lastUpdateUtcDate: ").append(toIndentedString(lastUpdateUtcDate)).append("\n");
    sb.append("    beginUtcDate: ").append(toIndentedString(beginUtcDate)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

