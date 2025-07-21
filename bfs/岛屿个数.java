package bfs;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/21 下午11:16
 **/
public class 岛屿个数 {
    int[][] used;
    int res = 0;
    int[][] dp = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        res = 0;
        int len1 = grid.length;
        int len2 = grid[0].length;
        used = new int[len1][len2];

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (grid[i][j] == '1' && used[i][j] == 0) {
                    res++;
                    bfs(grid, i, j);
                }
            }
        }
        return res;
    }

    public void bfs(char[][] grid, int x, int y) {
        used[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int newX = x + dp[i][0];
            int newY = y + dp[i][1];
            if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] == '1' && used[newX][newY] == 0) {
                bfs(grid, newX, newY);
            }
        }
    }
}
