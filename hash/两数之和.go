package main

import "fmt"

func twoSum(nums []int, target int) []int {
	hash := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		hash[nums[i]] = i
	}

	for i := 0; i < len(nums); i++ {
		if _, ok := hash[target-nums[i]]; ok {
			if hash[target-nums[i]] != i {
				return []int{i, hash[target-nums[i]]}
			}
		}
	}
	return nil
}

func main() {
	fmt.Println("hello world")
}
