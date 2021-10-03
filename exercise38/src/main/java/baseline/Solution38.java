package baseline;

public class Solution38 {
    public static void main(String args[])
    {
        int [] originalValues = valFilter.promptValues();
        int [] newValues = valFilter.filterEvenNumbers(originalValues);
        System.out.print("The even numbers are");
        for (int newValue : newValues) {
            System.out.print(" " + newValue);
        }
        System.out.print(".");
    }
}