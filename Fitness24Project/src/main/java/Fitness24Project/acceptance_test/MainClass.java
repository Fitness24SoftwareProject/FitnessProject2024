package Fitness24Project.acceptance_test;

import java.util.Scanner;
import java.util.logging.Logger;

public class MainClass {
   private static final Logger logger = Logger.getLogger(MainClass.class.getName());
    private static MyApplication myApplication = new MyApplication();
    private static MyInstructor myInstructor;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyApplication admin = new MyApplication(); // Admin instance

        boolean exit = false;

        while (!exit) {
            logger.info("\n" + repeat("=", 30));
            logger.info("            Main Menu            ");
            logger.info(repeat("=", 30));
            logger.info("1. Admin Login");
            logger.info("2. Instructor Login");
            logger.info("3. Client Login");
            logger.info("4. Exit");
            logger.info(repeat("=", 30));
            logger.info("Enter your choice: ");
            int roleChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (roleChoice) {
                case 1:
                    if (adminLogin(scanner, admin)) {
                        printAdminMenu(scanner, admin);
                    } else {
                        logger.warning("Invalid admin credentials.");
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
                    logger.info("Exiting system. Goodbye!");
                    break;
                default:
                    logger.warning("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static boolean login(Scanner scanner, MyApplication admin, String userType) {
        logger.info("Enter username: ");
        String username = scanner.nextLine();
        logger.info("Enter password: ");
        String password = scanner.nextLine();
        return admin.login(userType, username, password);
    }

    private static boolean adminLogin(Scanner scanner, MyApplication admin) {
        logger.info("Enter admin username: ");
        String username = scanner.nextLine();
        logger.info("Enter admin password: ");
        String password = scanner.nextLine();
        return admin.adminLogin(username, password);
    }

    private static void printAdminMenu(Scanner scanner, MyApplication admin) {
        boolean back = false;
        while (!back) {
            logger.info("\n" + repeat("=", 30));
            logger.info("         Admin Main Menu         ");
            logger.info(repeat("=", 30));
            logger.info("1. User Management");
            logger.info("2. Program Monitoring");
            logger.info("3. Content Management");
            logger.info("4. Subscription Management");
            logger.info("5. Back to Main Menu");
            logger.info(repeat("=", 30));
            logger.info("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    userManagementMenu(scanner);
                    break;
                case 2:
                    programMonitoringMenu(scanner);
                    break;
                case 3:
                    contentManagementMenu(scanner);
                    break;
                case 4:
                    subscriptionManagementMenu(scanner);
                    break;
                case 5:
                    back = true;
                    break;
                default:
                    logger.warning("Invalid Choice. Please Try Again!");
            }
        }
    }

    private static void userManagementMenu(Scanner scanner) {
        logger.info("\n" + repeat("=", 30));
        logger.info("            User Management Menu            ");
        logger.info("1. Add User");
        logger.info("2. Update User");
        logger.info("3. Deactivate User");
        logger.info(repeat("=", 30));
        logger.info("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                logger.info("Enter User Type (Instructor/Client): ");
                String userType = scanner.nextLine();
                logger.info("Enter Username: ");
                String username = scanner.nextLine();
                logger.info("Enter Name: ");
                String name = scanner.nextLine();
                logger.info("Enter Password: ");
                String password = scanner.nextLine();
                myApplication.addUser(userType, name, password, username);
                break;
            case 2:
                logger.info("Enter User Type (Instructor/Client): ");
                String updateUserType = scanner.nextLine();
                logger.info("Enter Username: ");
                String updateUsername = scanner.nextLine();
                logger.info("Enter new Name: ");
                String newName = scanner.nextLine();
                logger.info("Enter new Password: ");
                String newPassword = scanner.nextLine();
                myApplication.updateUser(updateUserType, updateUsername, newName, newPassword);
                break;
            case 3:
                logger.info("Enter User Type (Instructor/Client): ");
                String deactivateUserType = scanner.nextLine();
                logger.info("Enter Username to Deactivate: ");
                String deactivateUsername = scanner.nextLine();
                myApplication.deactivateUser(deactivateUserType, deactivateUsername);
                break;
            default:
                logger.warning("Invalid choice. Please try again.");
        }
    }
   //Instructor Menu Ends
    
     private static String repeat(String str, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(str);
        }
        return builder.toString();
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
