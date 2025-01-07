package Fitness24Project.acceptance_test;

import java.util.HashMap;
import java.util.Map;

public class MyInstructor {
    private Map<String, String> messages;
    private Map<String, String> progressReports;
    private Map<String, String> notifications;
    private Map<String, FitnessProgram> fitnessPrograms;  // Updated to store FitnessProgram objects

    public MyInstructor(String username, String password, String name) {
    	
        this.messages = new HashMap<>();
        this.progressReports = new HashMap<>();
        this.notifications = new HashMap<>();
        this.fitnessPrograms = new HashMap<>();
    }

    public void sendMessageToClient(String client, String message) {
        messages.put(client, message);
        System.out.println("Message sent to " + client + ": " + message);
    }

    public void writeProgressReport(String client, String report) {
        progressReports.put(client, report);
        System.out.println("Progress report written for " + client + ": " + report);
    }

    public void discussionForumInteraction(String forum, String topic) {
        System.out.println("Responded to " + topic + " in " + forum + " forum");
    }

    public void notifyScheduleChange(String event, String newTime) {
        notifications.put(event, newTime);
        System.out.println("Notification sent about " + event + " rescheduled to " + newTime);
    }

    public void announceNewProgram(String programTitle) {
        if (fitnessPrograms.containsKey(programTitle)) {
            System.out.println("Announcement sent for new program: " + programTitle);
        } else {
            System.out.println("Program not found: " + programTitle);
        }
    }

    public void promoteSpecialOffer(String item, int discountPercentage) {
        System.out.println("Promotion: " + discountPercentage + "% off on " + item);
    }

    public void updateFitnessProgram(String programTitle, String field, String newValue) {
        if (fitnessPrograms.containsKey(programTitle)) {
            FitnessProgram program = fitnessPrograms.get(programTitle);
            switch (field) {
                case "duration":
                    program.setDuration(Integer.parseInt(newValue));
                    break;
                case "price":
                    program.setPrice(Double.parseDouble(newValue));
                    break;
                case "difficulty":
                    program.setDifficulty(newValue);
                    break;
                case "goals":
                    program.setGoals(newValue);
                    break;
                default:
                    System.out.println("Invalid field: " + field);
                    return;
            }
            System.out.println("Updated " + field + " of " + programTitle + " to " + newValue);
        } else {
            System.out.println("Program not found: " + programTitle);
        }
    }

    public void deleteFitnessProgram(String programTitle) {
        if (fitnessPrograms.containsKey(programTitle)) {
            fitnessPrograms.remove(programTitle);
            System.out.println("Deleted fitness program: " + programTitle);
        } else {
            System.out.println("Program not found: " + programTitle);
        }
    }

    public void viewClientProgress(String client, String course, int completionRate, int attendance) {
        System.out.println("Client: " + client + ", Course: " + course + ", Completion Rate: " + completionRate + "%, Attendance: " + attendance);
    }

    public void sendMotivationalMessage(String client, String message) {
        messages.put(client, message);
        System.out.println("Motivational message sent to " + client + ": " + message);
    }

    public void recommendToClient(String client, String recommendation) {
        System.out.println("Recommended " + recommendation + " to " + client);
    }

    // Create a new fitness program and add it to the collection
    public void createNewFitnessProgram(String title, int duration, String difficulty, String goals, double price) {
        FitnessProgram program = new FitnessProgram(title, duration, difficulty, goals, price);
        fitnessPrograms.put(title, program);  // Using the title as the key
        System.out.println("New fitness program created: " + title);
    }
}
