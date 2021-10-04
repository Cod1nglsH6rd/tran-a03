/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */
package baseline;

import java.util.Scanner;
/*
Ask for an input
Verify that it is a number and is higher than 0
Either ask for another input or output result
 */
public class Solution29
{
    private static Scanner in = new Scanner(System.in);

    public static int calcYrsToDoubleInvestment(double r)
    {
        return (int)Math.ceil(72/r);
    }

    public static void main(String args[])
    {
        double r = -1;
        while(r == - 1 || r == 0)
        {
            // catches any invalid input (r = 0)
            try
            {
                System.out.print("What is the rate of return: ");
                r = in.nextInt();
            }
            catch(Exception e)
            {
                in.nextLine();
                System.out.println("Sorry that's not valid input\n");
            }
            if(r == 0)
            {
                System.out.print("Sorry. 0 is not a valid input.\n");
            }
        }
        // calculate number of years via aux function
        int numYrs = calcYrsToDoubleInvestment(r);
        // print output
        System.out.println("It will take " + numYrs + " years to double your initial investment\n");
    }
}