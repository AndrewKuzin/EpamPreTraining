/**
 * Created by АВК on 09.05.2018.
 */
public class LocalMaxMin {
    public static int[][] getLocalMaxMin(int[][] matrix) {
        int[] defaultValue = new int[]{-1};
        int[] locMax = defaultValue, locMin = defaultValue;
        if (matrix[0][0] <= matrix[0][1] || matrix[0][0] <= matrix[1][0]) {
            if (matrix[0][0] > matrix[0][1] && matrix[0][0] > matrix[1][0]) {
                locMin = new int[]{0, 0};
            }
        } else {
            locMax = new int[]{0, 0};
        }
        for (int j = 1; j < matrix[0].length - 1; j++) {
            if (locMax == defaultValue && matrix[0][j] > matrix[0][j + 1] && matrix[0][j] > matrix[0][j - 1]) {
                locMax = new int[]{0, j};
            } else if (locMin == defaultValue && matrix[0][j] < matrix[0][j + 1] && matrix[0][j] < matrix[0][j - 1]) {
                locMin = new int[]{0, j};
            }
        }
        if (locMax == defaultValue && matrix[0][matrix[0].length] > matrix[0][matrix[0].length-1]
                && matrix[0][matrix[0].length] > matrix[1][matrix[0].length]) {
            locMax = new int[]{0, matrix[0].length};
        } else if (locMin == defaultValue && matrix[0][matrix[0].length] < matrix[0][matrix[0].length-1]
                && matrix[0][matrix[0].length] < matrix[1][matrix[0].length]) {
            locMin = new int[]{0, matrix[0].length};
        }
        return new int[][]{locMax, locMin};
    }
}
