// Last updated: 10/10/2026, 9:22:05 AM
1class Solution {
2    public int findNthDigit(int n) {
3        long digits = 1;
4        long count = 9;
5        long start = 1;
6
7        while (n > digits * count) {
8            n -= digits * count;
9            digits++;
10            count *= 10;
11            start *= 10;
12        }
13
14        long number = start + (n - 1) / digits;
15        String s = String.valueOf(number);
16
17        return s.charAt((int) ((n - 1) % digits)) - '0';
18    }
19}