func maxSubArray(nums []int) int {
	return maxSubArrayDAC(nums, 0, len(nums)-1)
}

func maxSubArrayDAC(nums []int, start int, end int) int {
	if start >= end {
		return nums[start]
	}
	mid := (start + end) / 2
	leftMax := maxSubArrayDAC(nums, start, mid-1)
	rightMax := maxSubArrayDAC(nums, mid+1, end)

	midMax := nums[mid]
	tmp := midMax

	for i := mid + 1; i <= end; i++ {
		tmp += nums[i]
		midMax = Max(midMax, tmp)
	}

	tmp = midMax
	for i := mid - 1; i >= start; i-- {
		tmp += nums[i]
		midMax = Max(midMax, tmp)
	}

	return Max(midMax, Max(leftMax, rightMax))
}

func Max(a int, b int) int {
	if a >= b {
		return a
	}
	return b
}