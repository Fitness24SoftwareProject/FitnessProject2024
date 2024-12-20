Feature: Progress Tracking
  As a client, I want to track my progress and achievements to stay motivated.

  Scenario: Log fitness milestones
    Given I am enrolled in "Morning Yoga"
    When I log my progress with the following details:
      | Weight | "70kg" |
      | BMI    | "22.5" |
    Then my progress log should update with the new entries

  Scenario: View achievements
    Given I have completed the program "Beginner Strength Training"
    When I check my profile
    Then I should see the badge "Strength Starter" awarded for completing the program

  Scenario: Monitor attendance
    Given I am enrolled in "Advanced Cardio Program"
    When I view my attendance
    Then I should see "5/10 sessions attended"
