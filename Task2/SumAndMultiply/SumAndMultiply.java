public class SumAndMultiply {
    public static int[] getSumAndMult(int number) {
        int numbers[] = getNumbers(number);
        int sumAndMult[] = new int[2];
        sumAndMult[1] = 1;

        sumAndMult[0] += numbers[0];
        sumAndMult[1] *= numbers[0];
        sumAndMult[0] += numbers[1];
        sumAndMult[1] *= numbers[1];
        sumAndMult[0] += numbers[2];
        sumAndMult[1] *= numbers[2];
        sumAndMult[0] += numbers[3];
        sumAndMult[1] *= numbers[3];
        sumAndMult[0] += numbers[4];
        sumAndMult[1] *= numbers[4];

        return sumAndMult;
    }

    private static int[] getNumbers(int number) {
        int numbers[] = new int[5];
        numbers[0] = number % 10;
        number /= 10;
        numbers[1] = number % 10;
        number /= 10;
        numbers[2] = number % 10;
        number /= 10;
        numbers[3] = number % 10;
        number /= 10;
        numbers[4] = number % 10;
        return numbers;
    }
}
