package tema9;

import java.util.Scanner;

class PasswordValidationException extends Exception {

    public PasswordValidationException(String message) {
        super(message);
    }
}

public class Exercitiu3 {

    static void validatePassword(String password)
            throws PasswordValidationException {

        if (password.length() < 8) {
            throw new PasswordValidationException(
                    "Password must contain at least 8 characters!");
        }

        System.out.println("Password accepted.");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Insert your password: ");
            String password = input.nextLine();

            validatePassword(password);

        } catch (PasswordValidationException e) {

            System.out.println("Exception caught:");
            System.out.println(e.getMessage());

        } finally {

            System.out.println("Program finished. Thank you!");
            input.close();
        }
    }
}

