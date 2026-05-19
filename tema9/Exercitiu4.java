package tema9;

import java.util.Scanner;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String message) {
        super(message);
    }
}

public class Exercitiu4 {
    static void validateSeat(int seatNumber)
            throws InvalidSeatException {

        if (seatNumber < 1 || seatNumber > 50) {
            throw new InvalidSeatException(
                    "Invalid seat number! Valid seats are between 1 and 50."
            );
        }

        System.out.println("Seat reserved successfully!");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter seat number: ");
            int seatNumber = input.nextInt();

            validateSeat(seatNumber);

        } catch (InvalidSeatException e) {

            System.out.println("Custom exception caught:");
            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid input!");
            System.out.println(e.getMessage());

        } finally {

            System.out.println("Reservation session closed.");
            input.close();
        }
    }
}

