package src.week_2;

import java.util.Scanner;

public class tema1 {
    public static void main(String[] args) {
        /*Write a program that prints your name,age and favorite color on three separate lines*/
        System.out.println("My name is Dudas Viorel Dan");
        System.out.println("My favorite color is blue");
        System.out.println("I am 55");
    /*Write a program that defines four different values(an integer,a double,a character and a string)
    assign them values and then print them out.*/
        String myColor = "blue";
        System.out.println(myColor);
        int myNumber = 5;
        System.out.println(myNumber);
        char myLetter = 'A';
        System.out.println(myLetter);
        boolean myBool = true;
        System.out.println(myBool);
        byte myByte = 1;
        System.out.println(myByte);
        short myShort = 2;
        System.out.println(myShort);
        double myDouble = 3.14;
        System.out.println(myDouble);
    /*Write a program that performs various operations (addition, subtraction, multiplication,
    division, and modulus) on two numbers. The numbers can be hard-coded into the program.
    Print the result of each operation.*/
        double a = 8;
        double b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    /*Write a program that asks the user to enter two numbers, performs addition on those
    numbers,and prints out the result.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();
        int suma = number1 + number2;
        System.out.println(suma);

    }
}
    
