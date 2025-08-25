import java.util.Scanner;

class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double peri = 2 * (l + w);
        System.out.println("Perimeter = " + peri);
    }
}
