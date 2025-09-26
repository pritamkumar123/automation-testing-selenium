Feature: User Registration

  Scenario: Successful user registration
    Given the user is on the homepage
    When the user clicks on the "Register" link
    And the user enters data in the First Name field
    And the user enters data in the Last Name field
    And the user enters data in the Street Address field
    And the user enters data in the City field
    And the user enters data in the State field
    And the user enters data in the Zip Code field
    And the user enters data in the Phone Number field
    And the user enters data in the SSN field
    And the user enters data in the Username field
    And the user enters data in the Password field
    And the user enters data in the Confirm Password field
    And the user clicks on the "Register" button
    Then the user should see a success message "Your account was created successfully. You are now logged in."
    And the user clicks on the "Log Out" link
