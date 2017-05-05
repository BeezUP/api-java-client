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
import io.swagger.client.model.CardNumber;
import io.swagger.client.model.CardVerificationCode;
import io.swagger.client.model.ExpirationMonth;
import io.swagger.client.model.ExpirationYear;

/**
 * CreditCardInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:58:38.338Z")
public class CreditCardInfo {
  @SerializedName("cardNumber")
  private CardNumber cardNumber = null;

  @SerializedName("cardVerificationCode")
  private CardVerificationCode cardVerificationCode = null;

  @SerializedName("expirationMonth")
  private ExpirationMonth expirationMonth = null;

  @SerializedName("expirationYear")
  private ExpirationYear expirationYear = null;

  public CreditCardInfo cardNumber(CardNumber cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CardNumber getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(CardNumber cardNumber) {
    this.cardNumber = cardNumber;
  }

  public CreditCardInfo cardVerificationCode(CardVerificationCode cardVerificationCode) {
    this.cardVerificationCode = cardVerificationCode;
    return this;
  }

   /**
   * Get cardVerificationCode
   * @return cardVerificationCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CardVerificationCode getCardVerificationCode() {
    return cardVerificationCode;
  }

  public void setCardVerificationCode(CardVerificationCode cardVerificationCode) {
    this.cardVerificationCode = cardVerificationCode;
  }

  public CreditCardInfo expirationMonth(ExpirationMonth expirationMonth) {
    this.expirationMonth = expirationMonth;
    return this;
  }

   /**
   * Get expirationMonth
   * @return expirationMonth
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ExpirationMonth getExpirationMonth() {
    return expirationMonth;
  }

  public void setExpirationMonth(ExpirationMonth expirationMonth) {
    this.expirationMonth = expirationMonth;
  }

  public CreditCardInfo expirationYear(ExpirationYear expirationYear) {
    this.expirationYear = expirationYear;
    return this;
  }

   /**
   * Get expirationYear
   * @return expirationYear
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ExpirationYear getExpirationYear() {
    return expirationYear;
  }

  public void setExpirationYear(ExpirationYear expirationYear) {
    this.expirationYear = expirationYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardInfo creditCardInfo = (CreditCardInfo) o;
    return Objects.equals(this.cardNumber, creditCardInfo.cardNumber) &&
        Objects.equals(this.cardVerificationCode, creditCardInfo.cardVerificationCode) &&
        Objects.equals(this.expirationMonth, creditCardInfo.expirationMonth) &&
        Objects.equals(this.expirationYear, creditCardInfo.expirationYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, cardVerificationCode, expirationMonth, expirationYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardInfo {\n");
    
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardVerificationCode: ").append(toIndentedString(cardVerificationCode)).append("\n");
    sb.append("    expirationMonth: ").append(toIndentedString(expirationMonth)).append("\n");
    sb.append("    expirationYear: ").append(toIndentedString(expirationYear)).append("\n");
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

