import java.util.Scanner;

public class CheckNumber {
    public static void check() {
        System.out.println("input number:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int numbers[] = getNumbers(number);
        boolean sequence = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                sequence = false;
            }
        }
        if (sequence == true) {
            System.out.println(number + " is downcoming sequence");
        } else {
            sequence = true;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] >= numbers[i - 1]) {
                    sequence = false;
                }
            }
            if (sequence == true) {
                System.out.println(number + " is upcoming sequence");
            } else {
                System.out.println(number + " is not sequence");
            }
        }

    }

    private static int[] getNumbers(int number) {
        int i = 0, numbers[] = new int[4];
        while (number > 0) {
            numbers[i] = number % 10;
            number /= 10;
            i++;
        }
        return numbers;
    }
}
