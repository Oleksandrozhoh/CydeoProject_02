Feature: Login functionality

  Scenario: Users able to login successfully with valid credentials
    Given user is at the login page
    When user enters valid username
    And user enters valid password
    And user clicks the login button
    Then user launched to the dashboard