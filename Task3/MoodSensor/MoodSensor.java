import java.util.Random;

public class MoodSensor {
    public static final int MOOD_NUMBER = 3;
    public static final String SMILE = ":)";
    public static final String SAD = ":(";
    public static final String POKER = ":|";

    public static String showMood() {
        Random random = new Random();
        String mood = POKER;
        int a = random.nextInt(MOOD_NUMBER);

        switch (a) {
            case 0:
                mood = SMILE;
                break;
            case 1:
                mood = SAD;
                break;
            case 2:
                mood = POKER;
                break;
        }
        return mood;
    }
}
