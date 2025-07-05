package main

import "fmt"

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
var queue []*TreeNode
var res [][]int

func levelOrder(root *TreeNode) [][]int {
	if root == nil {
		return nil
	}
	res = make([][]int, 0)
	queue = make([]*TreeNode, 0)

	queue = append(queue, root)
	size := len(queue)

	for len(queue) > 0 {
		tmp := make([]int, 0)
		cnt := 0
		for i := 0; i < size; i++ {
			node := queue[0]
			queue = queue[1:]
			tmp = append(tmp, node.Val)
			if node.Left != nil {
				queue = append(queue, node.Left)
				cnt++
			}
			if node.Right != nil {
				queue = append(queue, node.Right)
				cnt++
			}
		}
		res = append(res, tmp)
		size = cnt
	}
	return res
}

func main() {
	fmt.Println("<UNK>")
}
