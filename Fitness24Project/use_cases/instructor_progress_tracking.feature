Feature: Progress Tracking
  As an instructor, I want to monitor client progress and motivate them to achieve their goals.

  Scenario: View a client’s progress
    Given "Emily Davis" is enrolled in "Pilates Basics"
    When I check her progress
    Then I should see her completion rate as "75%" and attendance as "8/10 sessions"

  Scenario: Send a motivational reminder
    Given "Mark Smith" has not attended the last two sessions
    When I send him a reminder saying "Don't give up! Join us for the next session!"
    Then Mark Smith should receive the motivational message

  Scenario: Recommend a follow-up program
    Given "Anna Brown" has completed "Beginner Strength Training"
    When I recommend her to enroll in "Intermediate Strength Training"
    Then Anna Brown should see the recommendation in her profile