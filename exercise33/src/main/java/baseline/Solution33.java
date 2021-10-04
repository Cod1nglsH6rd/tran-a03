/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */

package baseline;
/*
Four possible choices
    Yes
    No
    Maybe
    Ask later
Let the user ask a question
Randomly pick
Output the "answer to their question"
 */
public class Solution33 {
    public static void main(String args[])
    {
        System.out.println("Ask the Magic 8 ball a question! ");
        String output = magic8Ball.generateRandomAnswer();
        System.out.print(output);
    }

}