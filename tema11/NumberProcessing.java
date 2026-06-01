package tema11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberProcessing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 22, 3, 41, 5, 62, 7, 18, 95, 10);
        numbers.stream()
                .filter(number -> number >10)
                .map(number -> number * 2)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList()
                .forEach(System.out::println);
    }
}
