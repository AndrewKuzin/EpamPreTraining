import java.util.Scanner;

public class Revers {
    public static void getRevers() {
        System.out.println("input number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int reversNumber=0;
        while (number > 0) {
            reversNumber = reversNumber*10+ number % 10;
            number /= 10;
        }
        System.out.println("revers " + reversNumber);
    }
}
