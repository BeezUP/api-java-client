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
import org.joda.time.DateTime;

/**
 * Describe the prorata info based on your previous invoice
 */
@ApiModel(description = "Describe the prorata info based on your previous invoice")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-04T14:19:12.808Z")
public class PreviousFixPeriodInvoiceProrataInfo {
  @SerializedName("computedProrataToBeDeducted")
  private Double computedProrataToBeDeducted = null;

  @SerializedName("invoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("amountToBePaid")
  private Double amountToBePaid = null;

  @SerializedName("amountAfterTax")
  private Double amountAfterTax = null;

  @SerializedName("contractId")
  private String contractId = null;

  @SerializedName("fixedPeriodEndDate")
  private DateTime fixedPeriodEndDate = null;

  @SerializedName("fixedPeriodStartDate")
  private DateTime fixedPeriodStartDate = null;

  public PreviousFixPeriodInvoiceProrataInfo computedProrataToBeDeducted(Double computedProrataToBeDeducted) {
    this.computedProrataToBeDeducted = computedProrataToBeDeducted;
    return this;
  }

   /**
   * The prorata amount
   * @return computedProrataToBeDeducted
  **/
  @ApiModelProperty(example = "null", value = "The prorata amount")
  public Double getComputedProrataToBeDeducted() {
    return computedProrataToBeDeducted;
  }

  public void setComputedProrataToBeDeducted(Double computedProrataToBeDeducted) {
    this.computedProrataToBeDeducted = computedProrataToBeDeducted;
  }

  public PreviousFixPeriodInvoiceProrataInfo invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * The previous invoice number
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "B1234", value = "The previous invoice number")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public PreviousFixPeriodInvoiceProrataInfo amountToBePaid(Double amountToBePaid) {
    this.amountToBePaid = amountToBePaid;
    return this;
  }

   /**
   * The amount to be payed of the previous invoice
   * @return amountToBePaid
  **/
  @ApiModelProperty(example = "0.0", value = "The amount to be payed of the previous invoice")
  public Double getAmountToBePaid() {
    return amountToBePaid;
  }

  public void setAmountToBePaid(Double amountToBePaid) {
    this.amountToBePaid = amountToBePaid;
  }

  public PreviousFixPeriodInvoiceProrataInfo amountAfterTax(Double amountAfterTax) {
    this.amountAfterTax = amountAfterTax;
    return this;
  }

   /**
   * The amout after tax of the previous invoice
   * @return amountAfterTax
  **/
  @ApiModelProperty(example = "101.42", value = "The amout after tax of the previous invoice")
  public Double getAmountAfterTax() {
    return amountAfterTax;
  }

  public void setAmountAfterTax(Double amountAfterTax) {
    this.amountAfterTax = amountAfterTax;
  }

  public PreviousFixPeriodInvoiceProrataInfo contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * The contract id related to the previous invoice
   * @return contractId
  **/
  @ApiModelProperty(example = "8a7fbdec-9e71-472e-9974-27d5c1d57cf8", value = "The contract id related to the previous invoice")
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public PreviousFixPeriodInvoiceProrataInfo fixedPeriodEndDate(DateTime fixedPeriodEndDate) {
    this.fixedPeriodEndDate = fixedPeriodEndDate;
    return this;
  }

   /**
   * The fixed end period of the previous invoice
   * @return fixedPeriodEndDate
  **/
  @ApiModelProperty(example = "null", value = "The fixed end period of the previous invoice")
  public DateTime getFixedPeriodEndDate() {
    return fixedPeriodEndDate;
  }

  public void setFixedPeriodEndDate(DateTime fixedPeriodEndDate) {
    this.fixedPeriodEndDate = fixedPeriodEndDate;
  }

  public PreviousFixPeriodInvoiceProrataInfo fixedPeriodStartDate(DateTime fixedPeriodStartDate) {
    this.fixedPeriodStartDate = fixedPeriodStartDate;
    return this;
  }

   /**
   * The fixed start period of the previous invoice
   * @return fixedPeriodStartDate
  **/
  @ApiModelProperty(example = "null", value = "The fixed start period of the previous invoice")
  public DateTime getFixedPeriodStartDate() {
    return fixedPeriodStartDate;
  }

  public void setFixedPeriodStartDate(DateTime fixedPeriodStartDate) {
    this.fixedPeriodStartDate = fixedPeriodStartDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviousFixPeriodInvoiceProrataInfo previousFixPeriodInvoiceProrataInfo = (PreviousFixPeriodInvoiceProrataInfo) o;
    return Objects.equals(this.computedProrataToBeDeducted, previousFixPeriodInvoiceProrataInfo.computedProrataToBeDeducted) &&
        Objects.equals(this.invoiceNumber, previousFixPeriodInvoiceProrataInfo.invoiceNumber) &&
        Objects.equals(this.amountToBePaid, previousFixPeriodInvoiceProrataInfo.amountToBePaid) &&
        Objects.equals(this.amountAfterTax, previousFixPeriodInvoiceProrataInfo.amountAfterTax) &&
        Objects.equals(this.contractId, previousFixPeriodInvoiceProrataInfo.contractId) &&
        Objects.equals(this.fixedPeriodEndDate, previousFixPeriodInvoiceProrataInfo.fixedPeriodEndDate) &&
        Objects.equals(this.fixedPeriodStartDate, previousFixPeriodInvoiceProrataInfo.fixedPeriodStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computedProrataToBeDeducted, invoiceNumber, amountToBePaid, amountAfterTax, contractId, fixedPeriodEndDate, fixedPeriodStartDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviousFixPeriodInvoiceProrataInfo {\n");
    
    sb.append("    computedProrataToBeDeducted: ").append(toIndentedString(computedProrataToBeDeducted)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    amountToBePaid: ").append(toIndentedString(amountToBePaid)).append("\n");
    sb.append("    amountAfterTax: ").append(toIndentedString(amountAfterTax)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    fixedPeriodEndDate: ").append(toIndentedString(fixedPeriodEndDate)).append("\n");
    sb.append("    fixedPeriodStartDate: ").append(toIndentedString(fixedPeriodStartDate)).append("\n");
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

