@smoke
Feature: user create new account
  Scenario: user create new account

    Given user click on sign in tab
    When user enter email
    And user click on create an account button
    And user select gender type
    And user enter first name and last name
    And user enter password
    And user enter date of birth
    And user enter company name
    And user enter address1
    And user enter address2
    And user enter city name
    And user select the state
    And user enter postal code
    And user select country
    And user enter home phone
    And user enter mobil phone
    And user enter address alias
    Then user click on register button

