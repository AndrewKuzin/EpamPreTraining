public class DividerSimpleChecker {
    public static final int MIN_DIVIDER = 3;

    public static String getSimpleDividers(int number) {
        String dividers = "";
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                int divider = number / i;
                if (divider == 2 || divider == 3) {
                    dividers += " " + divider;
                } else if (number % 2 == 0) {
                } else {
                    for (int j = MIN_DIVIDER; j < divider / 2; i++) {
                        if (number % i == 0) {
                        }
                    }
                    dividers += " " + divider;
                }
            }
        }
        return dividers;

    }
}