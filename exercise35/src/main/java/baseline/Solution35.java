package baseline;

import java.util.ArrayList;

public class Solution35 {
    public static void main(String args[])
    {
        ArrayList<String> list = nameList.generateNamesList();
        String winner = nameList.generateWinningName(list);
        System.out.println("The winner is... " + winner + ".");
    }
}