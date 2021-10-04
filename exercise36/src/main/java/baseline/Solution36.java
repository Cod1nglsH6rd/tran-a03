/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */

package baseline;

import java.util.ArrayList;
/*
Ask for numbers
Wait for the input "done"
Calculate the average
Compare the numbers and determine the minimum and maximum
Calculate the STD
Output
 */
public class Solution36 {
    public static void main(String args[])
    {
        ArrayList<Integer> numbers = statisticsCalculator.getNumbers();

        // calculate all values for given numbers
        double average = statisticsCalculator.average(numbers);
        double max = statisticsCalculator.max(numbers);
        double min = statisticsCalculator.min(numbers);
        double std = statisticsCalculator.std(numbers);

        // print numbers array list
        System.out.print("Numbers: ");
        char comma = ',';
        for(int i = 0; i < numbers.size(); i++)
        {   if(i == numbers.size() - 1)
        {
            comma = ' ';
        }
            System.out.printf("%d%c ", numbers.get(i), comma);
        }
        // prints final output
        System.out.println();

        System.out.printf("The average is %.2f.\n", average);
        System.out.printf("The minimum is %d\n", (int)min);
        System.out.printf("The maximum is %d\n", (int)max);
        System.out.printf("The standard deviation is %.2f\n", std);
    }
}