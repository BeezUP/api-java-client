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
import io.swagger.client.model.Invoice;
import java.util.ArrayList;
import java.util.List;

/**
 * Invoices
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:36:43.626Z")
public class Invoices {
  @SerializedName("invoices")
  private List<Invoice> invoices = new ArrayList<Invoice>();

  public Invoices invoices(List<Invoice> invoices) {
    this.invoices = invoices;
    return this;
  }

  public Invoices addInvoicesItem(Invoice invoicesItem) {
    this.invoices.add(invoicesItem);
    return this;
  }

   /**
   * Get invoices
   * @return invoices
  **/
  @ApiModelProperty(example = "[{&quot;invoiceDate&quot;:&quot;2016-05-01&quot;,&quot;contractId&quot;:&quot;7098487a-86f6-4322-b8a5-b67f7363b3e7&quot;,&quot;invoiceNumber&quot;:&quot;B1234&quot;,&quot;amount&quot;:101.42,&quot;amountToBePaid&quot;:0.0,&quot;currencyCode&quot;:&quot;EUR&quot;,&quot;paymentStatus&quot;:&quot;Paid&quot;,&quot;dueDate&quot;:&quot;2016-05-10&quot;,&quot;invoiceUrl&quot;:&quot;https://beezupbilling.blob.core.windows.net/invoicepdf/2000/CustomerUserId_00000000-0000-0000-0000-000000000000/ContractId_00000000-0000-0000-0000-000000000000/2000-01-01_B1234.pdf&quot;}]", required = true, value = "")
  public List<Invoice> getInvoices() {
    return invoices;
  }

  public void setInvoices(List<Invoice> invoices) {
    this.invoices = invoices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoices invoices = (Invoices) o;
    return Objects.equals(this.invoices, invoices.invoices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoices {\n");
    
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
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

