package lc.lc105;


import lc.common.TreeNode;

import java.util.Arrays;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0){
            return null;
        }
        if(preorder.length == 1){
            return new TreeNode(preorder[0]);
        }

        int rootV = preorder[0];
        TreeNode root = new TreeNode(rootV);
        int leftLength = 0;
        for(int i = 0;i<inorder.length;i++){
            if(inorder[i] == rootV){
                leftLength = i;
                break;
            }
        }

        root.left = buildTree(Arrays.copyOfRange(preorder,1,leftLength+1),Arrays.copyOfRange(inorder,0,leftLength));
        root.right = buildTree(Arrays.copyOfRange(preorder,leftLength+1,preorder.length),Arrays.copyOfRange(inorder,leftLength+1,inorder.length));

        return root;
    }
}
