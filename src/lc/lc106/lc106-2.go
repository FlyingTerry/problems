/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */


func buildTree(inorder []int, postorder []int) *TreeNode {
    return Dfs(inorder,postorder)
}

func Dfs(inorder []int, postorder []int) *TreeNode {

    if postorder == nil || len(postorder) == 0{
        return nil
    }

    ret:=&TreeNode{Val: postorder[len(postorder)-1]}

    if len(postorder) == 1{
        return ret
    }

    len:= len(inorder)
    rootV := postorder[len-1]
    leftLength := 0
    for i:=0;i<len;i++{
        if inorder[i] == rootV{
            leftLength = i
            break;
        }
    }

    ret.Left = Dfs(inorder[:leftLength],postorder[:leftLength])
    ret.Right = Dfs(inorder[leftLength+1:],postorder[leftLength:len-1])

    return ret
}