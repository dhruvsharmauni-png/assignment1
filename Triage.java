import java.util.*;

class Patient {
    String name;
    int sev;

    Patient(String n, int s) {
        name = n;
        sev = s;
    }
}

public class Triage {
    public static void main(String[] a) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((x, y) -> y.sev - x.sev);
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        while (!pq.isEmpty())
            System.out.println(pq.remove().name);
    }
}
