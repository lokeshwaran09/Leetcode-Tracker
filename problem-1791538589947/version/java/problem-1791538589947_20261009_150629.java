// Last updated: 10/9/2026, 3:06:29 PM
1class Solution {
2    public boolean validUtf8(int[] data) {
3        int remaining = 0;
4
5        for (int num : data) {
6            if (remaining == 0) {
7                if ((num >> 7) == 0) {
8                    remaining = 0;
9                } else if ((num >> 5) == 0b110) {
10                    remaining = 1;
11                } else if ((num >> 4) == 0b1110) {
12                    remaining = 2;
13                } else if ((num >> 3) == 0b11110) {
14                    remaining = 3;
15                } else {
16                    return false;
17                }
18            } else {
19                if ((num >> 6) != 0b10) {
20                    return false;
21                }
22                remaining--;
23            }
24        }
25
26        return remaining == 0;
27    }
28}