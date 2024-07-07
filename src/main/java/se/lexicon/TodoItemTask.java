package se.lexicon;

import java.time.LocalDate;

public class TodoItemTask {
    // Instance variables
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    // Constructor to initialize the fields
    public TodoItemTask(int id, TodoItem todoItem, Person assignee) {
        if (todoItem == null) {
            throw new IllegalArgumentException("TodoItem cannot be null.");
        }
        this.id = id;
        this.todoItem = todoItem;
        this.assignee = assignee;
        this.assigned = (assignee != null);
    }


    public int getId() {
        return this.id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return this.assigned;
    }

    public TodoItem getTodoItem() {
        return this.todoItem;
    }

    // Setter for todoItem
    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) {
            throw new IllegalArgumentException("TodoItem cannot be null.");
        }
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return this.assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        this.assigned = (assignee != null);
    }

    // Method to return a summary of the todo item task
    public String getSummary() {
        return String.format("id: %d, assigned: %b, todoItem: {%s}, assignee: {%s}",
                this.id, this.assigned, this.todoItem.getSummary(), this.assignee != null ? this.assignee.getSummary() : "null");
    }

    public static void main(String[] args) {
        // Create an instance of TodoItem
        TodoItem todo = new TodoItem(1, "Change tires", "Change the tires before winter", LocalDate.of(2024, 7, 1), false, "John Doe");

        // Create an instance of Person
        Person person = new Person(2, "Jane", "Doe", "jane.doe@example.com");

        // Create an instance of TodoItemTask
        TodoItemTask task = new TodoItemTask(3, todo, person);

        // Get and print the summary of the todo item task
        System.out.println(task.getSummary());
    }
}
