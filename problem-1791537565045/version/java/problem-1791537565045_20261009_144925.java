// Last updated: 10/9/2026, 2:49:25 PM
1class Solution {
2    private static final int MOD = 1337;
3
4    public int superPow(int a, int[] b) {
5        a %= MOD;
6        return calculate(a, b, b.length);
7    }
8
9    private int calculate(int a, int[] b, int n) {
10        if (n == 0) {
11            return 1;
12        }
13
14        int last = b[n - 1];
15        int part1 = modPow(calculate(a, b, n - 1), 10);
16        int part2 = modPow(a, last);
17
18        return (part1 * part2) % MOD;
19    }
20
21    private int modPow(int a, int k) {
22        int result = 1;
23        a %= MOD;
24
25        while (k > 0) {
26            if (k % 2 == 1) {
27                result = (result * a) % MOD;
28            }
29            a = (a * a) % MOD;
30            k /= 2;
31        }
32
33        return result;
34    }
35}