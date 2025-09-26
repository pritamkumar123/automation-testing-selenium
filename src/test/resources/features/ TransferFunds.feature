Feature: Fund Transfer

  Scenario: Successful fund transfer
    Given the user is logged in transfer
    When the user clicks on the "Transfer Funds" link
    And the user enters data in the Amount field
    And the user selects data from the From Account dropdown
    And the user selects data from the To Account dropdown
    And the user clicks on the "Transfer" button
    Then the user should see the transfer success title displayed
    And the user clicks on the "Accounts Overview" link
