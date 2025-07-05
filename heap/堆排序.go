package main

import "fmt"

func heapSort(nums []int) []int {
	// 构建大顶堆
	for i := len(nums)/2 - 1; i >= 0; i-- {
		// 从最后一个非叶子节点开始调整
		heapify(nums, i, len(nums))
	}

	// 堆排序
	for i := len(nums) - 1; i > 0; i-- {
		nums[0], nums[i] = nums[i], nums[0]
		heapify(nums, 0, i)
	}
	return nums
}

func heapify(nums []int, i, n int) {
	left := 2*i + 1
	right := 2*i + 2
	largest := i
	if left < n && nums[left] > nums[largest] {
		largest = left
	}
	if right < n && nums[right] > nums[largest] {
		largest = right
	}
	if largest != i {
		nums[i], nums[largest] = nums[largest], nums[i]
		heapify(nums, largest, n)
	}
}
func findKthLargest(nums []int, k int) int {
	nums = heapSort(nums)
    return nums[len(nums)-k] 
}

func main() {
	fmt.Println(findKthLargest([]int{3, 2, 1, 5, 6, 4}, 2)) // 输出 5
}
