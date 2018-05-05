public class Main {
    public static void main(String[] args) {
        double[] medium = GetMedium.getMedium(123456);
        System.out.println("algebraic = "+medium[0]);
        System.out.println("arithmetic = "+medium[1]);
    }
}
