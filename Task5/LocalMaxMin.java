public class LocalMaxMin {
    public static int[] getLocalMaxMin(int[] x) {
        int locMax = -1, locMin = -1;
        if (x[0] <= x[1]) {
            if (x[0] == x[1]) {
                locMin = 0;
            }
        } else {
            locMax = 0;
        }
        for (int i = 2; i < x.length - 1; i++) {
            if (locMax == -1 && x[i] > x[i + 1] && x[i] > x[i - 1]) {
                locMax = i;
            } else if(locMin == -1 && x[i] < x[i + 1] && x[i] < x[i - 1]){
                locMin = i;
            }
        }
        if (locMax==-1&&x[x.length]>x[x.length-1]){
            locMax = x.length;
        } else if (locMin == -1 && x[x.length]<x[x.length-1]){
            locMin = x.length;
        }
        return new int[] {locMax, locMin};
    }
}
