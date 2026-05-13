package tema8_ex2;

import java.util.TreeMap;

public class ContactDirectory {
    public static void main(String[] args) {

        TreeMap<String, String> contacts = new TreeMap<>();

        contacts.put("Zoe", "0741111111");
        contacts.put("Bob", "0722222222");
        contacts.put("Alice", "0733333333");
        contacts.put("Mike", "0754444444");
        contacts.put("Charlie", "0765555555");

        // Afișare sortată
        System.out.println(contacts);

        // Primul element
        System.out.println("Prima persoană: " + contacts.firstKey());

        // Inserare cheie null
        //contacts.put(null, "0700000000");
    }
}
//I get error NullP0interException.


