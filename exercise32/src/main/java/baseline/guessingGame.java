/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */
package baseline;

import java.util.Scanner;

public class guessingGame
{
    private static final Scanner input = new Scanner(System.in);

    public static int getDifficulty()
    {
        // ensures input is between difficulty of  1 and 3
        int difficulty = 0;
        while(!(difficulty >= 1) && (difficulty <= 3))
        {
            difficulty = input.nextInt();
        }
        return difficulty;
    }

    public static int getRandNum(int difficulty)
    {
        // determines guessing range based on chosen difficulty
        int range = switch (difficulty) {
            case 2 -> 101;
            case 3 -> 1001;
            default -> 11;
        };
        // returns random number for user to guess for
        return (int)Math.abs(Math.round(Math.random() * (range - 1) + 2));
    }

    public static int getGuess()
    {
        // ensures users only enter ints as input
        int guess = -1;
        while(guess == -1)
        {
            try
            {
                guess = input.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Please enter numbers only.");
                guess = -1;
                continue;
            }
        }
        return guess;
    }

    public static String checkGuess(int guess, int ans)
    {
        if(ans > guess)
        {
            return "Too low. Guess again ";
        }
        if(ans < guess)
        {
            return "too high. Guess again: ";
        }
            return "You got it !";
    }

    public static char getChoice()
    {
        // trims input to single char
        char choice = input.next().charAt(0);

        // ensures choice is y or n (valid input)
        while(choice != 'y' && choice != 'n')
        {
            System.out.println("Please enter y/n: ");
            choice = input.next().charAt(0);
            if(choice == 'y' || choice == 'n')
            {
                return choice;
            }
        }
        // if all else fails assume n.
        return 'n';
    }
}