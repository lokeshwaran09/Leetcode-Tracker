// Last updated: 9/2/2026, 9:02:06 AM
1class Solution {
2    public int countDigitOne(int n) {
3        long factor = 1;
4        int count = 0;
5
6        while (factor <= n) {
7            long lower = n % factor;
8            long current = (n / factor) % 10;
9            long higher = n / (factor * 10);
10
11            if (current == 0) {
12                count += higher * factor;
13            } else if (current == 1) {
14                count += higher * factor + lower + 1;
15            } else {
16                count += (higher + 1) * factor;
17            }
18
19            factor *= 10;
20        }
21
22        return count;
23    }
24}