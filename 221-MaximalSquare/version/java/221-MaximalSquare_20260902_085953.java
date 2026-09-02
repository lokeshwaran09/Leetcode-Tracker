// Last updated: 9/2/2026, 8:59:53 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int kthSmallest(TreeNode root, int k) {
18        java.util.Stack<TreeNode> stack = new java.util.Stack<>();
19
20        while (true) {
21            while (root != null) {
22                stack.push(root);
23                root = root.left;
24            }
25
26            root = stack.pop();
27            k--;
28
29            if (k == 0) {
30                return root.val;
31            }
32
33            root = root.right;
34        }
35    }
36}