// Last updated: 10/9/2026, 2:54:38 PM
1class Solution {
2    public int combinationSum4(int[] nums, int target) {
3        int[] dp = new int[target + 1];
4        dp[0] = 1;
5
6        for (int i = 1; i <= target; i++) {
7            for (int num : nums) {
8                if (i >= num) {
9                    dp[i] += dp[i - num];
10                }
11            }
12        }
13
14        return dp[target];
15    }
16}