/**
     * Question: Diameter of Binary Tree (LeetCode #543)
     * Approach:- recursively calculate the height and diameter of each subtree in one traversal. For every node, the diameter is the maximum of the left diameter, right diameter, and left height + right height 
     * Time Complexity: O(N)
     * Space Complexity: O(H)
 */

class Solution {
    static class Info {
        int diam;
        int ht;
        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).diam;
    }
    public static Info diameter(TreeNode root) {
        if(root == null) return new Info(0, 0);
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }
}
