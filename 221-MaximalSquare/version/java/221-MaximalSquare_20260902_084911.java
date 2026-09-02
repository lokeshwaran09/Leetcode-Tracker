// Last updated: 9/2/2026, 8:49:11 AM
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5
6        int[] dp = new int[cols + 1];
7        int max = 0;
8        int prev = 0;
9
10        for (int i = 1; i <= rows; i++) {
11            prev = 0;
12
13            for (int j = 1; j <= cols; j++) {
14                int temp = dp[j];
15
16                if (matrix[i - 1][j - 1] == '1') {
17                    dp[j] = Math.min(Math.min(dp[j], dp[j - 1]), prev) + 1;
18                    max = Math.max(max, dp[j]);
19                } else {
20                    dp[j] = 0;
21                }
22
23                prev = temp;
24            }
25        }
26
27        return max * max;
28    }
29}