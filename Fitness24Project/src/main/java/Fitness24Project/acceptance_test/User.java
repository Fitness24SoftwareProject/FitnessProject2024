package Fitness24Project.acceptance_test;

public class User {
    private String username;
    private String password;
    private String name;

    // Constructor
    public User(String username, String password, String name) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.username = username;
        this.password = password;
        this.name = name;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    // Setter methods
    public void setPassword(String newPassword) {
        if (newPassword == null || newPassword.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
        this.password = newPassword;
    }

    public void setName(String newName) {
        if (newName == null || newName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = newName;
    }

    // Method to check if a given password matches the user's password (for authentication)
    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    // toString() method for easy display, excluding sensitive information
    @Override
    public String toString() {
        return "User [username=" + username + ", name=" + name + "]";
    }
}


