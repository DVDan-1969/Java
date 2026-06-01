package tema11;

import java.util.Arrays;
import java.util.List;

public class StringProcessing {
    public static void main(String[] args) {
        List<String> user_names = Arrays.asList("John","Dan","Andrew","Robinson","Michael","Ana");
        user_names.stream()
                .distinct()
                .filter(name -> name.length() >=4)
                .map(String::toUpperCase)
                .sorted()
                .toList()
                .forEach(System.out::println);

    }
}
