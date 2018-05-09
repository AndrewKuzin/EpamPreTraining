public class CheckSequence {
    public static String check(int[] x) {
        boolean upcommingSequence = true, downcommingSequence = true;
        for (int i = 1; i < x.length; i++) {
            if (x[i] <= x[i - 1]) {
                upcommingSequence = false;
                if (x[i] == x[i - 1]) {
                    downcommingSequence = false;
                    break;
                }
            } else {
                downcommingSequence = false;
            }
        }
        if (downcommingSequence == true) {
            return "downcoming sequence";
        } else if (upcommingSequence == true) {
            return " is upcoming sequence";
        } else {
            return " is not sequence";
        }
    }

}

