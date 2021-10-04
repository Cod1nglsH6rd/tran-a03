/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */
package baseline;

import java.util.Scanner;
/*
Ask for inputs
    First name
    Last name
    ZIP code
    employee ID
Verify
    First name filled and at least 2 characters long
    Last name filled and at least 2 characters long
    Employee ID is in AA-1234 format
    ZIP is a number
Output either an error or confirmation
 */
public class Solution27 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        inputValidator validator = new inputValidator();

        String firstName, lastName, employeeID, zipCode;

        System.out.print("Enter the first name: ");
        firstName = input.nextLine();

        System.out.print("Enter the last name: ");
        lastName = input.nextLine();

        System.out.print("Enter the ZIP code: ");
        zipCode = input.nextLine();

        System.out.print("Enter the employee ID: ");
        employeeID = input.nextLine();

        String output = validator.validateInput(firstName,lastName, employeeID,zipCode);
        if(output.equals(""))
        {
            System.out.print("There were no errors found.");
        }
        else
        {
            System.out.print(output);
        }
    }
}