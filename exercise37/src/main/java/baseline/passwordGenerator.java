package baseline;

import java.util.Arrays;
import java.util.Random;

public class passwordGenerator {
    // create character arrays
    public static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public static char[] specialChars = "!@#$%^&*()+~`".toCharArray();
    public static char[] numbers = "0123456789".toCharArray();

    private static final Random random = new Random();

    public static char getRandomSpecialCharacter() {
        int randIndex = random.nextInt(specialChars.length - 1);
        return specialChars[randIndex];
    }

    public static char getRandomNumber() {
        int randIndex = random.nextInt(numbers.length - 1);
        return numbers[randIndex];
    }

    public static char getRandomLetter() {
        int randIndex = random.nextInt(alphabet.length - 1);
        return alphabet[randIndex];
    }


    public static boolean isUsed(char[] used, int index) {
        return (used[index] == 'x');
    }


    public static int generateRandomIndex(int minLength, char[] used) {
        int cur_index;
        do {
            cur_index = random.nextInt(minLength - 1);
        }
        while (isUsed(used, cur_index));
        used[cur_index] = 'x';

        return cur_index;
    }


    public static char[] generatePassword(int minLength, int numSpecialChars, int numCount) {
        char[] password = new char[minLength];
        char[] used = new char[minLength];

        // insert special chars as desired
        for (int i = 0; i < numSpecialChars; i++) {
            int curIndex = generateRandomIndex(minLength, used);
            password[curIndex] = getRandomSpecialCharacter();
        }
        // insert numbers as desired
        for (int i = 0; i < numCount; i++) {
            int curIndex = generateRandomIndex(minLength, used);
            password[curIndex] = getRandomNumber();
        }

        // insert remaining characters if min length not met
        if (numCount + numSpecialChars < minLength) {
            for (int i = 0; i < minLength; i++) {
                if (password[i] == 0) {
                    password[i] = getRandomLetter();
                }
            }
        }
        return password;
    }
}