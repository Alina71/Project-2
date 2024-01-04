import java.util.Arrays;

public class Q5 {
    /*
    Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
     */
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("The string are not anagram.");
        }
        else {
            char[] string1=str1.toCharArray();
            char[] string2=str2.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);
            if(Arrays.equals(string1, string2)){
                System.out.println("The strings are anagram.");
            }else{
                System.out.println("The strings are not anagram.");
            }
        }
    }
}




