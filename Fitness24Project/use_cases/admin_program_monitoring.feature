


Feature: Program Monitoring
Scenario: View statistics on the most popular programs
Given I am logged in as an admin
When I navigate to the program statistics page
Then I should see a list of programs sorted by enrollment, including "Yoga for Beginners" and "Advanced Java Programming"

Scenario: Generate a revenue report
Given I am logged in as an admin
When I navigate to the reports page
And I select the revenue report option
And I generate the report
Then I should see a revenue report for the selected period

Scenario: Track active and completed programs
Given I am logged in as an admin
When I navigate to the program tracking page
Then I should see a list of active and completed programs, including "Fitness Bootcamp" and "Cucumber Testing Workshop"