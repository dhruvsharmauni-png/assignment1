import java.util.*;

public class SubSetCheck {
    public static void main(String[] a) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(s2.containsAll(s1));
    }
}
