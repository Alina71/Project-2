import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q10{
    /*
    How can you remove all duplicates from ArrayList
     */
    public static void main(String[] args) {
        ArrayList<String> duplicateList = new ArrayList<>();
        duplicateList.add("Ana");
        duplicateList.add("Dina");
        duplicateList.add("Rina");
        duplicateList.add("Ana");
        duplicateList.add("Luna");
        duplicateList.add("Vera");
        duplicateList.add("Dina");
        duplicateList.add("Vera");
        duplicateList.add("Luna");
        System.out.println("List with duplicates "+duplicateList);
        Set<String>set=new HashSet<>(duplicateList);
        List<String> withoutDuplicateList=new ArrayList<>(set);
        System.out.println("List without duplicates "+withoutDuplicateList);
    }
    }


