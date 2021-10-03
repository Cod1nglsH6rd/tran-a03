package baseline;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class magic8Ball {
    private static Scanner input = new Scanner(System.in);
    private static String[] answers = {"Yes", "No", "Maybe", "Ask again later"};

    public static int generateRandIndex()
    {
        // generates random number from 0 - 3
        return ThreadLocalRandom.current().nextInt(0, 4);
    }

    public static String generateRandomAnswer()
    {
        input.nextLine();
        int index = generateRandIndex();
        return answers[index];
    }
}