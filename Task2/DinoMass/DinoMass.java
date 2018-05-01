import java.util.Scanner;

public class DinoMass {
    public static void countMass() {
        System.out.println("input dino mass:");
        Scanner in = new Scanner(System.in);
        int mass = in.nextInt();
        System.out.println("mass in kilos = " + mass);
        System.out.println("mass in milligrams = " + mass * 1_000_000L);
        System.out.println("mass in grams = " + mass * 1000);
        System.out.println("mass in tons = " + mass / 1000F);
    }
}
