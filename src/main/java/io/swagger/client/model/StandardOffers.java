/*
 * BeezUP API
 * This API will allow you to create your account and to get your tokens. \\ If you lost your password, you have an operation to get it back. 
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
import io.swagger.client.model.Functionality;
import io.swagger.client.model.StandardOffer;
import java.util.ArrayList;
import java.util.List;

/**
 * StandardOffers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class StandardOffers {
  @SerializedName("offers")
  private List<StandardOffer> offers = new ArrayList<StandardOffer>();

  @SerializedName("functionalities")
  private List<Functionality> functionalities = new ArrayList<Functionality>();

  public StandardOffers offers(List<StandardOffer> offers) {
    this.offers = offers;
    return this;
  }

  public StandardOffers addOffersItem(StandardOffer offersItem) {
    this.offers.add(offersItem);
    return this;
  }

   /**
   * All standard offers
   * @return offers
  **/
  @ApiModelProperty(example = "[{&quot;additionalClickPrice&quot;:0.1234,&quot;includedClick&quot;:1200,&quot;isMostPopular&quot;:true,&quot;name&quot;:&quot;Wonder offer&quot;,&quot;offerId&quot;:1234,&quot;fixedPrice&quot;:101.42,&quot;currencyCode&quot;:&quot;EUR&quot;,&quot;position&quot;:1,&quot;functionalities&quot;:[{&quot;functionalityCode&quot;:&quot;MARKETMANA&quot;,&quot;maxValueInteger&quot;:4,&quot;unlimited&quot;:false,&quot;text&quot;:&quot;Marketplace management&quot;}]}]", value = "All standard offers")
  public List<StandardOffer> getOffers() {
    return offers;
  }

  public void setOffers(List<StandardOffer> offers) {
    this.offers = offers;
  }

  public StandardOffers functionalities(List<Functionality> functionalities) {
    this.functionalities = functionalities;
    return this;
  }

  public StandardOffers addFunctionalitiesItem(Functionality functionalitiesItem) {
    this.functionalities.add(functionalitiesItem);
    return this;
  }

   /**
   * All functionalities...
   * @return functionalities
  **/
  @ApiModelProperty(example = "[{&quot;code&quot;:&quot;MARKETMANA&quot;,&quot;order&quot;:1}]", value = "All functionalities...")
  public List<Functionality> getFunctionalities() {
    return functionalities;
  }

  public void setFunctionalities(List<Functionality> functionalities) {
    this.functionalities = functionalities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardOffers standardOffers = (StandardOffers) o;
    return Objects.equals(this.offers, standardOffers.offers) &&
        Objects.equals(this.functionalities, standardOffers.functionalities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, functionalities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardOffers {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    functionalities: ").append(toIndentedString(functionalities)).append("\n");
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

