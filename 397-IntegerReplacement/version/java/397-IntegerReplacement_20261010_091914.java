// Last updated: 10/10/2026, 9:19:14 AM
1class Solution {
2    public int integerReplacement(int n) {
3        long num = n;
4        int count = 0;
5
6        while (num != 1) {
7            if (num % 2 == 0) {
8                num /= 2;
9            } else if (num == 3 || (num & 3) == 1) {
10                num--;
11            } else {
12                num++;
13            }
14
15            count++;
16        }
17
18        return count;
19    }
20}