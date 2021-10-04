/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */
package Baseline;
import java.util.Scanner;
/*
Ask for the password
Filter the password
    Only numbers
        Very Weak
    Only letters and less than 8 characters
        Weak
    Letters and number with more than 8 chars
        Strong
    Letters numbers and special character that is more than 8
        Very Strong
Output the strength of the password.
 */

public class Solution25{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("Enter a password to determine its strength: ");
        password = input.nextLine();

        String strength = passwordStrength.getPasswordStrength(password);

        System.out.println("The password " + "'" + password + "'" + " is a " + strength + " password.");
    }
}