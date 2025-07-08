package double_ptr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/9 上午12:33
 **/
public class 三数之和 {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //其实一个定了另外两个就定了，第一个如果一样的话，另外两个也必须一样，才能和为0
            if( i>0 && nums[i] == nums[i-1] )continue;
            int l = i + 1, r = nums.length - 1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum ==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    l++;
                    r--;
                    while(l<r&&nums[l] == nums[l-1])l++;
                    while(l<r&&nums[r] == nums[r+1])r--;

                }else if(sum>0) {
                    r--;
                }else if(sum<0){
                    l++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
