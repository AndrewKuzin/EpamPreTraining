public class DinoMass {

    public static final long MILLIS_IN_KILO = 1_000_000L;
    public static final int GRAMS_IN_KILO = 1000;
    public static final float KILOS_IN_TON = 1000F;

    public static float[] countMass(int mass) {
        float[] differentMass = new float[3];
        differentMass[0] = mass * MILLIS_IN_KILO;
        differentMass[1] = mass * GRAMS_IN_KILO;
        differentMass[2] = mass / KILOS_IN_TON;
        return differentMass;
    }
}
