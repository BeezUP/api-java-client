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
import org.joda.time.DateTime;

/**
 * Describe the prorata info based on your previous invoice
 */
@ApiModel(description = "Describe the prorata info based on your previous invoice")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T13:43:05.416Z")
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

