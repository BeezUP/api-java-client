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
import io.swagger.client.model.CompressionFormatStrategy;
import io.swagger.client.model.Credential;
import io.swagger.client.model.DownloadCatalogStrategy;

/**
 * Describe the way to download the file
 */
@ApiModel(description = "Describe the way to download the file")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-18T15:50:05.056Z")
public class InputFileFetchConfiguration {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("credential")
  private Credential credential = null;

  @SerializedName("downloadCatalogStrategy")
  private DownloadCatalogStrategy downloadCatalogStrategy = null;

  @SerializedName("compressionFormatStrategy")
  private CompressionFormatStrategy compressionFormatStrategy = null;

  @SerializedName("compressedRelativePath")
  private String compressedRelativePath = null;

  @SerializedName("downloadTimeout")
  private Integer downloadTimeout = 30;

  public InputFileFetchConfiguration uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Indicate the Uri of the file. (http, https, ftp, ftps, sftp are allowed)
   * @return uri
  **/
  @ApiModelProperty(example = "http://www.mywebsite.com/mycatalog.csv", required = true, value = "Indicate the Uri of the file. (http, https, ftp, ftps, sftp are allowed)")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public InputFileFetchConfiguration credential(Credential credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @ApiModelProperty(example = "null", value = "")
  public Credential getCredential() {
    return credential;
  }

  public void setCredential(Credential credential) {
    this.credential = credential;
  }

  public InputFileFetchConfiguration downloadCatalogStrategy(DownloadCatalogStrategy downloadCatalogStrategy) {
    this.downloadCatalogStrategy = downloadCatalogStrategy;
    return this;
  }

   /**
   * Get downloadCatalogStrategy
   * @return downloadCatalogStrategy
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DownloadCatalogStrategy getDownloadCatalogStrategy() {
    return downloadCatalogStrategy;
  }

  public void setDownloadCatalogStrategy(DownloadCatalogStrategy downloadCatalogStrategy) {
    this.downloadCatalogStrategy = downloadCatalogStrategy;
  }

  public InputFileFetchConfiguration compressionFormatStrategy(CompressionFormatStrategy compressionFormatStrategy) {
    this.compressionFormatStrategy = compressionFormatStrategy;
    return this;
  }

   /**
   * Get compressionFormatStrategy
   * @return compressionFormatStrategy
  **/
  @ApiModelProperty(example = "null", value = "")
  public CompressionFormatStrategy getCompressionFormatStrategy() {
    return compressionFormatStrategy;
  }

  public void setCompressionFormatStrategy(CompressionFormatStrategy compressionFormatStrategy) {
    this.compressionFormatStrategy = compressionFormatStrategy;
  }

  public InputFileFetchConfiguration compressedRelativePath(String compressedRelativePath) {
    this.compressedRelativePath = compressedRelativePath;
    return this;
  }

   /**
   * Indicate the relative path in the compressed file
   * @return compressedRelativePath
  **/
  @ApiModelProperty(example = "folder/file.xxx", value = "Indicate the relative path in the compressed file")
  public String getCompressedRelativePath() {
    return compressedRelativePath;
  }

  public void setCompressedRelativePath(String compressedRelativePath) {
    this.compressedRelativePath = compressedRelativePath;
  }

  public InputFileFetchConfiguration downloadTimeout(Integer downloadTimeout) {
    this.downloadTimeout = downloadTimeout;
    return this;
  }

   /**
   * Indicate the download time out in second
   * @return downloadTimeout
  **/
  @ApiModelProperty(example = "360", value = "Indicate the download time out in second")
  public Integer getDownloadTimeout() {
    return downloadTimeout;
  }

  public void setDownloadTimeout(Integer downloadTimeout) {
    this.downloadTimeout = downloadTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputFileFetchConfiguration inputFileFetchConfiguration = (InputFileFetchConfiguration) o;
    return Objects.equals(this.uri, inputFileFetchConfiguration.uri) &&
        Objects.equals(this.credential, inputFileFetchConfiguration.credential) &&
        Objects.equals(this.downloadCatalogStrategy, inputFileFetchConfiguration.downloadCatalogStrategy) &&
        Objects.equals(this.compressionFormatStrategy, inputFileFetchConfiguration.compressionFormatStrategy) &&
        Objects.equals(this.compressedRelativePath, inputFileFetchConfiguration.compressedRelativePath) &&
        Objects.equals(this.downloadTimeout, inputFileFetchConfiguration.downloadTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, credential, downloadCatalogStrategy, compressionFormatStrategy, compressedRelativePath, downloadTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputFileFetchConfiguration {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    downloadCatalogStrategy: ").append(toIndentedString(downloadCatalogStrategy)).append("\n");
    sb.append("    compressionFormatStrategy: ").append(toIndentedString(compressionFormatStrategy)).append("\n");
    sb.append("    compressedRelativePath: ").append(toIndentedString(compressedRelativePath)).append("\n");
    sb.append("    downloadTimeout: ").append(toIndentedString(downloadTimeout)).append("\n");
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

