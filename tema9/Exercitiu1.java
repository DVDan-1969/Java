
package tema9;

import java.util.Scanner;

public class Exercitiu1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter age:");
            int age = input.nextInt();
            if (age < 18) {
                throw new IllegalArgumentException("Access denied-Yoy must be at least 18");
            }
            System.out.println("Access granted-You are old enough");
        }catch (IllegalArgumentException e){
            System.out.println("Exception caught: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Invalid input!");

        }finally {
            System.out.println("Program ended.");
            input.close();
        }
    }
}