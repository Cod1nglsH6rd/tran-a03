package baseline;

import java.util.Scanner;

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