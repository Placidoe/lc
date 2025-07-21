package binnary_tree;

import java.util.DuplicateFormatFlagsException;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO
 *
 * @Description
 * @Author Lx
 * @Date 2025/7/21 下午10:43
 **/
public class 中序遍历 {
    List<Integer> res = new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
    }
}
