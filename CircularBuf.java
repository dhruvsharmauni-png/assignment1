public class CircularBuf {
    int[] arr;
    int head = 0, size = 0;

    CircularBuf(int n) {
        arr = new int[n];
    }

    void add(int x) {
        arr[head] = x;
        head = (head + 1) % arr.length;
        if (size < arr.length)
            size++;
    }

    void print() {
        for (int i = 0; i < size; i++)
            System.out.print(arr[(head + i) % arr.length] + " ");
        System.out.println();
    }

    public static void main(String[] a) {
        CircularBuf b = new CircularBuf(3);
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.print();
    }
}
