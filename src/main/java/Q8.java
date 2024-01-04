import java.util.ArrayList;

public class Q8 {
    /*
    You have a list of strings and you want to keep only those that start with
“A” and you want to return them in lower case"
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Liza");
        names.add("Antonia");
        names.add("Lilia");
        names.add("Ariana");
        for (int i = 0; i < names.size(); i++) {
            String s = names.get(i);
            if (s.startsWith("A")) {
                System.out.println(s.toLowerCase());
            }
        }
    }
}

