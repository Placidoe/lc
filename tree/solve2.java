package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/27 下午8:13
 **/
public class solve2 {
    public int[][] rerankItems(int[][] items) {
        // write code here
        List<Integer[]> list1 = new LinkedList<>();
        List<Integer[]> list2 = new LinkedList<>();
        for(int i=0;i<items.length;i++){
           if(items[i][1] == 0){
               list2.add(new Integer[]{items[i][0],items[i][1]});
           }else if(items[i][1]>0){
               list1.add(new Integer[]{items[i][0],items[i][1]});
           }
        }
        List<Integer[]> res = new LinkedList<>();

        for(int i=0;i<list1.size();i++){
            res.add(list1.get(i));
        }
        for(int i=0;i<list2.size();i++){
            res.add(list2.get(i));
        }
        int[][] ans = new int[res.size()][];
        for(int i=0;i<res.size();i++){
            ans[i] = new int[]{res.get(i)[0],res.get(i)[1]};
        }
        return ans;
    }
    public int cmp(int[] a,int[] b){//为真交换
        if(a[1]<b[1]){
            return 1;
        }else if(a[1] == b[1]){
            return -(a[0] - b[0]);
        }
        return -1;
    }

    public static void main(String[] args) {
        solve2 s = new solve2();
        int[][] arr = {{2,100},{5,0},{3,200},{4,0}};
        final int[][] ints = s.rerankItems(arr);
    }
}
