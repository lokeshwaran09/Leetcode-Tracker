// Last updated: 9/2/2026, 9:31:43 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int[] dp = new int[nums.length];
4        int len = 0;
5
6        for (int num : nums) {
7            int left = 0, right = len;
8
9            while (left < right) {
10                int mid = left + (right - left) / 2;
11
12                if (dp[mid] < num) {
13                    left = mid + 1;
14                } else {
15                    right = mid;
16                }
17            }
18
19            dp[left] = num;
20
21            if (left == len) {
22                len++;
23            }
24        }
25
26        return len;
27    }
28}