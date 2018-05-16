/**
 * Created by АВК on 14.05.2018.
 */
public class Transponer {
    public static int[][] transpone(int[][] matrix) {

        int[][] transpone = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpone[j][i] = matrix[i][j];
            }
        }

        return transpone;
    }
}
