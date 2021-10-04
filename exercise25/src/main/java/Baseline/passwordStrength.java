/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */

package Baseline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordStrength {

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
            if(onlyNumbers(charArray))
            {
                strength = "very weak";
            }
            else if(onlyCharacters(charArray))
            {
                strength = "weak";
            }
        }
        else
        {
            if(!specialCharacters(password) && getNumCount(charArray) >= 1 && getCharCount(charArray) > 0)
            {
                strength = "strong";
            }
            else if(specialCharacters(password))
            {
                strength = "very strong";
            }
        }
        return strength;
    }
}