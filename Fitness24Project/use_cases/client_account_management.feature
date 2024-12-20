Feature: Account Management
  As a client, I want to manage my account to track my fitness journey effectively.

  Scenario: Create a new account
    Given I am on the registration page
    When I provide my personal details:
      | Name           | "Emma Johnson"          |
      | Age            | "30"                    |
      | Fitness Goals  | "Weight loss and toning" |
      | Dietary Prefs  | "Vegetarian"            |
    Then my account should be created with the provided information

  Scenario: Update account details
    Given I have an account with the name "Emma Johnson"
    When I update my fitness goals to "Build muscle" and age to "31"
    Then my updated profile should reflect the changes

  Scenario: Delete my account
    Given I no longer wish to use the platform
    When I choose to delete my account
    Then my account should be removed, and I should receive a confirmation message