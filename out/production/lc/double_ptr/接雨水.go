package main

func trap(height []int) int {
	if len(height) < 2 {
		return 0
	}
	res := 0
	lH := height[0]
	rH := height[len(height)-1]

	l := 0
	r := len(height) - 1
	for l < r {
		lH = max(lH, height[l])
		rH = max(rH, height[r])
		if lH < rH {
			res += lH - height[l]
			l++
		} else {
			res += rH - height[r]
			r--
		}
	}
	return res
}

func main() {

}
