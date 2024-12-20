Feature: Feedback and Reviews
  As a client, I want to provide feedback and reviews to improve the programs and share my experience.

  Scenario: Rate a completed program
    Given I have completed "Pilates Basics"
    When I rate the program with "4 stars"
    Then my rating should be recorded and displayed on the program's reviews page

  Scenario: Submit a review
    Given I have completed "Morning Yoga"
    When I submit a review saying "Great for beginners, but could use more advanced poses"
    Then my review should appear on the program's feedback section

  Scenario: Suggest improvements to an instructor
    Given I want to suggest changes for "Advanced Cardio Program"
    When I submit a suggestion saying "Consider adding more warm-up exercises"
    Then the instructor should receive my suggestion for review
    