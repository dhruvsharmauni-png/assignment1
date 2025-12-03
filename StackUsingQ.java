import java.util.*;

public class StackUsingQ {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++)
            q.add(q.remove());
    }

    int pop() {
        return q.remove();
    }

    int top() {
        return q.peek();
    }

    public static void main(String[] a) {
        StackUsingQ s = new StackUsingQ();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
    }
}

