// Last updated: 10/9/2026, 2:51:57 PM
1class Solution {
2    public int getMoneyAmount(int n) {
3        int[][] dp = new int[n + 2][n + 2];
4
5        for (int len = 2; len <= n; len++) {
6            for (int left = 1; left + len - 1 <= n; left++) {
7                int right = left + len - 1;
8                dp[left][right] = Integer.MAX_VALUE;
9
10                for (int k = left; k < right; k++) {
11                    int cost = k + Math.max(dp[left][k - 1], dp[k + 1][right]);
12                    dp[left][right] = Math.min(dp[left][right], cost);
13                }
14            }
15        }
16
17        return dp[1][n];
18    }
19}