package main

import "fmt"

var res []string
var tmp string

func divideString(s string, k int, fill byte) []string {
	res = make([]string, 0)
	tmp = ""
	if len(s) < k {
		tmp = s
		for i := 0; i < k-len(s); i++ {
			tmp += string(fill)
		}
		res = append(res, tmp)
		return res
	}

	cnt := 0
	tmp = ""
	for _, c := range s {
		cnt++
		tmp += string(c)
		if cnt%k == 0 {
			res = append(res, tmp)
			tmp = ""
		}
	}
	if tmp != "" {
		for tmp != "" && len(tmp) < k {
			tmp += string(fill)
		}
		res = append(res, tmp)
	}

	return res
}

func main() {
	s := "abcdefghi"
	k := 3
	fill := 'x'
	strings := divideString(s, k, byte(fill))
	fmt.Println(strings)
}
