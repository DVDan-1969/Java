package tema9;
import java.util.Scanner;

class InvalidScoreException extends Exception {

    public InvalidScoreException(String message) {
        super(message);
    }
}

public class Exercitiu2 {
    static void validateScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {

            throw new InvalidScoreException(
                    "Invalid score! Score must be between 0 and 100."
            );
        }

        System.out.println("Exam registration successful!");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter exam score: ");
            int score = input.nextInt();

            validateScore(score);

        } catch (InvalidScoreException e) {

            System.out.println("Custom Exception caught:");
            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid input!");

        } finally {

            System.out.println("Program finished. Thank you!");

            input.close();
        }
    }
}



