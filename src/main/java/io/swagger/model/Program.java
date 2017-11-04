package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.springframework.hateoas.ResourceSupport;

import java.util.Objects;

/**
 * Program
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T14:43:08.631Z")

public class Program  extends ResourceSupport {
  @JsonProperty("idProgram")
  private String idProgram = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("dateAdded")
  private DateTime dateAdded = null;

  public Program id(String id) {
    this.idProgram = id;
    return this;
  }

   /**
   * Get idProgram
   * @return idProgram
  **/
  @ApiModelProperty(example = "program123", required = true, value = "")
  public String getIdProgram() {
    return idProgram;
  }

  public void setIdProgram(String idProgram) {
    this.idProgram = idProgram;
  }

  public Program name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "The Walking Dead", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Program description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Action zombie adventure serie", required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Program status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "0", required = true, value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Program dateAdded(DateTime dateAdded) {
    this.dateAdded = dateAdded;
    return this;
  }

   /**
   * Get dateAdded
   * @return dateAdded
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", required = true, value = "")
  public DateTime getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(DateTime dateAdded) {
    this.dateAdded = dateAdded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Program program = (Program) o;
    return Objects.equals(this.idProgram, program.idProgram) &&
        Objects.equals(this.name, program.name) &&
        Objects.equals(this.description, program.description) &&
        Objects.equals(this.status, program.status) &&
        Objects.equals(this.dateAdded, program.dateAdded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProgram, name, description, status, dateAdded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Program {\n");

    sb.append("    idProgram: ").append(toIndentedString(idProgram)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
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

