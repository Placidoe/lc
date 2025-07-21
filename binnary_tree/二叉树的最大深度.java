package binnary_tree;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/21 下午10:52
 **/
public class 二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root);
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lH = dfs(root.left);
        int rH = dfs(root.right);
        return Math.max(lH, rH) + 1;
    }
}
