// Last updated: 9/2/2026, 9:14:04 AM
1class Solution {
2    public int addDigits(int num) {
3        while (num >= 10) {
4            int sum = 0;
5
6            while (num > 0) {
7                sum += num % 10;
8                num /= 10;
9            }
10
11            num = sum;
12        }
13
14        return num;
15    }
16}