Fitness24Project.acceptance_test;

import java.util.Scanner;

public class MainClass {
    private static MyApplication myApplication = new MyApplication();
	private static MyInstructor myInstructor;


	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    MyApplication admin = new MyApplication(); // Admin instance

	    boolean exit = false;

	    while (!exit) {
	        System.out.println("\n" + repeat("=", 30));
	        System.out.println("            Main Menu            ");
	        System.out.println(repeat("=", 30));
	        System.out.println("1. Admin Login");
	        System.out.println("2. Instructor Login");
	        System.out.println("3. Client Login");
	        System.out.println("4. Exit");
	        System.out.println(repeat("=", 30));
	        System.out.print("Enter your choice: ");
	        int roleChoice = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        switch (roleChoice) {
	            case 1:
	                if (adminLogin(scanner, admin)) {
	                    printAdminMenu(scanner, admin);
	                } else {
	                    System.out.println("Invalid admin credentials.");
	                }
	                break;
	            case 2:
	            	 if (login(scanner, admin, "Instructor")) {
	            		 handleInstructorLogin(scanner, new MyInstructor("demoInstructor", "1234", "Myarr"));
	                    }
	                    break;

	            case 3:
	            	   if (login(scanner, admin, "Client")) {
	                        handleClientLogin(scanner, new MyClient("demoClient", "1234", "Saffad"));
	                    }
	                    break;

	            case 4:
	                exit = true;
	                System.out.println("Exiting system. Goodbye!");
	                break;
	            default:
	                System.out.println("Invalid choice. Please try again.");
	        }
	    }
	    scanner.close();
	}
	
	
	
	   private static boolean login(Scanner scanner, MyApplication admin, String userType) {
	        System.out.print("Enter username: ");
	        String username = scanner.nextLine();
	        System.out.print("Enter password: ");
	        String password = scanner.nextLine();
	        return admin.login(userType, username, password);
	    }

	
	
	
	
	
	
	private static boolean adminLogin(Scanner scanner, MyApplication admin) {
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();
        return admin.adminLogin(username, password);
    }
   


 
    private static void printAdminMenu(Scanner scanner,MyApplication admin) {
    
 
    	boolean back = false;
    	while (!back) {
        System.out.println("\n" + repeat("=", 30));
        System.out.println("         Admin Main Menu         ");
        System.out.println(repeat("=", 30));
        System.out.println("1. User Management");
        System.out.println("2. Program Monitoring");
        System.out.println("3. Content Management");
        System.out.println("4. Subscription Management");
        System.out.println("5. Back to Main Menu");
        System.out.println(repeat("=", 30));
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
    	 
		switch (choice) {
    	 case 1 :
    		 userManagementMenu(scanner);
    		 break;
    	 case 2 :
    		 programMonitoringMenu(scanner);
    		 break;
    	 case 3 : 
    		 contentManagementMenu(scanner);
    		 break;
    	 case 4 :
    		 subscriptionManagementMenu(scanner);
    		 break;
    		 
    	 case 5 : 
    		 back=true;
    		 break;
    		 
    		 default:
    			 System.out.println("Invalid Choice Please Try Again !");
 
    	 }
    	
    	}
    	
       }
  
//Admin Menu Starts Here
    private static void userManagementMenu(Scanner scanner) {
        
    	
    	System.out.println("\n" + repeat("=", 30));
        System.out.println("            User Management Menu            ");
    	//System.out.println("\nUser Management Menu");
        System.out.println("1. Add User");
        System.out.println("2. Update User");
        System.out.println("3. Deactivate User");
        System.out.println(repeat("=", 30));
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter User Type (Instructor/Client): ");
                String userType = scanner.nextLine();
                System.out.print("Enter Username: ");
                String username = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Password: ");
                String password = scanner.nextLine();
                myApplication.addUser(userType, name, password, username);
                break;
            case 2:
                System.out.print("Enter User Type (Instructor/Client): ");
                String updateUserType = scanner.nextLine();
                System.out.print("Enter Username: ");
                String updateUsername = scanner.nextLine();
                System.out.print("Enter new Name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new Password: ");
                String newPassword = scanner.nextLine();
                myApplication.updateUser(updateUserType, updateUsername, newName, newPassword);
                break;
            case 3:
                System.out.print("Enter User Type (Instructor/Client): ");
                String deactivateUserType = scanner.nextLine();
                System.out.print("Enter Username to Deactivate: ");
                String deactivateUsername = scanner.nextLine();
                myApplication.deactivateUser(deactivateUserType, deactivateUsername);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void programMonitoringMenu(Scanner scanner) {
        System.out.println("\nProgram Monitoring Menu");
        System.out.println("1. View Statistics of Most Popular Programs");
        System.out.println("2. Generate a Revenue Report");
        System.out.println("3. Track Active and Completed Programs");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                myApplication.viewPopularPrograms();
                break;
            case 2:
                myApplication.generateRevenueReport();
                break;
            case 3:
                myApplication.trackPrograms();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void contentManagementMenu(Scanner scanner) {
        System.out.println("\nContent Management Menu");
        System.out.println("1. Approve Wellness Article");
        System.out.println("2. Approve Wellness Tip");
        System.out.println("3. User Feedback");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter Article Title: ");
                String articleTitle = scanner.nextLine();
                myApplication.approveWellnessArticle(articleTitle);
                break;
            case 2:
                System.out.print("Enter Wellness Tip: ");
                String wellnessTip = scanner.nextLine();
                myApplication.rejectWellnessTip(wellnessTip);
                break;
            case 3:
                myApplication.viewUserFeedback();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void subscriptionManagementMenu(Scanner scanner) {
        System.out.println("\nSubscription Management Menu");
        System.out.println("1. Add Plan");
        System.out.println("2. Update Plan");
        System.out.println("3. Deactivate Plan");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter Plan Name: ");
                String planName = scanner.nextLine();
                myApplication.addPlan(planName);
                break;
            case 2:
                System.out.print("Enter Old Plan Name: ");
                String oldPlanName = scanner.nextLine();
                System.out.print("Enter New Plan Details: ");
                String newPlanDetails = scanner.nextLine();
                myApplication.updatePlan(oldPlanName, newPlanDetails);
                break;
            case 3:
                System.out.print("Enter Plan Name to Deactivate: ");
                String deactivatePlanName = scanner.nextLine();
                myApplication.deactivatePlan(deactivatePlanName);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
//Admin Menu Ends Here
    
    
    private static void handleInstructorLogin(Scanner scanner,MyInstructor instructor) {
     
    	while (true) {
            printInstructorMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    programManagementMenu(scanner);
                    break;
                case 2:
                    clientInteractionMenu(scanner);
                    break;
                case 3:
                    progressTrackingMenu(scanner);
                    break;
                case 4:
                    notificationsAndUpdatesMenu(scanner);
                    break;
                case 5:
                    return; // Back to Main Menu
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printInstructorMenu() {
        System.out.println("\n" + repeat("=", 30));
        System.out.println("      Instructor Main Menu      ");
        System.out.println(repeat("=", 30));
        System.out.println("1. Program Management");
        System.out.println("2. Client Interaction");
        System.out.println("3. Progress Tracking");
        System.out.println("4. Notifications and Updates");
        System.out.println("5. Back to Main Menu");
        System.out.println(repeat("=", 30));
        System.out.print("Enter your choice: ");
    }

    private static String repeat(String str, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(str);
        }
        return builder.toString();
    }
    
    
    //Instructor Menu Starts
	private static void programManagementMenu(Scanner scanner) {
        System.out.println("\nProgram Management Menu");
        System.out.println("1. Create New Fitness Program");
        System.out.println("2. Update Fitness Program");
        System.out.println("3. Delete Fitness Program");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        
		switch (choice) {
            case 1:
                System.out.print("Enter Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Duration: ");
                int duration = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter Difficulty: ");
                String difficulty = scanner.nextLine();
                System.out.print("Enter Goals: ");
                String goals = scanner.nextLine();
                System.out.print("Enter Price: ");
                double price = scanner.nextDouble();
                myInstructor.createNewFitnessProgram(title, duration, difficulty, goals, price);
                break;
            case 2:
                System.out.print("Enter Title of Program to Update: ");
                String updateTitle = scanner.nextLine();
                System.out.print("Enter Field to Update (duration/difficulty/goals/price): ");
                String fieldToUpdate = scanner.nextLine();
                System.out.print("Enter New Value: ");
                String newValue = scanner.nextLine();
                myInstructor.updateFitnessProgram(updateTitle, fieldToUpdate, newValue);
                break;
            case 3:
                System.out.print("Enter Title of Program to Delete: ");
                String deleteTitle = scanner.nextLine();
                myInstructor.deleteFitnessProgram(deleteTitle);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void clientInteractionMenu(Scanner scanner) {
        System.out.println("\nClient Interaction Menu");
        System.out.println("1. Send a Message");
        System.out.println("2. Progress Report");
        System.out.println("3. Discussion Forum");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter Client Username: ");
                String clientUsername = scanner.nextLine();
                System.out.print("Enter Message: ");
                String message = scanner.nextLine();
                myInstructor.sendMessageToClient(clientUsername, message);
                break;
            case 2:
                System.out.print("Enter Client Username: ");
                String progressUsername = scanner.nextLine();
                System.out.print("Enter Progress Message: ");
                String progressMessage = scanner.nextLine();
                myInstructor.writeProgressReport(progressUsername, progressMessage);
                break;
            case 3:
                System.out.print("Enter Forum Name: ");
                String forumName = scanner.nextLine();
                System.out.print("Enter Client's Question: ");
                String question = scanner.nextLine();
                myInstructor.discussionForumInteraction(forumName, question);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void progressTrackingMenu(Scanner scanner) {
        System.out.println("\nProgress Tracking Menu");
        System.out.println("1. View Client’s Progress");
        System.out.println("2. Motivational Message Reminders");
        System.out.println("3. Recommendations to Clients");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter Client’s Name: ");
                String clientName = scanner.nextLine();
                System.out.print("Enter Program Enrolled: ");
                String programEnrolled = scanner.nextLine();
                System.out.print("Enter Completion Percentage: ");
                int completionPercentage = scanner.nextInt();
                System.out.print("Enter Attendance (out of 10): ");
                int attendance = scanner.nextInt();
                myInstructor.viewClientProgress(clientName, programEnrolled, completionPercentage, attendance);
                break;
            case 2:
                System.out.print("Enter Client’s Name: ");
                String motivationClient = scanner.nextLine();
                System.out.print("Enter Motivational Message: ");
                String motivationalMessage = scanner.nextLine();
                myInstructor.sendMotivationalMessage(motivationClient, motivationalMessage);
                break;
            case 3:
                System.out.print("Enter Client’s Name: ");
                String recommendClient = scanner.nextLine();
                System.out.print("Enter Recommendations: ");
                String recommendations = scanner.nextLine();
                myInstructor.recommendToClient(recommendClient, recommendations);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void notificationsAndUpdatesMenu(Scanner scanner) {
        System.out.println("\nNotifications and Updates Menu");
        System.out.println("1. Notify Schedule Change to Clients");
        System.out.println("2. Announce New Program");
        System.out.println("3. Promote Special Offers");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter Program Name for Schedule Change: ");
                String programName = scanner.nextLine();
                System.out.print("Enter New Schedule: ");
                String newSchedule = scanner.nextLine();
                myInstructor.notifyScheduleChange(programName, newSchedule);
                break;
            case 2:
                System.out.print("Enter New Program Title: ");
                String newProgramTitle = scanner.nextLine();
                myInstructor.announceNewProgram(newProgramTitle);
                break;
            case 3:
                System.out.print("Enter Program Name for Special Offer: ");
                String specialOfferProgram = scanner.nextLine();
                System.out.print("Enter Discount Percentage: ");
                int discount = scanner.nextInt();
                myInstructor.promoteSpecialOffer(specialOfferProgram, discount);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    
   


private static void handleClientLogin(Scanner scanner, MyClient client) {
	while (true) {
        System.out.println("\n" + repeat("=", 30));
        System.out.println("          Client Main Menu         ");
        System.out.println(repeat("=", 30));
        System.out.println("1. Account Management");
        System.out.println("2. Program Exploration and Enrollment");
        System.out.println("3. Progress Tracking");
        System.out.println("4. Feedback and Reviews");
        System.out.println("5. Back to Main Menu");
        System.out.println(repeat("=", 30));
        System.out.print("Enter your choice: ");
        int clientChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (clientChoice) {
            case 1:
                handleAccountManagementMenu(scanner, client);
                break;
            case 2:
                handleProgramExplorationAndEnrollmentMenu(scanner, client);
                break;
            case 3:
                handleProgressTrackingMenu(scanner, client);
                break;
            case 4:
                handleFeedbackAndReviewsMenu(scanner, client);
                break;
            case 5:
                return; // Back to Main Menu
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

private static void handleAccountManagementMenu(Scanner scanner, MyClient client) {
    System.out.println("\n" + repeat("=", 50));
    System.out.println("      Account Management Menu     ");
    System.out.println(repeat("=", 50));
    System.out.println("1. Fill in Account Information");
    System.out.println("2. Update Account Details");
    System.out.println("3. Delete Account");
    System.out.println("4. Back to Client Main Menu");
    System.out.println(repeat("=", 50));
    System.out.print("Enter your choice: ");
    int accountChoice = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    switch (accountChoice) {
        case 1:
            System.out.print("Enter fitness goals: ");
            String goals = scanner.nextLine();
            System.out.print("Enter age: ");
            String age = scanner.nextLine();
            client.updateAccountDetails(goals, age);
            break;
        case 2:
            System.out.print("Enter new fitness goals: ");
            goals = scanner.nextLine();
            System.out.print("Enter new age: ");
            age = scanner.nextLine();
            client.updateAccountDetails(goals, age);
            break;
        case 3:
            client.deleteAccount();
            break;
        case 4:
            return; // Back to Client Main Menu
        default:
            System.out.println("Invalid choice. Please try again.");
    }
}

private static void handleProgramExplorationAndEnrollmentMenu(Scanner scanner, MyClient client) {
    System.out.println("\n" + repeat("=", 30));
    System.out.println(" Program Exploration and Enrollment Menu ");
    System.out.println(repeat("=", 30));
    System.out.println("1. Browse Program Difficulty Level");
    System.out.println("2. Browse Program Focus Area");
    System.out.println("3. Enroll in a Program");
    System.out.println("4. Back to Client Main Menu");
    System.out.println(repeat("=", 30));
    System.out.print("Enter your choice: ");
    int programChoice = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    switch (programChoice) {
        case 1:
            System.out.print("Enter difficulty level to browse: ");
            String difficulty = scanner.nextLine();
            client.filterProgramsByDifficulty(difficulty);
            break;
        case 2:
            System.out.print("Enter focus area to browse: ");
            String focusArea = scanner.nextLine();
            client.filterProgramsByFocusArea(focusArea);
            break;
        case 3:
            System.out.print("Enter program name to enroll: ");
            String programName = scanner.nextLine();
            client.enrollInProgram(new MyClient.FitnessProgram(programName, "Medium", "General", "MWF 6PM", 20.0));
            break;
        case 4:
            return; // Back to Client Main Menu
        default:
            System.out.println("Invalid choice. Please try again.");
    }
}

private static void handleProgressTrackingMenu(Scanner scanner, MyClient client) {
    System.out.println("\n" + repeat("=", 30));
    System.out.println("        Progress Tracking Menu      ");
    System.out.println(repeat("=", 30));
    System.out.println("1. Log Fitness Milestone");
    System.out.println("2. View Achievements");
    System.out.println("3. Monitor Attendance");
    System.out.println("4. Back to Client Main Menu");
    System.out.println(repeat("=", 30));
    System.out.print("Enter your choice: ");
    int progressChoice = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    switch (progressChoice) {
        case 1:
            System.out.print("Enter date: ");
            String date = scanner.nextLine();
            System.out.print("Enter activity: ");
            String activity = scanner.nextLine();
            System.out.print("Enter duration: ");
            String duration = scanner.nextLine();
            client.logProgress(date, activity, duration);
            break;
        case 2:
            System.out.println("Achievements: Badges have been retrieved, CONGRADULATIONS! " );
            break;
        case 3:
            System.out.println("Attendance monitoring not implemented yet.");
            break;
        case 4:
            return; // Back to Client Main Menu
        default:
            System.out.println("Invalid choice. Please try again.");
    }
}

private static void handleFeedbackAndReviewsMenu(Scanner scanner, MyClient client) {
    System.out.println("\n" + repeat("=", 30));
    System.out.println("      Feedback and Reviews Menu    ");
    System.out.println(repeat("=", 30));
    System.out.println("1. Rate Program");
    System.out.println("2. Submit a Review");
    System.out.println("3. Improvement Suggestions");
    System.out.println("4. Back to Client Main Menu");
    System.out.println(repeat("=", 30));
    System.out.print("Enter your choice: ");
    int feedbackChoice = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    switch (feedbackChoice) {
        case 1:
            System.out.print("Enter rating (1-5): ");
            String rating = scanner.nextLine();
            client.rateProgram(rating);
            break;
        case 2:
            System.out.print("Enter review: ");
            String review = scanner.nextLine();
            client.submitReview(review);
            break;
        case 3:
            System.out.print("Enter suggestion: ");
            String suggestion = scanner.nextLine();
            client.submitSuggestion(suggestion);
            break;
        case 4:
            return; // Back to Client Main Menu
        default:
            System.out.println("Invalid choice. Please try again.");
    }
}



}
