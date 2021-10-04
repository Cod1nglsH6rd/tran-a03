/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gialam Tran
 */
package baseline;
/*
Ask for 2 strings
Compare the 2 to see if number is character match
Compare the 2 to see if the characters are the same
Output whether it's an anagram or not
 */
import java.util.*;

public class Solution24 {
    static boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String str1=input.nextLine();

        System.out.print("Enter the second string: ");
        String str2=input.nextLine();
        if(isAnagram(str1,str2))
            System.out.println(str1 + " and " + str2 + " are anagrams");
        else
            System.out.println(str1 + " and " + str2 + " are not anagrams");


    }
}