/**
 * Question: Binary Tree Preorder Traversal (LeetCode #144)
 * Approach:- perform recursive preorder traversal (Root → Left → Right). First, add the root node’s value to the list, then recursively traverse the left and right subtrees, and return the list.
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }
    public static void preOrder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}
