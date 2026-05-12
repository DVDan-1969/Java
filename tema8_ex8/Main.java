package tema8_ex8;
import java.util.ArrayList;
import java.util.List;
public class Main {
    // Generic method
    public static <E> void swapFirstAndLast(List<E> list) {

        // verificăm dacă lista are cel puțin 2 elemente
        if (list == null || list.size() < 2) {
            return;
        }

        // primul element
        E first = list.get(0);

        // ultimul element
        E last = list.get(list.size() - 1);

        // schimbarea elementelor
        list.set(0, last);
        list.set(list.size() - 1, first);
    }

    public static void main(String[] args) {

        // Test cu String
        List<String> names = new ArrayList<>();

        names.add("Ana");
        names.add("Maria");
        names.add("George");

        System.out.println("Before swap: " + names);

        swapFirstAndLast(names);

        System.out.println("After swap: " + names);


        // Test cu Integer
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Before swap: " + numbers);

        swapFirstAndLast(numbers);

        System.out.println("After swap: " + numbers);
    }
}


