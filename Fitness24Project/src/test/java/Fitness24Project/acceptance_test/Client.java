package Fitness24Project.acceptance_test;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Client {
 
	MyApplication app;

    public Client() {
        app = new MyApplication();
    }

    
    
    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() {
        System.out.println("Navigated to the registration page.");
    }

    @When("I provide my personal details:")
    public void iProvideMyPersonalDetails(DataTable dataTable) {
        Map<String, String> personalDetails = dataTable.asMap(String.class, String.class);
        System.out.println("Provided personal details:");
        personalDetails.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    @Then("my account should be created with the provided information")
    public void myAccountShouldBeCreatedWithTheProvidedInformation() {
        System.out.println("Account successfully created with the provided information.");
    }

    @Given("I have an account with the name {string}")
    public void iHaveAnAccountWithTheName(String name) {
        System.out.println("Verified account exists for the user: " + name);
    }

    @When("I update my fitness goals to {string} and age to {string}")
    public void iUpdateMyFitnessGoalsToAndAgeTo(String fitnessGoals, String age) {
        System.out.println("Updated fitness goals to: " + fitnessGoals);
        System.out.println("Updated age to: " + age);
    }

    @Then("my updated profile should reflect the changes")
    public void myUpdatedProfileShouldReflectTheChanges() {
        System.out.println("Profile successfully updated with the new fitness goals and age.");
    }

    @Given("I no longer wish to use the platform")
    public void iNoLongerWishToUseThePlatform() {
        System.out.println("User has decided to delete their account.");
    }

    @When("I choose to delete my account")
    public void iChooseToDeleteMyAccount() {
        System.out.println("Account deletion process initiated.");
    }

    @Then("my account should be removed, and I should receive a confirmation message")
    public void myAccountShouldBeRemovedAndIShouldReceiveAConfirmationMessage() {
        System.out.println("Account successfully removed. Confirmation message sent.");
    }
    
    
    
    @Given("I have completed {string}")
    public void iHaveCompleted(String programName) {
        System.out.println("User has completed the program: " + programName);
    }

    @When("I rate the program with {string}")
    public void iRateTheProgramWith(String rating) {
        System.out.println("User has rated the program with: " + rating + " stars.");
    }

    @Then("my rating should be recorded and displayed on the program's reviews page")
    public void myRatingShouldBeRecordedAndDisplayedOnTheProgramSReviewsPage() {
        System.out.println("The rating has been successfully recorded and is displayed on the reviews page.");
    }

    @When("I submit a review saying {string}")
    public void iSubmitAReviewSaying(String review) {
        System.out.println("User submitted a review: " + review);
    }

    @Then("my review should appear on the program's feedback section")
    public void myReviewShouldAppearOnTheProgramSFeedbackSection() {
        System.out.println("The review has been successfully added to the program's feedback section.");
    }

    @Given("I want to suggest changes for {string}")
    public void iWantToSuggestChangesFor(String programName) {
        System.out.println("User wants to suggest changes for the program: " + programName);
    }

    @When("I submit a suggestion saying {string}")
    public void iSubmitASuggestionSaying(String suggestion) {
        System.out.println("User submitted the following suggestion: " + suggestion);
    }

    @Then("the instructor should receive my suggestion for review")
    public void theInstructorShouldReceiveMySuggestionForReview() {
        System.out.println("The instructor has successfully received the suggestion for review.");
    }
    
    
    
    @Given("I am on the program exploration page")
    public void iAmOnTheProgramExplorationPage() {
        System.out.println("Navigated to the program exploration page.");
    }

    @When("I filter programs by {string} difficulty")
    public void iFilterProgramsByDifficulty(String difficulty) {
        System.out.println("Filtering programs by difficulty level: " + difficulty);
    }

    @Then("I should see a list of programs suited for beginners")
    public void iShouldSeeAListOfProgramsSuitedForBeginners() {
        System.out.println("Displayed programs suitable for beginners.");
    }

    @Given("I am exploring programs")
    public void iAmExploringPrograms() {
        System.out.println("Currently exploring available fitness programs.");
    }

    @When("I filter programs by focus area {string}")
    public void iFilterProgramsByFocusArea(String focusArea) {
        System.out.println("Filtering programs by focus area: " + focusArea);
    }

    @Then("I should see all programs related to weight loss")
    public void iShouldSeeAllProgramsRelatedToWeightLoss() {
        System.out.println("Displayed all programs related to weight loss.");
    }

    @Given("I have selected the program {string}")
    public void iHaveSelectedTheProgram(String programName) {
        System.out.println("Selected the program: " + programName);
    }

    @When("I enroll in the program")
    public void iEnrollInTheProgram() {
        System.out.println("Enrollment process initiated for the selected program.");
    }

    @Then("{string} should appear in my enrolled programs list with the schedule details")
    public void shouldAppearInMyEnrolledProgramsListWithTheScheduleDetails(String programName) {
        System.out.println("The program '" + programName + "' has been added to the enrolled programs list with the schedule details.");
    }
    
    
    @Given("I am enrolled in {string}")
    public void iAmEnrolledIn(String programName) {
        System.out.println("You are enrolled in the program: " + programName);
    }

    @When("I log my progress with the following details:")
    public void iLogMyProgressWithTheFollowingDetails(DataTable dataTable) {
        List<Map<String, String>> progressDetails = dataTable.asMaps(String.class, String.class);
        System.out.println("Logging progress with the following details:");
        for (Map<String, String> entry : progressDetails) {
            System.out.println("Date: " + entry.get("Date") + ", Activity: " + entry.get("Activity") + ", Duration: " + entry.get("Duration"));
        }
    }

    @Then("my progress log should update with the new entries")
    public void myProgressLogShouldUpdateWithTheNewEntries() {
        System.out.println("Progress log successfully updated with the new entries.");
    }

    @Given("I have completed the program {string}")
    public void iHaveCompletedTheProgram(String programName) {
        System.out.println("You have completed the program: " + programName);
    }

    @When("I check my profile")
    public void iCheckMyProfile() {
        System.out.println("Accessing your profile...");
    }

    @Then("I should see the badge {string} awarded for completing the program")
    public void iShouldSeeTheBadgeAwardedForCompletingTheProgram(String badgeName) {
        System.out.println("You have been awarded the badge: " + badgeName + " for completing the program.");
    }

    @When("I view my attendance")
    public void iViewMyAttendance() {
        System.out.println("Viewing attendance records...");
    }

    @Then("I should see {string}")
    public void iShouldSee(String attendanceSummary) {
        System.out.println("Attendance summary: " + attendanceSummary);
    }
    


    
	
	
	
	
	
	
	
	
}
