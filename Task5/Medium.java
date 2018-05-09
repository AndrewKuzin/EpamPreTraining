public class Medium {
    public static double[] getMedium(int[] x){
        double arithmeticalMedium = 0, geometricalMedium =1;
        for (int i=0; i<x.length;i++){
            arithmeticalMedium+=x[i];
            geometricalMedium*=x[i];
        }
        arithmeticalMedium/=x.length;
        geometricalMedium=Math.pow(geometricalMedium, 1.0/x.length);

        return new double[]{arithmeticalMedium, geometricalMedium};
    }
}
