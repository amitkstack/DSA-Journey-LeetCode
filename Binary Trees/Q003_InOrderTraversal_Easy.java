/**
 * Question: Binary Tree Inorder Traversal (LeetCode #94)
 * Approach:- Perform recursive inorder traversal (Left → Root → Right). Recursively traverse the left subtree, add the root value, then recursively traverse the right subtree and return the list.
 * Time Complexity: O(n)
 * Space Complexity: O(H)
 */


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inOrder(root, ans);
        return ans;
    }
    public static void inOrder(TreeNode root, List<Integer> list) {
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
