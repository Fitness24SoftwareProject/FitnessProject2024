Feature: Content Management
Scenario: Approve a wellness article
Given I am logged in as an admin
And a wellness article titled "Healthy Eating Tips" is pending approval
When I navigate to the content management page
And I approve the article
Then I should see a confirmation message
And the article "Healthy Eating Tips" should be marked as approved

Scenario: Reject a wellness tip
Given I am logged in as an admin
And a wellness tip titled "Quick Weight Loss Tricks" is pending approval
When I navigate to the content management page
And I reject the tip
Then I should see a confirmation message
And the tip "Quick Weight Loss Tricks" should be marked as rejected

Scenario: Handle user feedback
Given I am logged in as an admin
When I navigate to the user feedback page
Then I should see a list of user feedback, including comments from "Alice Johnson" and "Bob Lee"
And I should be able to respond to feedback