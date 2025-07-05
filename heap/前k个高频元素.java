package heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class 前k个高频元素 {
    public int[] topKFrequent(int[] nums, int k) {
        // 统计count
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // 优先级队列排序
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
        }

        //取出第k个
        int[] res = new int[k];
        for (int i = 0; i < k - 1; i++) {
            res[i] = queue.poll().getKey();
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        new 前k个高频元素().topKFrequent(nums, k);
    }
}