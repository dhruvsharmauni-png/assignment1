import java.util.*;

public class FreqMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(freq(list));
    }

    static Map<String, Integer> freq(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list)
            map.put(s, map.getOrDefault(s, 0) + 1);
        return map;
    }
}
