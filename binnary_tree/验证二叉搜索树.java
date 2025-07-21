package binnary_tree;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/21 下午11:04
 **/
public class 验证二叉搜索树 {
    public boolean isValidBST(TreeNode root) {
        return check(root, null, null);
    }

    public boolean check(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.val <= min) {
            return false;
        }

        if (max != null && root.val >= max) {
            return false;
        }

        return check(root.left, min, root.val) && check(root.right, root.val, max);
    }
}
