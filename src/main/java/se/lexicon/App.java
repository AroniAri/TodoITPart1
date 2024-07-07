package se.lexicon;




public class App {
    public static void main(String[] args) throws InterruptedException {
        // Create an instance of AppUser
        AppRole ROLE_APP_USER;
        ROLE_APP_USER = new AppUserDemo().getRole();
        AppUserDemo user1 = new AppUserDemo();
        AppUserDemo user2 = new AppUserDemo();

        // Print the users
        System.out.println(user1);
        System.out.println(user2);

        System.out.println("Are users equal? " + user1.equals(user2));


        System.out.println("User1 hash code: " + user1.hashCode());
        System.out.println("User2 hash code: " + user2.hashCode());



    }
}




