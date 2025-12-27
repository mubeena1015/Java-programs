import java.util.Scanner;
import java.util.Random;

class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(10) + 1; // 1 to 10
        int guess;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 10");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                break; // Exit loop when correct
            } else if (guess < secretNumber) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("Too High! Try again.");
            }
        }

        sc.close(); // Close scanner
    }
}
