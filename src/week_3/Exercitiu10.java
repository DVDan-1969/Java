package src.week_3;

import java.util.Scanner;

/*Write a program that checks whether a given string is a palindrome.*/
public class Exercitiu10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String original = sc.nextLine();
        String inversat ="";
        for (int i = original.length() - 1; i >= 0; i--) {
            inversat +=original.charAt(i);
        }
        if (original.equals(inversat)) {
            System.out.println("The string is palindrome");
        }else {
            System.out.println("The string is not palindrome");
        }
    }
}
