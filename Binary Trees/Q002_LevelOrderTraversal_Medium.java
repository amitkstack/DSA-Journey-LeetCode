/**
 * Question: Level Order Traversal (LeetCode #102)
 * Approach:- Use BFS with a queue and process the tree level by level. For each level, process all nodes currently in the queue, store their values, and add their children for the next level.
 * Time Complexity: O(N)
 * Space Complexity: O(W)
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; ++i) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            ans.add(level);
        }

        return ans;
    }
}
