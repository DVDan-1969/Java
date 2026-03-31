package Tema2;

import java.util.Scanner;


    /*Write a Java program to get a number from the user and print whether it is
    positive or negative.*/

    public class Exercitiu1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first number:");
            int number1 = scanner.nextInt();

            if (number1 > 0) {
                System.out.println("Number is positive");
            } else if (number1 < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }

            scanner.close();
        }
    }

