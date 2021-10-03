package baseline;

import java.util.Scanner;

public class Solution37 {

    private static final Scanner input = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Welcome to password generator! \nRemember to leave room for extra letters after special characters and numbers.");

        // prompts for min length
        System.out.print("What is the minimum length? ");
        int minLength = input.nextInt();

        // prompts for number of special characters
        System.out.print("How many special characters? ");
        int numSpecialChars = input.nextInt();

        // prompts for number of numerical chars
        System.out.print("How many numbers? ");
        int numCount = input.nextInt();

        // ensures values do not exceed min length
        if(minLength <= numCount+ numSpecialChars)
        {
            System.out.println("Make sure you leave room for letters!");
            return;
        }
        else if(minLength < numCount || minLength < numSpecialChars)
        {
            System.out.println("Cannot exceed minimum length!");
            return;
        }

        char[] potentialPassword = passwordGenerator.generatePassword(minLength,numSpecialChars,numCount);
        String password = new String(potentialPassword);
        System.out.print("Your password is " + password);

    }
}