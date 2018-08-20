/*
 * Diarization documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.1.73
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.speechpro.cloud.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Audio
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-12T23:25:12.859+03:00")
public class Audio {
  @SerializedName("data")
  private String data = null;

  @SerializedName("mime")
  private String mime = null;

  public Audio(String data, String mime) {
    this.data = data;
    this.mime = mime;
  }

  public Audio data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Audio in base64 for diarization
   * @return data
  **/
  @ApiModelProperty(required = true, value = "Audio in base64 for diarization")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Audio mime(String mime) {
    this.mime = mime;
    return this;
  }

   /**
   * Mime type of audio. Possible value: audio/alaw, audio/mulaw, audio/s16be, audio/wav
   * @return mime
  **/
  @ApiModelProperty(example = "audio/s16be", required = true, value = "Mime type of audio. Possible value: audio/alaw, audio/mulaw, audio/s16be, audio/wav")
  public String getMime() {
    return mime;
  }

  public void setMime(String mime) {
    this.mime = mime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Audio audio = (Audio) o;
    return Objects.equals(this.data, audio.data) &&
        Objects.equals(this.mime, audio.mime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, mime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audio {\n");

    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

