/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class statisticsCalculator
{
    private static final Scanner input = new Scanner(System.in);

    public static ArrayList<Integer> getNumbers()
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String buffer;
        do
        {
            // repeatedly prompt user for numbers
            System.out.print("Enter a number: ");
            buffer = input.nextLine();
            // breaks loop if user enters 'done'
            if(buffer.equals("done"))
            {
                break;
            }
            else
            {
                try {
                    int cur_num = Integer.parseInt(buffer);
                    nums.add(cur_num);
                }
                // catches non numeric data
                catch(NumberFormatException e)
                {
                    System.out.println("Please enter numeric data or \"done\" if done");
                    continue;
                }
            }
        }
        while(!buffer.equals("done"));
        // return array list
        return nums;
    }

    public static double average(ArrayList<Integer> numbers) {
        int total = 0;
        for(int num: numbers) {
            total += num;
        }
        double avg = (double)(total)/numbers.size();
        return avg;
    }
    public static int max(ArrayList<Integer> numbers) {
        int max= numbers.get(0);

        for(int num: numbers) {
            if(num > max)
                max = num;
        }

        return max;
    }
    public static int min(ArrayList<Integer> numbers) {
        int min= numbers.get(0);

        for(int num: numbers) {
            if(num < min)
                min = num;
        }

        return min;
    }
    public static double std(ArrayList<Integer> numbers) {
        double mean = average(numbers);

        double sum = 0;
        for(int num: numbers) {
            sum = sum + Math.pow((num-mean), 2);
        }
        double stdDev = Math.sqrt(sum/numbers.size());

        return stdDev;
    }

}