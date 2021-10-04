/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */
package baseline;

import java.util.Scanner;
/*
Ask for 5 numbers
Add the 5 numbers together
Output the sum
 */
public class Solution28
{
    private static Scanner in = new Scanner(System.in);

    public static void main(String args[])
    {
        System.out.println("Please enter 5 numbers");
        // initializes sum to 0
        int sum = 0;
        // prompts user for number 5 times
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            // adds user input to sum
            sum += in.nextInt();
        }
        System.out.println("The total is " + sum + ".");
    }
}