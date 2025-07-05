package main

import (
	"container/heap"
	"fmt"
)

// pair 用于存储数字及其出现的次数
type pair struct {
	num   int
	count int
}

// hp 定义小顶堆类型
type hp []pair

// Len 返回堆的长度
func (h hp) Len() int { return len(h) }

// Less 比较堆中元素的大小，实现小顶堆
func (h hp) Less(i, j int) bool { return h[i].count < h[j].count }

// Swap 交换堆中元素的位置
func (h hp) Swap(i, j int) { h[i], h[j] = h[j], h[i] }

// Push 向堆中添加元素
func (h *hp) Push(x interface{}) {
	*h = append(*h, x.(pair))
}

// Pop 从堆中移除并返回最小元素
func (h *hp) Pop() interface{} {
	old := *h
	n := len(old)
	x := old[n-1]
	*h = old[0 : n-1]
	return x
}

func topKFrequent(nums []int, k int) []int {
	// 统计每个数字出现的次数
	countMap := make(map[int]int)
	for _, num := range nums {
		countMap[num]++
	}

	// 构建小顶堆
	h := &hp{}
	heap.Init(h)
	for num, count := range countMap {
		heap.Push(h, pair{num, count})
		if h.Len() > k {
			heap.Pop(h)
		}
	}
	// 提取结果
	result := make([]int, 0, k)
	for _, p := range *h {
		result = append(result, p.num)
	}
	return result
}

func main() {
	nums := []int{1, 1, 1, 2, 2, 3}
	k := 2
	fmt.Println(topKFrequent(nums, k)) // 输出前 2 个高频元素
}
