import java.util.Scanner;

public class RingArea {
    public static void getArea() {
        System.out.println("input R1:");
        Scanner in1 = new Scanner(System.in);
        int r1 = in1.nextInt();
        System.out.println("input R2:");
        Scanner in2 = new Scanner(System.in);
        int r2 = in2.nextInt();
        System.out.printf("ring area = %.3f", countArea(r1, r2));
    }

    private static double countArea(int r1, int r2) {
        double area1 = Math.PI * Math.pow(r1, 2);
        double area2 = Math.PI * Math.pow(r2, 2);
        return area1 - area2;
    }
}
