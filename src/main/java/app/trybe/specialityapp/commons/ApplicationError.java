package app.trybe.specialityapp.commons;

import javax.ws.rs.core.Response.Status;

/**
 * ApplicationError.
 */
public class ApplicationError extends Throwable {
  private Status status;
  private String message;

  public ApplicationError(String message, Status status) {
    this.status = status;
    this.message = message;
  }

  public ApplicationError() {
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
