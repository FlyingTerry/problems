/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func sortedArrayToBST(nums []int) *TreeNode {
	return do(nums, 0, len(nums)-1)
}

func do(nums []int, start int, end int) *TreeNode {
	if start > end {
		return nil
	}
	if start == end {
		return &TreeNode{Val: nums[start]}
	}
	mid := (start + end) >> 1

	root := &TreeNode{Val: nums[mid]}

	left := do(nums, start, mid-1)
	right := do(nums, mid+1, end)

	root.Left = left
	root.Right = right

	return root

}