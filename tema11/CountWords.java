package tema11;

import java.util.Arrays;
import java.util.List;

public class CountWords {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("masina","casa","ascendent","descendent");
        long count= words.stream()
                .filter(word -> word.length()>5)
                .count();
        System.out.println("Count:"+ count);
    }
}
