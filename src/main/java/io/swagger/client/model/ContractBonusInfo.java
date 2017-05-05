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
import io.swagger.client.model.BonusInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Describe the bonus information related to your current contract.
 */
@ApiModel(description = "Describe the bonus information related to your current contract.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T13:15:23.720Z")
public class ContractBonusInfo {
  @SerializedName("bonuses")
  private List<BonusInfo> bonuses = new ArrayList<BonusInfo>();

  public ContractBonusInfo bonuses(List<BonusInfo> bonuses) {
    this.bonuses = bonuses;
    return this;
  }

  public ContractBonusInfo addBonusesItem(BonusInfo bonusesItem) {
    this.bonuses.add(bonusesItem);
    return this;
  }

   /**
   * Get bonuses
   * @return bonuses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<BonusInfo> getBonuses() {
    return bonuses;
  }

  public void setBonuses(List<BonusInfo> bonuses) {
    this.bonuses = bonuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractBonusInfo contractBonusInfo = (ContractBonusInfo) o;
    return Objects.equals(this.bonuses, contractBonusInfo.bonuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bonuses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractBonusInfo {\n");
    
    sb.append("    bonuses: ").append(toIndentedString(bonuses)).append("\n");
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

