package main

import "fmt"

func longestConsecutive(nums []int) int {
	if nums == nil || len(nums) == 0 {
		return 0
	}
	hash := make(map[int]int)
	maxLen := 0
	for i := 0; i < len(nums); i++ {
		hash[nums[i]] = nums[i] //set用法，key和value相同。如果是map，那value可以自己弄
		//其实set建议 value用bool，因为不需要value
	}

	//go这里要用set，不然会超时
	for val := range hash {
		cur := val
		if _, ok := hash[cur-1]; !ok {
			tmpLen := 1
			for _, ok := hash[cur+1]; ok; _, ok = hash[cur+1] {
				tmpLen++
				cur++
			}
			maxLen = max(maxLen, tmpLen)
		}
	}
	return maxLen
}

func main() {
	nums1 := []int{100, 4, 200, 1, 3, 2}
	nums2 := []int{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}
	fmt.Println(longestConsecutive(nums1))
	fmt.Println(longestConsecutive(nums2))
}
