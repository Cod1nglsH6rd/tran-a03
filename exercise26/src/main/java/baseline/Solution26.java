/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gialam Tran
 */

package baseline;
import java.util.Scanner;

public class Solution26 {
    public static void main(String args[])
    {
        paymentCalculator calculator = new paymentCalculator();
        Scanner in = new Scanner(System.in);
        double months;
        double balance, APR, monthlyPayment;

        System.out.print("What is your balance? ");
        balance = in.nextDouble();

        System.out.print("What is the APR on the card as a percent? ");
        APR = in.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        double minMonthlyPayment = in.nextDouble();

        double numMonths  = calculator.calculateMonthsUntilPaidOff(APR, balance,minMonthlyPayment);

        System.out.print("It will take you " + numMonths + " months to pay off this card.");
    }

}