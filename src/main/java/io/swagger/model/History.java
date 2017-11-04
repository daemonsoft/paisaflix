package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.springframework.hateoas.ResourceSupport;

import java.util.Objects;

/**
 * History
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T14:43:08.631Z")

public class History  extends ResourceSupport {
  @JsonProperty("idHistory")
  private String idHistory = null;

  @JsonProperty("program")
  private Program program = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("date")
  private DateTime date = null;

  public History id(String id) {
    this.idHistory = id;
    return this;
  }

   /**
   * Get idHistory
   * @return idHistory
  **/
  @ApiModelProperty(example = "his12345", required = true, value = "")
  public String getIdHistory() {
    return idHistory;
  }

  public void setIdHistory(String idHistory) {
    this.idHistory = idHistory;
  }

  public History programId(Program programId) {
    this.program = programId;
    return this;
  }

   /**
   * Get program
   * @return program
  **/
  @ApiModelProperty(example = "program1234", required = true, value = "")
  public Program getProgram() {
    return program;
  }

  public void setProgram(Program program) {
    this.program = program;
  }

  public History username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "user1234", required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public History date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", required = true, value = "")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    History history = (History) o;
    return Objects.equals(this.idHistory, history.idHistory) &&
        Objects.equals(this.program, history.program) &&
        Objects.equals(this.username, history.username) &&
        Objects.equals(this.date, history.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idHistory, program, username, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class History {\n");

    sb.append("    idHistory: ").append(toIndentedString(idHistory)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

