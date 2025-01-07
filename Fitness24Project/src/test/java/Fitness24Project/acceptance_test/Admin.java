package Fitness24Project.acceptance_test;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admin {
    MyApplication app;

    public Admin() {
        app = new MyApplication();  // Instantiate the application logic
    }

   
    
    @Given("I am logged in as an admin")
    public void i_am_logged_in_as_an_admin() {
        boolean loginSuccess = app.adminLogin("Beesan", "1010");
        if (!loginSuccess) {
            throw new RuntimeException("Admin login failed");
        }
        System.out.println("Logged in as admin");
    }

    @When("I navigate to the {string} page")
    public void i_navigate_to_the_page(String page) {
        app.navigateTo(page);
        System.out.println("Navigating to the " + page + " page.");
    }

    @When("I fill in the instructor's details with the username {string} and the password {string} and the name {string}")
    public void iFillInTheInstructorSDetailsWithTheUsernameAndThePasswordAndTheName(String username,String password,String name) {
        app.addUser("Instructor",username,password,name);
        System.out.println("Filling in the instructor's details for " + name);
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        app.submitForm();
        System.out.println("Submitting the form.");
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
        boolean isDisplayed = app.isConfirmationMessageDisplayed();
        if (!isDisplayed) {
            throw new RuntimeException("Confirmation message not displayed");
        }
        System.out.println("Confirmation message displayed.");
    }

    @Then("{string} should be listed in the instructor list")
    public void shouldBeListedInTheInstructorList(String instructorName) {
      
    	boolean isListed = app.doesInstructorExist(instructorName);
        if(!isListed) {
        	throw new RuntimeException ("Instructor not listed in the user managment page");
        }
        System.out.println(instructorName + " is listed in the user management page.");
       
    }
    
    
    


    @Given("a client account for {string} exists")
    public void aClientAccountForExists(String clientName) {
        boolean accountExists = app.doesClientExist(clientName);
        if (!accountExists) {
            throw new RuntimeException("Client account does not exist");
        }
        System.out.println("Client account for " + clientName + " exists.");
    }

    @When("I navigate to {string} account page")
    public void iNavigateToAccountPage(String accountType) {
        app.viewUsers(accountType);
        System.out.println("Navigating to " + accountType + " account page.");
    }

    @When("I update the {string} account details")
    public void i_update_the_account_details(String accountType) {
        app.updateAccountDetails(accountType);
        System.out.println("Updating " + accountType + " account details.");
    }

    @Then("{string} details should be updated")
    public void detailsShouldBeUpdated(String accountType) {
        boolean isUpdated = app.isAccountUpdated(accountType);
        if (!isUpdated) {
            throw new RuntimeException(accountType + " account details were not updated");
        }
        System.out.println(accountType + " details have been updated.");
    }

    @Given("an instructor account for {string} exists")
    public void anInstructorAccountForExists(String instructorName) {
        boolean accountExists = app.doesInstructorExist(instructorName);
        if (!accountExists) {
            throw new RuntimeException("Instructor account for " + instructorName + " does not exist");
        }
        System.out.println("Instructor account for " + instructorName + " exists.");
    }

    @When("I deactivate the instructor's account")
    public void i_deactivate_the_instructor_s_account() {
        app.deactivateInstructorAccount();
        System.out.println("Deactivating the instructor's account.");
    }

    @Then("{string} account should be marked as inactive")
    public void accountShouldBeMarkedAsInactive(String accountType) {
        boolean isInactive = app.isAccountInactive(accountType);
        if (!isInactive) {
            throw new RuntimeException(accountType + " account is not marked as inactive");
        }
        System.out.println(accountType + " account has been marked as inactive.");
    }

    @Given("a wellness article titled {string} is pending approval")
    public void aWellnessArticleTitledIsPendingApproval(String articleTitle) {
        boolean isPending = app.isWellnessArticlePendingApproval(articleTitle);
        if (!isPending) {
            throw new RuntimeException("Wellness article titled '" + articleTitle + "' is not pending approval");
        }
        System.out.println("Wellness article titled '" + articleTitle + "' is pending approval.");
    }

    @When("I approve the article {string}")
    public void iApproveTheArticle(String articleTitle) {
        app.approveWellnessArticle(articleTitle);
        System.out.println("Approving the wellness article titled '" + articleTitle + "'.");
    }

    @Then("the article {string} should be marked as approved")
    public void theArticleShouldBeMarkedAsApproved(String articleTitle) {
        boolean isApproved = app.isWellnessArticlePendingApproval(articleTitle);
        if (!isApproved) {
            throw new RuntimeException("Wellness article titled '" + articleTitle + "' is not marked as approved");
        }
        System.out.println("Wellness article titled '" + articleTitle + "' has been marked as approved.");
    }

    @Given("a wellness tip titled {string} is pending approval")
    public void aWellnessTipTitledIsPendingApproval(String tipTitle) {
        boolean isPending = app.isWellnessArticlePendingApproval(tipTitle);
        if (!isPending) {
            throw new RuntimeException("Wellness tip titled '" + tipTitle + "' is not pending approval");
        }
        System.out.println("Wellness tip titled '" + tipTitle + "' is pending approval.");
    }

    @When("I reject the tip {string}")
    public void iRejectTheTip(String tipTitle) {
        app.rejectWellnessTip(tipTitle);
        System.out.println("Rejecting the wellness tip titled '" + tipTitle + "'.");
    }

    @Then("the tip {string} should be marked as rejected")
    public void theTipShouldBeMarkedAsRejected(String tipTitle) {
        boolean isRejected = app.isWellnessTipRejected(tipTitle);
        if (!isRejected) {
            throw new RuntimeException("Wellness tip titled '" + tipTitle + "' is not marked as rejected");
        }
        System.out.println("Wellness tip titled '" + tipTitle + "' has been marked as rejected.");
    }

    @When("I navigate to the user feedback page")
    public void iNavigateToUserFeedbackPage() {
        app.navigateToUserFeedbackPage();
        System.out.println("Navigating to the user feedback page.");
    }

    @Then("I should see a list of user feedback, including comments from {string} and {string}")
    public void iShouldSeeAListOfUserFeedbackIncludingCommentsFromAnd(String user1, String user2) {
        boolean feedbackExists = app.doesUserFeedbackExist(user1, user2);
        if (!feedbackExists) {
            throw new RuntimeException("User feedback from " + user1 + " and " + user2 + " not found");
        }
        System.out.println("User feedback from " + user1 + " and " + user2 + " is displayed.");
    }

    @When("I add a new subscription plan named {string}")
    public void iAddANewSubscriptionPlanNamed(String planName) {
        app.deactivateSubscriptionPlan(planName);
        System.out.println("Adding a new subscription plan named " + planName);
    }

    @Then("the new plan {string} should be listed")
    public void theNewPlanShouldBeListed(String planName) {
        boolean isListed = app.isSubscriptionPlanListed(planName);
        if (!isListed) {
            throw new RuntimeException("Subscription plan " + planName + " is not listed");
        }
        System.out.println("Subscription plan " + planName + " is listed.");
    }

    @Given("a subscription plan named {string} exists")
    public void aSubscriptionPlanNamedExists(String planName) {
        boolean planExists = app.doesSubscriptionPlanExist(planName);
        if (!planExists) {
            throw new RuntimeException("Subscription plan named '" + planName + "' does not exist");
        }
        System.out.println("Subscription plan named '" + planName + "' exists.");
    }

    @When("I update the plan details for {string}")
    public void iUpdateThePlanDetailsFor(String planName) {
        app.updateSubscriptionPlanDetails(planName);
        System.out.println("Updating the plan details for " + planName);
    }

    @Then("the plan details for {string} should be updated")
    public void thePlanDetailsForShouldBeUpdated(String planName) {
        boolean isUpdated = app.isSubscriptionPlanListed(planName);
        if (!isUpdated) {
            throw new RuntimeException("Subscription plan details for '" + planName + "' were not updated");
        }
        System.out.println("Subscription plan details for '" + planName + "' have been updated.");
    }

    @When("I deactivate the plan {string}")
    public void iDeactivateThePlan(String planName) {
        app.deactivateSubscriptionPlan(planName);
        System.out.println("Deactivating the subscription plan '" + planName + "'");
    }

    @Then("the plan {string} should be marked as inactive")
    public void thePlanShouldBeMarkedAsInactive(String planName) {
        boolean isInactive = app.isSubscriptionPlanListed(planName);
        if (!isInactive) {
            throw new RuntimeException("Subscription plan '" + planName + "' is not marked as inactive");
        }
        System.out.println("Subscription plan '" + planName + "' has been marked as inactive.");
    }

    @Given("a wellness article titled {string} exists and is pending approval")
    public void aWellnessArticleTitledExistsAndIsPendingApproval(String articleTitle) {
        boolean isPending = app.isWellnessArticlePendingApproval(articleTitle);
        if (!isPending) {
            throw new RuntimeException("Wellness article titled '" + articleTitle + "' is not pending approval");
        }
        System.out.println("Wellness article titled '" + articleTitle + "' exists and is pending approval.");
    }

    @When("I approve the wellness article titled {string}")
    public void iApproveTheWellnessArticleTitled(String articleTitle) {
        app.approveWellnessArticle(articleTitle);
        System.out.println("Approving wellness article titled '" + articleTitle + "'");
    }

    @Then("the wellness article titled {string} should be marked as approved")
    public void theWellnessArticleTitledShouldBeMarkedAsApproved(String articleTitle) {
        boolean isApproved = app.isWellnessArticlePendingApproval(articleTitle);
        if (!isApproved) {
            throw new RuntimeException("Wellness article titled '" + articleTitle + "' is not marked as approved");
        }
        System.out.println("Wellness article titled '" + articleTitle + "' has been marked as approved.");
    }

    @Given("a wellness tip titled {string} exists and is pending approval")
    public void aWellnessTipTitledExistsAndIsPendingApproval(String tipTitle) {
        boolean isPending = app.isWellnessArticlePendingApproval(tipTitle);
        if (!isPending) {
            throw new RuntimeException("Wellness tip titled '" + tipTitle + "' is not pending approval");
        }
        System.out.println("Wellness tip titled '" + tipTitle + "' exists and is pending approval.");
    }

    @When("I reject the wellness tip titled {string}")
    public void iRejectTheWellnessTipTitled(String tipTitle) {
        app.rejectWellnessTip(tipTitle);
        System.out.println("Rejecting wellness tip titled '" + tipTitle + "'");
    }

    @Then("the wellness tip titled {string} should be marked as rejected")
    public void theWellnessTipTitledShouldBeMarkedAsRejected(String tipTitle) {
        boolean isRejected = app.isWellnessTipRejected(tipTitle);
        if (!isRejected) {
            throw new RuntimeException("Wellness tip titled '" + tipTitle + "' is not marked as rejected");
        }
        System.out.println("Wellness tip titled '" + tipTitle + "' has been marked as rejected.");
    }

    @When("I navigate to the program statistics page")
    public void iNavigateToProgramStatisticsPage() {
        app.navigateToProgramTrackingPage();
        System.out.println("Navigating to the program statistics page.");
    }

    @Then("I should see a list of programs sorted by enrollment, including {string} and {string}")
    public void iShouldSeeAListOfProgramsSortedByEnrollmentIncludingAnd(String program1, String program2) {
        boolean programsListed = app.areProgramsSortedByEnrollment(program1, program2);
        if (!programsListed) {
            throw new RuntimeException("Programs sorted by enrollment, including '" + program1 + "' and '" + program2 + "' are not displayed");
        }
        System.out.println("Programs sorted by enrollment, including '" + program1 + "' and '" + program2 + "' are displayed.");
    }

    @When("I navigate to the program tracking page")
    public void iNavigateToProgramTrackingPage() {
        app.navigateToProgramTrackingPage();
        System.out.println("Navigating to the program tracking page.");
    }

    @Then("I should see a list of active and completed programs, including {string} and {string}")
    public void iShouldSeeAListOfActiveAndCompletedProgramsIncludingAnd(String program1, String program2) {
        boolean programsTracked = app.areActiveAndCompletedProgramsDisplayed(program1, program2);
        if (!programsTracked) {
            throw new RuntimeException("Active and completed programs, including '" + program1 + "' and '" + program2 + "' are not displayed");
        }
        System.out.println("Active and completed programs, including '" + program1 + "' and '" + program2 + "' are displayed.");
    }

    @When("I navigate to the subscription management page")
    public void iNavigateToSubscriptionManagementPage() {
        app.navigateToSubscriptionManagementPage();
        System.out.println("Navigating to the subscription management page.");
    }

    @Then("I should see a list of subscription plans, including {string} and {string}")
    public void iShouldSeeAListOfSubscriptionPlansIncludingAnd(String plan1, String plan2) {
        boolean plansListed = app.areSubscriptionPlansListed(plan1, plan2);
        if (!plansListed) {
            throw new RuntimeException("Subscription plans, including '" + plan1 + "' and '" + plan2 + "' are not listed");
        }
        System.out.println("Subscription plans, including '" + plan1 + "' and '" + plan2 + "' are listed.");
    }
    
    
    @When("I navigate to the content management page")
    public void iNavigateToTheContentManagementPage() {
        // Navigating to the content management page...
        app.navigateTo("content-management");  // Assuming navigateTo method handles navigation
    }

    @When("I approve the article")
    public void iApproveTheArticle() {
        // Approving the article...
        app.approveWellnessArticle("Sample Article Title");  // Assuming approveWellnessArticle handles the approval action
    }

    @When("I reject the tip")
    public void iRejectTheTip() {
        // Rejecting the wellness tip...
        app.rejectWellnessTip("Sample Tip Title");  // Assuming rejectWellnessTip handles the rejection action
    }

    @Then("I should be able to respond to feedback")
    public void iShouldBeAbleToRespondToFeedback() {
        // Checking if feedback is available for response...
        boolean isFeedbackAvailable = app.doesUserFeedbackExist("User1", "User2");  // Assuming isUserFeedbackExist checks feedback existence
        assertTrue(isFeedbackAvailable);  // Verify if feedback is available
    }

    @When("I navigate to the reports page")
    public void iNavigateToTheReportsPage() {
        // Navigating to the reports page...
        app.navigateTo("reports");  // Assuming navigateTo method handles navigation
    }

    @When("I select the revenue report option")
    public void iSelectTheRevenueReportOption() {
        // Selecting the revenue report option...
        app.selectReportOption("revenue");  // Assuming there's a method to select the report
    }

    @When("I generate the report")
    public void iGenerateTheReport() {
        // Generating the report...
        app.generateRevenueReport();  // Assuming generateReports method handles report generation
    }

    @Then("I should see a revenue report for the selected period")
    public void iShouldSeeARevenueReportForTheSelectedPeriod() {
        // Verifying that the revenue report is displayed for the selected period...
        boolean isReportGenerated = app.isReportGenerated("revenue");  // Assuming isReportGenerated checks if report is generated
        assertTrue(isReportGenerated);  // Verify if the revenue report is generated
    }

    @When("I update the plan details")
    public void iUpdateThePlanDetails() {
        // Updating the plan details...
        app.updateSubscriptionPlanDetails("Basic Plan");  // Assuming updateSubscriptionPlanDetails updates the plan details
    }

    @When("I deactivate the plan")
    public void iDeactivateThePlan() {
        // Deactivating the plan...
        app.deactivateSubscriptionPlan("Premium Plan");  // Assuming deactivateSubscriptionPlan handles the deactivation
    }

    @Then("{string} should be listed in the user management page")
    public void shouldBeListedInTheUserManagementPage(String userName) {
        // Verifying if " + userName + " is listed in the user management page...
        boolean isUserListed = app.doesClientExist(userName);  // Assuming doesUserExist checks if the user is listed
        assertTrue(isUserListed);  // Verify if the user is listed
    }

    @When("I update the client's details")
    public void iUpdateTheClientSDetails() {
        // Updating the client's details...
        app.updateAccountDetails("ClientAccount");  // Assuming updateAccountDetails updates the client's account details
    }

    @When("I submit the changes")
    public void iSubmitTheChanges() {
        // Submitting the changes...
        app.submitForm();  // Assuming submitForm submits the changes made to the account
    }

    @When("I deactivate the account")
    public void iDeactivateTheAccount() {
        // Deactivating the account...
        app.deactivateUser("Client", "client 1");  // Assuming deactivateUser deactivates the account of a specific user
    }

    
}

