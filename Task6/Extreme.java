/**
 * Created by АВК on 14.05.2018.
 */
public class Extreme {
    public static int[] getExtremeValue(int[][] matrix) {
        int min = matrix[0][0], max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                } else if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return new int[]{max, min};
    }
}

