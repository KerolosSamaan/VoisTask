@smoke
  Feature:Validate order was placed from order history page
    Scenario:Validate order was placed from order history page
      Given user click on sign in tab
      When user enter email address
      And user enter log in password
      And user click on sign in button
      And user CLick on women tab
      And user click on Blouses tab
      And user choose resulted product
      And user click on add to cart button
      And user follow checkout procedure
      And confirm order by selecting bank wire option
      And user click on my account button
      Then user click on order history button
