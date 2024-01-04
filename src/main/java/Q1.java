public class Q1 {

    /*
    Write a program to swap 2 String without a temporary variable
     */
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "There";
        System.out.println("Strings before swapping: " + str1 + " " + str2);
        str1 = str1 + str2;
        str2 = str1.substring(0, (str1.length() - str2.length()));
        str1 = str1.substring(str2.length());

        System.out.println("Strings after swapping: " + str1 + " " + str2);
    }
}
