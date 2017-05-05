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
import io.swagger.client.model.BeezUPCommonChannelColumnId;
import io.swagger.client.model.ExclusionFilterName;
import io.swagger.client.model.ExclusionFilterOperatorName;

/**
 * The exclusion filter
 */
@ApiModel(description = "The exclusion filter")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-05T12:43:26.940Z")
public class ExclusionFilter {
  @SerializedName("name")
  private ExclusionFilterName name = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("positionInGroup")
  private Integer positionInGroup = null;

  @SerializedName("channelColumnId")
  private BeezUPCommonChannelColumnId channelColumnId = null;

  @SerializedName("operatorName")
  private ExclusionFilterOperatorName operatorName = null;

  @SerializedName("value")
  private String value = null;

  public ExclusionFilter name(ExclusionFilterName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ExclusionFilterName getName() {
    return name;
  }

  public void setName(ExclusionFilterName name) {
    this.name = name;
  }

  public ExclusionFilter position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * The position of the exclusion filter
   * minimum: 1
   * @return position
  **/
  @ApiModelProperty(example = "1", required = true, value = "The position of the exclusion filter")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public ExclusionFilter groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Indicate the filter's group. All filters in the same group means an \"AND\" operation in the filter group
   * @return groupId
  **/
  @ApiModelProperty(example = "d9833f4b-718a-436f-bab5-89da3d21bf60", required = true, value = "Indicate the filter's group. All filters in the same group means an \"AND\" operation in the filter group")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ExclusionFilter positionInGroup(Integer positionInGroup) {
    this.positionInGroup = positionInGroup;
    return this;
  }

   /**
   * Indicate the filter group position. This information is used for the UI purpose and must be unique in the filter group.
   * minimum: 1
   * @return positionInGroup
  **/
  @ApiModelProperty(example = "1", required = true, value = "Indicate the filter group position. This information is used for the UI purpose and must be unique in the filter group.")
  public Integer getPositionInGroup() {
    return positionInGroup;
  }

  public void setPositionInGroup(Integer positionInGroup) {
    this.positionInGroup = positionInGroup;
  }

  public ExclusionFilter channelColumnId(BeezUPCommonChannelColumnId channelColumnId) {
    this.channelColumnId = channelColumnId;
    return this;
  }

   /**
   * Get channelColumnId
   * @return channelColumnId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public BeezUPCommonChannelColumnId getChannelColumnId() {
    return channelColumnId;
  }

  public void setChannelColumnId(BeezUPCommonChannelColumnId channelColumnId) {
    this.channelColumnId = channelColumnId;
  }

  public ExclusionFilter operatorName(ExclusionFilterOperatorName operatorName) {
    this.operatorName = operatorName;
    return this;
  }

   /**
   * Get operatorName
   * @return operatorName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ExclusionFilterOperatorName getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(ExclusionFilterOperatorName operatorName) {
    this.operatorName = operatorName;
  }

  public ExclusionFilter value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value indicate by the user when the filter operation requires it.
   * @return value
  **/
  @ApiModelProperty(example = "sony", value = "The value indicate by the user when the filter operation requires it.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExclusionFilter exclusionFilter = (ExclusionFilter) o;
    return Objects.equals(this.name, exclusionFilter.name) &&
        Objects.equals(this.position, exclusionFilter.position) &&
        Objects.equals(this.groupId, exclusionFilter.groupId) &&
        Objects.equals(this.positionInGroup, exclusionFilter.positionInGroup) &&
        Objects.equals(this.channelColumnId, exclusionFilter.channelColumnId) &&
        Objects.equals(this.operatorName, exclusionFilter.operatorName) &&
        Objects.equals(this.value, exclusionFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, position, groupId, positionInGroup, channelColumnId, operatorName, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExclusionFilter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    positionInGroup: ").append(toIndentedString(positionInGroup)).append("\n");
    sb.append("    channelColumnId: ").append(toIndentedString(channelColumnId)).append("\n");
    sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

