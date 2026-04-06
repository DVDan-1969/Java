package src.week_3;

import java.util.Scanner;

/* Use the String class to write a program that reverses an input string. For example,
 the input "hello" should return "olleh". */

public class Exercitiu6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String original = sc.nextLine();
        String inversat ="";
        for (int i = original.length() - 1; i >= 0; i--) {
            inversat +=original.charAt(i);
        }
        System.out.print(inversat);

    }
}
