// Last updated: 9/2/2026, 9:09:16 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int row = 0;
4        int col = matrix[0].length - 1;
5
6        while (row < matrix.length && col >= 0) {
7            if (matrix[row][col] == target) {
8                return true;
9            } else if (matrix[row][col] > target) {
10                col--;
11            } else {
12                row++;
13            }
14        }
15
16        return false;
17    }
18}