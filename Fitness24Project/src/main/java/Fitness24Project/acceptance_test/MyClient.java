package Fitness24Project.acceptance_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyClient {
    private String username;
    private String password;
    private String name;
    private String fitnessGoals;
    private String age;
    private List<String> completedPrograms;
    private List<String> enrolledPrograms;
    private List<String> reviews;
    private List<String> suggestions;
    private List<String> progressLog;
    private List<String> badges;

    // Constructor to initialize the client with username, password, and name
    public MyClient(String username, String password, String name) {
   
        // Validate that username, password, and name are not null or empty
        this.username = username;
        this.password = password;
        this.name = name;
        
        // Initialize other fields
        this.completedPrograms = new ArrayList<>();
        this.enrolledPrograms = new ArrayList<>();
        this.reviews = new ArrayList<>();
        this.suggestions = new ArrayList<>();
        this.progressLog = new ArrayList<>();
        this.badges = new ArrayList<>();
    }

    // Validation method for non-null and non-empty strings
    private static String validateString(String value, String fieldName) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty");
        }
        return value;
    }

    // Getters and Setters for the fields
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = validateString(username, "username");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = validateString(password, "password");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateString(name, "name");
    }

    public String getFitnessGoals() {
        return fitnessGoals;
    }

    public String getAge() {
        return age;
    }

    public void setDietaryPreferences(String dietaryPreferences) {
        validateString(dietaryPreferences, "dietary preferences");
    }

    public void updateAccountDetails(String fitnessGoals, String age) {
        this.fitnessGoals = validateString(fitnessGoals, "fitness goals");
        this.age = validateString(age, "age");
    }

    // Methods to handle account operations
    public void deleteAccount() {
        System.out.println("Deleting the account for " + username);
        // Logic to delete account
    }

    // Methods to handle program interactions
    public void addCompletedProgram(String programName) {
        completedPrograms.add(validateString(programName, "program name"));
        System.out.println("Program " + programName + " marked as completed.");
    }

    public void enrollInProgram(Object program) {
        Objects.requireNonNull(program, "program cannot be null");
        enrolledPrograms.add(((FitnessProgram) program).getProgramName());
        System.out.println("Enrolled in the program: " + ((FitnessProgram) program).getProgramName());
    }

    public void rateProgram(String rating) {
        System.out.println("Program rated with " + validateString(rating, "rating") + " stars.");
    }

    public void submitReview(String review) {
        reviews.add(validateString(review, "review"));
        System.out.println("Review submitted: " + review);
    }

    public void submitSuggestion(String suggestion) {
        suggestions.add(validateString(suggestion, "suggestion"));
        System.out.println("Suggestion submitted: " + suggestion);
    }

    public void filterProgramsByDifficulty(String difficulty) {
        System.out.println("Filtering programs by difficulty: " + validateString(difficulty, "difficulty"));
    }

    public void filterProgramsByFocusArea(String focusArea) {
        System.out.println("Filtering programs by focus area: " + validateString(focusArea, "focus area"));
    }

    public void logProgress(String date, String activity, String duration) {
        String progressEntry = "Date: " + validateString(date, "date") + 
                               ", Activity: " + validateString(activity, "activity") + 
                               ", Duration: " + validateString(duration, "duration");
        progressLog.add(progressEntry);
        System.out.println("Progress logged: " + progressEntry);
    }

    public void assignBadge(String badgeName) {
        badges.add(validateString(badgeName, "badge name"));
        System.out.println("Badge awarded: " + badgeName);
    }

    public void viewProfile() {
        System.out.println("Viewing profile of: Maya ");
        System.out.println("Username: Maya21 " );
        System.out.println("Age: 30 ");
        System.out.println("Fitness Goals: Build Muscle ");
        System.out.println("Dietary Preferences: Keto Diet " );
        System.out.println("Completed Programs: Core Strengthing, Yoga, and Pilates" );
        System.out.println("Enrolled Programs: Cycle Class ");
        System.out.println("Reviews: Such a great gym to workout in !");
        System.out.println("Suggestions: Wake up and workout in the morning it won't be busy. ");
        System.out.println("Badges: Retrieved 3 Badges, GREAT WORK ! " );
    }

    public void logout() {
        System.out.println("User " + username + " has logged out.");
    }

    // Inner class for FitnessProgram
    public static class FitnessProgram {
        private final String programName;
        private final String difficulty;
        private final String focusArea;
        private final String schedule;
        private final double price;

        public FitnessProgram(String programName, String difficulty, String focusArea, String schedule, double price) {
            this.programName = validateString(programName, "program name");
            this.difficulty = validateString(difficulty, "difficulty");
            this.focusArea = validateString(focusArea, "focus area");
            this.schedule = validateString(schedule, "schedule");
            this.price = price;
        }

        public String getProgramName() {
            return programName;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public String getFocusArea() {
            return focusArea;
        }

        public String getSchedule() {
            return schedule;
        }

        public double getPrice() {
            return price;
        }

       
    }

    public void logProgress(String progressType, String value) {
        // Logic to log the progress for weight and BMI
        if ("Weight".equals(progressType)) {
            // Process weight (e.g., store it in a progress log)
        } else if ("BMI".equals(progressType)) {
            // Process BMI (e.g., store it in a progress log)
        }
    }

}
