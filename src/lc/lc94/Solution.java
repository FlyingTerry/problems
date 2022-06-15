package lc.lc94;

import java.util.*;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null){
            return ret;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node!=null){
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()) {
                node = stack.pop();
                ret.add(node.val);
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
