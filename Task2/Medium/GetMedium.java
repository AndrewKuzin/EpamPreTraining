public class GetMedium {
    public static void getMedium(int number) {
        int numbers[] = getNumbers(number);
        double sum = 0, multiply = 1;
        sum += numbers[0];
        multiply *= numbers[0];
        sum += numbers[1];
        multiply *= numbers[1];
        sum += numbers[2];
        multiply *= numbers[2];
        sum += numbers[3];
        multiply *= numbers[3];
        sum += numbers[4];
        multiply *= numbers[4];
        sum += numbers[5];
        multiply *= numbers[5];

        System.out.println("sum = " + sum / numbers.length);
        double algMedium = Math.pow(multiply, 1.0 / numbers.length);
        System.out.printf("multiply = %.3f", algMedium);
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
