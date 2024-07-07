import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerguess = 0;
        int secretNumber = 1 + (int) (100 * Math.random());

        int tries = 7;
        int i;

        System.out.println("Welcome to the number guessing game.");
        System.out.println("Try to guess the secret number selected between 1 and 100.");
        System.out.println("You have 7 guesses.");

        for (i = 0; i < tries; i++) {
            System.out.println("Guess the Number:");
            int remainingGuesses = (tries - (i + 1));

            playerguess = scanner.nextInt();

            if (secretNumber == playerguess) {
                System.out.println("Congratulations, you guessed the secret number!");
                System.out.println("You did it in " + (tries - remainingGuesses) + " guesses. Great job!");
                break;
            } else if (secretNumber > playerguess && i < tries - 1) {
                System.out.println("Your guess is too low.");
            } else if (secretNumber < playerguess && i < tries - 1) {
                System.out.println("Your guess is too high.");
            }
            if (remainingGuesses > 0) {
                System.out.println("You have " + remainingGuesses + " guesses remaining. Please guess again:");
            }
        }
        if (i == tries) {
            System.out.println("You have used up all of your guesses.");
            System.out.println("The correct number was " + secretNumber);

        }
        System.out.println("Thank you for playing");
        scanner.close();
    }
}
// generate random number 'secretNumber'
//set guesses take to zero
//while guesses taken < max guesses//ask player to take a guess and convert it to an int. increment guesses taken by 1
// guess = secret num, print, you win message, number of guesses, end game loop
// if guess is higher than secret, print your guess is too high
//if guess is lower than secret, print guess is to low message
// if layer reaches max guesses without getting the number, print run out of guesses message and correct number