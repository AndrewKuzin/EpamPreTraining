import java.util.Random;

public class CoinChecker {
    public static final int HEAD = 0;

    public static String check() {
        Random random = new Random();
        int heads = 0, tails = 0;
        for (int i = 0; i < 1000; i++) {
            int coinSide = random.nextInt(2);
            if (coinSide == HEAD) {
                heads++;
            } else {
                tails++;
            }
        }
        return "heads: " + heads + " tails: " + tails;
    }
}
