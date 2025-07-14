package matrix;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/15 上午12:09
 **/
public class 搜索我二维矩阵II {
    public int b_search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + right >> 1;
            if (target <= arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] > target) {
                return false;
            }
            if (matrix[i].length == 0) {
                continue;
            }
            int index = b_search(matrix[i], target);
            if (matrix[i][index] == target) {
                return true;
            }
        }
        return false;
    }
}
