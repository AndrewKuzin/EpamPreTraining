public class Revers {
    public static int getRevers(int number) {
        int reversNumber=0;
        reversNumber = reversNumber*10+ number % 10;
        number /= 10;
        reversNumber = reversNumber*10+ number % 10;
        number /= 10;
        reversNumber = reversNumber*10+ number % 10;
        number /= 10;
        reversNumber = reversNumber*10+ number % 10;
        number /= 10;
        reversNumber = reversNumber*10+ number % 10;
        number /= 10;
        reversNumber = reversNumber*10+ number % 10;
        number /= 10;
        reversNumber = reversNumber*10+ number % 10;
        return reversNumber;
    }
}
