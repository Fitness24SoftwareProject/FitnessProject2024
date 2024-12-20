Feature: Client Interaction
  As an instructor, I want to communicate with clients to provide feedback and support.

  Scenario: Send a message to a client
    Given I am logged in as an instructor
    When I send a message to "John Doe" saying "Keep up the great work!"
    Then John Doe should receive the message in their inbox

  Scenario: Provide a progress report
    Given "Sarah Lee" is enrolled in "Morning Yoga"
    When I write a progress report mentioning "Excellent attendance and improved flexibility"
    Then Sarah Lee should see the progress report in her profile

  Scenario: Participate in a discussion forum
    Given I am in the forum for "Advanced Cardio Program"
    When I reply to a client’s question about "Workout schedules"
    Then my response should appear in the forum thread
