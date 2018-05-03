public class HeadCounter {
    public static final int YONG = 200;
    public static final int TEEN = 300;
    public static final int YONG_HEADS = 3;
    public static final int TEEN_HEADS = 2;
    public static final int OLD_HEADS = 1;
    public static final int START_HEADS = 3;

    public static int countHeads(int dragonsAge) {
        int heads = 0;
        if (dragonsAge < 0) {
        } else if (dragonsAge < YONG) {
            heads = START_HEADS + dragonsAge * YONG_HEADS;
        } else if (dragonsAge < TEEN) {
            heads = START_HEADS + YONG * YONG_HEADS
                    - YONG * TEEN_HEADS + dragonsAge * TEEN_HEADS;
        } else {
            heads = START_HEADS + YONG * YONG_HEADS
                    + (TEEN - YONG) * TEEN_HEADS - TEEN * OLD_HEADS + dragonsAge * OLD_HEADS;
        }
        return heads;
    }
}
