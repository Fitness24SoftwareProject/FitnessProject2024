
Feature: Subscription Management
Scenario: Add a new subscription plan
Given I am logged in as an admin
When I navigate to the subscription management page
And I add a new subscription plan named "Premium Plus"
Then I should see a confirmation message
And the new plan "Premium Plus" should be listed

Scenario: Update a subscription plan
Given I am logged in as an admin
And a subscription plan named "Basic Plan" exists
When I navigate to the subscription management page
And I update the plan details
Then I should see a confirmation message
And the plan details for "Basic Plan" should be updated

Scenario: Deactivate a subscription plan
Given I am logged in as an admin
And a subscription plan named "Standard Plan" exists
When I navigate to the subscription management page
And I deactivate the plan
Then I should see a confirmation message
And the plan "Standard Plan" should be marked as inactive

   
       


