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
import io.swagger.client.model.BeezUPCommonCurrencyCode;
import io.swagger.client.model.ContractId;
import io.swagger.client.model.InvoiceNumber;
import io.swagger.client.model.InvoicePaymentStatus;
import org.joda.time.LocalDate;

/**
 * Invoice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:26:33.625Z")
public class Invoice {
  @SerializedName("invoiceDate")
  private LocalDate invoiceDate = null;

  @SerializedName("contractId")
  private ContractId contractId = null;

  @SerializedName("invoiceNumber")
  private InvoiceNumber invoiceNumber = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("amountToBePaid")
  private Double amountToBePaid = null;

  @SerializedName("currencyCode")
  private BeezUPCommonCurrencyCode currencyCode = null;

  @SerializedName("paymentStatus")
  private InvoicePaymentStatus paymentStatus = null;

  @SerializedName("dueDate")
  private LocalDate dueDate = null;

  @SerializedName("invoiceUrl")
  private String invoiceUrl = null;

  public Invoice invoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * The invoice date
   * @return invoiceDate
  **/
  @ApiModelProperty(example = "2016-05-01", required = true, value = "The invoice date")
  public LocalDate getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public Invoice contractId(ContractId contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Get contractId
   * @return contractId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ContractId getContractId() {
    return contractId;
  }

  public void setContractId(ContractId contractId) {
    this.contractId = contractId;
  }

  public Invoice invoiceNumber(InvoiceNumber invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public InvoiceNumber getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(InvoiceNumber invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Invoice amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount of your invoice
   * @return amount
  **/
  @ApiModelProperty(example = "101.42", required = true, value = "The amount of your invoice")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Invoice amountToBePaid(Double amountToBePaid) {
    this.amountToBePaid = amountToBePaid;
    return this;
  }

   /**
   * The remaining amount to be paid for this invoice
   * @return amountToBePaid
  **/
  @ApiModelProperty(example = "0.0", required = true, value = "The remaining amount to be paid for this invoice")
  public Double getAmountToBePaid() {
    return amountToBePaid;
  }

  public void setAmountToBePaid(Double amountToBePaid) {
    this.amountToBePaid = amountToBePaid;
  }

  public Invoice currencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonCurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(BeezUPCommonCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Invoice paymentStatus(InvoicePaymentStatus paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Get paymentStatus
   * @return paymentStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public InvoicePaymentStatus getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(InvoicePaymentStatus paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public Invoice dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(example = "2016-05-10", required = true, value = "")
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public Invoice invoiceUrl(String invoiceUrl) {
    this.invoiceUrl = invoiceUrl;
    return this;
  }

   /**
   * The url of the invoice document
   * @return invoiceUrl
  **/
  @ApiModelProperty(example = "https://beezupbilling.blob.core.windows.net/invoicepdf/2000/CustomerUserId_00000000-0000-0000-0000-000000000000/ContractId_00000000-0000-0000-0000-000000000000/2000-01-01_B1234.pdf", value = "The url of the invoice document")
  public String getInvoiceUrl() {
    return invoiceUrl;
  }

  public void setInvoiceUrl(String invoiceUrl) {
    this.invoiceUrl = invoiceUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.invoiceDate, invoice.invoiceDate) &&
        Objects.equals(this.contractId, invoice.contractId) &&
        Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.amount, invoice.amount) &&
        Objects.equals(this.amountToBePaid, invoice.amountToBePaid) &&
        Objects.equals(this.currencyCode, invoice.currencyCode) &&
        Objects.equals(this.paymentStatus, invoice.paymentStatus) &&
        Objects.equals(this.dueDate, invoice.dueDate) &&
        Objects.equals(this.invoiceUrl, invoice.invoiceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceDate, contractId, invoiceNumber, amount, amountToBePaid, currencyCode, paymentStatus, dueDate, invoiceUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountToBePaid: ").append(toIndentedString(amountToBePaid)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    invoiceUrl: ").append(toIndentedString(invoiceUrl)).append("\n");
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

