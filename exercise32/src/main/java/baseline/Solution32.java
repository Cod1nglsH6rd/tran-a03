/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */
package baseline;
/*
Ask for the level of difficulty
    Level 1 = 1-10
    Level 2 = 1-100
    Level 3 = 1-1000
Randomize the number that is being guessed
Ask for their guess
Compare the guess and their guess
If too low
    Output their guess is too low
If too high
    Output their guess is too high
If correct
    Output the number of guesses they took and that they got it right.
 */
public class Solution32
{
    public static void main(String[] args)
    {
        // initalize variables
        int difficulty, randNum, guess;

        // set status to playing
        boolean isPlaying = true;

        while(isPlaying)
        {
            // prompt user for difficulty
            System.out.println("Let's play guess the number!");
            System.out.println("Enter the difficulty level (1, 2, 3): ");
            difficulty = guessingGame.getDifficulty();

            // generate random number according to difficulty
            randNum = guessingGame.getRandNum(difficulty);

            System.out.print("I have my number. What's your guess? ");
            guess = guessingGame.getGuess();
            int guessCount = 1;
            // re-prompt user if guess is incorrect
            while(!guessingGame.checkGuess(guess, randNum).equals("You got it "))
            {
                System.out.print(guessingGame.checkGuess(guess, randNum));
                guess = guessingGame.getGuess();
                guessCount += 1;
            }
            System.out.print(guessingGame.checkGuess(guess, randNum));

            // ask user for replay
            System.out.print("do you want to play again? (y/n) ");
            char choice= guessingGame.getChoice();

            if(choice == 'n')
            {
                isPlaying = false;
            }
        }
    }
}