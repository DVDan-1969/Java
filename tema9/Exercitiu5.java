package tema9;

import java.util.Scanner;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}
public class Exercitiu5 {

    static void validateAge(int age)
            throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                    "Age must be at least 18."
            );
        }
    }
    static void validateUsername(String username)
            throws InvalidUsernameException {

        if (username.length() < 5) {
            throw new InvalidUsernameException(
                    "Username must contain at least 5 characters."
            );
        }
    }
    static void validatePassword(String password)
            throws InvalidPasswordException {

        if (password.length() < 8) {
            throw new InvalidPasswordException(
                    "Password must contain at least 8 characters."
            );
        }
    }
    static void validateGrade(double grade)
            throws InvalidGradeException {

        if (grade < 1 || grade > 10) {
            throw new InvalidGradeException(
                    "Grade must be between 1 and 10."
            );
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Enter username: ");
            String username = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

            System.out.print("Enter grade: ");
            double grade = input.nextDouble();


            validateAge(age);
            validateUsername(username);
            validatePassword(password);
            validateGrade(grade);

            System.out.println("Student registration successful!");

        } catch (InvalidAgeException e) {

            System.out.println("Age Exception:");
            System.out.println(e.getMessage());

        } catch (InvalidUsernameException e) {

            System.out.println("Username Exception:");
            System.out.println(e.getMessage());

        } catch (InvalidPasswordException e) {

            System.out.println("Password Exception:");
            System.out.println(e.getMessage());

        } catch (InvalidGradeException e) {

            System.out.println("Grade Exception:");
            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid input!");
            System.out.println(e.getMessage());

        } finally {

            System.out.println("Thank you for using the registration system!");
            input.close();
        }
    }
}

