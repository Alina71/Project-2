import java.util.ArrayList;
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
          List<String> duplicateListWithoutDuplicates = new ArrayList<>();
        for (String list : duplicateList) {
            if (!duplicateListWithoutDuplicates.contains(list)) {
                duplicateListWithoutDuplicates.add(list);
            }
        }
        System.out.println("Original list without duplicates: "+duplicateListWithoutDuplicates);

    }
}





