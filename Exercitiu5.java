package Tema2;
/*Write a program to Check whether the number is even or odd using switch statement,
tips: A even number is divided by 2 exactly.*/

import java.util.Scanner;

public class Exercitiu5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu  numarul (a): ");
        int a = scanner.nextInt();
        if(a%2==0){
            System.out.println("Number is divided by 2 exactly");
        }else {
            System.out.println("Number is odd");
        }

    }
}
