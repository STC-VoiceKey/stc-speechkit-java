/*
 * ASR documentation
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.1.58
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
 * ASRResultDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-12T21:20:53.133+03:00")
public class ASRResultDto {
  @SerializedName("score")
  private String score = null;

  @SerializedName("text")
  private String text = null;

  public ASRResultDto score(String score) {
    this.score = score;
    return this;
  }

   /**
   * Text score
   * @return score
  **/
  @ApiModelProperty(example = "75.45", required = true, value = "Text score")
  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public ASRResultDto text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Result text
   * @return text
  **/
  @ApiModelProperty(required = true, value = "Result text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ASRResultDto asRResultDto = (ASRResultDto) o;
    return Objects.equals(this.score, asRResultDto.score) &&
        Objects.equals(this.text, asRResultDto.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ASRResultDto {\n");

    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
