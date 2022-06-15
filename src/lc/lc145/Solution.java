package lc.lc145;

import java.util.*;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null){
            return ret;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
//        TreeNode lastVisit = root;

        Set<TreeNode> handledNode = new HashSet<>();

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            node = stack.peek();
            if (node.right == null || handledNode.contains(node.right)) {
                ret.add(node.val);
                stack.pop();
//                lastVisit = node;
                handledNode.add(node);
                node = null;
            } else {
                node = node.right;
            }

        }
        return ret;
    }

    class TreeNode{
        public TreeNode left;
        public TreeNode right;
        public Integer val;
    }
}
