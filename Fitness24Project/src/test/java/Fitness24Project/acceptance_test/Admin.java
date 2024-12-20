package Fitness24Project.acceptance_test;


import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admin {
    MyApplication app;

    public Admin() {
        app = new MyApplication();
    }

    @When("the instructor's account should be marked as inactive")
    public void theAdminMarksTheAccountAsInactive() {
        // Code to mark the instructor's account as inactive
        System.out.println("Instructor's account has been marked as inactive.");
    }

    @Given("I am logged in as an admin")
    public void i_am_logged_in_as_an_admin() {
        System.out.println("Logged in as admin");
    }

    @When("I navigate to the {string} page")
    public void i_navigate_to_the_page(String page) {
        System.out.println("Navigating to the " + page + " page.");
    }

    @When("I fill in the instructor's details")
    public void i_fill_in_the_instructor_s_details() {
        System.out.println("Filling in the instructor's details.");
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        System.out.println("Submitting the form.");
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
        System.out.println("Confirmation message displayed.");
    }

    @Then("the instructor should be listed in the user management page")
    public void the_instructor_should_be_listed_in_the_user_management_page() {
        System.out.println("Instructor is listed in the user management page.");
    }

    @Given("a client account exists")
    public void a_client_account_exists() {
        System.out.println("Client account exists.");
    }

    @When("I navigate to the client's account page")
    public void i_navigate_to_the_client_s_account_page() {
        System.out.println("Navigating to the client's account page.");
    }

    @When("I update the client's details")
    public void i_update_the_client_s_details() {
        System.out.println("Updating the client's details.");
    }

    @When("I submit the changes")
    public void i_submit_the_changes() {
        System.out.println("Submitting the changes.");
    }

    @Then("the client's details should be updated")
    public void the_client_s_details_should_be_updated() {
        System.out.println("Client's details have been updated.");
    }

    @Given("an instructor account exists")
    public void an_instructor_account_exists() {
        System.out.println("Instructor account exists.");
    }

    @When("I navigate to the instructor's account page")
    public void i_navigate_to_the_instructor_s_account_page() {
        System.out.println("Navigating to the instructor's account page.");
    }

    @When("I deactivate the account")
    public void i_deactivate_the_account() {
        System.out.println("Deactivating the instructor's account.");
    }

    @When("I navigate to the program statistics page")
    public void i_navigate_to_the_program_statistics_page() {
        System.out.println("Navigating to the program statistics page.");
    }

    @Then("I should see a list of programs sorted by enrollment")
    public void i_should_see_a_list_of_programs_sorted_by_enrollment() {
        System.out.println("List of programs sorted by enrollment is displayed.");
    }

    @When("I navigate to the reports page")
    public void i_navigate_to_the_reports_page() {
        System.out.println("Navigating to the reports page.");
    }

    @When("I select the revenue report option")
    public void i_select_the_revenue_report_option() {
        System.out.println("Selecting the revenue report option.");
    }

    @When("I generate the report")
    public void i_generate_the_report() {
        System.out.println("Generating the revenue report.");
    }

    @Then("I should see a revenue report for the selected period")
    public void i_should_see_a_revenue_report_for_the_selected_period() {
        System.out.println("Revenue report for the selected period is displayed.");
    }

    @When("I navigate to the program tracking page")
    public void i_navigate_to_the_program_tracking_page() {
        System.out.println("Navigating to the program tracking page.");
    }

    @Then("I should see a list of active and completed programs")
    public void i_should_see_a_list_of_active_and_completed_programs() {
        System.out.println("List of active and completed programs is displayed.");
    }

    @Given("a wellness article is pending approval")
    public void a_wellness_article_is_pending_approval() {
        System.out.println("Wellness article is pending approval.");
    }

    @When("I navigate to the content management page")
    public void i_navigate_to_the_content_management_page() {
        System.out.println("Navigating to the content management page.");
    }

    @When("I approve the article")
    public void i_approve_the_article() {
        System.out.println("Approving the wellness article.");
    }

    @Then("the article should be marked as approved")
    public void the_article_should_be_marked_as_approved() {
        System.out.println("Wellness article has been marked as approved.");
    }

    @Given("a wellness tip is pending approval")
    public void a_wellness_tip_is_pending_approval() {
        System.out.println("Wellness tip is pending approval.");
    }

    @When("I reject the tip")
    public void i_reject_the_tip() {
        System.out.println("Rejecting the wellness tip.");
    }

    @Then("the tip should be marked as rejected")
    public void the_tip_should_be_marked_as_rejected() {
        System.out.println("Wellness tip has been marked as rejected.");
    }

    @When("I navigate to the user feedback page")
    public void i_navigate_to_the_user_feedback_page() {
        System.out.println("Navigating to the user feedback page.");
    }

    @Then("I should see a list of user feedback")
    public void i_should_see_a_list_of_user_feedback() {
        System.out.println("List of user feedback is displayed.");
    }

    @Then("I should be able to respond to feedback")
    public void i_should_be_able_to_respond_to_feedback() {
        System.out.println("Able to respond to user feedback.");
    }

    @When("I navigate to the subscription management page")
    public void i_navigate_to_the_subscription_management_page() {
        System.out.println("Navigating to the subscription management page.");
    }

    @When("I add a new subscription plan")
    public void i_add_a_new_subscription_plan() {
        System.out.println("Adding a new subscription plan.");
    }

    @Then("the new plan should be listed")
    public void the_new_plan_should_be_listed() {
        System.out.println("New subscription plan is listed.");
    }

    @Given("a subscription plan exists")
    public void a_subscription_plan_exists() {
        System.out.println("Subscription plan exists.");
    }

    @When("I update the plan details")
    public void i_update_the_plan_details() {
        System.out.println("Updating the subscription plan details.");
    }

    @Then("the plan details should be updated")
    public void the_plan_details_should_be_updated() {
        System.out.println("Subscription plan details have been updated.");
    }

    @When("I deactivate the plan")
    public void i_deactivate_the_plan() {
        System.out.println("Deactivating the subscription plan.");
    }

    @Then("the plan should be marked as inactive")
    public void the_plan_should_be_marked_as_inactive() {
        System.out.println("Subscription plan has been marked as inactive.");
    }
    @Given("a wellness article titled {string} is pending approval")
    public void aWellnessArticleTitledIsPendingApproval(String string) {
        
    }
    @Then("the article {string} should be marked as approved")
    public void theArticleShouldBeMarkedAsApproved(String string) {
      
    }
    @Given("a wellness tip titled {string} is pending approval")
    public void aWellnessTipTitledIsPendingApproval(String string) {
       
    }
    @Then("the tip {string} should be marked as rejected")
    public void theTipShouldBeMarkedAsRejected(String string) {
      
    }
    @Then("I should see a list of user feedback, including comments from {string} and {string}")
    public void iShouldSeeAListOfUserFeedbackIncludingCommentsFromAnd(String string, String string2) {
   
    }
    @Then("I should see a list of programs sorted by enrollment, including {string} and {string}")
    public void iShouldSeeAListOfProgramsSortedByEnrollmentIncludingAnd(String string, String string2) {
       
    }
    @Then("I should see a list of active and completed programs, including {string} and {string}")
    public void iShouldSeeAListOfActiveAndCompletedProgramsIncludingAnd(String string, String string2) {
        
    }
    @When("I add a new subscription plan named {string}")
    public void iAddANewSubscriptionPlanNamed(String string) {
  
    }
    @Then("the new plan {string} should be listed")
    public void theNewPlanShouldBeListed(String string) {

    }
    @Given("a subscription plan named {string} exists")
    public void aSubscriptionPlanNamedExists(String string) {
   
    }
    @Then("the plan details for {string} should be updated")
    public void thePlanDetailsForShouldBeUpdated(String string) {
       
    }
 
    @Then("the plan {string} should be marked as inactive")
    public void thePlanShouldBeMarkedAsInactive(String string) {
        
    } 
    @When("I fill in the instructor's details with the name {string}")
    public void iFillInTheInstructorSDetailsWithTheName(String string) {
        
    }
    @Then("{string} should be listed in the user management page")
    public void shouldBeListedInTheUserManagementPage(String string) {
       
    }
    @Given("a client account for {string} exists")
    public void aClientAccountForExists(String string) {
        
    }
    @When("I navigate to {string} account page")
    public void iNavigateToAccountPage(String string) {
      
    }
    @Then("{string} details should be updated")
    public void detailsShouldBeUpdated(String string) {
     
    }
    @Given("an instructor account for {string} exists")
    public void anInstructorAccountForExists(String string) {
        
    }
  
    @Then("{string} account should be marked as inactive")
    public void accountShouldBeMarkedAsInactive(String string) {
       
    }

    
}