package Fitness24Project.acceptance_test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Instructor {
	MyApplication app;

    public Instructor() {
        app = new MyApplication();
    }
    
    @Given("I am logged in as an instructor")
    public void iAmLoggedInAsAnInstructor() {
        System.out.println("Logged in as an instructor");
    }

    @When("I send a message to {string} saying {string}")
    public void iSendAMessageToSaying(String recipient, String message) {
        System.out.println("Sending message to " + recipient + ": " + message);
    }

    @Then("John Doe should receive the message in their inbox")
    public void johnDoeShouldReceiveTheMessageInTheirInbox() {
        System.out.println("John Doe received the message in his inbox");
    }

    @Given("{string} is enrolled in {string}")
    public void isEnrolledIn(String student, String course) {
        System.out.println(student + " is enrolled in " + course);
    }

    @When("I write a progress report mentioning {string}")
    public void iWriteAProgressReportMentioning(String student) {
        System.out.println("Writing a progress report mentioning " + student);
    }

    @Then("Sarah Lee should see the progress report in her profile")
    public void sarahLeeShouldSeeTheProgressReportInHerProfile() {
        System.out.println("Sarah Lee sees the progress report in her profile");
    }

    @Given("I am in the forum for {string}")
    public void iAmInTheForumFor(String topic) {
        System.out.println("In the forum for " + topic);
    }

    @When("I reply to a client’s question about {string}")
    public void iReplyToAClientSQuestionAbout(String questionTopic) {
        System.out.println("Replying to a client's question about " + questionTopic);
    }

    @Then("my response should appear in the forum thread")
    public void myResponseShouldAppearInTheForumThread() {
        System.out.println("My response appears in the forum thread");
    }
    
    
    
    
    
    @Given("I need to reschedule {string} to a later time")
    public void iNeedToRescheduleToALaterTime(String event) {
        System.out.println("Need to reschedule " + event + " to a later time");
    }

    @When("I send a notification about the new schedule")
    public void iSendANotificationAboutTheNewSchedule() {
        System.out.println("Sending notification about the new schedule");
    }

    @Then("all enrolled clients should receive the notification")
    public void allEnrolledClientsShouldReceiveTheNotification() {
        System.out.println("All enrolled clients received the notification");
    }

    @Given("I have created a new program titled {string}")
    public void iHaveCreatedANewProgramTitled(String programTitle) {
        System.out.println("Created a new program titled " + programTitle);
    }

    @When("I announce the program to all clients")
    public void iAnnounceTheProgramToAllClients() {
        System.out.println("Announcing the program to all clients");
    }

    @Then("all clients should receive the announcement in their inbox")
    public void allClientsShouldReceiveTheAnnouncementInTheirInbox() {
        System.out.println("All clients received the announcement in their inbox");
    }

    @Given("there is a {int}% discount on {string}")
    public void thereIsADiscountOn(Integer discount, String item) {
        System.out.println("There is a " + discount + "% discount on " + item);
    }

    @When("I promote the offer to clients")
    public void iPromoteTheOfferToClients() {
        System.out.println("Promoting the offer to clients");
    }

    @Then("all clients should see the promotional message in their dashboard")
    public void allClientsShouldSeeThePromotionalMessageInTheirDashboard() {
        System.out.println("All clients see the promotional message in their dashboard");
    }
    
  
    
   
    @When("I create a new fitness program with the following details:")
    public void iCreateANewFitnessProgramWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("Creating a new fitness program with the following details:");
        dataTable.asMaps(String.class, String.class).forEach(row -> {
            row.forEach((key, value) -> System.out.println(key + ": " + value));
        });
    }

    @Then("the program {string} should be added to the list of available programs")
    public void theProgramShouldBeAddedToTheListOfAvailablePrograms(String programName) {
        System.out.println("The program " + programName + " should be added to the list of available programs");
    }

    @Given("I have a program titled {string}")
    public void iHaveAProgramTitled(String programTitle) {
        System.out.println("I have a program titled " + programTitle);
    }

    @When("I update its duration to {string} and price to {string}")
    public void iUpdateItsDurationToAndPriceTo(String duration, String price) {
        System.out.println("Updating program duration to " + duration + " and price to " + price);
    }

    @Then("the program details should reflect the updated values")
    public void theProgramDetailsShouldReflectTheUpdatedValues() {
        System.out.println("The program details should reflect the updated values");
    }

    @When("I delete the program")
    public void iDeleteTheProgram() {
        System.out.println("Deleting the program");
    }

    @Then("{string} should no longer appear in the list of available programs")
    public void shouldNoLongerAppearInTheListOfAvailablePrograms(String programName) {
        System.out.println(programName + " should no longer appear in the list of available programs");
    }
  
    
    
    @When("I check her progress")
    public void iCheckHerProgress() {
        System.out.println("Checking her progress");
    }

    @Then("I should see her completion rate as {string} and attendance as {string}")
    public void iShouldSeeHerCompletionRateAsAndAttendanceAs(String completionRate, String attendance) {
        System.out.println("Completion rate: " + completionRate + ", Attendance: " + attendance);
    }

    @Given("{string} has not attended the last two sessions")
    public void hasNotAttendedTheLastTwoSessions(String student) {
        System.out.println(student + " has not attended the last two sessions");
    }

    @When("I send him a reminder saying {string}")
    public void iSendHimAReminderSaying(String reminderMessage) {
        System.out.println("Sending reminder: " + reminderMessage);
    }

    @Then("Mark Smith should receive the motivational message")
    public void markSmithShouldReceiveTheMotivationalMessage() {
        System.out.println("Mark Smith received the motivational message");
    }

    @Given("{string} has completed {string}")
    public void hasCompleted(String student, String course) {
        System.out.println(student + " has completed " + course);
    }

    @When("I recommend her to enroll in {string}")
    public void iRecommendHerToEnrollIn(String nextCourse) {
        System.out.println("Recommending her to enroll in " + nextCourse);
    }

    @Then("Anna Brown should see the recommendation in her profile")
    public void annaBrownShouldSeeTheRecommendationInHerProfile() {
        System.out.println("Anna Brown sees the recommendation in her profile");
    }


    
    
    
}
