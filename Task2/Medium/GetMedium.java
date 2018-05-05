public class GetMedium {
    public static double[] getMedium(int number) {
        int numbers[] = getNumbers(number);
        double medium[] = new double[2];
        medium[1] = 1;
        medium[0] += numbers[0];
        medium[1] *= numbers[0];
        medium[0] += numbers[1];
        medium[1] *= numbers[1];
        medium[0] += numbers[2];
        medium[1] *= numbers[2];
        medium[0] += numbers[3];
        medium[1] *= numbers[3];
        medium[0] += numbers[4];
        medium[1] *= numbers[4];
        medium[0] += numbers[5];
        medium[1] *= numbers[5];

        medium[0] /= numbers.length;
        medium[1] = Math.pow(medium[1], 1.0 / numbers.length);
        return medium;
    }

    private static int[] getNumbers(int number) {
        int numbers[] = new int[6];
        numbers[0] = number % 10;
        number /= 10;
        numbers[1] = number % 10;
        number /= 10;
        numbers[2] = number % 10;
        number /= 10;
        numbers[3] = number % 10;
        number /= 10;
        numbers[4] = number % 10;
        number /= 10;
        numbers[5] = number % 10;

        return numbers;
    }
}
