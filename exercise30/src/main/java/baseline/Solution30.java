/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */
package baseline;
/*
Create a loop within a loop
Loop J in I and have them increment and multiple with each other
    Output with /n and the end of 12 I
    Have even spaces between them for make them even
 */
public class Solution30 {
    public static void main(String args[])
    {

        for(int i = 1; i <= 12; i++)
        {
            for(int j = 1; j <= 12; j++){
                System.out.print(j * i + "\t");
            }
            System.out.print("\n");
        }
    }
}