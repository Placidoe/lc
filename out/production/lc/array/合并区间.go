package main

//
//import "sort"
//
//var res [][]int
//
//func merge(intervals [][]int) [][]int {
//	res = make([][]int, 0)
//	sort.Slice(intervals, func(i, j int) bool {
//		return intervals[i][0] < intervals[j][0]
//	})
//	if len(intervals) == 0 {
//		return res
//	}
//
//	for _, pair := range intervals {
//		if len(res) == 0 {
//			res = append(res, pair)
//			continue
//		}
//
//		lv := pair[0]
//		rv := pair[1]
//
//		endrv := res[len(res)-1][1]
//
//		if lv < endrv {
//			res[len(res)-1][1] = max(rv, endrv)
//		} else {
//			res = append(res, []int{lv, rv})
//		}
//		}
//	return res
//}
//
//func max(a,b int) int{}
//	if a > b {
//		return a
//	}
//	return b
//}
//
//func main() {
//
//}
