
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */
package baseline;

 import java.util.Scanner;

public class monitor
{
    private static Scanner input = new Scanner(System.in);

    public static int getInput(String user_input_field)
    {
        double val = 0;
        while(val == 0)
        {
            System.out.print("Enter your " + user_input_field + ": ");
            val = input.nextDouble();

            try
            {
                double d = Double.parseDouble(String.valueOf(val));

            }
            catch(Exception e)
            {
                System.out.println("Enter a valid input.");
                val = 0;
                continue;
            }
        }
        return (int)Math.ceil(val);
    }

    public static int calcTargetHR(int age, int restingPulse, double intensity)
    {
        // convert to decimal by dividing 100
        intensity = intensity / 100;
        // carry out formula
        double targetHR = 220 - age;
        targetHR = targetHR - restingPulse;
        targetHR = targetHR * intensity;
        targetHR = targetHR + restingPulse;
        return (int)Math.rint(targetHR);

    }
}