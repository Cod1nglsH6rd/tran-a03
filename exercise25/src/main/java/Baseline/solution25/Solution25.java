/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gialam Tran
 */

package Baseline.solution25;
import java.util.Scanner;


pubilc class solution25{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        passwordStrength indicator = new PasswordStrength();
        String password, strength;

        System.out.print("Enter a password to determine its strength: ");
        password = in.nextLine();

        passwordStrength = indicator.getPasswordStrength(password);

        System.out.println("The password " + "\'" + password + "\'" + " is a " + strength + " password.");
    }
}
    }
            }