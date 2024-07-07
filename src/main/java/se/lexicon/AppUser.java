package se.lexicon;

import java.util.Objects;

public class AppUser {
    // Instance variables
    private String username;
    private String password;
    private AppRole role;

    // Constructor to initialize the fields
    public AppUser(String username, String password, AppRole role) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty.");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty.");
        }
        if (role == null) {
            throw new IllegalArgumentException("Role cannot be null.");
        }
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getter for username
    public String getUsername() {
        return this.username;
    }

    // Setter for username
    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty.");
        }
        this.username = username;
    }

    // Getter for password
    public String getPassword() {
        return this.password;
    }

    // Setter for password
    public void setPassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty.");
        }
        this.password = password;
    }

    // Getter for role
    public AppRole getRole() {
        return this.role;
    }

    // Setter for role
    public void setRole(AppRole role) {
        if (role == null) {
            throw new IllegalArgumentException("Role cannot be null.");
        }
        this.role = role;
    }

    // Override toString method
    @Override
    public String toString() {
        return String.format("AppUser{username='%s', role=%s}", this.username, this.role);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(this.username, this.role);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AppUserDemo appUserDemo;
        appUserDemo = (AppUserDemo) obj;
        return Objects.equals(this.username, appUserDemo.username) && this.role == appUserDemo.getRole();
    }

    // Main method to test the class
    public static void main(String[] args) throws InterruptedException {
        // Create an instance of AppUser
        AppUserDemo user1 = new AppUserDemo();
        AppUserDemo user2 = new AppUserDemo();

        // Print the users
        System.out.println(user1);
        System.out.println(user2);

        // Check equality
        System.out.println("Are users equal? " + user1.equals(user2));

        // Check hash code
        System.out.println("User1 hash code: " + user1.hashCode());
        System.out.println("User2 hash code: " + user2.hashCode());
    }
}
