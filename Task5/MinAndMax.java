public class MinAndMax {
    public static int[] getMinAndMax(int x[]) {
        int min = x[0], max = x[0];
        for (int i = 1; i < x.length; i++){
            if(x[i]>max){
                max=x[i];
            } else if(x[i]< min){
                min = x[i];
            }
        }
        return new int[]{max, min};
    }
}
