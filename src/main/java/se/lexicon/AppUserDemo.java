package se.lexicon;


import java.util.Objects;
import java.util.Optional;

public class AppUserDemo {
    private static Object Role;
    public Object username;


    private String password;
    private AppRole role;

    // Constructor to initialize the fields
    public AppUserDemo() throws InterruptedException {
        if ((username != null)) {
            username.wait();
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
        return String.format("AppUser{username='%s', role=%s}", (Object) this.username, Optional.ofNullable(this.role));
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash((Object) this.username, Optional.of(Optional.of(Optional.ofNullable(this.role))));
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AppUserDemo appUser = (AppUserDemo) obj;
        return Objects.equals(this.username, appUser.username) && this.role == appUser.role;
    }



}

