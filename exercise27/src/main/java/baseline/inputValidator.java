/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */
package baseline;

import java.lang.*;

public class inputValidator {

    // checks if name is filled
    public static boolean nameFilled(String name)
    {
        if (name.trim().length() == 0) {
            return false;
        }
        return true;
    }
    // checks if name is at least 2 chars
    public static boolean nameMinLength(String name)
    {
        return name.length() >= 2;
    }

    // Checks if ID is in proper format
    public static String IDFormatIsValid(String EmployeeID)
    {
        String letters, numbers;
        char hyphen;
        boolean isValid = true;

        // checks if employee ID is proper length of 7 chars
        if(EmployeeID.length() != 7)
        {
            isValid = false;
        }
        else {
            // checks first two characters of string
            letters = EmployeeID.substring(0, 2);
            char[] letters_arr = letters.toCharArray();
            if (letters.length() != 2) {
                isValid = false;
            } else {
                // makes sure chars in front letters
                for (int i = 0; i < letters.length(); i++) {
                    if (Character.isDigit(letters_arr[i])) {
                        isValid = false;
                    }
                }
            }
            // checks for hyphen at correct position
            hyphen = EmployeeID.charAt(2);

            if (hyphen != '-') {
                isValid = false;
            } else {
                // makes
                numbers = EmployeeID.substring(3, 7);
                char[] num_array = numbers.toCharArray();
                for (int i = 0; i < numbers.length(); i++) {
                    if (!Character.isDigit(num_array[i])) {
                        isValid = false;
                    }
                }
            }
        }
        // returns error if ID is not valid
        if (isValid)
        {
            return "";
        }
        else
        {
            return "The employee ID must be in the format AA-1234.\n";
        }
    }

    // checks if zip code is valid
    public static String validZipCode(String zipCode)
    {
        // initialize error string
        String error = "The zipcode must be a 5 digit number.\n";
        if (zipCode.length() != 5)
        {
            return error;
        }
        else
        {
            char [] nums = zipCode.toCharArray();
            for(int i = 0; i < 5; i++)
            {
                if(!Character.isDigit(nums[i]))
                {
                    return error;
                }
            }
        }
        error = "";
        return error;

    }

    // validates input
    public static String validateInput(String firstName, String lastName, String EmployeeID, String zipCode) {
        String validationString = "";
        // create error messages
        if(!nameMinLength(firstName))
        {
            validationString += "The first name must be at least 2 characters long.\n";
        }
        if(!nameFilled(firstName))
        {
            validationString += "The first name must be filled in.\n";
        }
        if(!nameMinLength(lastName))
        {
            validationString += "The last name must be at least 2 characters long.\n";
        }
        if(!nameFilled(lastName))
        {
            validationString += "The last name must be filled in.\n";
        }

        validationString += IDFormatIsValid(EmployeeID);
        validationString += validZipCode(zipCode);

        return validationString;
    }
}