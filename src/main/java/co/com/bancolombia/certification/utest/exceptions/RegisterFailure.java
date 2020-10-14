package co.com.bancolombia.certification.utest.exceptions;

public class RegisterFailure extends AssertionError {

  public RegisterFailure(String message, Throwable cause) {
    super(message, cause);
  }
}
