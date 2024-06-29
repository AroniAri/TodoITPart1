package se.lexicon;

import java.time.LocalDate;

public class TodoItem {
    // Instance variables
    private int id;
    private String title;
    private String description;
    private LocalDate deadLine;
    private boolean done;
    private String creator;

    // Constructor to initialize the fields
    public TodoItem(int id, String title, String description, LocalDate deadLine, boolean done, String creator) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        if (deadLine == null) {
            throw new IllegalArgumentException("DeadLine cannot be null.");
        }
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }

    // Getter for id
    public int getId() {
        return this.id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for title
    public String getTitle() {
        return this.title;
    }

    // Setter for title
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        this.title = title;
    }

    // Getter for description
    public String getDescription() {
        return this.description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for deadLine
    public LocalDate getDeadLine() {
        return this.deadLine;
    }

    // Setter for deadLine
    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null) {
            throw new IllegalArgumentException("DeadLine cannot be null.");
        }
        this.deadLine = deadLine;
    }

    // Getter for done
    public boolean isDone() {
        return this.done;
    }

    // Setter for done
    public void setDone(boolean done) {
        this.done = done;
    }

    // Getter for creator
    public String getCreator() {
        return this.creator;
    }

    // Setter for creator
    public void setCreator(String creator) {
        this.creator = creator;
    }

    // Method to return a summary of the todo item
    public String getSummary() {
        return String.format("id: %d, title: %s, description: %s, deadLine: %s, done: %b, creator: %s",
                this.id, this.title, this.description, this.deadLine, this.done, this.creator);
    }

    // Method to check if the todo item is overdue
    public boolean isOverdue() {
        return LocalDate.now().isAfter(this.deadLine);
    }

    public static void main(String[] args) {
        // Create an instance of TodoItem
        TodoItem todo = new TodoItem(1, "Change tires", "Change the tires before winter", LocalDate.of(2024, 7, 1), false, "John Doe");

        // Get and print the summary of the todo item
        System.out.println(todo.getSummary());

        // Check if the todo item is overdue
        System.out.println("Is the todo item overdue? " + todo.isOverdue());
    }
}
