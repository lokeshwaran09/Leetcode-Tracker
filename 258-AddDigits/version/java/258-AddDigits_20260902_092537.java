// Last updated: 9/2/2026, 9:25:37 AM
1class Solution {
2    public int nthUglyNumber(int n) {
3        int[] ugly = new int[n];
4        ugly[0] = 1;
5
6        int i2 = 0;
7        int i3 = 0;
8        int i5 = 0;
9
10        for (int i = 1; i < n; i++) {
11            int next2 = ugly[i2] * 2;
12            int next3 = ugly[i3] * 3;
13            int next5 = ugly[i5] * 5;
14
15            ugly[i] = Math.min(next2, Math.min(next3, next5));
16
17            if (ugly[i] == next2) {
18                i2++;
19            }
20
21            if (ugly[i] == next3) {
22                i3++;
23            }
24
25            if (ugly[i] == next5) {
26                i5++;
27            }
28        }
29
30        return ugly[n - 1];
31    }
32}