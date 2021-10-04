/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */

package baseline;
/*
Create an array of employee and note the number of employee within the array
    John Smith
    Jackie Jackson
    Chris Jones
    Amanda Cullen
    Jeremy Goodwin
Ask for a name from the list
Remove the name from the list
Output the remaining names and number of employee left
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> employees = employeeList.initEmployeeList();

        employeeList.printEmployees(employees);

        System.out.print("Enter an employee name to remove: ");
        String employeeToRemove = input.nextLine();

        System.out.println();
        employeeList.removeEmployee(employees, employeeToRemove);
        employeeList.printEmployees(employees);
    }
}