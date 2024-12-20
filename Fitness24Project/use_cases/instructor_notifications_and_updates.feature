Feature: Notifications and Updates
  As an instructor, I want to notify clients about changes and announcements.

  Scenario: Notify clients about schedule changes
    Given I need to reschedule "Morning Yoga" to a later time
    When I send a notification about the new schedule
    Then all enrolled clients should receive the notification

  Scenario: Announce a new program
    Given I have created a new program titled "Evening Meditation"
    When I announce the program to all clients
    Then all clients should receive the announcement in their inbox

  Scenario: Promote a special offer
    Given there is a 20% discount on "Advanced Cardio Program"
    When I promote the offer to clients
    Then all clients should see the promotional message in their dashboard
