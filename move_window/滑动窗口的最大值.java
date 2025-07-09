package move_window;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/10 上午12:34
 **/
public class 滑动窗口的最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int index = 0;

        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            //删旧
            if (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }

            //加新
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            q.addLast(i);
            //取值
            if (i >= k - 1) {
                res[index++] = nums[q.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = new 滑动窗口的最大值().maxSlidingWindow(nums, k);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
