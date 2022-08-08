@smoke
Feature:authenticate as new user
  Scenario: authenticate as new user
    Given user click on sign in tab
    When user enter email address
    And user enter log in password
    Then user click on sign in button