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
import io.swagger.client.model.ContractTerminationReason;
import io.swagger.client.model.ContractTerminationReasonType;

/**
 * The contract termination info
 */
@ApiModel(description = "The contract termination info")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:26:33.625Z")
public class TerminateContract {
  @SerializedName("contractTerminationReasonType")
  private ContractTerminationReasonType contractTerminationReasonType = null;

  @SerializedName("contractTerminationReason")
  private ContractTerminationReason contractTerminationReason = null;

  public TerminateContract contractTerminationReasonType(ContractTerminationReasonType contractTerminationReasonType) {
    this.contractTerminationReasonType = contractTerminationReasonType;
    return this;
  }

   /**
   * Get contractTerminationReasonType
   * @return contractTerminationReasonType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ContractTerminationReasonType getContractTerminationReasonType() {
    return contractTerminationReasonType;
  }

  public void setContractTerminationReasonType(ContractTerminationReasonType contractTerminationReasonType) {
    this.contractTerminationReasonType = contractTerminationReasonType;
  }

  public TerminateContract contractTerminationReason(ContractTerminationReason contractTerminationReason) {
    this.contractTerminationReason = contractTerminationReason;
    return this;
  }

   /**
   * Get contractTerminationReason
   * @return contractTerminationReason
  **/
  @ApiModelProperty(example = "null", value = "")
  public ContractTerminationReason getContractTerminationReason() {
    return contractTerminationReason;
  }

  public void setContractTerminationReason(ContractTerminationReason contractTerminationReason) {
    this.contractTerminationReason = contractTerminationReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminateContract terminateContract = (TerminateContract) o;
    return Objects.equals(this.contractTerminationReasonType, terminateContract.contractTerminationReasonType) &&
        Objects.equals(this.contractTerminationReason, terminateContract.contractTerminationReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractTerminationReasonType, contractTerminationReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminateContract {\n");
    
    sb.append("    contractTerminationReasonType: ").append(toIndentedString(contractTerminationReasonType)).append("\n");
    sb.append("    contractTerminationReason: ").append(toIndentedString(contractTerminationReason)).append("\n");
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

