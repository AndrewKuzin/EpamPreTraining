public class MaxNumber {
    public static final int BIGGEST_NUMBER = 9;

    public static int getBiggestNumber(int number){
        int max = 0;
        while (number>0){
            if (max<number%10){
                max=number%10;
            }
            if (max==BIGGEST_NUMBER){
                return max;
            }
            number /=10;
        }
        return max;
    }
}
