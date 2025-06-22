package main

var res int
var cur int
var total int
var curGas []int

func canCompleteCircuit(gas []int, cost []int) int {
	res = 0
	cur = 0
	total = 0
	curGas = make([]int, len(gas))

	for i := 0; i < len(gas); i++ {
		curGas[i] = gas[i] - cost[i]
	}
	for i := 0; i < len(gas); i++ {
		cur += curGas[i]
		total += curGas[i]
		if cur < 0 {
			cur = 0
			res = i + 1
		}
	}
	if total < 0 {
		return -1
	}
	return res
}

func main() {

}
