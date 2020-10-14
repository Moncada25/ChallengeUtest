package co.com.bancolombia.certification.utest.models;

public class User {

  private String firstName;
  private String lastName;
  private String email;
  private String dateOfBirth;
  private String language;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}
