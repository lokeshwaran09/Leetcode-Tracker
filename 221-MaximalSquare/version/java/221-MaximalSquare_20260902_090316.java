// Last updated: 9/2/2026, 9:03:16 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        while (root != null) {
14            if (p.val < root.val && q.val < root.val) {
15                root = root.left;
16            } else if (p.val > root.val && q.val > root.val) {
17                root = root.right;
18            } else {
19                return root;
20            }
21        }
22
23        return null;
24    }
25}