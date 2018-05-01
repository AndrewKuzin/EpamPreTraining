import java.util.Scanner;

public class GetMedium {
    public static void getMedium() {
        System.out.println("input number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int numbers[] = getNumbers(number);
        double sum = 0, multiply = 1;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            multiply *= numbers[i];
        }
        System.out.println("sum = " + sum / numbers.length);
        double algMedium = Math.pow(multiply, 1.0 / numbers.length);
        System.out.printf("multiply = %.3f", algMedium);
    }

    private static int[] getNumbers(int number) {
        int i = 0, numbers[] = new int[6];
        while (number > 0) {
            numbers[i] = number % 10;
            number /= 10;
            i++;
        }
        return numbers;
    }
}
