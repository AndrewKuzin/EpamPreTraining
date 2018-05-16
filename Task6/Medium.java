public class Medium {
    public static double[] getMedium(int[][] matrix) {
        double arithmeticalMedium = 0, geometricalMedium = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arithmeticalMedium += matrix[i][j];
                geometricalMedium *= matrix[i][j];
            }
        }
        arithmeticalMedium /= (matrix.length * matrix[0].length);
        geometricalMedium = Math.pow(geometricalMedium, 1.0 / (matrix.length * matrix[0].length));

        return new double[]{arithmeticalMedium, geometricalMedium};
    }
}
