Feature: Purchase

  Scenario: Success purchase and a "Thanks" message
    Given the user navigates to the SauceDemo login page
    When the user log in with user "standard_user" and password "secret_sauce"
    And Click in Login button
    And Add 1 item in the cart 1
    And Add 1 item in the cart 2
    And Click in Shopping Cart button
    And Click in Checkout button
    And Type First Name
    And Type Last Name
    And Type Zip-Postal Code
    And Click in Continue button
    Then Click in Finish button
