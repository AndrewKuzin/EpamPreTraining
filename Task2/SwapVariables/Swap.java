public class Swap {
    public static int[] getSwap(int a, int b) {
        a ^= b;
        b = a ^ b;
        a ^= b;
        int[] swaped = {a, b};
        return (swaped);
    }
}
