package bit_cal;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/8/7 上午1:16
 **/
public class 只出现一次的数字II {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = map.getOrDefault(nums[i], 0);
            map.put(nums[i], val + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
