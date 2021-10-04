/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */
package baseline;
/*
Ask for list of number with spaces between them
    Input [] = promptValues
Filter out the even number
    newValue [] = even numbers
    Count number of even numbers
Output the even numbers
 */
public class Solution38 {
    public static void main(String args[])
    {
        int [] originalValues = valFilter.promptValues();
        int [] newValues = valFilter.filterEvenNumbers(originalValues);
        System.out.print("The even numbers are");
        for (int newValue : newValues) {
            System.out.print(" " + newValue);
        }
        System.out.print(".");
    }
}