/**
 * Question: Binary Tree Postorder Traversal (LeetCode #145)
 * Approach:- Perform recursive postorder traversal (Left → Right → Root). Recursively traverse the left and right subtrees first, then add the root value to the list.
 * Time Complexity: O(N)
 * Space Complexity: O(H)
 */

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        postOrder(root, ans);
        return ans;
    }
    public static void postOrder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return;
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
    }
}
