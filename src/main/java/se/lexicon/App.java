package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person(4, "Nisse", "Olsson", "nisse@gmail.com");

        // Get and print the summary of the person
        System.out.println(person.getSummary());
    }
}
