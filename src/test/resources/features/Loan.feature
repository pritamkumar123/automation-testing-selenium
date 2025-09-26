Feature: Loan Request Functionality

  Scenario: Successful loan request
    Given the user is logged in
    When the user is on the loan request page
    And the user enters loan amount
    And the user enters down payment
    And the user selects account number from the dropdown
    And the user clicks on the apply now button
    Then the loan should be approved successfully
    And the user should be redirected to the accounts overview page
