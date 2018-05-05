public class Main {
    public static void main(String[] args) {
        float[] mass = DinoMass.countMass(1234);
        System.out.println("mass in milligrams = " + mass[0]);
        System.out.println("mass in grams = " + mass[1]);
        System.out.println("mass in tons = " + mass[2]);
    }
}
