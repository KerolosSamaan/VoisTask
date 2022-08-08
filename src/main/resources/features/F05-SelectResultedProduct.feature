@smoke
Feature:select resulted product
  Scenario:select resulted product

    Given user click on sign in tab
    When user enter email address
    And user enter log in password
    And user click on sign in button
    And user CLick on women tab
    And user click on Blouses tab
    And user choose resulted product
    And user click on add to cart button
    And user follow checkout procedure
    Then confirm order by selecting bank wire option