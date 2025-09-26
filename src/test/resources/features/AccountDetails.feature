Feature: View Account Details

  Scenario: Successfully view account details
    Given the user is logged in
    When the user clicks on the account number
    Then the user should see the account type displayed
    And the user should see the balance displayed
    And the user should see the available balance displayed
