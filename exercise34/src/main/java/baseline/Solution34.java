package baseline;

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