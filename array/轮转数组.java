package array;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/12 下午12:57
 **/
public class 轮转数组 {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }
}
