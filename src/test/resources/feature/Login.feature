Feature: Login

  Scenario Outline: Verify user login with different credentials
    Given the user navigates to the SauceDemo login page
    When the user enters "<users>" as the username
    And the user enters "<passwords>" as the password
    And the user clicks on the login button
    Then the login should be "<status>"

    Examples:
      | users         | passwords    | status  |
      | standard_user | secret_sauce | success |
      #| locked_out_user | secret_sauce | locked  |
      #| standard        | secret_sauce | invalid |
      #| standard_user   | *********    | invalid |

