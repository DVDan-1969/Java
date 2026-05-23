package tema10_ex3;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //print a message
        Runnable message = () -> System.out.println("Hello");
        message.run();

        //print a student name
        Consumer<String> printStudent = name -> System.out.println("Student" + name);
        printStudent.accept("Dan Dudas");

        //return average of two double numbers
        BiFunction<Double,Double,Double> average = (a,b)->(a+b) /2;
        double result = average.apply(8.5,9.5);
        System.out.println(result);

        //check if numbers is even
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));

        //return current message
        Supplier<String> currentMessage =
                () -> "Current message from lambda";
        System.out.println(currentMessage.get());

        //Return maximum from 2 double params
        BiFunction<Double, Double, Double> max =
                (a, b) -> Math.max(a, b);
        double result2 = max.apply(10.5, 7.2);
        System.out.println("Maximum = " + result2);

        //Print an array element
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, };
        Consumer<Integer>printElement = x->System.out.println(x);
        for (Integer i : numbers) {
            printElement.accept(i);
        }

        //Check empty strings
        Predicate<String> isEmpty = s -> s == null || s.isEmpty();
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("Hello"));
        System.out.println(isEmpty.test(null));

        //compare 2 strings
        BiPredicate<String, String> areEqual =(s1, s2) -> s1.equals(s2);
        System.out.println(areEqual.test("hello", "hello"));
        System.out.println(areEqual.test("hello", "hi"));



    }
}
