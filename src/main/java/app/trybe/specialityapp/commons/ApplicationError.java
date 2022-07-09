package app.trybe.specialityapp.commons;

public class ApplicationError extends Throwable {
  private Integer status;
  private String message;

  public ApplicationError(Integer status, String message) {
    this.status = status;
    this.message = message;
  }

  public ApplicationError() {
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
