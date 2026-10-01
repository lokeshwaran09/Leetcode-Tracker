// Last updated: 10/1/2026, 9:08:00 AM
1class Solution {
2    public void gameOfLife(int[][] board) {
3        int m = board.length;
4        int n = board[0].length;
5
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8                int live = 0;
9
10                for (int x = -1; x <= 1; x++) {
11                    for (int y = -1; y <= 1; y++) {
12                        if (x == 0 && y == 0) continue;
13
14                        int r = i + x;
15                        int c = j + y;
16
17                        if (r >= 0 && r < m && c >= 0 && c < n &&
18                            Math.abs(board[r][c]) == 1) {
19                            live++;
20                        }
21                    }
22                }
23
24                if (board[i][j] == 1 && (live < 2 || live > 3)) {
25                    board[i][j] = -1;
26                }
27
28                if (board[i][j] == 0 && live == 3) {
29                    board[i][j] = 2;
30                }
31            }
32        }
33
34        for (int i = 0; i < m; i++) {
35            for (int j = 0; j < n; j++) {
36                if (board[i][j] == -1) {
37                    board[i][j] = 0;
38                } else if (board[i][j] == 2) {
39                    board[i][j] = 1;
40                }
41            }
42        }
43    }
44}