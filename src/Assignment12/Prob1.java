package Assignment12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prob1 {


    public static void main(String[] args) {
        try {
            int userScore = getScore();
            System.out.println("Score: " + userScore);
        } catch (InputMismatchException | UnsupportedOperationException e) {
            System.out.println("Error : " + e.getMessage());
        }

    }

    public static int getScore() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your score between 0 to 100");
            int input = sc.nextInt();

            if (input < 0 || input > 100) {
                throw new UnsupportedOperationException("Score must be in the range of 0 to 100.");
            }

            return input;
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid input. Please enter an integer value.");
        } finally {
            sc.close();
        }
    }
}
