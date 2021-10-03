package baseline;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class nameList {
    private static Scanner input = new Scanner(System.in);

    public static ArrayList<String> generateNamesList()
    {
        // prompts user to enter names in do while loop
        ArrayList<String> namesList = new ArrayList<String>();
        String cur_name;
        do{
            System.out.print("Enter a name: ");
            cur_name = input.nextLine();
            // adds each name to array list
            namesList.add(cur_name);
        }
        while(!cur_name.trim().isEmpty());
        return namesList;
    }


    public static String generateWinningName(ArrayList<String> names)
    {
        // randomly generates a winning name
        int max = names.size();
        int randIndex = ThreadLocalRandom.current().nextInt(0, max);
        return names.get(randIndex);
    }

}