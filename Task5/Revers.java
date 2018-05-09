public class Revers {
    public static int[] getRevers(int x[]) {
        for (int i = 0; i<x.length/2 ; i++){
            x[i] ^= x[x.length-1-i];
            x[x.length-1-i] ^= x[i];
            x[i] ^= x[x.length-1-i];

        }
        return x;
    }
}
