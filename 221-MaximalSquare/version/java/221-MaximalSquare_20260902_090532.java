// Last updated: 9/2/2026, 9:05:32 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[n];
5
6        result[0] = 1;
7
8        for (int i = 1; i < n; i++) {
9            result[i] = result[i - 1] * nums[i - 1];
10        }
11
12        int right = 1;
13
14        for (int i = n - 1; i >= 0; i--) {
15            result[i] *= right;
16            right *= nums[i];
17        }
18
19        return result;
20    }
21}