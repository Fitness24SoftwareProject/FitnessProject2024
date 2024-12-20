Feature: Program Exploration and Enrollment
  As a client, I want to explore and enroll in programs that fit my goals and schedule.

  Scenario: Browse programs by difficulty level
    Given I am on the program exploration page
    When I filter programs by "Beginner" difficulty
    Then I should see a list of programs suited for beginners

  Scenario: Browse programs by focus area
    Given I am exploring programs
    When I filter programs by focus area "Weight loss"
    Then I should see all programs related to weight loss

  Scenario: Enroll in a program
    Given I have selected the program "Morning Yoga"
    When I enroll in the program
    Then "Morning Yoga" should appear in my enrolled programs list with the schedule details