Feature: Register a user
  I, as user,
  I want register me into uTest page
  for stay tuned to news about testing

  @RegisterNewUser
  Scenario Outline: register new user into uTest page
    Given the user opens register page
    When he enters your basic data
      | firstName  | lastName   | email   | dateOfBirth   | language   |
      | <firtName> | <lastName> | <email> | <dateOfBirth> | <language> |
    And he enters your location data
      | city       | <city>       |
      | postalCode | <postalCode> |
      | country    | <country>    |
    And he enters your data about devices
      | computer     | <computer>     |
      | version      | <version>      |
      | language     | <language>     |
      | mobileDevice | <mobileDevice> |
      | model        | <model>        |
      | os           | <os>           |

    Examples:
      | firtName | lastName | email                          | dateOfBirth       | language | city     | postalCode | country  | computer | version | mobileDevice | model         | os         |
      | Santiago | Moncada  | santiago.moncada.dev@gmail.com | September/25/1997 | Spanish  | Medellin | 05001      | Colombia | Windows  | 10      | Xiaomi       | Redmi K20 Pro | Android 10 |