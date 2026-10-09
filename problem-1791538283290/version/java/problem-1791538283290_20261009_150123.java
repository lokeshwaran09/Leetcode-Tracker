// Last updated: 10/9/2026, 3:01:23 PM
1class Solution {
2    public int lastRemaining(int n) {
3        int head = 1;
4        int step = 1;
5        boolean left = true;
6
7        while (n > 1) {
8            if (left || n % 2 == 1) {
9                head += step;
10            }
11
12            n /= 2;
13            step *= 2;
14            left = !left;
15        }
16
17        return head;
18    }
19}