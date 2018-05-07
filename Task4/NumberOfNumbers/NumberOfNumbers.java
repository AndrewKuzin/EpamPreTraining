public class NumberOfNumbers {
    public static int getNumberOfNumbers(int number) {
        String numbers = "";
        int numberOfNumbers = 0;
        while (number > 0) {
            if (!numbers.contains(String.valueOf(number % 10))) {
                numbers += number % 10;
                numberOfNumbers++;
                if (numberOfNumbers == 9) {
                    break;
                }
            }
            number /= 10;
        }
        return numberOfNumbers;

    }
}
