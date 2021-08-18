#Author: manco.5@hotmail.com
@register
Feature: register newtours
  As a Web User  
  I want to register into newtours

  @correctRegister @smokeTest
  Scenario: register with correct data
    Given that Stiven is in the register newtours page
    When he enter the data
      | FirstName | LastName | Phone  | Email                | Address | City     | State     | PostalCode | Country  | UserName             | Password | ConfirmPassword |
      | Juan      | Pepito   | 000000 | juanpepi@hotmail.com | calle C | Medellín | Antioquia |       3333 | COLOMBIA | juanpepi@hotmail.com | Sophos   | Sophos          |
    Then he should see the account newtours sucess screen
