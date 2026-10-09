// Last updated: 10/9/2026, 2:59:49 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> lexicalOrder(int n) {
5        List<Integer> result = new ArrayList<>();
6
7        for (int i = 1; i <= 9; i++) {
8            dfs(i, n, result);
9        }
10
11        return result;
12    }
13
14    private void dfs(int num, int n, List<Integer> result) {
15        if (num > n) {
16            return;
17        }
18
19        result.add(num);
20
21        for (int i = 0; i <= 9; i++) {
22            int next = num * 10 + i;
23
24            if (next > n) {
25                break;
26            }
27
28            dfs(next, n, result);
29        }
30    }
31}