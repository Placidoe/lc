package matrix;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/12 下午5:19
 **/
public class 矩阵置零 {
    int[][] used;

    public void setZeroes(int[][] matrix) {
        used = new int[matrix.length][matrix[0].length];
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0 && used[i][j] == 0) {
                    setRowZeroes(matrix, i);
                    setColZeroes(matrix, j);
                    used[i][j] = 1;
                }
            }
        }
    }

    public void setRowZeroes(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = 0;
                used[row][j] = 1;
            }

        }
    }


    public void setColZeroes(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = 0;
                used[i][col] = 1;
            }
        }
    }
}
