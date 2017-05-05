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
import io.swagger.client.model.AccountSynchronization;
import java.util.ArrayList;
import java.util.List;

/**
 * AccountSynchronizations
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T10:32:45.871Z")
public class AccountSynchronizations {
  @SerializedName("accountSynchronizations")
  private List<AccountSynchronization> accountSynchronizations = new ArrayList<AccountSynchronization>();

  public AccountSynchronizations accountSynchronizations(List<AccountSynchronization> accountSynchronizations) {
    this.accountSynchronizations = accountSynchronizations;
    return this;
  }

  public AccountSynchronizations addAccountSynchronizationsItem(AccountSynchronization accountSynchronizationsItem) {
    this.accountSynchronizations.add(accountSynchronizationsItem);
    return this;
  }

   /**
   * Get accountSynchronizations
   * @return accountSynchronizations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AccountSynchronization> getAccountSynchronizations() {
    return accountSynchronizations;
  }

  public void setAccountSynchronizations(List<AccountSynchronization> accountSynchronizations) {
    this.accountSynchronizations = accountSynchronizations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSynchronizations accountSynchronizations = (AccountSynchronizations) o;
    return Objects.equals(this.accountSynchronizations, accountSynchronizations.accountSynchronizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSynchronizations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSynchronizations {\n");
    
    sb.append("    accountSynchronizations: ").append(toIndentedString(accountSynchronizations)).append("\n");
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

