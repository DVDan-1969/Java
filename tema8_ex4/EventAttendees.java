package tema8_ex4;

import java.util.HashSet;

public class EventAttendees {
    public static void main(String[] args) {

        HashSet<String> guests = new HashSet<>();

        // Adăugare invitați
        guests.add("John");
        guests.add("Sara");
        guests.add("Mike");
        guests.add("Alice");
        guests.add("John"); // duplicat

        System.out.println("Guest List:");
        System.out.println(guests);

        System.out.println("\nAlice este în listă? "
                + guests.contains("Alice"));

        System.out.println("\nNumăr invitați unici: "
                + guests.size());
    }
}
