package TaskCodeway;

import java.util.Scanner;

// Task 1

public class task1 {
    public static int generateRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int totalRounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + minRange + " and " + maxRange + ".");

        boolean playAgain = true;
        while (playAgain) {
            int secretNumber = generateRandomNumber(minRange, maxRange);
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
                int userGuess = sc.nextInt();

                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }

                attempts++;
            }

            totalAttempts += attempts;
            totalRounds++;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = sc.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }
        sc.close();

        System.out.println("Thanks for playing!");
        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Total attempts: " + totalAttempts);
    }
}
