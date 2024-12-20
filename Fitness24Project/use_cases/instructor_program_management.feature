Feature: Program Management
  As an instructor, I want to manage fitness programs to provide quality services to clients.

  Scenario: Create a new fitness program
    Given I am logged in as an instructor
    When I create a new fitness program with the following details:
      | Title           | "Morning Yoga"       |
      | Duration        | "4 weeks"            |
      | Difficulty      | "Beginner"           |
      | Goals           | "Flexibility"        |
      | Price           | "$50"               |
    Then the program "Morning Yoga" should be added to the list of available programs

  Scenario: Update an existing fitness program
    Given I have a program titled "Morning Yoga"
    When I update its duration to "6 weeks" and price to "$60"
    Then the program details should reflect the updated values

  Scenario: Delete a fitness program
    Given I have a program titled "Morning Yoga"
    When I delete the program
    Then "Morning Yoga" should no longer appear in the list of available programs