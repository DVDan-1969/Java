package Tema2;
/*Write a program that accepts three numbers from the user and     check if numbers are in
"increasing" or "decreasing" order*/
import java.util.Scanner;

public class Exercitiu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a:");
        int a = scanner.nextInt();
        System.out.println("Enter number b:");
        int b = scanner.nextInt();
        System.out.println("Enter number c:");
        int c = scanner.nextInt();
        if (a < b && b < c) {
            System.out.println("Strict crescatoare");
        } else if (a > b && b > c) {
            System.out.println("Strict descrescatoare");
        } else {
            System.out.println("Nu sunt strict ordonate");
        }
    }
}
