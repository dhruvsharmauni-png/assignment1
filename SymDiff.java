import java.util.*;

public class SymDiff {
    public static void main(String[] a) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> r = new HashSet<>(s1);
        r.addAll(s2);

        Set<Integer> inter = new HashSet<>(s1);
        inter.retainAll(s2);

        r.removeAll(inter);
        System.out.println(r);
    }
}
