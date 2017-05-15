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
import io.swagger.client.model.AccountingEmails;
import io.swagger.client.model.Address;
import io.swagger.client.model.BeezUPCommonCountryIsoCodeAlpha3;
import io.swagger.client.model.City;
import io.swagger.client.model.Company;
import io.swagger.client.model.PostalCode;
import io.swagger.client.model.VatNumber;

/**
 * CompanyInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-15T15:26:19.914Z")
public class CompanyInfo {
  @SerializedName("address")
  private Address address = null;

  @SerializedName("postalCode")
  private PostalCode postalCode = null;

  @SerializedName("city")
  private City city = null;

  @SerializedName("countryIsoCodeAlpha3")
  private BeezUPCommonCountryIsoCodeAlpha3 countryIsoCodeAlpha3 = null;

  @SerializedName("company")
  private Company company = null;

  @SerializedName("vatNumber")
  private VatNumber vatNumber = null;

  @SerializedName("accountingEmails")
  private AccountingEmails accountingEmails = null;

  public CompanyInfo address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public CompanyInfo postalCode(PostalCode postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public PostalCode getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(PostalCode postalCode) {
    this.postalCode = postalCode;
  }

  public CompanyInfo city(City city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }

  public CompanyInfo countryIsoCodeAlpha3(BeezUPCommonCountryIsoCodeAlpha3 countryIsoCodeAlpha3) {
    this.countryIsoCodeAlpha3 = countryIsoCodeAlpha3;
    return this;
  }

   /**
   * Get countryIsoCodeAlpha3
   * @return countryIsoCodeAlpha3
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonCountryIsoCodeAlpha3 getCountryIsoCodeAlpha3() {
    return countryIsoCodeAlpha3;
  }

  public void setCountryIsoCodeAlpha3(BeezUPCommonCountryIsoCodeAlpha3 countryIsoCodeAlpha3) {
    this.countryIsoCodeAlpha3 = countryIsoCodeAlpha3;
  }

  public CompanyInfo company(Company company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public CompanyInfo vatNumber(VatNumber vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * Get vatNumber
   * @return vatNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public VatNumber getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(VatNumber vatNumber) {
    this.vatNumber = vatNumber;
  }

  public CompanyInfo accountingEmails(AccountingEmails accountingEmails) {
    this.accountingEmails = accountingEmails;
    return this;
  }

   /**
   * Get accountingEmails
   * @return accountingEmails
  **/
  @ApiModelProperty(example = "null", value = "")
  public AccountingEmails getAccountingEmails() {
    return accountingEmails;
  }

  public void setAccountingEmails(AccountingEmails accountingEmails) {
    this.accountingEmails = accountingEmails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyInfo companyInfo = (CompanyInfo) o;
    return Objects.equals(this.address, companyInfo.address) &&
        Objects.equals(this.postalCode, companyInfo.postalCode) &&
        Objects.equals(this.city, companyInfo.city) &&
        Objects.equals(this.countryIsoCodeAlpha3, companyInfo.countryIsoCodeAlpha3) &&
        Objects.equals(this.company, companyInfo.company) &&
        Objects.equals(this.vatNumber, companyInfo.vatNumber) &&
        Objects.equals(this.accountingEmails, companyInfo.accountingEmails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, postalCode, city, countryIsoCodeAlpha3, company, vatNumber, accountingEmails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyInfo {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryIsoCodeAlpha3: ").append(toIndentedString(countryIsoCodeAlpha3)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    accountingEmails: ").append(toIndentedString(accountingEmails)).append("\n");
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

