import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {
            int randomNumber = random.nextInt(100) + 1;  // Generate a random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10;

            System.out.println("I have selected a number between 1 and 100. Try to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    break;
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("You've used all your attempts! The correct number was " + randomNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
