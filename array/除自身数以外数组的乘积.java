package array;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/12 下午1:19
 **/
public class 除自身数以外数组的乘积 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] leftA = new int[nums.length + 1];
        int[] rightA = new int[nums.length + 1];

        leftA[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            leftA[i + 1] = leftA[i] * nums[i];
        }

        // 修复2：初始化右数组最后一个元素为1
        rightA[rightA.length - 1] = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            rightA[i] = rightA[i + 1] * nums[i];
        }


        // 前后缀数组相乘
        for (int i = 0; i < nums.length; i++) {
            res[i] = leftA[i] * rightA[i + 1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = new 除自身数以外数组的乘积().productExceptSelf(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
