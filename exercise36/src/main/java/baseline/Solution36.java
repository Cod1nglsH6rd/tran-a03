package baseline;

import java.util.ArrayList;

public class Solution36 {
    public static void main(String args[])
    {
        ArrayList<Integer> numbers = statisticsCalculator.getNumbers();

        // calculate all values for given numbers
        double average = statisticsCalculator.average(numbers);
        double max = statisticsCalculator.max(numbers);
        double min = statisticsCalculator.min(numbers);
        double standardDeviation = statisticsCalculator.std(numbers);

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
        System.out.printf("The standard deviation is %.2f\n", standardDeviation);
    }
}