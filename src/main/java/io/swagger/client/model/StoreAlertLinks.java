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
import io.swagger.client.model.LinksSaveStoreAlertLink;

/**
 * The different actions you can make on this offer
 */
@ApiModel(description = "The different actions you can make on this offer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class StoreAlertLinks {
  @SerializedName("saveStoreAlert")
  private LinksSaveStoreAlertLink saveStoreAlert = null;

  public StoreAlertLinks saveStoreAlert(LinksSaveStoreAlertLink saveStoreAlert) {
    this.saveStoreAlert = saveStoreAlert;
    return this;
  }

   /**
   * Get saveStoreAlert
   * @return saveStoreAlert
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinksSaveStoreAlertLink getSaveStoreAlert() {
    return saveStoreAlert;
  }

  public void setSaveStoreAlert(LinksSaveStoreAlertLink saveStoreAlert) {
    this.saveStoreAlert = saveStoreAlert;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreAlertLinks storeAlertLinks = (StoreAlertLinks) o;
    return Objects.equals(this.saveStoreAlert, storeAlertLinks.saveStoreAlert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saveStoreAlert);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreAlertLinks {\n");
    
    sb.append("    saveStoreAlert: ").append(toIndentedString(saveStoreAlert)).append("\n");
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

