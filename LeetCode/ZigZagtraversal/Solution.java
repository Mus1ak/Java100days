/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root == null) return list;
        Stack<TreeNode> curr = new Stack<>();
        Stack<TreeNode> next = new Stack<>();
        boolean leftToRight = true;
        curr.push(root);
        List<Integer> levelNodes = new ArrayList<>();

        while(!curr.empty()){
            
            TreeNode node = curr.pop();
            levelNodes.add(node.val);

            if(leftToRight){
                if(node.left != null) next.push(node.left);
                if(node.right != null) next.push(node.right);
            }else{
                if(node.right != null) next.push(node.right);
                if(node.left != null) next.push(node.left);
            }

            if(curr.empty()){
                list.add(new ArrayList<>(levelNodes));
                levelNodes.clear();
                leftToRight = !leftToRight;
                //swap
                Stack<TreeNode> temp = curr;
                curr = next;
                next = temp;
            }
        }
        return list;

    }  
}