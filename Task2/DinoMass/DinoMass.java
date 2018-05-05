public class DinoMass {

    public static final long MILLIS_IN_KILO = 1_000_000L;
    public static final int GRAMS_IN_KILO = 1000;
    public static final float KILOS_IN_TON = 1000F;

    public static void countMass(int mass) {
        System.out.println("mass in kilos = " + mass);
        System.out.println("mass in milligrams = " + mass * MILLIS_IN_KILO);
        System.out.println("mass in grams = " + mass * GRAMS_IN_KILO);
        System.out.println("mass in tons = " + mass / KILOS_IN_TON);
    }
}
