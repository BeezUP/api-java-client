/*
 * Public - Security
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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;


/**
 * The account status * Active:  When the account is active * SystemBlocked:  When all stores on the account are blocked by the system * UserBlocked: When all stores on the account are blocked on GO not on the system * NotActivated: When the email is not verified 
 */
public enum AccountStatus {
  
  @SerializedName("Active")
  ACTIVE("Active"),
  
  @SerializedName("SystemBlocked")
  SYSTEMBLOCKED("SystemBlocked"),
  
  @SerializedName("UserBlocked")
  USERBLOCKED("UserBlocked"),
  
  @SerializedName("NotActivated")
  NOTACTIVATED("NotActivated");

  private String value;

  AccountStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

