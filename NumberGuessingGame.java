import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a number between 1 and 100. Try to guess it.");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess < lowerBound || guess > upperBound) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < secretNumber) {
                System.out.println("Try a higher number.");
            } else if (guess > secretNumber) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
                break;
            }
        }

        scanner.close();
    }
}
