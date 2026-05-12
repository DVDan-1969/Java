package tema8_ex3;

import java.util.LinkedHashMap;

public class LoginHistory {
    public static void main(String[] args) {

        LinkedHashMap<String, String> users = new LinkedHashMap<>();

        users.put("user101", "08:15");
        users.put("user205", "08:20");
        users.put("user309", "08:35");
        users.put("user412", "08:50");

        users.put("user550", "09:05");

        System.out.println("Login History:");
        System.out.println(users);

        String firstUser = users.keySet().iterator().next();
        users.remove(firstUser);

        System.out.println("\nDupă eliminarea primului utilizator:");
        System.out.println(users);

        System.out.println("\nColecția este goală? " + users.isEmpty());
    }
}


