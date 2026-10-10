// Last updated: 10/10/2026, 9:17:54 AM
1class Solution {
2    public int maxRotateFunction(int[] nums) {
3        int n = nums.length;
4        long sum = 0;
5        long f = 0;
6
7        for (int i = 0; i < n; i++) {
8            sum += nums[i];
9            f += (long) i * nums[i];
10        }
11
12        long max = f;
13
14        for (int i = n - 1; i > 0; i--) {
15            f = f + sum - (long) n * nums[i];
16            max = Math.max(max, f);
17        }
18
19        return (int) max;
20    }
21}