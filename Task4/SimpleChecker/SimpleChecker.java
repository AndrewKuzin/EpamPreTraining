public class SimpleChecker {
    public static final int MIN_DIVIDER = 3;

    public static boolean simpleCheck(int number) {
        if (number == 2 || number == 3) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        } else {
            for (int i = MIN_DIVIDER; i < number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
