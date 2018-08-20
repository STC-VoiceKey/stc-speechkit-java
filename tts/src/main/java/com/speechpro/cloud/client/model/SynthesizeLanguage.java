/*
 * TTS documentation
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
 * SynthesizeLanguage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-12T22:49:47.436+03:00")
public class SynthesizeLanguage {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  public SynthesizeLanguage(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public SynthesizeLanguage id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Language id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Language id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SynthesizeLanguage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Language name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Language name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SynthesizeLanguage synthesizeLanguage = (SynthesizeLanguage) o;
    return Objects.equals(this.id, synthesizeLanguage.id) &&
        Objects.equals(this.name, synthesizeLanguage.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SynthesizeLanguage {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
