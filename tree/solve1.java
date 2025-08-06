package tree;


import java.util.*;
import java.lang.*;
/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
 */


public class solve1 {


    /**
     * Note: 类名、方法名、参数名已经指定，请勿修改
     *
     * @param root TreeNode类
     * @return int整型二维数组
     */
    HashMap<Integer, List<Integer>> res = new HashMap<>();

    public int[][] levelOrder(TreeNode root) {
        int[][] ans = new int[res.size()][];
        if(root==null){
            return ans;
        }
        res = new HashMap<>();
        // write code here
        dfs(root, 0);
        for (Map.Entry<Integer, List<Integer>> entry : res.entrySet()) {
            int level = entry.getKey();
            List<Integer> list = entry.getValue();
            int len = list.size();
            ans[level] = new int[len];
            for (int i = 0; i < len; i++) {
                ans[level][i] = list.get(i);
            }
        }

        return ans;
    }

    public void dfs(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        res.getOrDefault(level, new LinkedList<>()).add(root.val);
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }

    public static void main(String[] args) {
        solve1 s = new solve1();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        int[][] res = s.levelOrder(root);
    }
}
