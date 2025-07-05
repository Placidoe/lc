package double_ptr;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/5 下午6:37
 **/
public class 最多盛水容器 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int res = 0;

        while(l<r){
            res = Math.max(res,Math.min(height[l],height[r]) * (r-l));
            if (height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(new 最多盛水容器().maxArea(nums));;
    }
}
