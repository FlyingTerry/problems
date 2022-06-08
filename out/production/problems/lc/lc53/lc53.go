func maxSubArray(nums []int) int {
	max := nums[0]
	tmp := max
	for i := 1; i < len(nums); i++ {
		tmp = Max(tmp, 0)
		tmp += nums[i]
		max = Max(max, tmp)
	}
	return max
}

func Max(a int, b int) int {
	if a >= b {
		return a
	}
	return b
}