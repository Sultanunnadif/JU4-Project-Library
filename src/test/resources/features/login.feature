@login
Feature: Login

  @valid-login
  Scenario: Login with valid username & password
    Given user is on login page
    When user input email text box with "standard_user"
    And user input password on text box "secret_sauce"
    And user click Login button
    Then user will redirect to homepage

  @invalid-login
  Scenario: Login with invalid username & password
    Given user is on login page
    When user input email text box with "invalid_user"
    And user input password on text box "invalid_sauce"
    And user click Login button
    And user see error message "Epic sadface: Username and password do not match any user in this service"