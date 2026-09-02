// Last updated: 9/2/2026, 9:26:56 AM
1class Solution {
2    public int numSquares(int n) {
3        int[] dp = new int[n + 1];
4
5        for (int i = 1; i <= n; i++) {
6            dp[i] = i;
7
8            for (int j = 1; j * j <= i; j++) {
9                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
10            }
11        }
12
13        return dp[n];
14    }
15}