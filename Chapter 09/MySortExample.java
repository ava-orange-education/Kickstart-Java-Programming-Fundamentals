import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MySortExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Neo");
        names.add("Trinity");
        names.add("Morpheus");

        // Natural order sorting
        Collections.sort(names);
        System.out.println("Sorted in natural order: " + names);

        // Custom order sorting
        Collections.sort(names, Comparator.reverseOrder());
        System.out.println("Sorted in reverse order: " + names);
    }
}
