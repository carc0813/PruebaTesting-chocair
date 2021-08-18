#Author: manco.5@hotmail.com
@login
Feature: login newtours
  As a Web User  
  I want to login into newtours

  @tag1 @correctLogin @smokeTest
  Scenario: login with correct credentials
    Given that Stiven wants into newtours page
    When he enter the credentials
      | userName            | password |
      | manco.5@hotmail.com | sophos   |
    Then he should see the flight finder screen

  @tag2 @wrongUser
  Scenario: login with correct credentials
    Given that Stiven wants into newtours page
    When he enter the credentials
      | userName | password |
      | Stiven   | sophos   |
    Then he should see the flight finder screen
      

  @tag3 @wrongPassword
  Scenario: login with correct credentials
    Given that Stiven wants into newtours page
    When he enter the credentials
      | userName            | password |
      | manco.5@hotmail.com | sopho    |
    Then he should see the flight finder screen

  @tag4 @wrongPasswordAndUser
  Scenario: login with correct credentials
    Given that Stiven wants into newtours page
    When he enter the credentials
      | userName | password |
      | Stiven   | sopho    |
    Then he should see the flight finder screen
