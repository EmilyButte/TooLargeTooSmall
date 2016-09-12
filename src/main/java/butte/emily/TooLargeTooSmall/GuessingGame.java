package butte.emily.TooLargeTooSmall;
//Write a guessing game where the user has to guess a secret number. After every guess the program tells the user
// whether their number was too large or too small. At the end the number of tries needed should be printed.
// It counts only as one try if they input the same number multiple times consecutively.

import java.util.Random;
import java.util.Scanner;

/**

 * Created by emilybutte on 9/10/16.
 */

public class GuessingGame {

    private int computerNumber;
    private int userNumber;
    private boolean win = false;
    private int numTries = 0;
    private int lastGuess;

    public void computerNumber() {
        Random randomNum = new Random();
        computerNumber = randomNum.nextInt(50);
    }

    public void userNumber() {
        System.out.println("Choose a number, 1-50.");
        Scanner myScanner = new Scanner(System.in);
        userNumber = myScanner.nextInt();
    }

    public void play() {
        computerNumber();
        while (!win) {
            userNumber();
            if (lastGuess != userNumber) {
                numTries++;
                if (userNumber == computerNumber) {
                    System.out.println("You win! It took you " + numTries +" tries");
                    win = true;
                } else if (userNumber > computerNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            } else {
                // This part isn't working
                System.out.println("You already guessed that number. Try another.");
            }
        }
    }

    public static void main(String[] args) {
        GuessingGame guessingGame = new GuessingGame();
        guessingGame.play();
    }
}


