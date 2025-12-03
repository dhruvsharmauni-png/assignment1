import java.util.*;

public class RemoveDup {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println(remove(list));
    }

    static <T> List<T> remove(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();
        for (T x : list) {
            if (!seen.contains(x)) {
                seen.add(x);
                result.add(x);
            }
        }
        return result;
    }
}
