/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gialam Tran
 */

package Baseline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class passwordStrengthIndicator {

    public static boolean onlyNumbers(char[] chars)
    {
        for(int i = 0; i < chars.length; i++)
        {
            if(!(Character.isDigit(chars[i])))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean onlyCharacters(char[] chars)
    {
        for(int i = 0; i <chars.length; i++)
        {
            if (Character.isDigit(chars[i]))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean specialCharacters(String chars)
    {
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(chars);

        return m.find();
    }

    public static int getNumCount(char[] chars)
    {
        int numCount = 0;
        for(int i = 0; i < chars.length; i++)
        {
            if(Character.isDigit(chars[i]))
            {
                numCount++;
            }
        }
        return numCount;
    }

    public static int getCharCount(char [] chars)
    {
        int charCount = 0;
        for(int i = 0; i < chars.length; i++)
        {
            if(!(Character.isDigit(chars[i])));
            {
                charCount++;
            }
        }
        return  charCount;
    }

    public static String getPasswordStrength(String password)
    {
        String strength = "null";
        char [] charArray = password.toCharArray();
        if(password.length() < 8)
        {
            if(hasOnlyNumbers(charArray))
            {
                strength = "very weak";
            }
            else if(hasOnlyCharacters(charArray))
            {
                strength = "weak";
            }
        }
        else
        {
            if(!hasSpecialCharacters(password) && getNumberCount(charArray) >= 1 && getCharCount(charArray) > 0)
            {
                strength = "strong";
            }
            else if(hasSpecialCharacters(password))
            {
                strength = "very strong";
            }
        }
        return strength;
    }
}