package Tema2;

/*Write a program to read a weekday number and print weekday name     using     switch
statement */
import java.util.Scanner;

public class Exercitiu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu un numar (1-7):");
        int zi = scanner.nextInt();

        switch (zi) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Numar invalid!");
        }

        scanner.close();
    }
}

