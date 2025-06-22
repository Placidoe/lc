package main

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

var flag bool

func hasPathSum(root *TreeNode, targetSum int) bool {
	flag = false
	if root == nil {
		return flag
	}
	dfs(root, 0, targetSum)
	return flag
}

func dfs(root *TreeNode, path, targetSum int) {
	if root == nil {
		return
	}
	val := path + root.Val
	if val == targetSum && root.Left == nil && root.Right == nil {
		flag = true
	}
	dfs(root.Left, val, targetSum)
	dfs(root.Right, val, targetSum)
}

func main() {

}
