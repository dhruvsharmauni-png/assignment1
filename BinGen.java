import java.util.*;

public class BinGen {
    static List<String> gen(int n) {
        List<String> r = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n-- > 0) {
            String s = q.remove();
            r.add(s);
            q.add(s + "0");
            q.add(s + "1");
        }
        return r;
    }

    public static void main(String[] a) {
        System.out.println(gen(5));
    }
}
