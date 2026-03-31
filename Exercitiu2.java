package Tema2;

/*Write a Java program that reads a floating-point number and prints "zero" if the number
is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of
the number is less than 1, or "large" if it exceeds 1,000,000.*/

import java.util.Scanner;

public class Exercitiu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a floating-point number:");
        float number2 = scanner.nextFloat();

        if (number2 == 0) {
            System.out.println("zero");
        } else {
            if (number2 > 0) {
                System.out.print("positive ");
            } else {
                System.out.print("negative ");
            }

            float abs = Math.abs(number2);

            if (abs < 1) {
                System.out.println("small");
            } else if (abs > 1_000_000) {
                System.out.println("large");
            } else {
                System.out.println("not in range");
            }
        }

        scanner.close();
    }
}

