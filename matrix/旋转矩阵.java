package matrix;

import java.util.LinkedList;
import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/12 下午5:47
 **/
public class 旋转矩阵 {
    int[][] dp = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        int total = m * n;
        int x = 0, y = 0;
        int index = 0;
        int[][] used = new int[n][m];
        for (int i = 0; i < total; i++) {
            res.add(matrix[x][y]);
            used[x][y] = 1;
            //check
            int nx = x + dp[index % 4][0];
            int ny = y + dp[index % 4][1];
            if (nx < 0 || nx >= n || ny < 0 || ny >= m || used[nx][ny] == 1) {
                index++;
            }

            nx = x + dp[index % 4][0];
            ny = y + dp[index % 4][1];
            x = nx;
            y = ny;
        }
        return res;
    }
}
