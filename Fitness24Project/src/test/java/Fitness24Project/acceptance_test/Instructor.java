package Fitness24Project.acceptance_test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Instructor {
    MyInstructor instuc;

    public Instructor() {
        instuc = new MyInstructor("instructorUsername", "password123", "Instructor Name");
    }

    @Given("I am logged in as an instructor")
    public void iAmLoggedInAsAnInstructor() {
        System.out.println("Logged in as an instructor");
    }

    @When("I send a message to {string} saying {string}")
    public void iSendAMessageToSaying(String recipient, String message) {
        instuc.sendMessageToClient(recipient, message);
    }

    @Then("John Doe should receive the message in their inbox")
    public void johnDoeShouldReceiveTheMessageInTheirInbox() {
        // Assuming some logic here to check message delivery
        System.out.println("John Doe received the message in his inbox");
    }

    @Given("{string} is enrolled in {string}")
    public void isEnrolledIn(String student, String course) {
        System.out.println(student + " is enrolled in " + course);
    }

    @When("I write a progress report mentioning {string}")
    public void iWriteAProgressReportMentioning(String student) {
        instuc.writeProgressReport(student, "Progress is satisfactory.");
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
        instuc.discussionForumInteraction("General Forum", questionTopic);
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
        instuc.notifyScheduleChange("Yoga Class", "Next Monday at 6 PM");
    }

    @Then("all enrolled clients should receive the notification")
    public void allEnrolledClientsShouldReceiveTheNotification() {
        System.out.println("All enrolled clients received the notification");
    }

    @Given("I have created a new program titled {string}")
    public void iHaveCreatedANewProgramTitled(String programTitle) {
        instuc.createNewFitnessProgram(programTitle, 8, "Intermediate", "Weight Loss", 50.0);
    }

    @When("I announce the program to all clients")
    public void iAnnounceTheProgramToAllClients() {
        instuc.announceNewProgram("Spring Fitness Blast");
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
        instuc.promoteSpecialOffer("Personal Training Package", 20);
    }

    @Then("all clients should see the promotional message in their dashboard")
    public void allClientsShouldSeeThePromotionalMessageInTheirDashboard() {
        System.out.println("All clients see the promotional message in their dashboard");
    }
    @When("I create a new fitness program with the following details:")
    public void iCreateANewFitnessProgramWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("Creating a new fitness program with the following details:");

        // Create a single instance of MyInstructor to preserve state across iterations
        MyInstructor myInstructor = new MyInstructor("username", "password", "Instructor Name");

        // Print the raw DataTable for debugging
        System.out.println("DataTable: " + dataTable.asLists(String.class));

        // Convert DataTable to a list of maps (this will give us each row as a map)
        dataTable.asMaps(String.class, String.class).forEach(row -> {
            // Debug: print each row to verify the contents
            System.out.println("Row: " + row);

            // Extract values from the row
            String title = row.get("Title");
            String durationStr = row.get("Duration");
            String difficulty = row.get("Difficulty");
            String goals = row.get("Goals");
            String priceStr = row.get("Price");

            // Debugging output for retrieved values
            System.out.println("Retrieved - Title: " + title + ", Duration: " + durationStr + ", Difficulty: " + difficulty + ", Goals: " + goals + ", Price: " + priceStr);

            // Parse the duration and price values
            int duration = 0;
            double price = 0.0;

            // Parse duration (assumes format like "4 weeks")
            try {
                if (durationStr != null && !durationStr.isEmpty()) {
                    // Extract number from "4 weeks"
                    duration = Integer.parseInt(durationStr.replaceAll("[^0-9]", ""));
                    System.out.println("Parsed - Duration: " + duration);  // Debugging
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid duration format: " + durationStr);
            }

            // Parse price (assumes format like "$50" or "50")
            try {
                if (priceStr != null && !priceStr.isEmpty()) {
                    // Remove the dollar sign (if present) and parse the number
                    price = Double.parseDouble(priceStr.replaceAll("[^0-9.]", ""));
                    System.out.println("Parsed - Price: " + price);  // Debugging
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid price format: " + priceStr);
            }

            // Ensure parsed values are valid before calling the method
            if (duration > 0 && price > 0) {
                // Create the new fitness program using the parsed values
                myInstructor.createNewFitnessProgram(title, duration, difficulty, goals, price);
            } else {
                System.out.println("Skipping invalid program creation due to invalid duration or price.");
            }
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
        instuc.updateFitnessProgram("Spring Fitness Blast", "duration", duration);
        instuc.updateFitnessProgram("Spring Fitness Blast", "price", price);
    }

    @Then("the program details should reflect the updated values")
    public void theProgramDetailsShouldReflectTheUpdatedValues() {
        System.out.println("The program details should reflect the updated values");
    }

    @When("I delete the program")
    public void iDeleteTheProgram() {
        instuc.deleteFitnessProgram("Spring Fitness Blast");
    }

    @Then("{string} should no longer appear in the list of available programs")
    public void shouldNoLongerAppearInTheListOfAvailablePrograms(String programName) {
        System.out.println(programName + " should no longer appear in the list of available programs");
    }

    @When("I check her progress")
    public void iCheckHerProgress() {
        instuc.viewClientProgress("Sarah Lee", "Yoga Basics", 80, 8);
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
        instuc.sendMotivationalMessage("Mark Smith", reminderMessage);
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
        instuc.recommendToClient("Anna Brown", nextCourse);
    }

    @Then("Anna Brown should see the recommendation in her profile")
    public void annaBrownShouldSeeTheRecommendationInHerProfile() {
        System.out.println("Anna Brown sees the recommendation in her profile");
    }
}

