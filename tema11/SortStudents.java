package tema11;

import java.util.Arrays;
import java.util.List;

public class SortStudents {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("John","Dan","Andrew","Robinson","Michael");
        names.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
