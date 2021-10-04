/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */

package baseline;

import java.util.ArrayList;
/*
Ask for names
Randomly pick a number out of the numbers of name given
Output the corresponding winner
 */
public class Solution35 {
    public static void main(String args[])
    {
        ArrayList<String> list = nameList.generateNamesList();
        String winner = nameList.generateWinningName(list);
        System.out.println("The winner is... " + winner + ".");
    }
}