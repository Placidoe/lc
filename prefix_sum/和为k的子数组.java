package prefix_sum;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/9 上午12:52
 **/
public class 和为k的子数组 {
    public int subarraySum(int[] nums, int k) {
        int[] s = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            s[i+1] = s[i] + nums[i];
        }
        int cnt = 0;
        for(int i=0;i<=nums.length;i++){
            for(int j=0;j<i;j++){
                if(s[i]-s[j]==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
