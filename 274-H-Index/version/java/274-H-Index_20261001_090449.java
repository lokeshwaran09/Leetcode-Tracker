// Last updated: 10/1/2026, 9:04:49 AM
1import java.util.Arrays;
2
3class Solution {
4    public int hIndex(int[] citations) {
5        Arrays.sort(citations);
6
7        int n = citations.length;
8
9        for (int i = 0; i < n; i++) {
10            int h = n - i;
11
12            if (citations[i] >= h) {
13                return h;
14            }
15        }
16
17        return 0;
18    }
19}