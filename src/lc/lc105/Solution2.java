package lc.lc105;

import lc.common.TreeNode;

public class Solution2 {
    public static void main(String[] args) {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        System.out.println(buildTree(preorder, inorder));
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        System.out.print(" prestart: "+preStart);
        System.out.print(" preEnd: "+preEnd);
        System.out.print(" inStart: "+inStart);
        System.out.print(" inEnd: "+inEnd);
        System.out.println();
        if (preStart >=preEnd) {
            return null;
        }
        if (preStart == preEnd) {
            return new TreeNode(preorder[preStart]);
        }

        int rootV = preorder[preStart];
        TreeNode root = new TreeNode(rootV);
        int leftLength = 0;
        for (int i = inStart; i < inEnd; i++) {
            if (inorder[i] == rootV) {
                leftLength = i - inStart;
            }
        }

        root.left = buildTree(preorder, preStart + 1, preStart + 1 + leftLength, inorder, inStart, inStart + leftLength);
        root.right = buildTree(preorder, preStart + 1 + leftLength, preEnd, inorder, inStart + leftLength + 1, inEnd);

        return root;
    }
}
