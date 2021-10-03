package baseline;

import java.util.ArrayList;

public class employeeList
{
    public static ArrayList<String> initEmployeeList()
    {
        // generate employees list
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        return employees;
    }
    public static void removeEmployee(ArrayList<String> employees, String employeeName)
    {
        // get removal index based on name argument
        int removalIndex = employees.indexOf(employeeName);
        // remove corresponding employee
        employees.remove(removalIndex);
    }

    public static void printEmployees(ArrayList<String> employees)
    {
        // print employees list as per specifications
        int numEmployees = employees.size();
        System.out.printf("There are %d employees:\n", numEmployees);
        for(int i = 0; i < numEmployees; i++)
        {
            System.out.println(employees.get(i));
        }
    }
}