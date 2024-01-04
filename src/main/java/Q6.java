public class Q6 {
    /*
Create a method to count how many vowels are present in a string
“documentation”
 */
    public static void main(String[] args) {
        String vowels = "documentation";
        int count = 0;
        vowels = vowels.toLowerCase();
        for (int i = 0; i < vowels.length(); i++) {
            char c = vowels.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("In this string there are "+count+ " vowels.");
    }
}

