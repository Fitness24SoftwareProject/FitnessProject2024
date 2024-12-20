Feature: User Management
Scenario: Add a new instructor account
Given I am logged in as an admin 
When I navigate to the "Add User" page 
And I fill in the instructor's details with the name "Dr. John Smith"
And I submit the form
Then I should see a confirmation message
And "Dr. John Smith" should be listed in the user management page

Scenario: Update a client’s account
Given I am logged in as an admin
And a client account for "Jane Doe" exists
When I navigate to "Jane Doe's" account page
And I update the client's details
And I submit the changes
Then I should see a confirmation message
And "Jane Doe's" details should be updated

Scenario: Deactivate an instructor’s account
Given I am logged in as an admin
And an instructor account for "Prof. Emily Davis" exists
When I navigate to "Prof. Emily Davis's" account page
And I deactivate the account
Then I should see a confirmation message
And "Prof. Emily Davis's" account should be marked as inactive
    
