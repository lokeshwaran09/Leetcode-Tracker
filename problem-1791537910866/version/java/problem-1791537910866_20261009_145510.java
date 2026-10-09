// Last updated: 10/9/2026, 2:55:10 PM
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n = matrix.length;
4        int low = matrix[0][0];
5        int high = matrix[n - 1][n - 1];
6
7        while (low < high) {
8            int mid = low + (high - low) / 2;
9            int count = 0;
10
11            for (int i = 0; i < n; i++) {
12                int j = n - 1;
13
14                while (j >= 0 && matrix[i][j] > mid) {
15                    j--;
16                }
17
18                count += j + 1;
19            }
20
21            if (count < k) {
22                low = mid + 1;
23            } else {
24                high = mid;
25            }
26        }
27
28        return low;
29    }
30}