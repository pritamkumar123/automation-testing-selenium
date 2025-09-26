Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters username
    And the user enters password
    And the user clicks on the login button
    Then the user should be redirected to the "Accounts Overview" page
