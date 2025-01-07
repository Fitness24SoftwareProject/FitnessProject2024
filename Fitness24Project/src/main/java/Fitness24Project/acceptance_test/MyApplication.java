package Fitness24Project.acceptance_test;

public class MyApplication {

	 private User[] instructors = {
		        new User("Shaymaa", "123", "Shaymaa"),
		        new User("Sara", "456", "Sara")
		    };
		    private User[] clients = {
		        new User("Aysha", "121", "Aysha"),
		        new User("Zain", "122", "Zain")
		    };
		    private int instructorCount = 2;
		    private int clientCount = 2 ;
		    
		    
		 // Add user to the system
		    public void addUser(String userType, String username, String password, String name) {
		        User newUser = new User(username, password, name);

		        if (userType.equalsIgnoreCase("Instructor")) {
		            // Check if there's space for new instructors, and if not, expand the array
		            if (instructorCount == instructors.length) {
		                instructors = expandUserArray(instructors); // Dynamically expand the instructor array
		            }
		            instructors[instructorCount++] = newUser;
		            System.out.println("Added new Instructor: " + name);
		        } else if (userType.equalsIgnoreCase("Client")) {
		            // Check if there's space for new clients, and if not, expand the array
		            if (clientCount == clients.length) {
		                clients = expandUserArray(clients); // Dynamically expand the client array
		            }
		            clients[clientCount++] = newUser;
		            System.out.println("Added new Client: " + name);
		        } else {
		            System.out.println("Failed to add user. Invalid userType.");
		        }
		    }

		    // Method to expand the user array
		    private User[] expandUserArray(User[] oldArray) {
		        // Create a new array with double the size of the old array
		        User[] newArray = new User[oldArray.length * 2];
		        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		        return newArray;
		    }

		    
		    // Remove user by username
		    public void deactivateUser(String userType, String username) {
		        User[] usersArray = userType.equalsIgnoreCase("Instructor") ? instructors : clients;
		        int count = userType.equalsIgnoreCase("Instructor") ? instructorCount : clientCount;

		        for (int i = 0; i < count; i++) {
		            if (usersArray[i].getUsername().equals(username)) {
		                for (int j = i; j < count - 1; j++) {
		                    usersArray[j] = usersArray[j + 1];
		                }
		                if (userType.equalsIgnoreCase("Instructor")) {
		                    instructors[--instructorCount] = null;
		                } else {
		                    clients[--clientCount] = null;
		                }
		                System.out.println(userType + " deactivated: " + username);
		                return;
		            }
		        }
		        System.out.println(userType + " not found.");
		    }

		    // View users of a specific type
		    public void viewUsers(String userType) {
		        User[] usersArray = userType.equalsIgnoreCase("Instructor") ? instructors : clients;
		        int count = userType.equalsIgnoreCase("Instructor") ? instructorCount : clientCount;

		        System.out.println("\n" + userType + "s:");
		        for (int i = 0; i < count; i++) {
		            System.out.println(usersArray[i]);
		        }
		    }

		    public boolean login(String userType, String username, String password) {
		        User[] usersArray = userType.equalsIgnoreCase("Instructor") ? instructors : clients;
		        int count = userType.equalsIgnoreCase("Instructor") ? instructorCount : clientCount;

		        for (int i = 0; i < count; i++) {
		            if (usersArray[i].getUsername().equals(username) && usersArray[i].getPassword().equals(password)) {
		                System.out.println("Login successful for " + userType + ": " + username);
		                return true;
		            }
		        }
		        System.out.println("Login failed for " + userType + ". Incorrect username or password.");
		        return false;
		    }

		    
		 // Method for testing purposes: add a new instructor
		    public void addInstructorForTest(String name, String username, String password) {
		        addUser("Instructor", username, password, name);
		    }
		    
		    // Admin login
		    public boolean adminLogin(String username, String password) {
		        return "Beesan".equals(username) && "1010".equals(password);
		    }

		    public void generateReports() {
		        System.out.println("Generating Reports...");

		        // Report for Instructors
		        System.out.println("\nInstructor Report:");
		        System.out.println("-------------------------------");
		        if (instructorCount == 0) {
		            System.out.println("No instructors available.");
		        } else {
		            for (int i = 0; i < instructorCount; i++) {
		                System.out.println(instructors[i]);
		            }
		        }

		        // Report for Clients
		        System.out.println("\nClient Report:");
		        System.out.println("-------------------------------");
		        if (clientCount == 0) {
		            System.out.println("No clients available.");
		        } else {
		            for (int i = 0; i < clientCount; i++) {
		                System.out.println(clients[i]);
		            }
		        }

		        System.out.println("\nEnd of Reports");
		    }


    // Dummy method implementations for test cases
    public void navigateTo(String page) {
        System.out.println("Navigating to " + page + " page.");
    }

    public void submitForm() {
        System.out.println("Form submitted.");
    }

    public boolean isConfirmationMessageDisplayed() {
        return true; // Simulate confirmation message display
    }

    public boolean doesInstructorExist(String instructorName) {
        for (User user : instructors) {
            if (user.getName().equalsIgnoreCase(instructorName)) {
                return true;
            }
        }
        return false;
    }

    public boolean doesClientExist(String clientName) {
        for (User user : clients) {
            if (user.getName().equalsIgnoreCase(clientName)) {
                return true;
            }
        }
        return false;
    }

    public void deactivateInstructorAccount() {
        System.out.println("Instructor account deactivated.");
    }

    public boolean isAccountInactive(String accountType) {
        return true; // Simulate account marked as inactive
    }

    public boolean isWellnessArticlePendingApproval(String articleTitle) {
        return true; // Simulate pending approval
    }

    public void approveWellnessArticle(String articleTitle) {
        System.out.println("Wellness article approved: " + articleTitle);
    }

    public void rejectWellnessTip(String tipTitle) {
        System.out.println("Wellness tip rejected: " + tipTitle);
    }

    public boolean isWellnessTipRejected(String tipTitle) {
        return true; // Simulate tip rejection
    }

    public void navigateToUserFeedbackPage() {
        System.out.println("Navigating to user feedback page.");
    }

    public boolean doesUserFeedbackExist(String user1, String user2) {
        return true; // Simulate user feedback exists
    }

    public void deactivateSubscriptionPlan(String planName) {
        System.out.println("Deactivating subscription plan: " + planName);
    }

    public boolean isSubscriptionPlanListed(String planName) {
        return true; // Simulate plan listing
    }

    public boolean doesSubscriptionPlanExist(String planName) {
        return true; // Simulate plan existence
    }

    public void updateSubscriptionPlanDetails(String planName) {
        System.out.println("Updating subscription plan details for: " + planName);
    }

    public void navigateToProgramTrackingPage() {
        System.out.println("Navigating to program tracking page.");
    }

    public boolean areProgramsSortedByEnrollment(String program1, String program2) {
        return true; // Simulate programs sorted by enrollment
    }

    public boolean areActiveAndCompletedProgramsDisplayed(String program1, String program2) {
        return true; // Simulate programs display
    }

    public void navigateToSubscriptionManagementPage() {
        System.out.println("Navigating to subscription management page.");
    }

    public boolean areSubscriptionPlansListed(String plan1, String plan2) {
        return true; // Simulate plans listing
    }

    public boolean isReportGenerated(String reportType) {
        return true; // Simulate report generation
    }
    public void updateAccountDetails(String accountType) {
        System.out.println("Updating account details for " + accountType + ".");
    }

    public boolean isAccountUpdated(String accountType) {
        return true; // Assuming account is always updated successfully.
    }
    public void generateRevenueReport() {
        System.out.println("Generating revenue report...");
    }

	public void selectReportOption(String string) {
		System.out.println("Revenue Report Selected :");
		
	}

	 public void viewUserFeedback() {
	        System.out.println("Feedback from Hasan: Great program!");
	        System.out.println("Feedback from Sidra: Very helpful!");
	    }
	 public void trackPrograms() {
	        System.out.println("Tracking active and completed programs...");
	    }
	 public void viewPopularPrograms() {
	        System.out.println("Viewing statistics of most popular programs...");
	    }
	 public void addPlan(String planName) {
	        System.out.println("Adding plan: " + planName);
	    }

	    public void updatePlan(String oldPlanName, String newPlanDetails) {
	        System.out.println("Updating plan: " + oldPlanName + " to " + newPlanDetails);
	    }

	    public void deactivatePlan(String planName) {
	        System.out.println("Deactivating plan: " + planName);
	    }
	    public boolean updateUser(String type, String username, String newName, String newPassword) {
	        User[] usersArray = type.equalsIgnoreCase("Instructor") ? instructors : clients;
	        int count = type.equalsIgnoreCase("Instructor") ? instructorCount : clientCount;

	        for (int i = 0; i < count; i++) {
	            if (usersArray[i].getUsername().equals(username)) {
	                usersArray[i].setName(newName);
	                usersArray[i].setPassword(newPassword);
	                System.out.println(type + " updated: " + username);
	                return true;
	            }
	        }
	        System.out.println(type + " not found: " + username);
	        return false;
	    }
	

	    // Constructor and other methods

	   

	    
}
