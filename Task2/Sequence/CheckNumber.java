public class CheckNumber {
    public static String check(int number) {
        int numbers[] = getNumbers(number);
        boolean sequence = true;
        if (numbers[1] <= numbers[0]) {
            sequence = false;
        }
        if (numbers[2] <= numbers[1]) {
            sequence = false;
        }
        if (numbers[3] <= numbers[2]) {
            sequence = false;
        }

        if (sequence == true) {
            return " is downcoming sequence";
        } else {
            sequence = true;
            if (numbers[1] >= numbers[0]) {
                sequence = false;
            }
            if (numbers[2] >= numbers[1]) {
                sequence = false;
            }
            if (numbers[3] >= numbers[2]) {
                sequence = false;
            }

            if (sequence == true) {
                return " is upcoming sequence";
            } else {
                return " is not sequence";
            }
        }

    }

    private static int[] getNumbers(int number) {
        int numbers[] = new int[4];
        numbers[0] = number % 10;
        number /= 10;
        numbers[1] = number % 10;
        number /= 10;
        numbers[2] = number % 10;
        number /= 10;
        numbers[3] = number % 10;

        return numbers;
    }
}
