func buildTree(inorder []int, postorder []int) *TreeNode {
	if len(inorder) == 0 || len(postorder) == 0 {
		return nil
	}
	rv := postorder[len(postorder)-1]
	var i int
	for i = range inorder {
		if inorder[i] == rv {
			break
		}
	}

	return &TreeNode{
		Val:   rv,
		Left:  buildTree(inorder[:i], postorder[:i]),
		Right: buildTree(inorder[i+1:], postorder[i:len(postorder)-1]),
	}
}