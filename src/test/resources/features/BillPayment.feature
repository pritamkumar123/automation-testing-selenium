Feature: Bill Payment

  Scenario: Successfully pay a bill
    Given the user is logged in
    When the user navigates to the "Bill Pay" page
    And the user enters the payee name
    And the user enters the payee street address
    And the user enters the payee city
    And the user enters the payee state
    And the user enters the payee zip code
    And the user enters the payee phone number
    And the user enters the payee account number
    And the user re-enters the account number
    And the user enters the payment amount
    And the user selects the account with ID from the dropdown
    And the user clicks the "Send Payment" button
    Then the user should see the payment success message
    And the user navigates back to the "Accounts Overview" page
