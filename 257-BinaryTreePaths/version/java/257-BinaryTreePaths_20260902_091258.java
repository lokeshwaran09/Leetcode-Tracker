// Last updated: 9/2/2026, 9:12:58 AM
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
16import java.util.*;
17
18class Solution {
19    public List<String> binaryTreePaths(TreeNode root) {
20        List<String> result = new ArrayList<>();
21
22        if (root == null) {
23            return result;
24        }
25
26        dfs(root, "", result);
27
28        return result;
29    }
30
31    private void dfs(TreeNode node, String path, List<String> result) {
32        if (node == null) {
33            return;
34        }
35
36        if (path.isEmpty()) {
37            path = String.valueOf(node.val);
38        } else {
39            path += "->" + node.val;
40        }
41
42        if (node.left == null && node.right == null) {
43            result.add(path);
44            return;
45        }
46
47        dfs(node.left, path, result);
48        dfs(node.right, path, result);
49    }
50}