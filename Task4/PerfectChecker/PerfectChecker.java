public class PerfectChecker {
    public static final int SUM_OF_TWO_FIRST_DIVINERS = 3;

    public static boolean checkPerfect(int number) {
        if (number % 2 == 0) {
            int sum = SUM_OF_TWO_FIRST_DIVINERS;
            for (int i = 3; i < number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            sum += number / 2;
            if (sum == number) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
