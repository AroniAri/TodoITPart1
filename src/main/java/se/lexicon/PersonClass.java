package se.lexicon;

public class PersonClass {

    private int id;
    private String firstName;
    private String lastName;
    private String email;


    public PersonClass(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("FirstName cannot be null");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("Lastname cannot be null");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email cannot be null");
        this.email = email;
    }

    public String getSummary() {
        return String.format("id: %d, name: %s %s, email: %s", this.id, this.firstName, this.lastName, this.email);
    }



    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person(4, "Nisse", "Olsson", "nisse@gmail.com");

        // Get and print the summary of the person
        System.out.println(person.getSummary());
    }
}






