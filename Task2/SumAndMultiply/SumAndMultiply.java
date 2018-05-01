import java.util.Scanner;

public class SumAndMultiply {
    public static void getSumAndMult() {
        System.out.println("input number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int numbers[] = getNumbers(number);
        int sum = 0, multiply = 1;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            multiply *= numbers[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("multiply = " + multiply);
    }

    private static int[] getNumbers(int number) {
        int i = 0, numbers[] = new int[5];
        while (number > 0) {
            numbers[i] = number % 10;
            number /= 10;
            i++;
        }
        return numbers;
    }
}
