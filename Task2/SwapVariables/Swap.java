import java.util.Scanner;

public class Swap {
    public static void getSwap() {
        System.out.println("input a:");
        Scanner in1 = new Scanner(System.in);
        int a = in1.nextInt();
        System.out.println("input b:");
        Scanner in2 = new Scanner(System.in);
        int b = in2.nextInt();
        a += b;
        b = a - b;
        a -= b;
        System.out.println("swaped a: " + a);
        System.out.println("swaped b: " + b);
    }
}
