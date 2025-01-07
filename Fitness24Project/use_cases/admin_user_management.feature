Feature: User Management
Scenario: Add a new instructor account
Given I am logged in as an admin 
When I navigate to the "Add User" page 
And I fill in the instructor's details with the username "Sara" and the password "456" and the name "Sara"
And I submit the form
Then I should see a confirmation message
And "Sara" should be listed in the instructor list

Scenario: Update a client’s account
Given I am logged in as an admin
And a client account for "Aysha" exists
When I navigate to "Aysha's" account page
And I update the client's details
And I submit the changes
Then I should see a confirmation message
And "Aysha's" details should be updated

Scenario: Deactivate an instructor’s account
Given I am logged in as an admin
And an instructor account for "Shaymaa" exists
When I navigate to "Shaymaa's" account page
And I deactivate the account
Then I should see a confirmation message
And "Shaymaa's" account should be marked as inactive
    
