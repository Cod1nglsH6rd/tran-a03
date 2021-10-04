/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */
package baseline;
/*
Ask for inputs
    Age
    Resting Pulse
Verify it is numbers
Loop the calculation and output to create and pattern of output
Have - and | to keep it organized
 */
public class Solution31 {
    public static void main(String args[])
    {
        monitor inputManager = new monitor();

        // prompt user for data
        int age = inputManager.getInput("age");
        int restingPulse = inputManager.getInput("resting heart rate");
        int currentIntensity = 55;

        // Print data
        System.out.println("Resting Pulse: " + restingPulse + "\t\t\tAge: " + age);
        System.out.println("Intensity\t| Rate");
        System.out.println("----------------------");

        // update intensity and print output
        while (currentIntensity <= 95)
        {
            System.out.printf("%d%%\t\t\t| %d bpm\n", currentIntensity, inputManager.calcTargetHR(age,restingPulse,currentIntensity));
            currentIntensity += 5;
        }
    }
}