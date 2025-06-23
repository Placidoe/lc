package main

func cover(target []int, cnt []int) bool {
	for i := 0; i < len(target); i++ {
		if target[i] > cnt[i] {
			return false
		}
	}
	return true
}

func minWindow(s string, t string) string {
	// 将变量作为局部变量处理
	target := make([]int, 128)
	cnt := make([]int, 128)
	// 初始化为一个较大的值
	res := len(s) + 1
	for _, c := range t {
		target[c]++
	}

	l := 0
	r := 0
	ansStart := 0
	for r < len(s) {
		cnt[s[r]]++
		for l <= r && cover(target, cnt) {
			if r-l+1 < res {
				res = r - l + 1
				ansStart = l
			}
			cnt[s[l]]--
			l++
		}
		r++
	}

	// 处理不存在满足条件子串的情况
	if res > len(s) {
		return ""
	}
	return s[ansStart : ansStart+res]
}

func main() {

}
