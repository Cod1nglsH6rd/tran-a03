package baseline;

import java.util.Scanner;

public class valFilter {
    private static Scanner input = new Scanner(System.in);
    public static int[] promptValues()
    {
        String user_input;
        // prompts user for values
        System.out.print("Enter a list of numbers, separated by spaces: ");
        user_input = input.nextLine();
        String [] buffer = user_input.split(" ");

        int [] values = new int[buffer.length];
        // parses ints from user data
        for(int i = 0; i < buffer.length; i++)
        {
            values[i] = Integer.parseInt(buffer[i]);
        }
        return values;
    }

    public static int [] filterEvenNumbers(int[] oldVals)
    {
        int [] bufferValues = new int[oldVals.length];
        int evenCount = 0;
        //iterates through and generates count of even numbers
        for (int oldVal : oldVals) {
            if (oldVal % 2 == 0 && oldVal != 0) {
                evenCount++;
            }
        }

        int [] newVals = new int[evenCount];
        // creates a new array of even vals
        for (int oldVal : oldVals) {
            if (oldVal % 2 == 0 && oldVal != 0) {
                int j = 0;
                while (newVals[j] != 0) {
                    j++;
                }
                newVals[j] = oldVal;
            }
        }
        return newVals;
    }

}